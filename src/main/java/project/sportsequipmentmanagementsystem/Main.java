package project.sportsequipmentmanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import project.sportsequipmentmanagementsystem.persistence.DBHandler;
import project.sportsequipmentmanagementsystem.persistence.PersistenceFactory;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("WelcomeScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Sports Equipment Management System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        DBHandler dbHandler = new DBHandler();
        dbHandler.connectDB();

        PersistenceFactory.setConnection(dbHandler);

        launch();
    }

    public void changeSceneToWelcomeScreen(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("WelcomeScreen.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 800, 600));

        stage.show();
    }

    public void changeSceneToMainStudentScreen(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainStudentScreen.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 800, 600));

        stage.show();
    }

    public void changeSceneToManageBorrowEquipment(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ManageEquipmentScreen.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 800, 600));

        stage.show();
    }

    public void changeSceneToBorrowEquipment(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("BorrowEquipmentScreen.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 800, 600));

        stage.show();
    }

    public void changeSceneToManageTeacher(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ManageTeacherScreen.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 800, 600));

        stage.show();
    }

    public void changeSceneToPrincipalMenu(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainPrincipalScreen.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 800, 600));

        stage.show();
    }

    public void changeSceneToManageStudent(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ManageStudentScreen.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 800, 600));

        stage.show();
    }

    public void changeSceneToTeacherMenu(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainSportsTeacherScreen.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 800, 600));
        stage.show();
    }

    public void goBackToMainMenu(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("WelcomeScreen.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 800, 600));

        stage.show();

    }
    public void changeSceneToEquipmentMenu(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("CheckIssuedEquipment.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 800, 600));
        stage.show();
    }
    public void changeSceneToIssueFine(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("IssueFine.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 800, 600));
        stage.show();
    }
    public void changeScenetoReturnEquipment(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ReturnIssueEquipment.fxml"));
        stage.setScene(new Scene(fxmlLoader.load(), 800, 600));
        stage.show();
    }
}