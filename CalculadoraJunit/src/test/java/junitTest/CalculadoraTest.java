/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junitTest;

import com.mycompany.calculadorajunit.Calculadora;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

/**
 *
 * @author rafaelamoreira
 */
public class CalculadoraTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Testes da Calculada");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Teste individual");
    }

    @Test
    @DisplayName("Soma de 2 números")
    public void testSomar() {
        int n1 = 5;
        int n2 = 5;
        Calculadora c = new Calculadora(n1, n2);
        double expResult = 10.0;
        double result = c.somar();
        assertEquals(expResult, result, 0);
    }

    @Test
    @DisplayName("Subtração de 2 números")
    public void testSubtrair() {
        int n1 = 5;
        int n2 = 3;
        Calculadora c = new Calculadora(n1, n2);
        double expResult = 2;
        double result = c.subtrair();
        assertEquals(expResult, result, 0);
    }

    @Test
    @DisplayName("Multiplicação de 2 números")
    public void testMultiplicar() {
        int n1 = 2;
        int n2 = 3;
        Calculadora c = new Calculadora(n1, n2);
        double expResult = 6;
        double result = c.multiplicar();
        assertEquals(expResult, result, 0);
    }

    @RepeatedTest(3)
    @DisplayName("Multiplicação por zero")
    public void testMultiplicarporZero() {
        int n1 = 2;
        int n2 = 0;
        Calculadora c = new Calculadora(n1, n2);
        double expResult = 0;
        double result = c.multiplicar();
        assertEquals(expResult, result, 0);
    }

    @Test
    @DisplayName("Divisão de 2 números")
    public void testDividir() {
        int n1 = 5;
        int n2 = 2;
        Calculadora c = new Calculadora(n1, n2);
        double expResult = 2.5;
        double result = c.dividir();
        assertEquals(expResult, result, 0, "Falhou ao multiplicar");
    }

    @Test
    @DisplayName("Divisão por zero")
    @Disabled("Não implementado ainda")
    public void testDividirporZero() {

    }

    @AfterEach
    void afterEach() {
        System.out.println("Teste individual finalizado!");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Todos os teates finalizados!");
    }

}
