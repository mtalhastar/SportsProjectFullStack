package project.sportsequipmentmanagementsystem.UIControllers.TeacherScreenController;

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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import project.sportsequipmentmanagementsystem.EducationalInstitute;
import project.sportsequipmentmanagementsystem.SportsRoom.Equipment;
import project.sportsequipmentmanagementsystem.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainSportsTeacherScreenController implements Initializable {

    public TextField equipmentID = new TextField();
    public TextField name = new TextField();
    public TextField brandName = new TextField();
    public TextField availability = new TextField();
    public TextField room = new TextField();
    public Button addEquipment = new Button();
    public TableView<Equipment> equipmentTable = new TableView<>();
    public TableColumn<Equipment, String> equipmentIdColumn;
    public TableColumn<Equipment, String> nameColumn;
    public TableColumn<Equipment, String> brandNameColumn;
    public TableColumn<Equipment, String> availabilityColumn;
    public TableColumn<Equipment, String> roomIdColumn;
    ObservableList<Equipment> equipmentObservableList;
    public ImageView ManageEQBtn = new ImageView();
    public ImageView equipment = new ImageView();

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


    public void manageEquipment(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        new Main().changeSceneToTeacherMenu(stage);
    }

    public void logOut(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        new Main().goBackToMainMenu(stage);
    }

    public void CheckEquipment(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        new Main().changeSceneToEquipmentMenu(stage);
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
