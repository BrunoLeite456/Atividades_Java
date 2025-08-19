import java.util.Scanner;

public class MediaViagem {

    public static void main(String[] args) {
        System.out.println("Calcule a média da velocidade de uma viagem");
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite a distancia(KM):");
        double distancia = scanner.nextDouble();
        System.out.println("Digite o tempo(Horas):");
        double tempo = scanner.nextDouble();
        
      if(tempo < 1 || distancia < 1) {
        throw new ArithmeticException();
      }
        double media = distancia / tempo;
         System.out.print("A média da velocidade é : " + media);

          } catch (ArithmeticException e) {
        System.out.println("Não é possivel dividir por 0: " + e.getMessage());

    } catch (Exception e) {
        System.out.println("Erro: " + e.getMessage());
    } finally {
        scanner.close();
    }
    
}
}
