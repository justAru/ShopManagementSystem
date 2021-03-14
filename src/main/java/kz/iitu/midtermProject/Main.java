package kz.iitu.midtermProject;

import kz.iitu.midtermProject.config.ProjectConfig;
import kz.iitu.midtermProject.service.ItemService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShopManagementSystem shopManagementSystem = new ShopManagementSystem();
        shopManagementSystem.menu();
    }
}
