/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.vendas.service;

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
public class ProvedorServiceTest {
    
    public ProvedorServiceTest() {
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
     * Test of getTotalVendaMes method, of class IProvedorService.
     */
    @Test
    public void testGetTotalVendaMes() {
        System.out.println("getTotalVendaMes");
        int mes = 3;
        IProvedorService instance = new ProvedorService();
        double expResult = 84499.85;
        double result = instance.getTotalVendaMes(mes);
        assertEquals(expResult, result, 0.01);
        
    }

    /**
     * Test of getTotalVendasVendedor method, of class IProvedorService.
     */
    @Test
    public void testGetTotalVendasVendedor() {
        System.out.println("getTotalVendasVendedor");
        String vendedor = "Rodrigo";
        IProvedorService instance = new ProvedorService();
        double expResult = 20499.97;
        double result = instance.getTotalVendasVendedor(vendedor);
        assertEquals(expResult, result, 0.01);
        
    }

    /**
     * Test of getTotalComissaoVendasVendedor method, of class IProvedorService.
     */
    @Test
    public void testGetTotalComissaoVendasVendedor() {
        System.out.println("getTotalComissaoVendasVendedor");
        String vendedor = "Pamela";
        IProvedorService instance = new ProvedorService();
        double expResult = 6799.97;
        double result = instance.getTotalComissaoVendasVendedor(vendedor);
        assertEquals(expResult, result, 0.01);
       
    }

    /**
     * Test of getTotalComissaoVendasVendedorMes method, of class IProvedorService.
     */
    @Test
    public void testGetTotalComissaoVendasVendedorMes() {
        System.out.println("getTotalComissaoVendasVendedorMes");
        String vendedor = "Pamela";
        int mes = 3;
        IProvedorService instance = new ProvedorService();
        double expResult = 3499.98;
        double result = instance.getTotalComissaoVendasVendedorMes(vendedor, mes);
        assertEquals(expResult, result, 0.01);
        
    }
        
}
