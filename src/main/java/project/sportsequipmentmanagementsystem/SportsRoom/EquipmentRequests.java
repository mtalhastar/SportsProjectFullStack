package project.sportsequipmentmanagementsystem.SportsRoom;

import project.sportsequipmentmanagementsystem.Date;

public class EquipmentRequests {
    String StudentID;
    String IssuedEquipmentName;
    Date IssuedDate;
    String EquipmentID;

    public EquipmentRequests(String StudentID,String IssuedEquipmentName,Date IssuedDate,String EquipmentID){
        this.StudentID=StudentID;
        this.IssuedEquipmentName=IssuedEquipmentName;
        this.IssuedDate=IssuedDate;
        this.EquipmentID=EquipmentID;
    }

    public String getEquipmentID() {
        return EquipmentID;
    }

    public Date getIssuedDate() {
        return IssuedDate;
    }

    public String getIssuedEquipmentName() {
        return IssuedEquipmentName;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setEquipmentID(String equipmentID) {
        EquipmentID = equipmentID;
    }

    public void setIssuedDate(Date issuedDate) {
        IssuedDate = issuedDate;
    }

    public void setIssuedEquipmentName(String issuedEquipmentName) {
        IssuedEquipmentName = issuedEquipmentName;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    @Override
    public String toString() {
        return "EquipmentRequests{" +
                "StudentID='" + StudentID + '\'' +
                ", IssuedEquipmentName='" + IssuedEquipmentName + '\'' +
                ", IssuedDate=" + IssuedDate +
                ", EquipmentID='" + EquipmentID + '\'' +
                '}';
    }
}
