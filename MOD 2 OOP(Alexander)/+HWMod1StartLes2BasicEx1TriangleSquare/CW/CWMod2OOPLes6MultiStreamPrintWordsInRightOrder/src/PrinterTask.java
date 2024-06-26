public class PrinterTask implements Runnable {
    private Printer printer;
    private String text;

    public PrinterTask(Printer printer, String text) {
        super();
        this.printer = printer;
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            printer.printText(text);
        }
    }

}
