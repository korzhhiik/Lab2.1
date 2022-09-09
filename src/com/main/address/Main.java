package com.main.address;

public class Main {
    public static void main(String[] args) {
        var address = new Address();

        address.setIndex("01234");
        address.setApartment("23");
        address.setCity("Kiev");
        address.setStreet("Obolonsky Prospect");
        address.setHouse("23A");
        address.setCountry("Ukraine");

        System.out.println(address);
    }
}
