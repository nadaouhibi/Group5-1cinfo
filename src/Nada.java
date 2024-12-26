public class Nada {

    // Calcule la puissance d'un nombre
    public static int puissance(int base, int exposant) {
        int resultat = 1;
        for (int i = 0; i < exposant; i++) {
            resultat *= base;
        }
        return resultat;
    }

    // Calcule le PGCD de deux nombres (algorithme d'Euclide)
    public static int pgcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    // Trie un tableau d'entiers en ordre croissant (méthode du tri par insertion)
    public static void trierTableau(int[] tab) {
        int n = tab.length;
        for (int i = 1; i < n; ++i) {
            int key = tab[i];
            int j = i - 1;

            while (j >= 0 && tab[j] > key) {
                tab[j + 1] = tab[j];
                j = j - 1;
            }
            tab[j + 1] = key;
        }
    }

    // Vérifie si une chaîne est un palindrome
    public static boolean estPalindrome(String chaine) {
        int i = 0, j = chaine.length() - 1;
        while (i < j) {
            if (chaine.charAt(i) != chaine.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // Recherche l'élément maximal dans un tableau
    public static int max(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    // Concatène deux tableaux
    public static int[] concatenerTableaux(int[] tab1, int[] tab2) {
        int[] resultat = new int[tab1.length + tab2.length];
        System.arraycopy(tab1, 0, resultat, 0, tab1.length);
        System.arraycopy(tab2, 0, resultat, tab1.length, tab2.length);
        return resultat;
    }

    // Calcule la racine carrée d'un nombre (méthode de Newton)
    public static double racineCarree(double x) {
        double epsilon = 1e-15;
        double t = x;
        while (Math.abs(t - x / t) > epsilon * t) {
            t = 0.5 * (t + x / t);
        }
        return t;
    }

    // Convertit une chaîne en majuscule
    public static String majuscules(String chaine) {
        return chaine.toUpperCase();
    }

    // Calcule la longueur d'une chaîne
    public static int longueurChaine(String chaine) {
        return chaine.length();
    }

    // ... (vous pouvez ajouter d'autres méthodes ici)
}