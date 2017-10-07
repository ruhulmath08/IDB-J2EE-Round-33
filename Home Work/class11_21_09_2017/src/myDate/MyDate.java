package myDate;

public class MyDate {
    private int day = 23;
    private int month = 9;
    private int year = 2017;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public MyDate(MyDate myDate) {
        this.day = myDate.day;
    }
    
    public MyDate(int month, int year) {
        MyDate obj = new MyDate(this);
        this.month = month;
        this.year = year;
    } 
    
    public MyDate addDay (int moreDays){
        MyDate newDate = new MyDate(this);
        newDate.day = newDate.day + moreDays;
        return newDate;
    }

    @Override
    public String toString() {
        return "MyDate{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }
    
    
    
}
