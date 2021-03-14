package kz.iitu.midtermProject.service;

import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import kz.iitu.midtermProject.model.Item;
import kz.iitu.midtermProject.model.ItemType;
import kz.iitu.midtermProject.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Service
public class ItemService {
    Scanner scanner = new Scanner(System.in);

    @Autowired
    private ItemRepository itemRepository;

    public void delete(){
        listOfItems();
        System.out.println("Enter id: ");
        long id = scanner.nextInt();
        Item item = itemRepository.findItemById(id);
        itemRepository.delete(item);
        System.out.println("**********************************");
        System.out.println("*             RESULT             *");
        System.out.println("Item deleted successfully! ");
        listOfItems();
    }

    public void create(){
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.println("Choose item style: ");
        System.out.println("1." + ItemType.CLASSIC);
        System.out.println("2." + ItemType.CASUAL);
        System.out.println("3." + ItemType.GLAMOUR);
        System.out.println("4." + ItemType.SPORT);
        System.out.print("Choice : ");
        int choice = scanner.nextInt();

        ItemType type;

        switch (choice){
            case 1:
                type = ItemType.CLASSIC;
                break;
            case 2:
                type = ItemType.CASUAL;
                break;
            case 3:
                type = ItemType.GLAMOUR;
                break;
            case 4:
                type = ItemType.SPORT;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
        System.out.print("Enter description: ");
        String desc = scanner.next();
        System.out.println("Price: ");
        double pr = scanner.nextInt();

        Item item = new Item();
        item.setName(name);
        item.setItemType(type);
        item.setDescription(desc);
        item.setPrice(pr);
        itemRepository.save(item);
        System.out.println("**********************************");
        System.out.println("*             RESULT             *");
        System.out.println("Item added successfully! " + item.toString());
    }

    public void updateDescription(){
        listOfItems();
        System.out.println("Enter id of item: ");
        long id = scanner.nextInt();
        Item item = itemRepository.findItemById(id);
        System.out.println(item.toString());

        System.out.println("Enter new description: ");
        String description = scanner.next();
        item.setDescription(description);
        itemRepository.save(item);
    }

    public void updatePrice(){
        listOfItems();
        System.out.println("Enter id of item: ");
        long id = scanner.nextInt();
        Item item = itemRepository.findItemById(id);
        System.out.println(item.toString());
        double price = item.getPrice();

        System.out.println("1. Increase ");
        System.out.println("2. Decrease ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter percentage: ");
                int per = scanner.nextInt();
                item.setPrice(price + price * per / 100);
                break;
            case 2:
                System.out.println("Enter percentage: ");
                int dper = scanner.nextInt();
                item.setPrice(price - price * dper / 100);
                break;
            default:
                System.out.println("Incorrect!");
        }
        itemRepository.save(item);
        System.out.println("**********************************");
        System.out.println("*             RESULT             *");
        System.out.println("Changed successfully! " + item.toString());
    }

    public void listOfItems(){
        List<Item> items = itemRepository.findAll();
        System.out.println("**********************************");
        System.out.println("*              ITEMS             *");
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

}
