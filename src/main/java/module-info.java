module com.example.treeinrow {
    requires javafx.controls;
    requires javafx.fxml;
            
                    requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
                requires com.almasb.fxgl.all;
    
    opens com.example.treeinrow to javafx.fxml;
    exports com.example.treeinrow;
}