package edu.najah.eng.solid.lsp.assignment;

import java.util.ArrayList;

public class Customer extends Operations{

    public Customer(){
        offers = new ArrayList<>();
    }
    public void addOffers(Offer offer) {
        this.offers.add(offer);
    }

}


