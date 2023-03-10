package com.treeinrow.control;

import com.treeinrow.Constants;
import com.treeinrow.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {
    @FXML public AnchorPane menuPane;

    public void startOnAction(ActionEvent actionEvent) {
        GameController gameController = new GameController();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("gameView.fxml"));
        fxmlLoader.setController(gameController);
        Parent root;
        try {
            root = fxmlLoader.load();
        } catch (IOException e) {
            System.err.println("game load error");
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setTitle("TreeInRow");
        stage.setScene(new Scene(root));
        stage.setWidth(600);
        stage.setHeight(800);
        gameController.start();
    }

    public void settingsOnAction(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("settingView.fxml"));
        Parent root;
        try {
            root = fxmlLoader.load();
        } catch (IOException e) {
            System.err.println("setting load error");
            throw new RuntimeException(e);
        }
        SettingController settingController = (SettingController)fxmlLoader.getController();
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setTitle("Setting");
        stage.setScene(new Scene(root));
        stage.setWidth(600);
        stage.setHeight(800);
    }

    public void exitOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        BackgroundImage myBI;
        try {
            myBI = new BackgroundImage(new Image(new File("src/main/resources/com/treeinrow/images/background.png").toURI().toURL().toExternalForm(),600, 800,false,true),
                    BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                    BackgroundSize.DEFAULT);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        menuPane.setBackground(new Background(myBI));

        Constants.ini(5, 8, 50);
    }
}
