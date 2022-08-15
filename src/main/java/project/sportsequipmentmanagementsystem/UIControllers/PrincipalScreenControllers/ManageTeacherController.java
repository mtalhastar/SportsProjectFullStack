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
import project.sportsequipmentmanagementsystem.SportsTeacher.SportsTeacher;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ManageTeacherController implements Initializable {

    public Button manageEquipmentButton = new Button();
    public Button manageTeacherButton = new Button();
    public Button homeButton = new Button();
    public Button manageStudentButton = new Button();
    public Button logOutButton = new Button();
    public TextField teacherID = new TextField();
    public TextField name = new TextField();
    public TextField dateOfBirth = new TextField();
    public Button addTeacher = new Button();
    public Button removeTeacher = new Button();
    public Button editTeacher = new Button();
    public TableView<SportsTeacher> teachersTable;
    public TableColumn<SportsTeacher, String> idColumn;
    public TableColumn<SportsTeacher, String> nameColumn;
    public TableColumn<SportsTeacher, Date> dateOfBirthColumn;
    ObservableList<SportsTeacher> sportsTeacherObservableList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sportsTeacherObservableList = FXCollections.observableArrayList(getTeachersData());

        idColumn.setCellValueFactory(new PropertyValueFactory<>("Id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
        dateOfBirthColumn.setCellValueFactory(new PropertyValueFactory<>("DateOfBirth"));

        teachersTable.setItems(sportsTeacherObservableList);
    }

    private ArrayList<SportsTeacher> getTeachersData(){
        return new EducationalInstitute().getAllSportsTeacher();
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

    public void addTeacher(ActionEvent event) throws IOException{
        new EducationalInstitute().addSportsTeacher(teacherID.getText(), name.getText(), dateOfBirth.getText());

        sportsTeacherObservableList = FXCollections.observableArrayList(getTeachersData());
        teachersTable.setItems(sportsTeacherObservableList);
    }

    public void editTeacher(ActionEvent event) throws IOException{
        new EducationalInstitute().removeSportsTeacher(teacherID.getText());
        new EducationalInstitute().addSportsTeacher(teacherID.getText(), name.getText(), dateOfBirth.getText());

        sportsTeacherObservableList = FXCollections.observableArrayList(getTeachersData());
        teachersTable.setItems(sportsTeacherObservableList);
    }

    public void removeTeacher(ActionEvent event) throws IOException{
        new EducationalInstitute().removeSportsTeacher(teacherID.getText());

        sportsTeacherObservableList = FXCollections.observableArrayList(getTeachersData());
        teachersTable.setItems(sportsTeacherObservableList);
    }
}
