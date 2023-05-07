package com.siemieniuk.trafficmgmt.core.graph;

import com.siemieniuk.trafficmgmt.graph.Graph;
import com.siemieniuk.trafficmgmt.roadnetwork.GraphNode;
import com.siemieniuk.trafficmgmt.roadnetwork.RoadEdge;
import com.siemieniuk.trafficmgmt.roadnetwork.RoadMidPoint;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class GraphTest {
    static Graph graph;
    static List<RoadEdge> edges;
    static List<GraphNode> nodes;

    @BeforeAll
    static void setUpAll() {
        nodes = new ArrayList<>();
        GraphNode node1 = new RoadMidPoint();
        GraphNode node2 = new RoadMidPoint();
        GraphNode node3 = new RoadMidPoint();
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);

        edges = new ArrayList<>();
        edges.add(new RoadEdge(node1, node2, 30));
        edges.add(new RoadEdge(node1, node3, 30));
    }

    @BeforeEach
    void setUp() {
        graph = new Graph();
    }

    @Test
    void testAppending() {
        assertDoesNotThrow(() -> graph.append(edges.get(0)));
        assertThrows(IllegalArgumentException.class, () -> graph.append(edges.get(0)));
        assertDoesNotThrow(() -> graph.append(edges.get(1)));
        assertThrows(IllegalArgumentException.class, () -> graph.append(edges.get(1)));
        assertThrows(IllegalArgumentException.class, () -> graph.append(edges.get(1)));
    }

    @Test
    void testConnectivity() {
        for (var edge : edges) {
            graph.append(edge);
            GraphNode source = edge.getSource();
            GraphNode target = edge.getTarget();
            assertTrue(graph.isConnected(source, target));
            assertFalse(graph.isConnected(target, source));
        }
    }

    @AfterEach
    void tearDown() {
        graph = null;
    }
}