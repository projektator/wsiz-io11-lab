package pl.edu.wsiz.io11.demo;

import pl.edu.wsiz.io11.demo.package1.Animal;
import pl.edu.wsiz.io11.demo.package1.DogFactory;
import pl.edu.wsiz.io11.demo.package2.Kangaroo;
import pl.edu.wsiz.io11.demo.package3.Growable;
import pl.edu.wsiz.io11.demo.package3.Tree;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Growable> growables = new ArrayList<>();
        Animal animalDog = DogFactory.getDog();

        growables.add(new Tree(10));
        growables.add(animalDog);
        growables.add(new Kangaroo());

        for (Growable growable : growables) {
            System.out.println("Growable: " + growable);
            growable.grow();
        }

        for (Growable growable : growables) {
            System.out.println("Growable: " + growable);
        }

//        showDemo();
    }

    public static void showDemo() {
        int a = 5;
        Growable tree = new Tree(30);

        System.out.println("a: " + a);
        System.out.println("tree: " + tree);
        System.out.println("-------");

        print(a, tree);

        System.out.println("a: " + a);
        System.out.println("tree: " + tree);
        System.out.println("-------");
    }

    public static void print(int aa, Growable growable) {
        System.out.println("aa: " + aa);
        System.out.println("growable: " + growable);
        System.out.println("-------");

        growable.grow();

        growable = DogFactory.getDog();

        aa += 1;

        System.out.println("aa: " + aa);
        System.out.println("growable: " + growable);
        System.out.println("-------");
    }
}
