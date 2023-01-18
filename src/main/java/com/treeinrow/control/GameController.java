package com.treeinrow.control;

import com.treeinrow.game.Cube;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import static com.treeinrow.Constants.*;

public class HelloController implements Initializable {
    @FXML
    public Pane gameScene;
    private Cube[][] board;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        startX = 100;
        startY = 200;

        board = new Cube[colCount][rowCount];
        for (int col = 0; col < colCount; col++){
            for (int row = 0; row < rowCount; row++){
                board[col][row] = new Cube(gameScene, board, col, row, col*size + startX + (col-1)*space, row*size + startY + (row-1)*space, size);
                gameScene.getChildren().add(board[col][row]);
            }
        }

        for (int col = 0; col < colCount; col++) {
            for (int row = 0; row < rowCount; row++) {
                board[col][row].setTranslateY(board[col][row].getTranslateY() - (rowCount - 1) * size + startY + (rowCount - 1 - 1) * space);
                board[col][row].returnToHome(false, board[col][row]::start);
            }
        }
    }
}