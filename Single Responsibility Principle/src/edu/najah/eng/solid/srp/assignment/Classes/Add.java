package edu.najah.eng.solid.srp.assignment.Classes;

import edu.najah.eng.solid.srp.assignment.Interfaces.IOperations;

public class Add implements IOperations {


    public Add(long amount, Object invoiceDate) {
        // super(amount, invoiceDate);
    }

    public static void add(Invoice add) {
    }
    // connect to database
    // execute insert command to add new record in database
    //close the database connection
    // Once Invoice has been added , send mail
    MailMessage mailMessage = new MailMessage("MailAddressFrom","MailAddressTo","MailSubject","MailBody");
    //add.sendEmail(mailMessage);
}


