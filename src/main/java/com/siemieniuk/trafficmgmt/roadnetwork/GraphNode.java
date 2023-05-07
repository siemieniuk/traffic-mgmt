package com.siemieniuk.trafficmgmt.roadnetwork;

public abstract class GraphNode {
    private static int NEW_ID = 0;
    private final int id;

    public GraphNode() {
        this.id = NEW_ID++;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof GraphNode)) {
            return false;
        }
        return this.id == ((GraphNode) obj).getId();
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "id=" + id +
                '}';
    }
}
