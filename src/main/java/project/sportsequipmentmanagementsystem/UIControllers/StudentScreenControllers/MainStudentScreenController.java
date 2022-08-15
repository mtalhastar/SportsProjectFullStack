package project.sportsequipmentmanagementsystem.UIControllers.StudentScreenControllers;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import project.sportsequipmentmanagementsystem.Main;

import java.io.IOException;

public class MainStudentScreenController {
    public Button borrowEquipment = new Button();
    public Button logOut = new Button();

    public void borrowEquipment (ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToBorrowEquipment(stage);
    }

    public void goToWelcomeScreen (ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToWelcomeScreen(stage);
    }

}
