/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt2;
import java.util.Scanner;

/**
 *
 * @author Duy
 */
public class EquationSolver {
    public double[] inputCoefficients() {
        Scanner scanner = new Scanner(System.in);
        double[] coefficients = new double[3];
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.println("Nhập hệ số a: ");
                coefficients[0] = scanner.nextDouble();

                System.out.println("Nhập hệ số b: ");
                coefficients[1] = scanner.nextDouble();

                System.out.println("Nhập hệ số c: ");
                coefficients[2] = scanner.nextDouble();

                isValidInput = true;
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số.");
                scanner.nextLine(); // Đọc và loại bỏ dữ liệu không hợp lệ khỏi bộ nhớ đệm của Scanner
            }
        }

        return coefficients;
    }

    public double[] solveQuadraticEquation(double a, double b, double c) {
        double[] roots = new double[2];

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    // Phương trình có vô số nghiệm
                    roots[0] = Double.POSITIVE_INFINITY;
                    roots[1] = Double.POSITIVE_INFINITY;
                } else {
                    // Phương trình vô nghiệm
                    roots[0] = Double.NaN;
                    roots[1] = Double.NaN;
                }
            } else {
                // Phương trình có một nghiệm
                roots[0] = -c / b;
                roots[1] = roots[0];
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                // Phương trình có 2 nghiệm phân biệt
                roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
                roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
            } else if (delta == 0) {
                // Phương trình có nghiệm kép
                roots[0] = -b / (2 * a);
                roots[1] = roots[0];
            } else {
                // Phương trình vô nghiệm
                roots[0] = Double.NaN;
                roots[1] = Double.NaN;
            }
        }

        return roots;
    }
}

