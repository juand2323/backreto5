package com.Cangrejo.repository;

import com.Cangrejo.model.Supplement;
import com.Cangrejo.repository.crud.SupplementCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Juan Valero
 */
@Repository
public class SupplementRepository {

    @Autowired
    private SupplementCrudRepository crudInterface;

    public List<Supplement> listAll() {
        return crudInterface.findAll();
    }

    public Optional<Supplement> getSupplement(String reference) {
        return crudInterface.findById(reference);
    }

    public Supplement create(Supplement clothe) {
        return crudInterface.save(clothe);
    }

    public void update(Supplement clothe) {
        crudInterface.save(clothe);
    }

    public void delete(Supplement clothe) {
        crudInterface.delete(clothe);
    }
    //Reto 5
    public List<Supplement> gadgetsByPrice(double precio) {
        return crudInterface.findByPriceLessThanEqual(precio);
    }
    public List<Supplement> findByCategoryLike(String category) {
        return crudInterface.findByCategoryLike(category);
    }
    //Reto 5
    public List<Supplement> findByDescriptionLike(String description) {
        return crudInterface.findByDescriptionLike(description);
    }
}
