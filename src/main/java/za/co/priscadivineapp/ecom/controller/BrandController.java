package za.co.priscadivineapp.ecom.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.priscadivineapp.ecom.model.Brand;
import za.co.priscadivineapp.ecom.model.Category;
import za.co.priscadivineapp.ecom.repo.BrandRepo;
import za.co.priscadivineapp.ecom.repo.CategoryRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("category")
public class BrandController {

    @Autowired
    BrandRepo brandRepo;
    @Autowired
    CategoryRepo categoryRepo;

    @GetMapping("/all")
    public List<Brand> getAll() {
        List<Brand> brands = new ArrayList<>();
        for(Brand b: brandRepo.findAll()) {
            brands.add(b);
        }
        return brands;
    }
    // category/1/create_brand

   @PutMapping("{cat_id}/create_brand")
   public Brand createBrand(@RequestBody Brand brand, @PathVariable Long cat_id) {
       Optional<Category> category = categoryRepo.findById(cat_id);
       brand.setCategory(category.get());
       return brandRepo.save(brand);
   }

}
