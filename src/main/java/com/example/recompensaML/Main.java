package com.example.recompensaML;

public class Main {

    public static void main(String[] args) {
        Cliente mario = new Cliente("Mario", 50.00);
        Conta contaDoMario = new Conta(mario);

        Cliente luigi = new Cliente("Luigi", 30.00);
        Conta contaDoLuigi = new Conta(luigi);

        System.out.println("O saldo bancário do Mário é de: R$" + mario.getSaldo());
        System.out.println("O saldo bancário do Luigi é de: R$" + luigi.getSaldo());

        Tarefa salvarPrincesa = new Tarefa("Salvar a princesa", 20.00, 10.00);

        mario.setTarefa(salvarPrincesa);

        contaDoMario.encomendar(salvarPrincesa, luigi);

        contaDoMario.conclusao(true, luigi);

        System.out.println("O saldo bancário do Mário agora é de: R$" + mario.getSaldo());
        System.out.println("O saldo bancário do Luigi agora é de: R$" + luigi.getSaldo());
    }
}
