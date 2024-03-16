package com.example.recompensaML;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Conta {

    @Id
   private Long id; 
   private Cliente cliente;


   
public Conta(Cliente cliente) {
    this.cliente = cliente;
}

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public Cliente getCliente() {
    return cliente;
}
public void setCliente(Cliente cliente) {
    this.cliente = cliente;
}





public void encomendar(Tarefa tarefa,Cliente cliente){

        this.cliente.setTarefa(tarefa);
        cliente.setTarefaRecebida(tarefa);

}






public void conclusao(boolean feito,Cliente cliente){
  

    if(feito==true){

          cliente.setSaldo(cliente.getTarefaRecebida().getCredito()+cliente.getSaldo());
          this.cliente.setSaldo(this.cliente.getSaldo()-cliente.getTarefaRecebida().getCredito());
        
    }else{
        cliente.setSaldo(cliente.getSaldo()-cliente.getTarefaRecebida().getDebito());
        this.cliente.setSaldo(this.cliente.getSaldo()+cliente.getTarefaRecebida().getDebito());

    }

}


    
}
