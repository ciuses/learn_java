package ru.ciuse.hw_4_orm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_Price")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer price_id;

    Integer starting;

    Integer final_price;

    String currency;

    public Price() {
    }

    public Price(Integer starting) {
        this.starting = starting;
    }

    public Integer getStarting() {
        return starting;
    }

    public void setStarting(Integer starting) {
        this.starting = starting;
    }

    public Integer getFinal_price() {
        return final_price;
    }

    public void setFinal_price(Integer final_price) {
        this.final_price = final_price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Price{" +
                "price_id=" + price_id +
                ", starting=" + starting +
                ", final_price=" + final_price +
                ", currency='" + currency + '\'' +
                '}';
    }
}
