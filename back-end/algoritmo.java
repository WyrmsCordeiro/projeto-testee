import java.util.Scanner;

public class Soma {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
    
    double queijo = 7.0;
    double pao = 10.00;
    double presunto = 8.00;

    double valorTotal = queijo + pao + presunto;
    System.out.println("O valor da compra no supermercado foi: " + valorTotal);
    
    scanner.close();
    
    
    }
}

