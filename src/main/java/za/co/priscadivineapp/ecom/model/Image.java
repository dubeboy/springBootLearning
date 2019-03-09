package za.co.priscadivineapp.ecom.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Image {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String imageUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
