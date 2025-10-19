package ru.ciuse.hw_4_orm.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "tbl_gem_name")
public class Gem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;

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

    @Override
    public String toString() {
        return "Gem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


