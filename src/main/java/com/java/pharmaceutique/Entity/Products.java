package com.java.pharmaceutique.Entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;

@Entity
@Table
@Data

public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String description;

}

