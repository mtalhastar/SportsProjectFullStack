package project.sportsequipmentmanagementsystem.Student;

import project.sportsequipmentmanagementsystem.Date;
import project.sportsequipmentmanagementsystem.persistence.PersistenceFactory;
import project.sportsequipmentmanagementsystem.persistence.PersistenceHandler;

import java.util.ArrayList;

public class StudentRecord {

    public void addStudent(String rollNumber, String name, String dateOfBirth){
        dateOfBirth = dateOfBirth.replaceAll("/","");
        dateOfBirth = dateOfBirth.replaceAll("-","");
        Date date = new Date(dateOfBirth);
        Student studentToAdd = new Student(rollNumber, name, date);

        PersistenceHandler persistenceHandler = PersistenceFactory.getConnection();

        persistenceHandler.addStudent(studentToAdd);
    }

    public void removeStudent(String rollNumber){
        PersistenceHandler persistenceHandler = PersistenceFactory.getConnection();

        persistenceHandler.removeStudent(rollNumber);
    }

    public void editStudent(String rollNumber, String name, String dateOfBirth){
        dateOfBirth = dateOfBirth.replaceAll("/","");
        dateOfBirth = dateOfBirth.replaceAll("-","");
        Date date = new Date(dateOfBirth);
        Student studentToEdit = new Student(rollNumber, name, date);

        PersistenceHandler persistenceHandler = PersistenceFactory.getConnection();

        persistenceHandler.editStudent(studentToEdit);
    }

    public ArrayList<Student> getAllStudentRecords(){
        return PersistenceFactory.getConnection().getAllStudents();
    }
}
