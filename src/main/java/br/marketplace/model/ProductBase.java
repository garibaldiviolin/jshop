package br.marketplace.model;

import java.io.Serializable;
import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public abstract class ProductBase {    

    @Id
    private String barcode;

    @Column(unique=true, nullable=false)
    private String slug;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "This column is required")
    @NotNull(message = "This column is required")
    private String title;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "This column is required")
    @NotNull(message = "This column is required")
    private String description;

    @Column(nullable = false, length = 250)
    @NotBlank(message = "This column is required")
    @NotNull(message = "This column is required")
    private String image;

    @Transient
    private File imageFile;

    @Column(precision=8, scale=2) 
    private Float price;

    @OneToOne
    @NotBlank(message = "This column is required")
    @NotNull(message = "This column is required")
    private Category category;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
