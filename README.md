# Ithra Library Using java 
 Implementation of concepts studies on course IT214, to utilize my programming skills and apply what I learned.

## Concepts Used: 
``
In source code, I left a comment in each place that one of these applies.
``
### ch7:
   - set(with conditions) & get 
   - customized constructor 
   - Static (dealing with non-static) & non-static fields & methods
   - array of objects 

### ch8 :
   - toString 
   - this keyword 
   - overloading constructor 
   - final instance 
   - composition 

### ch9:
   - inheritance 
   - super(arguments) 
   - protected
   - override with @Override 


### ch10:
   - abstract 
   - interface 

#### In [Books](https://github.com/wesamhamad/Ithra_Library_simulation/blob/main/Src/Books.java) class I use composition as an object as shown belowe :
  
```java
import java.util.Scanner;

abstract class reviews{
    abstract void feedback();
}
// Concept used: ch10: - abstract

public class Books extends Borrowing {  // Concept used: ch9: - inheritance
    //Fields
    private String bookName;
    private bookReviews review; // Concept used: ch8: - composition 


    //constructor
    public Books( String b, Date []d, bookReviews r,String bookN){
        super(b, d);
        review = r;
        setBookName(bookN);
    }
}
```
#### While in [Borrowing](https://github.com/wesamhamad/Ithra_Library/blob/main/Src/Borrowing.java) class I use composition as array of object with set&get methods (get return type is array of Date data type ) :
```java
public class Borrowing {
    //Fields
    private String borrower;
    private Date []dateBorrowed; // concepts used: ch8: - composition
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

    public void setDateBorrowed(Date []date) {dateBorrowed = date;}
    public Date[] getDateBorrowed() {return dateBorrowed;}

    public static int getNoOfoBrrowed(){return noOfBorrowed;}


}


```

``
NOTE: this program only for learning purpose, so sure need to improvements .
``
