public class Main {
    public static void main(String[] args) {
        Printer printer = new ColorPrinter();

        Printer printer2 = new BlackWhitePrinter();

        //彩色打印机
        printer.print();

        //黑白打印机
        printer2.print();
    }

}
