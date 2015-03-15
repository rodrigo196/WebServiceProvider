package br.com.poo.util;

import br.com.poo.vendas.entity.VendaEntity;
import java.util.function.Predicate;

/**
 *  Classe utilitaria usada para armazenar os predicatos de consulta.
 *  @author Andre Luiz Pelisoli, Pamela Pereira Zagatti e Rodrigo Fernandes Bulgarelli
 */
public class Predicados {
    
    /**
     * Retorna o predicato para consultar todas as vendas no m^es.
     * @param mes <b>int</b> - O mes em que se deseja consultar as vendas.
     * @return <b>Predicate</b> - O predicato de consulta
     */
    public static Predicate<VendaEntity> vendasNoMes(int mes){
        return v -> v.getData().getMonthValue() == mes;
    }
    
    /**
     * Retorna o predicato para consultar todas as vendas do vendedor.
     * @param vendedor <b>String</b> - O nome do vendedor para consultar as vendas
     * @return <b>Predicate</b> - O predicato de consulta
     */
    public static Predicate<VendaEntity> vendasDoVendedor(String vendedor){
        return v -> v.getVendedor().getNome().equalsIgnoreCase(vendedor);
    }
    
    /**
     * Retorna o predicato para consultar todas as vendas do vendedor no mes especificado.
     * @param vendedor <b>String</b> - O nome do vendedor para consultar as vendas
     * @param mes <b>int</b> - O mes em que se deseja consultar as vendas.
     * @return <b>Predicate</b> - O predicato de consulta
     */
    public static Predicate<VendaEntity> vendasDoVendedorNoMes(String vendedor, int mes){
        return v -> v.getVendedor().getNome().equalsIgnoreCase(vendedor) && 
                v.getData().getMonthValue() == mes;
                
    }
    
}
