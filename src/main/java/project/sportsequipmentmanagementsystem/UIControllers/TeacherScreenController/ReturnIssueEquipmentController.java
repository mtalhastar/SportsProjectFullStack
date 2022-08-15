package project.sportsequipmentmanagementsystem.UIControllers.TeacherScreenController;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import project.sportsequipmentmanagementsystem.EducationalInstitute;
import project.sportsequipmentmanagementsystem.Main;
import project.sportsequipmentmanagementsystem.SportsRoom.EquipmentRequests;

import java.io.IOException;

public class ReturnIssueEquipmentController {

    public ImageView ManageEQBtn = new ImageView();
    public Button logOutButton = new Button();
    public Button equipmentReturn = new Button();
    public ImageView equipment = new ImageView();
    public  ImageView Fine = new ImageView();

    public TableView<EquipmentRequests> equipmentBorrowRecordTableView = new TableView<>();
    public TableColumn<EquipmentRequests,String> StudentIDcolumn;
    public  TableColumn<EquipmentRequests,String>   IssuedEquipmentCol;
    public  TableColumn<EquipmentRequests,String>   DateOfIssueCol;
    public  TableColumn<EquipmentRequests,String>   EquipmentIDCol;
    public  TableColumn<EquipmentRequests,String>  DateOfReturn1;
    public  TableColumn<EquipmentRequests,String>  Fine1;

    public    TextField    RollNoTxtF =      new TextField();
    public    TextField    EquipmentIDtxtF = new TextField();
    public    TextField    DateOfReturn   =  new TextField();
    public    TextField    AmountOnDamage =  new TextField();

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

    public void ReturnEquipement(ActionEvent event) {
        int rollno= Integer.parseInt(RollNoTxtF.getText());
        int  id =  Integer.parseInt(EquipmentIDtxtF.getText());
        String  date =    DateOfReturn.getText();
        float amount  = Float.parseFloat(AmountOnDamage.getText());
        new EducationalInstitute().returnEquipment(rollno,date,id,amount);
    }
}
