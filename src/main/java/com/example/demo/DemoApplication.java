package com.example.demo;

import com.example.demo.entity.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

//        PriutEntity priut = new PriutEntity();
//        initializeCatPriut(priut);
//        initializeDogPriut(priut);
//        initializeBirdPriut(priut);
//        System.out.println("Cats: ");
//        for (AnimalEntity cat : priut.getListCats()) {
//            System.out.println("Name: " + cat.getName() + "; "  + "Age: " + cat.getAge() + "; " + "Color: " + cat.getColor() + "; " + "Id: " + cat.getId() + ";" + "Price:" + cat.getPrice());
//        }
//        System.out.println("Dogs: ");
//        for (AnimalEntity dog : priut.getListDogs()) {
//            System.out.println("Name: " +  dog.getName() + "; " + "Age: " +  dog.getAge() + "; " + "Color: " +  dog.getColor() + "; " + "Id: " +  dog.getId() + ";" + "Price:" + dog.getPrice());
//        }
//        System.out.println("Bird: ");
//        for (AnimalEntity bird : priut.getListBirds()) {
//            System.out.println("Name: " +  bird.getName() + "; " + "Age: " +  bird.getAge() + "; " + "Color: " + bird.getColor() + "; " + "Id: "  + bird.getId() + ";" + "Price:" + bird.getPrice());
//        }
//        AnimalEntity removedCat = new CatEntity();
//        for (AnimalEntity cat : priut.getListCats()) {
//            if ( cat.getId() == 2) {
//                removedCat = cat;
//            }
//        }
//        priut.removeCat(removedCat);
//        System.out.println("Cats: ");
//        for (AnimalEntity cat : priut.getListCats()) {
//            System.out.println("Name: " + cat.getName() + "; "  + "Age: " + cat.getAge() + "; " + "Color: " + cat.getColor() + "; " + "Id: " + cat.getId() + "Price:" + cat.getPrice());
//        }
    }

    private static void initializeCatPriut(PriutEntity priut) {
        AnimalEntity cat = new CatEntity();
        cat.setName("Ylik");
        cat.setAge(5);
        cat.setColor("White");
        cat.setId(1);
        cat.setPrice(100);
        AnimalEntity cat1 = new CatEntity();
        cat1.setName("Dydik");
        cat1.setAge(4);
        cat1.setColor("Black");
        cat1.setId(2);
        cat1.setPrice(110);

    }

    private static void initializeDogPriut(PriutEntity priut) {
        AnimalEntity dog = new DogEntity();
        AnimalEntity dog1 = new DogEntity();
        dog.setName("Papik");
        dog.setAge(6);
        dog.setColor("Orange");
        dog.setId(1);
        dog.setPrice(200);
        dog1.setName("Kim");
        dog1.setAge(1);
        dog1.setColor("Brown");
        dog1.setId(2);
        dog1.setPrice(250);
        AnimalEntity dog3 = new DogEntity("Archi", 5, "White");
        dog3.setId(3);
        dog3.setPrice(300);

    }
    private static void initializeBirdPriut(PriutEntity priut) {
        AnimalEntity bird = new BirdEntity("Lion", 5, "Green", 3, 300);
        AnimalEntity bird1 = new BirdEntity("Lion", 4, "Red", 2, 500);

    }

}
