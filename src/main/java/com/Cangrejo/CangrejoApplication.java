package com.Cangrejo;

import com.Cangrejo.repository.crud.OrderCrudRepository;
import com.Cangrejo.repository.crud.SupplementCrudRepository;
import com.Cangrejo.repository.crud.UserCrudRepository;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *
 * @author Juan Valero
 */
@SpringBootApplication
public class CangrejoApplication implements CommandLineRunner {

    @Autowired
    private UserCrudRepository userRepo;

    @Autowired
    private SupplementCrudRepository supRepo;
    
    @Autowired
    private OrderCrudRepository orderRepo;

    public static void main(String[] args) {
        SpringApplication.run(CangrejoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepo.deleteAll();
        supRepo.deleteAll();
        orderRepo.deleteAll();

        //para efectos de formateo de fechas
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
   
    }

}
