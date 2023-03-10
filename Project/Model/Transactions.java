package Model;

public class Transactions {
    private int transactionID;
    private int studentID;
    private String date;
    private int amount;
    public Transactions(int transactionID, int studentID, String date, int amount) {
        this.transactionID = transactionID;
        this.studentID = studentID;
        this.date = date;
        this.amount = amount;
    }
    public int getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }
    public int getStudentID() {
        return studentID;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
