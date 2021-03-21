package org.example.pojo;

import java.math.BigDecimal;

public class Product {
    private Integer id;

    private Byte categoryId;

    private String name;

    private String image;

    private BigDecimal maketPrice;

    private BigDecimal price;

    private Byte status;

    private String productDescrption;

    private String productNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Byte categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public BigDecimal getMaketPrice() {
        return maketPrice;
    }

    public void setMaketPrice(BigDecimal maketPrice) {
        this.maketPrice = maketPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getProductDescrption() {
        return productDescrption;
    }

    public void setProductDescrption(String productDescrption) {
        this.productDescrption = productDescrption == null ? null : productDescrption.trim();
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber == null ? null : productNumber.trim();
    }
}