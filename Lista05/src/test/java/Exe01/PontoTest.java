/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Exe01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author felboos
 */
public class PontoTest {
    
    public PontoTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of getX method, of class Ponto.
     */
    @org.junit.jupiter.api.Test
    public void testGetX() {
        System.out.println("getX");
        Ponto instance = new Ponto();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Ponto.
     */
    @org.junit.jupiter.api.Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Ponto instance = new Ponto();
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Ponto.
     */
    @org.junit.jupiter.api.Test
    public void testGetY() {
        System.out.println("getY");
        Ponto instance = new Ponto();
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Ponto.
     */
    @org.junit.jupiter.api.Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Ponto instance = new Ponto();
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of identificarQuadrante method, of class Ponto.
     */
    @org.junit.jupiter.api.Test
    public void testIdentificarQuadrantePrimeiro() {
        System.out.println("identificarQuadrante");
        Ponto ponto = new Ponto(1, 1);
        Quadrante expResult = Quadrante.PRIMEIRO;
        Quadrante result = ponto.identificarQuadrante();
        assertEquals(expResult, result);
        
    }
    
    @org.junit.jupiter.api.Test
    public void testIdentificarQuadranteSegundo() {
        System.out.println("identificarQuadrante");
        Ponto ponto = new Ponto(-1, 1);
        Quadrante expResult = Quadrante.SEGUNDO;
        Quadrante result = ponto.identificarQuadrante();
        assertEquals(expResult, result);
        
    }
    
    @org.junit.jupiter.api.Test
    public void testIdentificarQuadranteTerceiro() {
        System.out.println("identificarQuadrante");
        Ponto ponto = new Ponto(-1, -1);
        Quadrante expResult = Quadrante.TERCEIRO;
        Quadrante result = ponto.identificarQuadrante();
        assertEquals(expResult, result);
        
    }
    
    @org.junit.jupiter.api.Test
    public void testIdentificarQuadranteQuarto() {
        System.out.println("identificarQuadrante");
        Ponto ponto = new Ponto(1, -1);
        Quadrante expResult = Quadrante.QUARTO;
        Quadrante result = ponto.identificarQuadrante();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of estaIncidindoSobreX method, of class Ponto.
     */
    @org.junit.jupiter.api.Test
    public void testEstaIncidindoSobreX() {
        System.out.println("estaIncidindoSobreX");
        Ponto instance = new Ponto(0, 1);
        boolean expResult = true;
        boolean result = instance.estaIncidindoSobreX();
        assertEquals(expResult, result);
    }

    /**
     * Test of estaIncidindoSobreY method, of class Ponto.
     */
    @org.junit.jupiter.api.Test
    public void testEstaIncidindoSobreY() {
        System.out.println("estaIncidindoSobreY");
        Ponto instance = new Ponto(1, 0);
        boolean expResult = true;
        boolean result = instance.estaIncidindoSobreY();
        assertEquals(expResult, result);
    }

    /**
     * Test of calcularDistancia method, of class Ponto.
     */
    @org.junit.jupiter.api.Test
    public void testCalcularDistancia_Ponto() {
        System.out.println("calcularDistancia");
        Ponto outroPonto = null;
        Ponto instance = new Ponto();
        double expResult = 0.0;
        double result = instance.calcularDistancia(outroPonto);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularDistancia method, of class Ponto.
     */
    @org.junit.jupiter.api.Test
    public void testCalcularDistancia_Ponto_Ponto() {
        System.out.println("calcularDistancia");
        Ponto p1 = null;
        Ponto p2 = null;
        Ponto instance = new Ponto();
        double expResult = 0.0;
        double result = instance.calcularDistancia(p1, p2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcular method, of class Ponto.
     */
    @org.junit.jupiter.api.Test
    public void testCalcular() {
        System.out.println("calcular");
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 0.0;
        Ponto instance = new Ponto();
        double expResult = 0.0;
        double result = instance.calcular(x1, y1, x2, y2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
