package com.company.user;

public class Admin extends User {


    public Admin(long uniqueId, String firstName, String lastName, String email, String password) {
        super(uniqueId, "customer", firstName, lastName, email, password);
    }
}