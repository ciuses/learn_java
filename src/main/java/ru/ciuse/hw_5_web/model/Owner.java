package ru.ciuse.hw_5_web.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tbl_Owner")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer owner_id;

    String name;
    String city;
    String contact;


    public Owner() {
    }

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    @Override
    public String toString() {
        return "Owner{" +
                "owner_id=" + owner_id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}


