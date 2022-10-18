package edu.najah.eng.solid.di.example.good.impl;

import edu.najah.eng.solid.di.example.good.intf.PasswordEncoder;

public class Base64Hasher implements PasswordEncoder {

    public int hashPassword(String password) {
        int hash = 7;
        for (int i = 0; i < password.length(); i++) {
            hash = hash*31 + password.charAt(i);
        }
        return hash;
    }

    @Override
    public int encoder(String password) {
        return hashPassword(password);
    }
}
