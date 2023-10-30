/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calc;

/**
 *
 * @author rafaelamoreira
 */
public class Calculadora {
    private double a;
    private double b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double somar() {
        return a + b;
    }

    public double subtrair() {
        return a - b;
    }

    public double multiplicar() {
        return a * b;
    }

    public double dividir() {
        if (b != 0) {
            return a / b;
        }
        return 0;

    }
}
