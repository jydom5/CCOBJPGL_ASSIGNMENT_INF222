package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class Drinkcontroller {


    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    coke coke = new coke();
    fanta fanta = new fanta();
    mountaindew mountaindew = new mountaindew();
    pepsi pepsi = new pepsi();
    sprite sprite = new sprite();


    public void initialize() {

        coke.settaste("tastes like coke");
        coke.setscolor("looks like coke but has a little shade of grey");

        fanta.settaste("tastes sweet");
        fanta.setscolor("color orange");

        mountaindew.settaste("tastes like 7up");
        mountaindew.setscolor("looks like 7up");

        pepsi.settaste("tastes bitter sweet");
        pepsi.setscolor("looks like 7up");

        sprite.settaste("tastes like mountaindew");
        sprite.setscolor("looks like mountaindew");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Coke " + coke.getscolor() + " and " + coke.gettaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Fanta " + fanta.getscolor() + " and " + fanta.gettaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Mountaindew " + mountaindew.getscolor() + " and " + mountaindew.gettaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Pepsi " + pepsi.getscolor() + " and " + pepsi.gettaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Sprite " + sprite.getscolor() + " and " + sprite.gettaste());
            }
        
    
        alert.showAndWait();
    }
} 
