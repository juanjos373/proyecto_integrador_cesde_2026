package co.edu.cesde.ga.app;

import co.edu.cesde.ga.model.Person;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.setUserId(7L);
        person.setCode("123456");
        person.setDocumentNumber("1056785634");
        person.setFirstName("Julian");
        person.setLastName("Silva");
        person.setStatus("ACTIVE");

        System.out.println("User ID: " + person.getUserId());
        System.out.println("Code: " + person.getCode());
        System.out.println("Document Number: " + person.getDocumentNumber());
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Status: " + person.getStatus());

        Person person2 = new Person(2L, "654321", "0987654321", "Jane", "Smith", "INACTIVE");

        System.out.println("User ID: " + person2.getUserId());
        System.out.println("Code: " + person2.getCode());
        System.out.println("Document Number: " + person2.getDocumentNumber());
        System.out.println("First Name: " + person2.getFirstName());
        System.out.println("Last Name: " + person2.getLastName());
        System.out.println("Status: " + person2.getStatus());
    }
}

