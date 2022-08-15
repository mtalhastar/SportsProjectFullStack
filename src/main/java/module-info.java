module project.sportsequipmentmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires javafx.graphics;
    requires java.sql;
    requires mysql.connector;

    opens project.sportsequipmentmanagementsystem to javafx.fxml;
    exports project.sportsequipmentmanagementsystem;
    exports project.sportsequipmentmanagementsystem.UIControllers;
    opens project.sportsequipmentmanagementsystem.UIControllers to javafx.fxml;
    exports project.sportsequipmentmanagementsystem.UIControllers.PrincipalScreenControllers;
    opens project.sportsequipmentmanagementsystem.UIControllers.PrincipalScreenControllers to javafx.fxml;
    exports project.sportsequipmentmanagementsystem.UIControllers.StudentScreenControllers;
    opens project.sportsequipmentmanagementsystem.UIControllers.StudentScreenControllers to javafx.fxml;
    exports project.sportsequipmentmanagementsystem.UIControllers.TeacherScreenController;
    opens project.sportsequipmentmanagementsystem.UIControllers.TeacherScreenController to javafx.fxml;
    exports project.sportsequipmentmanagementsystem.persistence;
    opens project.sportsequipmentmanagementsystem.persistence to javafx.fxml;
    exports project.sportsequipmentmanagementsystem.SportsRoom;
    opens project.sportsequipmentmanagementsystem.SportsRoom to javafx.fxml;
    exports project.sportsequipmentmanagementsystem.Student;
    opens project.sportsequipmentmanagementsystem.Student to javafx.fxml;
    exports project.sportsequipmentmanagementsystem.SportsTeacher;
    opens project.sportsequipmentmanagementsystem.SportsTeacher to javafx.fxml;
    exports project.sportsequipmentmanagementsystem.Principal;
    opens project.sportsequipmentmanagementsystem.Principal to javafx.fxml;
}