package com.Cangrejo.repository.crud;

import com.Cangrejo.model.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
/**
 *
 * @author Juan Valero
 */
public interface OrderCrudRepository extends MongoRepository<Order, Integer> {
    
    //Retorna las ordenes de pedido que coincidan con la zona recivida como parametro
    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(String zone);
    
    //Para seleccionar la orden con el id maximo
    Optional<Order> findTopByOrderByIdDesc();
}
