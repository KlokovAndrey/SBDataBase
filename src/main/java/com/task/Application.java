package com.task;


import com.task.entity.Customer;
import com.task.repository.CustomerRepository;
import com.task.service.BookService;
import com.task.service.BuyService;
import com.task.service.CustomerService;
import com.task.service.StoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application  implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

//    @Autowired
//    private CustomerRepository customerRepository;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private StoreService storeService;
    @Autowired
    private BookService bookService;
    @Autowired
    private BuyService buyService;
    @Autowired
    private CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {



        log.info("find all");
//        customerRepository.findAll().forEach(System.out::println);
        customerService.findAll().forEach(System.out::println);
        storeService.findAll().forEach(System.out::println);
        bookService.findAll().forEach(System.out::println);
        buyService.findAll().forEach(System.out::println);

    }
}


//import com.task.entity.Customer;
//import com.task.repository.CustomerRepository;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//@EnableAutoConfiguration
//public class Application {
//
//    public static void main(String[] args) {
//
//        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
//        CustomerRepository repository = context.getBean(CustomerRepository.class);
//
//        // save a couple of customers
//        repository.save(new Customer("Королев", "Автозаводский", 5));
//        repository.save(new Customer("Котлов", "Советский", 15));
//        repository.save(new Customer("Головотюк", "Приокский", 25));
//
//        // fetch all customers
//        Iterable<Customer> customers = repository.findAll();
//        System.out.println("Customers found with findAll():");
//        System.out.println("-------------------------------");
//        for (Customer customer : customers) {
//            System.out.println(customer);
//        }
//        System.out.println();
//
//
//
//        context.close();
//    }
//
//}