package project.sportsequipmentmanagementsystem.UIControllers.PrincipalScreenControllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import project.sportsequipmentmanagementsystem.*;
import project.sportsequipmentmanagementsystem.SportsRoom.Equipment;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ManageEquipmentController implements Initializable {
    public Button manageEquipmentButton = new Button();
    public Button manageTeacherButton = new Button();
    public Button homeButton = new Button();
    public Button manageStudentButton = new Button();
    public Button logOutButton = new Button();

    public TextField equipmentID = new TextField();
    public TextField name = new TextField();
    public TextField brandName = new TextField();
    public TextField availability = new TextField();
    public TextField room = new TextField();
    public Button addEquipment = new Button();

    public TableView  <Equipment> equipmentTable = new TableView<>();
    public TableColumn<Equipment, String> equipmentIdColumn;
    public TableColumn<Equipment, String> nameColumn;
    public TableColumn<Equipment, String> brandNameColumn;
    public TableColumn<Equipment, String> availabilityColumn;
    public TableColumn<Equipment, String> roomIdColumn;
    ObservableList<Equipment> equipmentObservableList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        equipmentObservableList = FXCollections.observableArrayList(getStudentsData());

        equipmentIdColumn.setCellValueFactory(new PropertyValueFactory<>("EquipmentID"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
        brandNameColumn.setCellValueFactory(new PropertyValueFactory<>("Brand"));
        availabilityColumn.setCellValueFactory(new PropertyValueFactory<>("Availability"));
        roomIdColumn.setCellValueFactory(new PropertyValueFactory<>("Room"));

        equipmentTable.setItems(equipmentObservableList);
    }

    private ArrayList<Equipment> getStudentsData(){
        return new EducationalInstitute().getAllEquipment();
    }

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

    public void addEquipment(ActionEvent event) throws IOException{
        new EducationalInstitute().addEquipment(equipmentID.getText(), name.getText(), brandName.getText(), availability.getText(), room.getText());

        equipmentObservableList = FXCollections.observableArrayList(getStudentsData());
        equipmentTable.setItems(equipmentObservableList);
    }

    public void editEquipment(ActionEvent event) throws IOException{
        new EducationalInstitute().editEquipment(equipmentID.getText(), name.getText(), brandName.getText(), availability.getText(), room.getText());

        equipmentObservableList = FXCollections.observableArrayList(getStudentsData());
        equipmentTable.setItems(equipmentObservableList);
    }

    public void removeEquipment(ActionEvent event) throws IOException{
        new EducationalInstitute().removeEquipment(equipmentID.getText());

        equipmentObservableList = FXCollections.observableArrayList(getStudentsData());
        equipmentTable.setItems(equipmentObservableList);
    }
}
