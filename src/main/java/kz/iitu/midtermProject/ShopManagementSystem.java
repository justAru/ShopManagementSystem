package kz.iitu.midtermProject;

import kz.iitu.midtermProject.config.ProjectConfig;
import kz.iitu.midtermProject.model.Customer;
import kz.iitu.midtermProject.service.CustomerService;
import kz.iitu.midtermProject.service.ItemService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class ShopManagementSystem {
    Scanner scanner = new Scanner(System.in);
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    ItemService itemService = context.getBean(ItemService.class);
    CustomerService customerService = context.getBean(CustomerService.class);

    public void menu(){
            System.out.println("******************************************");
            System.out.println("*                WELCOME!                *");
        while (true){
            System.out.println("         Choose 1-2?          ");
            System.out.println("         1. Customer management");
            System.out.println("         2. Items management");
            System.out.println("         0. EXIT");
            int choice = scanner.nextInt();
            if (choice == 1){
                customerMenu();
            } else if (choice == 2){
                itemMenu();
            } else if (choice == 0){
                System.exit(404);
            } else {
                System.out.println("Try again!");
            }
        }
    }


    public void customerMenu(){
        while (true) {
            System.out.println("\n\n***************************************");
            System.out.println("*       MENU                          *");
            System.out.println("*       1. Add customer*              *");
            System.out.println("*       2. Update customer info       *");
            System.out.println("*       3. List of customers          *");
            System.out.println("*       4. Delete customer            *");
            System.out.println("*       0. Exit                       *");
            System.out.println("***************************************");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    customerService.createCustomer();
                    break;
                case 2:
                    customerService.updateCustomerInfo();
                    break;
                case 3:
                    customerService.listOfCustomers();
                    break;
                case 4:
                    customerService.deleteCustomer();
                    break;
                case 0:
                    menu();
                    return;
            }
        }
    }

    public void itemMenu(){
        while (true) {
            System.out.println("\n\n*****************************************");
            System.out.println("*           MENU                        *");
            System.out.println("*           1. Add item                 *");
            System.out.println("*           2. Update price             *");
            System.out.println("*           3. Update description       *");
            System.out.println("*           4. List of items            *");
            System.out.println("*           5. Delete item              *");
            System.out.println("*           0. Exit                     *");
            System.out.println("*****************************************");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    itemService.create();
                    break;
                case 2:
                    itemService.updatePrice();
                    break;
                case 3:
                    itemService.updateDescription();
                    break;
                case 4:
                    itemService.listOfItems();
                    break;
                case 5:
                    itemService.delete();
                case 0:
                    menu();
                    return;
            }
        }
    }
}
