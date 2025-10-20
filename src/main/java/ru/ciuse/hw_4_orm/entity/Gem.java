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

    @Override
    public String toString() {
        return "Gem{" +
                "gem_id=" + gem_id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Gem{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
}


