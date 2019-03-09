package za.co.priscadivineapp.ecom.model;

import java.util.List;

public class Category {

    private Integer id;
    private String name;
    private List<Brand> brands;

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

    public List<Brand> getBrand() {
        return brands;
    }

    public void setBrand(List <Brand> brands) {
        this.brands = brands;
    }
}
