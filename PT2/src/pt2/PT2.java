/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt2;

import java.util.Scanner;

/**
 *
 * @author Duy
 */
public class PT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EquationSolver solver = new EquationSolver();
        double[] coefficients = solver.inputCoefficients();
        solver.solveQuadraticEquation(coefficients[0], coefficients[1], coefficients[2]);
    }    
}
