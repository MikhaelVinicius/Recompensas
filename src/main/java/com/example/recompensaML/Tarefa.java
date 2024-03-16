package com.example.recompensaML;

import jakarta.persistence.Entity;

@Entity
public class Tarefa {


    private Long id;
    private String tarefa;
    private double credito;
    private double debito;
    private Cliente cliente;


    
    public Tarefa(String tarefa, double credito, double debito) {
        this.tarefa = tarefa;
        this.credito = credito;
        this.debito = debito;
       
    }





    public String getTarefa() {
        return tarefa;
    }
    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }
    public double getCredito() {
        return  credito;
    }
    public void setCredito(double credito) {
        credito = credito;
    }
    public double getDebito() {
        return debito;
    }
    public void setDebito(double debito) {
        this.debito = debito;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   
    
}
