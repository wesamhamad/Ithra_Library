# Ithra Library Simulation
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
   -override with @Override 


### ch10
   - abstract 
   - interface 

In [Books]() class I combine to concepts which are composition & interface as shown belowe :
  
```java
import java.util.Scanner;

abstract class reviews{
    abstract void feedback();
}
// Concept used: ch10: - abstract

public class Books extends Borrowing {  // Concept used: ch9: - inheritance
    //Fields
    private String bookName;
    private bookReviews review; // concepts used: ch8&10: - composition & interface


    //constructor
    public Books( String b, Date []d, bookReviews r,String bookN){
        super(b, d);
        review = r;
        setBookName(bookN);
    }
}
```

``
NOTE: this program only for learning purpose, so sure need to improvements .
``
