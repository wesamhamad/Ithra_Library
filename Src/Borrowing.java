public class Borrowing {
    //Fields
    private String borrower;
    private Date []dateBorrowed;
    private static int noOfBorrowed;

    //Constructor
    public Borrowing( String borrower, Date []date) {
        setBorrower(borrower);
        setDateBorrowed(date);
        ++noOfBorrowed;
    }


    public void setBorrower(String b) {
        if(b.length() >= 2)// to make sure not empty
            borrower = b;
    }
    public String getBorrower( ) {return borrower ;}

    public void setDateBorrowed(Date []date) {
        dateBorrowed = date;}
    public Date[] getDateBorrowed() {

        return dateBorrowed;
    }

    public static int getNoOfoBrrowed(){return noOfBorrowed;}


}

