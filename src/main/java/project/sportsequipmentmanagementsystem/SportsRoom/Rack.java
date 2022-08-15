package project.sportsequipmentmanagementsystem.SportsRoom;

import project.sportsequipmentmanagementsystem.SportsRoom.Equipment;
import project.sportsequipmentmanagementsystem.persistence.PersistenceFactory;

import java.util.ArrayList;

public class Rack {
    public void addEquipment(String equipmentID, String name, String brand, String availability, String roomID){
        Equipment equipmentToAdd = new Equipment(equipmentID, name, brand, availability, roomID);
        PersistenceFactory.getConnection().addEquipment(equipmentToAdd);
    }

    public void removeEquipment(String equipmentID){
        PersistenceFactory.getConnection().removeEquipment(equipmentID);
    }

    public void editEquipment(String equipmentID, String name, String brand, String availability, String room){
        Equipment equipmentToEdit = new Equipment(equipmentID, name, brand, availability, room);
        PersistenceFactory.getConnection().editEquipment(equipmentToEdit);
    }

    public ArrayList<Equipment> getAllEquipment(){
        return PersistenceFactory.getConnection().getAllEquipments();
    }

}
