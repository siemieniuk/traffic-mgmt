package siemieniuk.trafficmgmt.graph;

import siemieniuk.trafficmgmt.roadnetwork.GraphNode;
import siemieniuk.trafficmgmt.roadnetwork.RoadEdge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Graph {
    public HashMap<GraphNode, HashMap<GraphNode, RoadEdge>> edges;
    public List<GraphNode> nodes;

    Graph() {
        this.nodes = new ArrayList<>();
        this.edges = new HashMap<>();
    }

    public void append(RoadEdge edge) {
        GraphNode source = edge.getSource();
        GraphNode target = edge.getTarget();
        if (edges.containsKey(source)) {
            if (edges.get(source).containsKey(target)) {
                throw new IllegalArgumentException("Already exists!");
            } else {
                nodes.add(source);
                nodes.add(target);
                edges.get(source).put(target, edge);
            }
        } else {
            nodes.add(source);
            nodes.add(target);
            HashMap<GraphNode, RoadEdge> sourceEntry = new HashMap<>();
            sourceEntry.put(target, edge);
            edges.put(source, sourceEntry);
        }
    }

    public void remove(RoadEdge roadEdge) {
        GraphNode source = roadEdge.getSource();
        GraphNode target = roadEdge.getTarget();

        if (! (edges.containsKey(source) && edges.get(source).containsKey(target))) {
            throw new IllegalArgumentException("Already exists!");
        }

        edges.get(source).remove(target);
    }

    public boolean isConnected(GraphNode source, GraphNode target) {
        return (edges.containsKey(source) && edges.get(source).containsKey(target));
    }
}
