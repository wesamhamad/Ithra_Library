import java.util.Scanner;

 class Ithra {
    //Fields
    protected final String LibraryName ;
    protected final String CITY ;
    protected final int NOOFFLOOERS;
    protected final String OPEANINGHOURE;
    /* since they are final then will be protected from changing so no need to be private with (set&get)
     concepts used : ch8: - protected & final instance */

    public Ithra(){
        CITY = "Dammam";
        NOOFFLOOERS = 3;
        OPEANINGHOURE = "8 AM";
        LibraryName = "King Abdulaziz Center for World Culture - Ithra";
    }

    public static void sale(Date d){
        Date date = new Date(d);
        if(Borrowing.getNoOfoBrrowed() == 2 && date.getYear() == 2021 ){
            System.out.println("\n** Congrats you git 10% sale ** ");
        }
    }
    // concept used :  ch7: - Static (dealing with non-static)

    @Override
    public String toString() {
        return "----------- Library Info :-----------\n" +
                "Library Name is " + LibraryName + '\n' +
                "Location " + CITY + '\n' +
                "Number Of Floors = " + NOOFFLOOERS +'\n' +
                "Opening Hour = " + OPEANINGHOURE +'\n' ;
    }
    // concept used : ch8 : - toString
}


public class Main {
    //Fields
    private final static int STARTDATE = 0;
    private final static int ENDDATE = 1;
    private final static Scanner input = new Scanner(System.in);
    private static bookReviews r; // concepts used: ch8&10: - composition & interface & static filed

    public static void main(String[] args) {
        int y,m,d;
        Date []DateOfBorrowed = new Date [2];//concept used: ch7: - array of objects

        //Library info
        Ithra ithra = new Ithra();
        System.out.println(ithra);

        //Customer info & feedback
        System.out.println("\nWelcome To Ithra Library ");
        System.out.print("Please enter date of borrowed :");
        y = input.nextInt();
        m = input.nextInt();
        d = input.nextInt();

        // Create Date object which is borrowed date
        DateOfBorrowed[STARTDATE] = new Date(y, m, d);

        System.out.print("Please enter date of return :");
        y = input.nextInt();// no need to create new variables since the first object's fields already initialized
        m = input.nextInt();
        d = input.nextInt();

        // Create Date object which is return date
        DateOfBorrowed[ENDDATE] = new Date(y, m, d);

        System.out.println("\n----------- Customers Info :-----------");
        User customer1 = new User("Student",DateOfBorrowed, "Notes For Professionals",411, "Wesam", "0555555555","Visa",r );
        System.out.println(customer1);
        bookReviews reviewc1 = new bookReviews();
        reviewc1.feedback();




        // Another customer info & feedback
        System.out.println("\n\nWelcome To Ithra Library ");
        System.out.print("Please enter date of borrowed :");
        y = input.nextInt();
        m = input.nextInt();
        d = input.nextInt();

        // Create Date object which is borrowed date
        DateOfBorrowed[STARTDATE] = new Date(y, m, d);

        System.out.print("Please enter date of return :");
        y = input.nextInt();// no need to create new variables since the first object's fields already initialized
        m = input.nextInt();
        d = input.nextInt();

        // Create Date object which is return date
        DateOfBorrowed[ENDDATE] = new Date(y, m, d);
        User customer2 = new User("Student",DateOfBorrowed, "We Were Liars",381, "Betool", "0555444444","Mada",r );
        System.out.println(customer2);
        bookReviews reviewc2 = new bookReviews();
        reviewc2.feedback();

        Ithra.sale(DateOfBorrowed[STARTDATE]);

        System.out.printf("\n\n-----------Reviews :----------- \nBook name: %s \nReview: %s \nBook name: %s \nReview:% s \n",customer1.getBookName(),reviewc1.getReview(),customer2.getBookName(),reviewc2.getReview());
    }
}


// concept used :
/*
    ch7:
    - set(with conditions) & get
   - customized constructor
   - Static (dealing with non-static) & non-static fields & methods
   - array of objects

    ch8 :
   - toString
   - this keyword
   - overloading constructor
   - final instance
   - composition

   ch9:
   - inheritance
   - super(arguments)
   - protected
   -override with @Override


   ch10
   - abstract
   - interface

 */