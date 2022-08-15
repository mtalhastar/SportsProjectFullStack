package project.sportsequipmentmanagementsystem;

import project.sportsequipmentmanagementsystem.Principal.PrincipalRecord;
import project.sportsequipmentmanagementsystem.SportsRoom.Defaulter;
import project.sportsequipmentmanagementsystem.SportsRoom.Equipment;
import project.sportsequipmentmanagementsystem.SportsRoom.EquipmentRequests;
import project.sportsequipmentmanagementsystem.SportsRoom.SportsRoom;
import project.sportsequipmentmanagementsystem.SportsTeacher.SportsTeacher;
import project.sportsequipmentmanagementsystem.SportsTeacher.SportsTeacherRecord;
import project.sportsequipmentmanagementsystem.Student.Student;
import project.sportsequipmentmanagementsystem.Student.StudentRecord;

import java.util.ArrayList;

public class EducationalInstitute {
    private StudentRecord studentRecord = new StudentRecord();
    private PrincipalRecord principalRecord;
    private SportsTeacherRecord sportsTeacherRecord = new SportsTeacherRecord();
    private SportsRoom sportsRoom = new SportsRoom();


    public EducationalInstitute(){}

    public ArrayList<Student> getAllStudentRecords(){
        return studentRecord.getAllStudentRecords();
    }

    public void addStudent(String rollNumber, String name, String dateOfBirth){
        studentRecord.addStudent(rollNumber, name, dateOfBirth);
    }

    public void removeStudent(String rollNumber){
        studentRecord.removeStudent(rollNumber);
    }

    public void editStudent(String rollNumber, String name, String dateOfBirth){
        studentRecord.editStudent(rollNumber, name, dateOfBirth);
    }

    public ArrayList<Equipment> getAllEquipment(){
        return sportsRoom.getAllEquipment();
    }

    public void addEquipment(String equipmentID, String name, String brand, String availability, String roomID){
        sportsRoom.addEquipment(equipmentID, name, brand, availability, roomID);
    }

    public void removeEquipment(String equipmentID){
        sportsRoom.removeEquipment(equipmentID);
    }

    public void editEquipment(String equipmentID, String name, String brand, String availability, String room){
        sportsRoom.editEquipment(equipmentID, name, brand, availability, room);
    }

    public ArrayList<SportsTeacher> getAllSportsTeacher(){
        return sportsTeacherRecord.getAllSportsTeacher();
    }

    public void addSportsTeacher(String id, String name, String dateOfBirth){
        sportsTeacherRecord.addTeacher(id, name,dateOfBirth);
    }
    public void removeSportsTeacher(String id){
        sportsTeacherRecord.removeTeacher(id);
    }

    public void processBorrowRequest(String equipmentID, String studentID, Date dateOfIssue) {
         sportsRoom.processBorrowRequest(equipmentID,studentID,dateOfIssue);
    }

    public void IssueFine(int rollno,float amount){
       sportsTeacherRecord.issueFine(rollno,amount);
    }

    public ArrayList<EquipmentRequests> getAllCurrentlyBorrowedEquipmentRecords(){
       return sportsRoom.getAllCurrentlyBorrowedEquipmentRecords();
    }
    public void returnEquipment(int rollNo, String dateOfReturn, int equipmentID, float amount){
        sportsRoom.returnEquipment(rollNo,dateOfReturn,equipmentID,amount);
    }
    public ArrayList<Defaulter> getDefaulters(){
        return sportsRoom.getDefaultersList();
    }
}
