/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patstake1;

/**
 *
 * @author YishaiBasserabie
 */
public class fetchPayments {
    private int StudentID, payDuration;
    private boolean paid;
    private String PayDate, PayTime;

    public fetchPayments(int StudentID, int payDuration, boolean paid, String PayDate, String PayTime) {
        this.StudentID = StudentID;
        this.payDuration = payDuration;
        this.paid = paid;
        this.PayDate = PayDate;
        this.PayTime = PayTime;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public int getPayDuration() {
        return payDuration;
    }

    public void setPayDuration(int payDuration) {
        this.payDuration = payDuration;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getPayDate() {
        return PayDate;
    }

    public void setPayDate(String PayDate) {
        this.PayDate = PayDate;
    }

    public String getPayTime() {
        return PayTime;
    }

    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    

    
}
