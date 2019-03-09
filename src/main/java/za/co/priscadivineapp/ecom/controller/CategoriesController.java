package za.co.priscadivineapp.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.priscadivineapp.ecom.model.Category;
import za.co.priscadivineapp.ecom.repo.CategoryRepo;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("category")
public class CategoriesController {

    //so we want to be able to add categories
    //we also want to be able to show all the categories

    @Autowired
    private CategoryRepo categoryRepo;

    @GetMapping("/all")
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<Category>();
        for (Category c : categoryRepo.findAll()) {
            categories.add(c);
        }
        return categories;
    }

    @PutMapping("create_category")
    public Category createCategory(@RequestBody Category category) {
        return categoryRepo.save(category);
    }





}
