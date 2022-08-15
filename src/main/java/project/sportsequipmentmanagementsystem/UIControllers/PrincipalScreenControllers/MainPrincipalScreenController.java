package project.sportsequipmentmanagementsystem.UIControllers.PrincipalScreenControllers;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import project.sportsequipmentmanagementsystem.Main;

import java.io.IOException;

public class MainPrincipalScreenController {
    public Button manageEquipmentButton = new Button();
    public Button manageTeacherButton = new Button();
    public Button homeButton = new Button();
    public Button manageStudentButton = new Button();
    public Button logOutButton = new Button();

    public void logOut(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().goBackToMainMenu(stage);
    }

    public void goToHome(ActionEvent event) throws IOException{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToPrincipalMenu(stage);
    }

    public void goToEquipment(ActionEvent event) throws IOException{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToManageBorrowEquipment(stage);
    }

    public void goToTeacher(ActionEvent event) throws IOException{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToManageTeacher(stage);
    }

    public void goToStudent(ActionEvent event) throws IOException{
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().changeSceneToManageStudent(stage);
    }
}
