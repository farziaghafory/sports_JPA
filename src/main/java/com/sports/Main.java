
package com.sports;

import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        Persistence.createEntityManagerFactory("sport_JPA");

        System.out.println("It is workinggg!!! ohooo!!!");
    }
}