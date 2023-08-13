package com.Student;

public class Studentdata {
    private int ID;
    private String name;
    private String phone;
    private String City;

    public Studentdata(int ID, String name, String phone, String city) {
        super();
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        this.City = city;
    }
    public Studentdata(String name, String phone, String city) {
        super();
        this.name = name;
        this.phone = phone;
        this.City = city;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCity() {
        return City;
    }

    public Studentdata() {
        super();
    }

    @Override
    public String toString() {
        return "Studentdata{" +
                "ID=" + ID +
                ", Name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}
