package com.eniso.tp5;

public class MathOperations {
    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Le nombre doit être positif pour calculer le factoriel.");
        }
        
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new ArithmeticException("La racine carrée d'un nombre négatif ne peut pas être calculée.");
        }
        return Math.sqrt(number);
    }
}
