package org.example;

import org.example.printer.Printable;

public class PrinterStore<I, P extends Printable<I>> { // bounded generics

    public void print(I item, P printer) {
        printer.print(item);
    }
}
