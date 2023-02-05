//Exercise 2 : Solutions Does This Quadratic
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: How Many Solutions Does This Quadratic Have
 * A quadratic equation a x² + b x + c = 0 has either 0, 1, or 2 distinct solutions
 * for real values of x. Given a, b and c, you should return the number of solutions to the equation.
 * Date : 01/01/2023
 */
package exercise2;


public class Exercise2 {
    
    public static int  solutions(int a, int b, int c) {
        
        // Calcul du discriminant
    
        int discriminant = b * b - 4 * a * c;
        
        // Si le discriminant est négatif, l'équation n'a pas de solutions réelles
        
        if (discriminant < 0) {
        
            return 0;
        }
        
        // Si le discriminant est égal à 0, l'équation a une solution réelle
        
        if (discriminant == 0) {
            
            return 1;
        }
        // Si le discriminant est positif, l'équation a deux solutions réelles
        
        return 2;
    }

}
