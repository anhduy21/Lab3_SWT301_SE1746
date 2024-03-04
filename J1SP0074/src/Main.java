/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author congt1
 * 
 */
public class Main {
    public static void main(String[] args) {
        Validate v = new Validate();
        ManageMatrix m = new ManageMatrix();
        double[][] matrix1;
        double[][] matrix2;
        double[][] result;
        while(true){
            m.displayMenu();
            int choice = v.checkInputChoice("Your choice: ", 1, 4);
            switch (choice) {
                case 1:
                    System.out.println("----- Addition -----");
                    matrix1 = m.getMatrix1();
                    matrix2 = m.getMatrix2(matrix1, choice);
                    result = m.additionMatrix(matrix1, matrix2);
                    m.displayResult(matrix1, matrix2, result, choice);
                    break;
                case 2:
                    System.out.println("----- Subtraction -----");
                    matrix1 = m.getMatrix1();
                    matrix2 = m.getMatrix2(matrix1, choice);
                    result = m.subtractionMatrix(matrix1, matrix2);
                    m.displayResult(matrix1, matrix2, result, choice);
                    break;
                case 3:
                    System.out.println("----- Multiplication -----");
                    matrix1 = m.getMatrix1();
                    matrix2 = m.getMatrix2(matrix1, choice);
                    result = m.multiplicationMatrix(matrix1, matrix2);
                    m.displayResult(matrix1, matrix2, result, choice);
                    break;
                case 4:
                    System.exit(0);
            }
        }
        
    }
}
