package com.example.recompensaML;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Cliente {

    @Id
    private Long id;
    private String nome;
    private double saldo;

    private Tarefa tarefa;
    private Tarefa tarefaRecebida;




    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public Tarefa getTarefaRecebida() {
        return tarefaRecebida;
    }

    public void setTarefaRecebida(Tarefa tarefaRecebida) {
        this.tarefaRecebida = tarefaRecebida;
    }

    public Cliente(String nome, double valor) {
        this.nome = nome;
        this.saldo = valor;
     
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double valor) {
        this.saldo = valor;
    }


    


    
}
