import java.util.Scanner;

public class impar_par {
    public static void main(String[] args) {
        System.out.println("Numeros impares até 30");
        Scanner scanner = new Scanner(System.in);


      for (int i = 1; i < 30; i += 2 )  {
        System.out.printf(" | " + i);
    
    }
    System.out.println();
     System.out.println("Numeros pares até 30");

      for (int i = 2; i <= 30; i += 2 )  {
        System.out.printf(" | " + i);
    
    }
}
}
