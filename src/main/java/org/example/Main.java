package org.example;

import org.example.items.Item;
import org.example.items.impl.A2Paper;
import org.example.items.impl.A3Paper;
import org.example.pictures.P4x3;
import org.example.pictures.Picture;
import org.example.printer.Printable;
import org.example.printer.impl.Canon;
import org.example.printer.impl.Hp;
import org.example.user.ArmenianOperator;
import org.example.user.Customer;
import org.example.user.Operator;
import org.example.user.User;

import java.awt.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*int[] primitives = new int[4];

        String[] strings = new String[3];

        List<Integer> numbers = Arrays.asList(12, 432, 42, 43, 2);
//        numbers.add("sewdcx")

        List<User> usersList = new LinkedList<>();

        Set<User> users = new HashSet<>();
        users.add(new User("aram", "aramk@gmail.com"));
        users.add(new User("vazgen", "vazgenh@gmail.com"));

//        print("my_sample_text");
        print(numbers);

        Collection<Integer> mixedCollection = new LinkedList<>();
        mixedCollection.add(32);
//        mixedCollection.add("cewcx");  // type safety
        print(mixedCollection);

        print(users);

        System.out.println("Hello world!");*/

        PrinterStore<Object, Printable<Object>> printerStore = new PrinterStore<>();
        Item a2Item = new A2Paper(12, 42);
        Item a3Item = new A3Paper(134, 113);

        Hp hpPrinter = new Hp();

        printerStore.print(a2Item, hpPrinter);
        printerStore.print(a3Item, hpPrinter);

        Canon canon = new Canon();

        Item a4Item = new A2Paper(42, 2);
        Picture p4x3 = new P4x3(Color.CYAN, 4, 3);

        printerStore.print(p4x3, canon);
        printerStore.print(a4Item, canon);

        Collection<?> someCollection = new LinkedList<>();

        List<Operator> allOperators = Arrays.asList(new Operator("tom"));
        addUsersFromMarketingDepartment(allOperators);
        List<User> allUsers = Arrays.asList(new Customer("tom"), new Operator("spencer"));

//        addUsersFromMarketingDepartment(allUsers);

        addUsersFromMarketingDepartmentFixed(allUsers);
    }

    private static void addUsersFromMarketingDepartmentFixed(List<? super Customer> users) {
        users.add(new Customer("john doe"));
        users.add(new Customer("jane doe"));
    }

    private static void addUsersFromMarketingDepartment(List<Operator> users) {
        users.add(new Operator("john doe"));
        users.add(new Operator("jane doe"));
    }

    public void sendEmailsFixed(List<? extends User> users) {
        for (User user : users) {
            System.out.println("sending email to " + user);
        }
    }

    // TODO analyze <? extends T>   bounded wildcards
    // TODO analyze <? super T>
    // TODO ? usage on generics

    private static <E> void print(Collection<E> obj) {  // type erasure
        System.out.println("This is a object: " + obj);
    }

    /*private static void print(String text) {
        System.out.println("This is a sample text: " + text);
    }

    private static void print(Integer number) {
        System.out.println("This is a sample number: " + number);
    }*/

}