package edu.najah.eng.solid.srp.assignment.Classes;

import edu.najah.eng.solid.srp.assignment.Classes.Invoice;
import edu.najah.eng.solid.srp.assignment.Classes.MailMessage;
import edu.najah.eng.solid.srp.assignment.Interfaces.IsendEmail;

public class sendEmail implements IsendEmail {

    public sendEmail(MailMessage mailMessage) {

        super();
        if (mailMessage.isValidMessage()) {
            // Code for getting Email setting and send invoice mail
        }
            else {
            //show error message for the user
        }
    }
}
