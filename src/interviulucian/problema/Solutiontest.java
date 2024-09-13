package interviulucian.problema;

public class Solutiontest {
    // Funcție pentru a calcula cel mai mare divizor comun (GCD)
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Funcție pentru a calcula cel mai mic multiplu comun (LCM)
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Funcția principală care calculează minimul de ciocolate suplimentare necesare
    public static int solution(int A, int B) {
        // Calculăm LCM-ul dintre A și B
        int lcm = lcm(A, B);

        // Calculăm ciocolatele suplimentare necesare pentru Alex și Drake
        int extraChocolatesForAlex = (lcm - A % lcm) % lcm;
        int extraChocolatesForDrake = (lcm - B % lcm) % lcm;

        // Asigurăm că X și Y sunt diferite de 0
        // Dacă `extraChocolatesForAlex` este 0, înseamnă că A este deja un multiplu de LCM.
        // Trebuie să adăugăm cel puțin o ciocolată pentru a satisface cerința
        if (extraChocolatesForAlex == 0) {
            extraChocolatesForAlex = lcm;
        }
        // Similar pentru Drake
        if (extraChocolatesForDrake == 0) {
            extraChocolatesForDrake = lcm;
        }

        // Returnăm suma ciocolatelor suplimentare necesare
        return extraChocolatesForAlex + extraChocolatesForDrake;
    }

    public static void main(String[] args) {
        int A = 8;
        int B = 16;
        System.out.println(solution(A, B)); // Output: 8
    }
}
