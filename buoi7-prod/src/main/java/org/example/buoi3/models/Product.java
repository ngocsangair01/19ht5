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

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "guarantee")
    private String guarantee;

    @Column(name = "condition")
    private String condition;

    @Column(name = "price")
    private String price;

    @Column(name = "sale_price")
    private String salePrice;

    @Column(name = "info")
    private String info;

    @Column(name = "specification")
    private String specification;

    @Column(name = "document")
    private String document;

    @Column(name = "accessory")
    private String accessory;

    @ManyToOne
    @JoinColumn(name = "id_category")
    @JsonIgnore
    private Category category;

    public Product() {
    }

    public Product(Long id, String name, String code, String guarantee, String condition, String price, String salePrice, String info, String specification, String document, String accessory, Category category) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.guarantee = guarantee;
        this.condition = condition;
        this.price = price;
        this.salePrice = salePrice;
        this.info = info;
        this.specification = specification;
        this.document = document;
        this.accessory = accessory;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
