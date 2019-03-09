package za.co.priscadivineapp.ecom.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import za.co.priscadivineapp.ecom.model.Category;

import java.util.List;

public interface CategoryRepo extends CrudRepository<Category, Long> {

  //  @Query(value = "select * from Category where name= 0 ")
  //  List<Category> getHH(String name);



}
