/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.business;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigo
 */
public class VendaBusinessTest {
    
    public VendaBusinessTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTotalVendaMes method, of class VendaBusiness.
     */
    @Test
    public void testGetTotalVendaMes() {
        System.out.println("getTotalVendaMes");
        int mes = 2;
        IVendaBusiness instance = new VendaBusiness();
        double expResult = 2015.21;
        double result = instance.getTotalVendaMes(mes);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("Calculo do total de vendas no mes falhou!.");
    }

    /**
     * Test of getTotalVendasVendedor method, of class VendaBusiness.
     */
    @Test
    public void testGetTotalVendasVendedor() {
        System.out.println("getTotalVendasVendedor");
        String vendedor = "";
        IVendaBusiness instance = new VendaBusiness();
        double expResult = 0.0;
        double result = instance.getTotalVendasVendedor(vendedor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalComissaoVendasVendedor method, of class VendaBusiness.
     */
    @Test
    public void testGetTotalComissaoVendasVendedor() {
        System.out.println("getTotalComissaoVendasVendedor");
        String vendedor = "";
        IVendaBusiness instance = new VendaBusiness();
        double expResult = 0.0;
        double result = instance.getTotalComissaoVendasVendedor(vendedor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalComissaoVendasVendedorMes method, of class VendaBusiness.
     */
    @Test
    public void testGetTotalComissaoVendasVendedorMes() {
        System.out.println("getTotalComissaoVendasVendedorMes");
        String vendedor = "";
        int mes = 0;
        IVendaBusiness instance = new VendaBusiness();
        double expResult = 0.0;
        double result = instance.getTotalComissaoVendasVendedorMes(vendedor, mes);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
