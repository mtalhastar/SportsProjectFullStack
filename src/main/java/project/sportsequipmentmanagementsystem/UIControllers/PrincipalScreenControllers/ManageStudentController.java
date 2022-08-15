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
import project.sportsequipmentmanagementsystem.Date;
import project.sportsequipmentmanagementsystem.EducationalInstitute;
import project.sportsequipmentmanagementsystem.Main;
import project.sportsequipmentmanagementsystem.Student.Student;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ManageStudentController implements Initializable {

    public Button manageEquipmentButton = new Button();
    public Button manageTeacherButton = new Button();
    public Button homeButton = new Button();
    public Button manageStudentButton = new Button();
    public Button logOutButton = new Button();

    public TextField name = new TextField();
    public TextField rollNumber = new TextField();
    public TextField dateOfBirth = new TextField();
    public Button removeButton = new Button();
    public Button editButton = new Button();
    public TableView<Student> studentsTable;
    public TableColumn<Student, String> rollNumberColumn;
    public TableColumn<Student, String> nameColumn;
    public TableColumn<Student, Date> dateOfBirthColumn;
    ObservableList<Student> studentObservableList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        studentObservableList = FXCollections.observableArrayList(getStudentsData());

        rollNumberColumn.setCellValueFactory(new PropertyValueFactory<>("Id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
        dateOfBirthColumn.setCellValueFactory(new PropertyValueFactory<>("Date"));

        studentsTable.setItems(studentObservableList);
    }

    private ArrayList<Student> getStudentsData(){
        return new EducationalInstitute().getAllStudentRecords();
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

    public void addStudent(ActionEvent event) throws IOException{
        new EducationalInstitute().addStudent(rollNumber.getText(),name.getText(),dateOfBirth.getText());

        studentObservableList = FXCollections.observableArrayList(getStudentsData());
        studentsTable.setItems(studentObservableList);
    }

    public void editStudent(ActionEvent event) throws IOException{
        new EducationalInstitute().editStudent(rollNumber.getText(),name.getText(),dateOfBirth.getText());

        studentObservableList = FXCollections.observableArrayList(getStudentsData());
        studentsTable.setItems(studentObservableList);
    }

    public void removeStudent(ActionEvent event) throws IOException{
        new EducationalInstitute().removeStudent(rollNumber.getText());

        studentObservableList = FXCollections.observableArrayList(getStudentsData());
        studentsTable.setItems(studentObservableList);
    }
}
