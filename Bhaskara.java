import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
           System.out.println("Calcular a Bhaskara");
        Scanner scanner = new Scanner(System.in);
    try{
        System.out.println("Digite o valor de A:");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor de b :");
        double b = scanner.nextDouble();
        System.out.println("Digite o valor de C:");
        double c = scanner.nextDouble();
       
        double delta = (Math.pow(b,2)-4*a*c);
        double x1 = ((- b + Math.sqrt(delta))/(2*a));
        double x2 = ((- b - Math.sqrt(delta))/(2*a));

         System.out.print(" x1: " + x1);

         System.out.print("\n x2: " + x2);
         
          } catch (Exception e) {
        System.out.println("Erro: " + e.getMessage());
    } finally {
        scanner.close();
    }
}
}
