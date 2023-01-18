module com.example.treeinrow {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.treeinrow to javafx.fxml;
    exports com.treeinrow;
    exports com.treeinrow.control;
    opens com.treeinrow.control to javafx.fxml;
}