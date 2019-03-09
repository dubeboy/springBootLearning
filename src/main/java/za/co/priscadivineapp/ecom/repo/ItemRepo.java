package za.co.priscadivineapp.ecom.repo;

import org.springframework.data.repository.CrudRepository;
import za.co.priscadivineapp.ecom.model.Item;

public interface ItemRepo extends CrudRepository<Item, Long> {


}
