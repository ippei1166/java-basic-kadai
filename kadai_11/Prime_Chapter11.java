package kadai_11;

public class Prime_Chapter11 {
    public static void main(String[] args) {
        new Prime_Chapter11().findPrimes();
    }

    public void findPrimes() {
        int max = 100;
        boolean[] primeNum = new boolean[max + 1];

        
        for (int i = 2; i <= max; i++) {
            primeNum[i] = true;
        }

        
        for (int i = 2; i * i <= max; i++) {
            if (primeNum[i]) {
                for (int j = i * i; j <= max; j += i) {
                    primeNum[j] = false; 
                }
            }
        }

        
        System.out.println();
        for (int i = 2; i <= max; i++) {
            if (primeNum[i]) {

                System.out.println(i);
            }
        }
    }
}