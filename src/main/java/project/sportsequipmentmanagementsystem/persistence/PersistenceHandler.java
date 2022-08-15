package project.sportsequipmentmanagementsystem.persistence;

import project.sportsequipmentmanagementsystem.SportsRoom.Defaulter;
import project.sportsequipmentmanagementsystem.SportsRoom.Equipment;
import project.sportsequipmentmanagementsystem.SportsRoom.EquipmentBorrowRecord;
import project.sportsequipmentmanagementsystem.SportsRoom.EquipmentRequests;
import project.sportsequipmentmanagementsystem.SportsTeacher.SportsTeacher;
import project.sportsequipmentmanagementsystem.Student.Student;

import java.util.ArrayList;

public interface PersistenceHandler {
    void addStudent(Student student);
    ArrayList<Student> getAllStudents();
    void removeStudent(String rollNumber);
    void editStudent(Student student);
    ArrayList<Equipment> getAllEquipments();
    void addEquipment(Equipment equipment);
    void removeEquipment(String equipmentID);
    void editEquipment(Equipment equipment);
    ArrayList<SportsTeacher> getAllSportsTeacher();
    void addSportTeacher(SportsTeacher sportsTeacher);
    void removeSportsTeacher(String id);
    void  issueFine(int rollno,float amount);
    ArrayList<EquipmentRequests> getAllCurrentlyBorrowedEquipmentRecords();
    void EquipmentReturned(int rollNo,String date,int equipmentID,float amount);
    ArrayList<Defaulter> getDefaulters();
    void processBorrowRequest(EquipmentBorrowRecord equipmentBorrowRecord);
}
