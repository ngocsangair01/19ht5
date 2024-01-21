package org.example.buoi3.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String code;

    private String guarantee;

    private String condition;

    private String price;

    private String salePrice;

    private String info;

    private String specification;

    private String document;

    private String accessory;

    @ManyToOne
    @JoinColumn(name = "id_category")
    @JsonIgnore
    private Category category;
}
