package com.itschool;
public class Main {

    public static void main(String[] args) {
        int a = 9;
        int b = 2;
        int c = 100;
        System.out.print("Резултат возведения числа " + a + " в степень" + b + " равен: ");
        System.out.println(stepen(a, b));

        System.out.print("Резултат извлечения квадратного корня из числа " + a + " равен: ");
        System.out.println(koren(a));

        System.out.print("Резултат решения квадратного уровнения с a = " + a + " с b = " + b + " с с = " + c + " равен :");
        System.out.print(yrovnenie(a,b,c));


    }

    static double stepen(int a, int b) {
        return Math.pow(a, b);
    }

    static double koren(int a) {
        return Math.sqrt(a);
    }

    static double yrovnenie(int a, int b, int c)
    {
        double D;
        D = b * b - 4 * a * c;
        if (D > 0)
        {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            return x1;
        }
        else if (D == 0)
        {
            double x;
            x = -b / (2 * a);
            return x;
        }
        else
        {
            return 0;
        }
    }
}
