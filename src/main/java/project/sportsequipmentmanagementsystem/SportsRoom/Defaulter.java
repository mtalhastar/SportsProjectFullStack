package project.sportsequipmentmanagementsystem.SportsRoom;

public class Defaulter {

   String studentID;
   String EquipmentName;
   String EquipmentID;
   String timeOfReturn;

   public Defaulter(String studentID, String EquipmentName, String equipmentID, String timeOFreturn){
       this.studentID = studentID;
       this.EquipmentID=equipmentID;
       this.EquipmentName=EquipmentName;
       this.timeOfReturn =timeOFreturn;
   }

    public void setEquipmentID(String equipmentID) {
        EquipmentID = equipmentID;
    }

    public void setEquipmentName(String equipmentName) {
        EquipmentName = equipmentName;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setTimeOfReturn(String timeOfReturn) {
        this.timeOfReturn = timeOfReturn;
    }

    public String getEquipmentID() {
        return EquipmentID;
    }

    public String getEquipmentName() {
        return EquipmentName;
    }

    public String getTimeOfReturn() {
        return timeOfReturn;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Defaulter{" +
                "studentID='" + studentID + '\'' +
                ", EquipmentName='" + EquipmentName + '\'' +
                ", EquipmentID='" + EquipmentID + '\'' +
                ", timeOfReturn='" + timeOfReturn + '\'' +
                '}';
    }
}
