package com.treeinrow.control;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;

import java.net.URL;
import java.util.ResourceBundle;

public class SettingControll implements Initializable {
    public Spinner columnValue;
    public Spinner rowValue;
    public Spinner sizeValue;
    public Spinner widthValue;
    public Spinner heightValue;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void saveOnAction(ActionEvent actionEvent) {
    }
}
