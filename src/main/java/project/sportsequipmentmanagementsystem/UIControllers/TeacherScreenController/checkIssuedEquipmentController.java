package project.sportsequipmentmanagementsystem.UIControllers.TeacherScreenController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import project.sportsequipmentmanagementsystem.EducationalInstitute;
import project.sportsequipmentmanagementsystem.SportsRoom.EquipmentRequests;
import project.sportsequipmentmanagementsystem.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class checkIssuedEquipmentController implements Initializable {

    public  TableView<EquipmentRequests> equipmentBorrowRecordTableView = new TableView<>();
    public  TableColumn<EquipmentRequests,String>   StudentIDcolumn;
    public  TableColumn<EquipmentRequests,String>   IssuedEquipmentCol;
    public  TableColumn<EquipmentRequests,String>   DateOfIssueCol;
    public  TableColumn<EquipmentRequests,String>   EquipmentIDCol;
    public  TableColumn<EquipmentRequests,String>  DateOfReturn;
    public  TableColumn<EquipmentRequests,String>  Fine;
    public ObservableList<EquipmentRequests> List;

    public ImageView ManageEQBtn = new ImageView();
    public Button logOutButton = new Button();
    public ImageView equipment = new ImageView();
    public ImageView  issuefine1 = new ImageView();


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

    public void IssueFining(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        new Main().changeSceneToIssueFine(stage);
    }

    public ArrayList<EquipmentRequests> getIssuedList(){
        return new EducationalInstitute().getAllCurrentlyBorrowedEquipmentRecords();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
     /*   List = FXCollections.observableList(getIssuedList());
        StudentIDcolumn.setCellValueFactory(new PropertyValueFactory<>("StudentID"));
        IssuedEquipmentCol.setCellValueFactory(new PropertyValueFactory<>("IssuedEquipmentName"));
        DateOfIssueCol.setCellValueFactory(new PropertyValueFactory<>("IssuedDate"));
        EquipmentIDCol.setCellValueFactory(new PropertyValueFactory<>("EquipmentID"));
        equipmentBorrowRecordTableView.setItems(List);*/
    }
}
