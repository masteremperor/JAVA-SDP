public class LoanTester {
    public static void main(String[] args) {
        // Create 2 objects of Loan class using the default constructor
        Loan loan1 = new Loan(123, 456, 10000.0f, 12, 5.0f);
        Loan loan2 = new Loan(789, 101, 15000.0f, 24, 7.5f);

        // Create 2 objects of Loan class using parametrized constructor
        Loan loan3 = new Loan(111, 222, 20000.0f, 18, 6.0f);
        Loan loan4 = new Loan(333, 444, 12000.0f, 36, 8.0f);

        // Use getter methods and display the value of loanCounter for every instance
        System.out.println("Loan Counter for loan1: " + loan1.getLoanCounter());
        System.out.println("Loan Counter for loan2: " + loan2.getLoanCounter());
        System.out.println("Loan Counter for loan3: " + loan3.getLoanCounter());
        System.out.println("Loan Counter for loan4: " + loan4.getLoanCounter());
    }
}

class Loan {
    private int loanNo;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float interest;
    private static int loanCounter;

    // Constructors
    public Loan(int accountNo, int customerNo, float loanAmount, int loanDuration, float interest) {
        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this.loanAmount = loanAmount;
        this.loanDuration = loanDuration;
        this.interest = interest;
        loanCounter++;
    }

    // Getter and Setter methods for each field

    public int getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(int loanNo) {
        this.loanNo = loanNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    // Static method to get loanCounter
    public static int getLoanCounter() {
        return loanCounter;
    }
}