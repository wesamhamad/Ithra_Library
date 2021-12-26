import java.util.Scanner;

abstract class reviews{
    abstract void feedback();
}
// Concept used: ch10: - abstract

public class Books extends Borrowing {  // Concept used: ch9: - inheritance
    //Fields
    private String bookName;
    private bookReviews review; // concepts used: ch8: - composition


    //constructor
    public Books( String b, Date []d, bookReviews r,String bookN){
        super(b, d);
        review = r;
        setBookName(bookN);
    }
    // Concept used: ch9: - customized constructor & super()

    // Set&Gets
    public void setBookName(String bn) {
        if(bn.length() >= 2)// to make sure not empty
         bookName = bn;
    }
    public String getBookName() {return bookName;}

    @Override
    public String toString(){
        return String.format("Borrower Is a %s \nBook Name: %s \nDate Of Borrowed:\nBorrowed:%s \nReturned: %s\n \nNumber Of Borrowed for this book : %d "
                ,getBorrower(),getBookName(),getDateBorrowed()[0],getDateBorrowed()[1],getNoOfoBrrowed());
    }
    //Concept used: ch9: -Override
}

class bookReviews extends reviews{
    private String review;
    public void feedback(){
        Scanner input = new Scanner(System.in);
        System.out.println("Leave your feedback: " );
        review = input.nextLine();
    }

    public String getReview() {return review;}
}


