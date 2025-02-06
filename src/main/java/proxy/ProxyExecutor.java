package proxy;

public class ProxyExecutor {
    public static void main(String[] args) {
        PrinterProxy pp = new PrinterProxy("gunha");
        System.out.println("이름은 현재 " + pp.getPrinterName()+ "입니다.");

        pp.setPrinterName("jihwan");

        System.out.println("이름은 현재 "+ pp.getPrinterName()+ "입니다.");
        pp.print("hello, world");
    }
}
