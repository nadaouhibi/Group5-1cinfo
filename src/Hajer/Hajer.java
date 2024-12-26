package Hajer;

public class Hajer {

    // 1. Calculer la somme d’un tableau d’entiers.
    public static int somme(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // 2. Calculer la moyenne d’un tableau d’entiers.
    public static double moyenne(int[] array) {
        if (array.length == 0) return 0; // To avoid division by zero
        int sum = somme(array);  // Reuse the somme method
        return (double) sum / array.length;
    }

    // 3. Calculer la factorielle d’un nombre.
    public static long factorielle(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Le nombre doit être positif.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 4. Vérifier si un nombre est pair.
    public static boolean estPair(int n) {
        return n % 2 == 0;
    }

    // 5. Vérifier si un nombre est premier.
    public static boolean estPremier(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 6. Inverser une chaîne de caractères.
    public static String inverserChaine(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }


}

