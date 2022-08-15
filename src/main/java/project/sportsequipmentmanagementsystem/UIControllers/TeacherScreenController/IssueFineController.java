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
import project.sportsequipmentmanagementsystem.Main;
import project.sportsequipmentmanagementsystem.SportsRoom.Defaulter;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class IssueFineController  implements Initializable {


    public ImageView ManageEQBtn = new ImageView();
    public Button logOutButton = new Button();
    public ImageView equipment = new ImageView();
    public ImageView ReturnERequest = new ImageView();
    public Button issueFineButton = new Button();
    public TextField amountTextField = new TextField();
    public TextField rollNoTextField = new TextField();
    public TableView<Defaulter> issueFineTable = new TableView<>();
    public TableColumn<Defaulter,String> studentIdCol = new TableColumn<>();
    public TableColumn<Defaulter,String> equipmentNameCol = new TableColumn<>();
    public TableColumn<Defaulter,String> equipmentIDCol = new TableColumn<>();
    public TableColumn<Defaulter,String> daysCol = new TableColumn<>();
    public ObservableList<Defaulter> List;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List = FXCollections.observableList(getDefaulterList());

        studentIdCol.setCellValueFactory(new PropertyValueFactory<>("StudentID"));
        equipmentNameCol.setCellValueFactory(new PropertyValueFactory<>("EquipmentName"));
        equipmentIDCol.setCellValueFactory(new PropertyValueFactory<>("EquipmentID"));
        daysCol.setCellValueFactory(new PropertyValueFactory<>("TimeOfReturn"));

        issueFineTable.setItems(List);

    }

    private ArrayList<Defaulter> getDefaulterList(){

        return new EducationalInstitute().getDefaulters();
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

    public void ReturnEquipmentRequest(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        new Main().changeScenetoReturnEquipment(stage);
    }


    public void IssueFineToStudent(ActionEvent event) {
        int rollno =   Integer.parseInt(  rollNoTextField.getText() );
        float amount =  Float.parseFloat(  amountTextField.getText() );
        new EducationalInstitute().IssueFine(rollno,amount);
    }
}
