package edu.najah.eng.solid.lsp.assignment;

import java.util.ArrayList;

public abstract class Operations {
    protected ArrayList<Offer> offers = null;

    abstract void addOffers(Offer offer);

    public ArrayList<Offer> getOffers() {
        ArrayList<Offer> tmpOffers = new ArrayList<>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers;
    }
}
