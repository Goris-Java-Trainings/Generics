package org.example.printer.impl;

import org.example.items.Item;
import org.example.pictures.Picture;
import org.example.printer.Printable;

public class Canon implements Printable<Object> {
    @Override
    public void print(Object obj) {
        System.out.println("This is a Canon printer");

        if (obj instanceof Item) {
            Item item = (Item) obj;

            System.out.println("Canon: Width: " + item.getWidth());
            System.out.println("Canon: Height" + item.getHeight());
        } else if(obj instanceof Picture) {
            Picture item = (Picture) obj;

            System.out.println("Canon: size 1: " + item.getX());
            System.out.println("Canon: size 2" + item.getY());
        }
    }
}

/*
public class Canon implements Printable<A4Paper> {
    @Override
    public void print(A4Paper item) {
        System.out.println("This is a Canon printer: I am printing only A4 formatting papers");
        System.out.println("Canon: Width: " + item.getWidth());
        System.out.println("Canon: Height" + item.getHeight());
    }
}*/
