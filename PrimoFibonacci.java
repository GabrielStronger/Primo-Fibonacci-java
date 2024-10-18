public class PrimoFibonacci {

    public static void main(String[] args) {
        int n = 10; 
        PrimoFibonacci primo = new PrimoFibonacci();
        primo.imprimeseq(n); 
        int termoN = primo.encontraTermo(n); 
        System.out.println("O " + n + "º termo da sequência é: " + termoN);
    }

    public void imprimeseq(int numTermos) {
        int[] sequencia = new int[numTermos]; 
        for (int i = 0; i < numTermos; i++) { 
            if (i == 0 || i == 1 || i == 2 || i == 3) {
                sequencia[i] = 1; 
            } else {
                
                sequencia[i] = sequencia[i - 1] + sequencia[i - 2] + sequencia[i - 3] + sequencia[i - 4];
            }
        }       
        for (int j = 0; j < numTermos; j++) {
            System.out.print(sequencia[j]); 
            if (j < numTermos - 1) {
                System.out.print(", "); 
            }
        }
        System.out.println(); 
    }
    public int encontraTermo(int n) {
        int[] seq = new int[n]; 
        for (int k = 0; k < n; k++) { 
            if (k == 0 || k == 1 || k == 2 || k == 3) {
                seq[k] = 1; 
            } else {
                
                seq[k] = seq[k - 1] + seq[k - 2] + seq[k - 3] + seq[k - 4];
            }
        }
        return seq[n - 1];
    }
}

