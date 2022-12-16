/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;

/**
 *
 * @author Leandro
 */
public class Main {
    
    public static void main(String[] args){
        
        String nome = "tiago";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "barba", 30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1,"Leandro","rua 10","956356276256");
        
        Agendamento ag = new Agendamento(1, cliente, servico, 30, "12/07/2022 21:32");
        System.out.println(ag.getCliente().getNome());
        
        
    }
    
}
