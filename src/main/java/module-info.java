module com.siemieniuk.trafficmgmt {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                    requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
            
    opens siemieniuk.trafficmgmt.app to javafx.fxml;
    exports siemieniuk.trafficmgmt.app;
    exports siemieniuk.trafficmgmt.roadnetwork;
    opens siemieniuk.trafficmgmt.roadnetwork to javafx.fxml;
    exports siemieniuk.trafficmgmt.graph;
    opens siemieniuk.trafficmgmt.graph to javafx.fxml;
}