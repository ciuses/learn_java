package ru.ciuse.hw_5_web.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tbl_Occurrence")
public class Occurrence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer occ_id;

    String country;
    String place;
    String date;

    public Occurrence() {
    }

    public Occurrence(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Occurrence{" +
                "occ_id=" + occ_id +
                ", country='" + country + '\'' +
                ", place='" + place + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
