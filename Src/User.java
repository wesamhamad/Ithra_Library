interface orderBook{
    public abstract void orderInfo(String phonNo, String paymentMethod);
}

public class User extends Books implements orderBook{

    //Fields
    private int id;
    private String name;
    private String phonNo;
    private String paymentMethod;

    //Constructor
    public User(String borrower, Date []date,String bookN ,int id, String n,String phone, String paymentM, bookReviews review){
        super(borrower, date, review,bookN);
        setId(id);
        setName(n);
        orderInfo(phone, paymentM);
    }

    // Sets&Gets
    // Concept Used: ch7: - set(with conditions) & get
    public void setId(int id) {this.id = id;}
    public int getId() {return id;}

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setPaymentMethod(String paymentMethod) {
        if(paymentMethod.length() <= 10)
            this.paymentMethod = paymentMethod;
    }
    public String getPaymentMethod() {return paymentMethod;}

    public void setPhonNo(String phonNo) {
        if(phonNo.length() == 10 && phonNo.startsWith("05"))
            this.phonNo = phonNo;
    }
    public String getPhonNo() {return phonNo;}

    public void orderInfo(String phonNo, String paymentMethod){
        setPhonNo(phonNo);
        setPaymentMethod(paymentMethod);
    }

    @Override
    public String toString() {
        return String.format("User id : %d \nUser Name : %s\nPhone Number : %s \nPayment Method : %s\n%s\n",getId(),getName(),getPhonNo(),getPaymentMethod(),super.toString());
    }
}

