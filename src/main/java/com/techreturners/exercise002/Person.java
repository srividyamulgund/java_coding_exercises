package com.techreturners.exercise002;

public class Person {
    String firstName;
    String lastName;
    String city;
    int age;

    public Person(String fn, String ln, String cty, int ag) {
        this.firstName = fn;
        this.lastName = ln;
        this.city = cty;
        this.age = ag;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

}
