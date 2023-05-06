module com.siemieniuk.trafficmgmt {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                    requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
            
    opens com.siemieniuk.trafficmgmt to javafx.fxml;
    exports com.siemieniuk.trafficmgmt;
    exports com.siemieniuk.trafficmgmt.core.roadnetwork;
    opens com.siemieniuk.trafficmgmt.core.roadnetwork to javafx.fxml;
    exports com.siemieniuk.trafficmgmt.core.graph;
    opens com.siemieniuk.trafficmgmt.core.graph to javafx.fxml;
}