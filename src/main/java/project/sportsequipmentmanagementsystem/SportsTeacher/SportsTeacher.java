package project.sportsequipmentmanagementsystem.SportsTeacher;

import project.sportsequipmentmanagementsystem.Date;

public class SportsTeacher {
    private String id;
    private String name;
    private Date dateOfBirth;

    public SportsTeacher(){}

    public SportsTeacher(String id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    void IssueFine(){



    }
}
