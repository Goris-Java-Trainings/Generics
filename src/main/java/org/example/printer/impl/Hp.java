package org.example.printer.impl;

import org.example.items.Item;
import org.example.printer.Printable;

public class Hp implements Printable<Object> {
    @Override
    public void print(Object o) {
        if (!(o instanceof Item)) {
            return;
        }

        Item item = (Item) o;
        System.out.println("This is a HP printer: I am printing only Items");
        System.out.println("HP: Width: " + item.getWidth());
        System.out.println("HP: Height: " + item.getHeight());
    }
}
