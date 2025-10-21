package ru.ciuse.hw_4_orm.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "tbl_Auction")
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer auc_id;

    String name;
    String city;
    String date;

    @ManyToOne
    private Gem gem;


    public Auction() {
    }

    public Auction(String name) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Gem getGem() {
        return gem;
    }

    public void setGem(Gem gem) {
        this.gem = gem;
    }

    @Override
    public String toString() {
        return "Auction{" +
                "auc_id=" + auc_id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

}
