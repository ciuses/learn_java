package ru.ciuse.hw_4_orm.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "tbl_Gem")
public class Gem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer gem_id;

    String name;
    String type;
    Double price;

    @OneToOne
    private Owner owner;

    @OneToOne
    private Occurrence occurrence;

//    @ManyToMany
//    private Auction auction;

    public Gem() {
    }

    public Gem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Occurrence getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(Occurrence occurrence) {
        this.occurrence = occurrence;
    }

//    public Auction getAuction() {
//        return auction;
//    }
//
//    public void setAuction(Auction auction) {
//        this.auction = auction;
//    }

    @Override
    public String toString() {
        return "Gem{" +
                "gem_id=" + gem_id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

}


