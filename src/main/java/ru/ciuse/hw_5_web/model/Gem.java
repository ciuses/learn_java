package ru.ciuse.hw_5_web.model;
import jakarta.persistence.*;


@Entity
@Table(name = "tbl_Gem")
public class Gem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer gem_id;

    String name;
    String type;


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

}


