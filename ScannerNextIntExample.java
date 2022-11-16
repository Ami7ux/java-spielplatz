import java.util.*;

public class ScannerNextIntExample {
    public static void main(String[] args) {  
          Scanner scanner = new Scanner(System.in);
          while (scanner.hasNext()) {
              if (scanner.hasNextInt()) {
                 System.out.println("Integer gefunden: "+scanner.nextInt());
              }
              else {
                System.out.println("Kein Integer gefunden: "+scanner.next());
              }
          }
          scanner.close();
    }
}
