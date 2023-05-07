package com.siemieniuk.trafficmgmt.graph;

import javafx.fxml.FXML;

public final class GraphController {
    private static Graph graph;
    @FXML private GraphView canvas;

    public GraphController() {
        if (graph == null) {
            graph = new Graph();
        }
    }
    @FXML
    private void initialize() {

    }
}
