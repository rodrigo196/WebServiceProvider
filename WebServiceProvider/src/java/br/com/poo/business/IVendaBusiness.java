/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.poo.business;

import br.com.poo.vendas.entity.VendaEntity;
import java.util.List;

/**
 *
 * @author Andre Luiz Pelisoli, Pamela Pereira Zagatti e Rodrigo Fernandes Bulgarelli
 */
public interface IVendaBusiness {
    
    public void setVendas(List<VendaEntity> vendas);
    
    public List<VendaEntity> getVendas();
    
    public double getTotalVendaMes(int mes);
    
    public double getTotalVendasVendedor(String vendedor);
    
    public double getTotalComissaoVendasVendedor(String vendedor);
    
    public double getTotalComissaoVendasVendedorMes(String vendedor, int mes);
    
}
