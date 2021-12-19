package com.Cangrejo.repository.crud;

import com.Cangrejo.model.Supplement;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
/**
 *
 * @author Juan Valero
 */
public interface SupplementCrudRepository extends MongoRepository<Supplement, String> {
    public List<Supplement> findByPriceLessThanEqual(double precio);
    //Reto 5
     @Query("{'category':{'$regex':'?0','$options':'i'}}")
    public List<Supplement> findByCategoryLike(String category);
    
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Supplement> findByDescriptionLike(String description);
}
