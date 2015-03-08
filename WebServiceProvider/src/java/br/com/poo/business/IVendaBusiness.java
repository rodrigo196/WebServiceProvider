/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.poo.business;

/**
 *
 * @author rodrigo
 */
public interface IVendaBusiness {
    
    public double getTotalVendaMes(int mes);
    
    public double getTotalVendasVendedor(String vendedor);
    
    public double getTotalComissaoVendasVendedor(String vendedor);
    
    public double getTotalComissaoVendasVendedorMes(String vendedor, int mes);
    
}
