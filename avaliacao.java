import java.util.TreeSet;

public class avaliacao {

public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { //for para verificar quantas vezes vai passa pelo array.
            
            for (int j = 0; j < n - 1 - i; j++) {  //for para fazer a comparação das trocas.
                if (arr[j] > arr[j + 1]) {
                    
                    int troca = arr[j]; //vai fazer a troca da possição sempre que o valor for maior que o numero da direita.
                    arr[j] = arr[j + 1];
                    arr[j + 1] = troca;
                    
                      System.out.printf("troca da possicao "  + j + " Para " + (j+1));//vai mostar a possição trocada.
                      System.out.println(" || valores: " + arr[j] + " <-> " + arr[j+1]);//vai mostrar o valor trocado.
                      
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int[] array = {5, 1, 4, 6, 2, 3};
        System.out.println("Array original:" + java.util.Arrays.toString(array));
        bubbleSort(array);
        System.out.println("\n Array ordenada: " + java.util.Arrays.toString(array));
        
       TreeSet<Integer> numeros = new TreeSet<>();// entrada: TreeSet.
        numeros.add(5);
        numeros.add(1);
        numeros.add(4);
        numeros.add(6); 
        numeros.add(2);
        numeros.add(3);

        System.out.println("Collection ordenado: " + numeros); // Saída: TreeSet ordenado.
    }
}