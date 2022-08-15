package project.sportsequipmentmanagementsystem;

public class Date {
    private Integer day;
    private Integer month;
    private Integer year;

    public Date (String date){
        if (date.length() > 8){
            date = date.replaceAll("/","");
            date = date.replaceAll("-","");
        }
        this.year = Integer.parseInt(date.substring(0,4));
        this.month = Integer.parseInt(date.substring(4,6));
        this.day = Integer.parseInt(date.substring(6));
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String convert(){
        return getYear()+"/"+getMonth()+"/"+getDay();
    }

    @Override
    public String toString() {
        return year.toString() + "-" + month.toString() + "-" + day.toString();
    }
}
