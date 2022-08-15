package project.sportsequipmentmanagementsystem.SportsRoom;

import project.sportsequipmentmanagementsystem.Date;
import project.sportsequipmentmanagementsystem.persistence.PersistenceFactory;

public class EquipmentBorrowRecord {

    public String equipmentID;
    public String studentID;
    public Date dateOfIssue;
    public Date dateOfReturn;
    public Float fine;

    public EquipmentBorrowRecord(String equipmentID, String studentID, Date dateOfIssue){
        this.equipmentID = equipmentID;
        this.studentID = studentID;
        this.dateOfIssue = dateOfIssue;
    }

    public String getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(String equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Date getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(Date dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public Float getFine() {
        return fine;
    }

    public void setFine(Float fine) {
        this.fine = fine;
    }
}
