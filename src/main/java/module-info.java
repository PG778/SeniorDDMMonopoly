module com.example.monopoly_lc_ddm {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.monopoly_lc_ddm to javafx.fxml;
    exports com.example.monopoly_lc_ddm;
}