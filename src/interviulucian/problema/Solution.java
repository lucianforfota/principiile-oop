package interviulucian.problema;

public class Solution {
    // Funcție pentru a calcula cel mai mare divizor comun (GCD)
    private static int cmmdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Funcție pentru a calcula cel mai mic multiplu comun (cmmmc)
    private static int cmmmc(int a, int b) {
        return (a * b) / cmmdc(a, b);
    }

    public static int solution(int A, int B) {
        // Calculăm cmmmc dintre A și B
        int cmmmc = cmmmc(A, B);

        // Calculăm numărul de ciocolate suplimentare necesare
        int x = cmmmc - A; // Pentru Alex
        int y = cmmmc - B; // Pentru Drake

//            if(x==0){
//                x=cmmmc;
//            }
//            if(y==0){
//                y=cmmmc;
//            }

        // Suma ciocolatelor suplimentare
        return (int) (x + y);
    }

    public static void main(String[] args) {
        int A = 8;
        int B = 16;
        if (A < B) {
            int t = A;
            A = B;
            B = t;
        }

        if (A % B == 0) {
            System.out.println(0);
        } else System.out.println(solution(A, B)); // Output: 2

    }
}
