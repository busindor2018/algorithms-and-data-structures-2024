package ru.mirea.practice.s23l0908.task78;

public final class Tester {

    private Tester() {
    }

    public static void main(String[] args) {
        Printable[] printables = new Printable[3];
        printables[0] = new Printable("auchan");
        printables[1] = new Printable("pere");
        printables[2] = new Printable("ozon\n");
        Magazine.printMagazines(printables);

        Printable[] printabless = new Printable[3];
        printabless[0] = new Printable("nature");
        printabless[1] = new Printable("family");
        printabless[2] = new Printable("computer");
        Book.printBook(printabless);
    }
}
