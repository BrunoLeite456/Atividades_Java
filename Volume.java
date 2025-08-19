import java.util.Scanner;

public class Volume {

    public static void main(String[] args) {
        System.out.println("Calcular o volume");
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite a altura");
            double altura =scanner.nextDouble();
            System.out.println("Digite a largura");
            double largura =scanner.nextDouble();
            System.out.println("Digite a profundidade");
            double profundidade =scanner.nextDouble();

            double volume = altura * largura * profundidade;
            System.out.println("o volume é: " + volume);
        }catch (Exception e) {
            System.out.println("digite apenas valores numéricos: " + e.getMessage());
        } finally {
            scanner.close();
        }
        }

    }
    

