package cashregister;

class CashRegister {

    private final Printer printer;

    public CashRegister(Printer printer) {
        this.printer = printer;
    }

    public CashRegister(FakePrinter fakePrinter, Printer printer) {

        this.printer = printer;
    }


    public CashRegister(Purchase fakePrinter) {
    }

    public void process(Purchase purchase) {
        printer.print(purchase.asString());
    }
}
