module com.siemieniuk.trafficmgmt {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                    requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
            
    opens com.siemieniuk.trafficmgmt.app to javafx.fxml;
    exports com.siemieniuk.trafficmgmt.app;
    exports com.siemieniuk.trafficmgmt.roadnetwork;
    opens com.siemieniuk.trafficmgmt.roadnetwork to javafx.fxml;
    exports com.siemieniuk.trafficmgmt.graph;
    opens com.siemieniuk.trafficmgmt.graph to javafx.fxml;
}