package za.co.priscadivineapp.ecom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("all")
public class MainController {

    @GetMapping
    String getAllItems() {
        return "Hello";
    }

    // CRUD
    // POST
    // DELETE
    // GET
    // Patch
    // PUT

}
