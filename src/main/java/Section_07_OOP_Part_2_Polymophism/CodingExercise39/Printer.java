package src.main.java.Section_07_OOP_Part_2_Polymophism.CodingExercise39;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel <= 100 && tonerLevel > -1) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        return (tonerAmount > 0 && tonerAmount <= 100) ?
                ((tonerLevel + tonerAmount > 100) ? -1 : (tonerLevel += tonerAmount)) : -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = duplex ?  (pages + 1) / 2 : pages;

        if (duplex) {
            System.out.println("Printing in duplex mode");
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
