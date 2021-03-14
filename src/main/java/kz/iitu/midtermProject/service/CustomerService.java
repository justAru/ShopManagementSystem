package kz.iitu.midtermProject.service;

import kz.iitu.midtermProject.model.Customer;
import kz.iitu.midtermProject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class CustomerService {
    Scanner scanner = new Scanner(System.in);

    @Autowired
    private CustomerRepository customerRepository;

    public void deleteCustomer(){
        listOfCustomers();
        System.out.println("Enter id: ");
        long id = scanner.nextInt();
        Customer customer = customerRepository.findCustomerById(id);
        customerRepository.delete(customer);
        System.out.println("**********************************");
        System.out.println("*             RESULT             *");
        System.out.println("Item deleted successfully! ");
        listOfCustomers();
    }

    public void listOfCustomers(){
        List<Customer> customers = customerRepository.findAll();
        System.out.println("**********************************");
        System.out.println("*              ITEMS             *");
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    public void updateCustomerInfo(){
        listOfCustomers();
        System.out.println("Enter id: ");
        long id = scanner.nextInt();
        Customer customer = customerRepository.findCustomerById(id);
        System.out.println("Update info: \n");
        System.out.println("First name: ");
        customer.setFirstname(scanner.next());
        System.out.println("Last name: ");
        customer.setLastname(scanner.next());
        System.out.println("Email: ");
        customer.setEmail(scanner.next());
        customerRepository.save(customer);
        System.out.println("**********************************");
        System.out.println("*             RESULT             *");
        System.out.println("Info changed successfully! " + customer.toString());
    }

    public void createCustomer(){
        Customer customer = new Customer();
        System.out.println("First name: ");
        customer.setFirstname(scanner.next());
        System.out.println("Last name: ");
        customer.setLastname(scanner.next());
        System.out.println("Email: ");
        customer.setEmail(scanner.next());

        customerRepository.save(customer);
        System.out.println("**********************************");
        System.out.println("*             RESULT             *");
        System.out.println("Customer added successfully! " + customer.toString());
    }
}
