package com.kodilla.hibernate2.invoice;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public class Product {


    private String name;
    private int id;
    private List<Item> items = new ArrayList<>();

    public Product() {

    }

    public Product(String name) {
        this.name = name;
    }

    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @OneToMany (
            targetEntity = Item.class,
            mappedBy = "product",
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    private void setItems(List<Item> items) {
        this.items = items;
    }

    private void setName(String name) {
        this.name = name;
    }


    private void setId(int id) {
        this.id = id;
    }
}
