/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.business;

import br.com.poo.vendas.entity.VendaEntity;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
        double expResult = 38283.38;
        double result = instance.getTotalVendaMes(mes);
        assertEquals(expResult, result, 0.01);
        
    }

    /**
     * Test of getTotalVendasVendedor method, of class VendaBusiness.
     */
    @Test
    public void testGetTotalVendasVendedor() {
        System.out.println("getTotalVendasVendedor");
        String vendedor = "Pamela";
        IVendaBusiness instance = new VendaBusiness();
        double expResult = 33999.88;
        double result = instance.getTotalVendasVendedor(vendedor);
        assertEquals(expResult, result, 0.01);
        
    }

    /**
     * Test of getTotalComissaoVendasVendedor method, of class VendaBusiness.
     */
    @Test
    public void testGetTotalComissaoVendasVendedor() {
        System.out.println("getTotalComissaoVendasVendedor");
        String vendedor = "Rodrigo";
        IVendaBusiness instance = new VendaBusiness();
        double expResult = 2050.0;
        double result = instance.getTotalComissaoVendasVendedor(vendedor);
        assertEquals(expResult, result, 0.01);
       
    }

    /**
     * Test of getTotalComissaoVendasVendedorMes method, of class VendaBusiness.
     */
    @Test
    public void testGetTotalComissaoVendasVendedorMes() {
        System.out.println("getTotalComissaoVendasVendedorMes");
        String vendedor = "Andre";
        int mes = 3;
        IVendaBusiness instance = new VendaBusiness();
        double expResult = 8624.99;
        double result = instance.getTotalComissaoVendasVendedorMes(vendedor, mes);
        assertEquals(expResult, result, 0.01);
        
    }
    
}
