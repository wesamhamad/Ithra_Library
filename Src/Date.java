public class Date {
    //Fields
    private int year;
    private int month;
    private int day;
    //Constructor
    //Concept used: ch8: -Overloading Constructor
    public Date(int y, int m, int d){
        setYear(y);
        setMonth(m);
        setDay(d);
    }
    public Date(Date d){
        this(d.getYear(), d.getMonth(), d.getDay());
    }

    //Sets&Gets methods
    public void setYear(int y) {
        if(y >= 2016) // 2016 opening year of Ithra library
        year = y;
    }
    public int getYear() {return year;}

    public void setMonth(int m) {
        if(m > 0 && m <= 12)
            month = m;
    }
    public int getMonth() {return month;}

    public void setDay(int d) {
        if(d > 0 && d <= 30)
            day = d;
    }

    public int getDay() {return day;}

    @Override
    public String toString() {
        return String.format("%04d/%02d/%02d",getYear(),getMonth(),getDay());
    }
}
