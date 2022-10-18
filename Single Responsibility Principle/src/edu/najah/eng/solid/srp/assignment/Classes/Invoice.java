package edu.najah.eng.solid.srp.assignment.Classes;

//import java.util.Date;

/**
 * What are the responsibilities for this class?
 * Do the required change to make this class single responsibility
 */
public class Invoice<Date> {

    private long amount;
    private Date invoiceDate;

    public Invoice(long amount, Date invoiceDate) {
        this.amount = amount;
        this.invoiceDate = invoiceDate;
    }

   private Add add;
    private Delete delete;
    private sendEmail sendemail;

    public Invoice() {

    }

    public void add()  {
        Add.add(this);
    }
    public void delete()  {
        // connect to database
        // execute delete command to delete the invoice from the database
        //close the database connection
    }


    public void sendEmail(MailMessage mailMessage)  {


    }


    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Add getAdd() {
        return add;
    }

    public void setAdd(Add add) {
        this.add = add;
    }
}
