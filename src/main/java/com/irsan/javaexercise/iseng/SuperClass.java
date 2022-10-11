package com.irsan.javaexercise.iseng;

public class SuperClass {
    private String email;
    private String password;

    @Override
    public String toString() {
        return "email='" + email + '\'' + ", password='" + password + '\'';
    }

    public SuperClass() {
    }

    public SuperClass(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class ChildClass extends SuperClass {
    private String name;
    private String username;
    private String address;
    private Long phoneNumber;

    @Override
    public String toString() {
        return super.toString() + ", name='" + name + '\'' + ", username='" + username + '\'' + ", address='" + address + '\'' + ", phoneNumber=" + phoneNumber;
    }

    public ChildClass() {
    }

    public ChildClass(String name, String username, String address, Long phoneNumber) {
        this.name = name;
        this.username = username;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public ChildClass(String email, String password, String name, String username, String address, Long phoneNumber) {
        super(email, password);
        this.name = name;
        this.username = username;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

class Demo {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass("irsanr6@gmail.com", "irsanramadhan13", "Irsan Ramadhan", "irsan.ramadhan", "Jln Kayu Jati", 3123L);
        String s = cc.toString();
        System.out.println("toString -> " + s);
    }
}
