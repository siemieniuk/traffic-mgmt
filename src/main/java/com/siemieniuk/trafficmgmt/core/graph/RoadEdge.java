package com.siemieniuk.trafficmgmt.core.graph;

public class RoadEdge {
    private final int LANES;
    private final double SPEED_LIMIT;
    private final GraphNode source;
    private final GraphNode target;

    public RoadEdge(GraphNode source, GraphNode target, int LANES, double SPEED_LIMIT) {
        this.source = source;
        this.target = target;
        this.SPEED_LIMIT = SPEED_LIMIT;
        this.LANES = LANES;
    }

    public RoadEdge(GraphNode source, GraphNode target, double SPEED_LIMIT) {
        this.source = source;
        this.target = target;
        this.SPEED_LIMIT = SPEED_LIMIT;
        this.LANES = 1;
    }

    public int getLANES() {
        return LANES;
    }

    public double getSPEED_LIMIT() {
        return SPEED_LIMIT;
    }

    public GraphNode getSource() {
        return source;
    }

    public GraphNode getTarget() {
        return target;
    }
}
