package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class Controller {

    @FXML
    private Button set;
    @FXML
    private Button close;
    @FXML
    private TextField time;
    @FXML
    private CheckBox shootdown;

    private Stage stage;


    // Пуск таймера для клика
    @FXML
    public void set() throws AWTException, IOException {

        Integer timeOut = (int) (Double.parseDouble(time.getText())*60000);

        System.out.println(timeOut);

        System.out.println(time.getText());


        new ClickAfterTime(timeOut, shootdown.isSelected()).start();

        this.stage.close();

    }


    public void setStage(Stage stage) {

        this.stage = stage;

    }
}
