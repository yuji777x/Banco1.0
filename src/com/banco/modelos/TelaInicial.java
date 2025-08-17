package com.banco.modelos;

import java.util.Random;
import java.util.Scanner;

public class TelaInicial {
    private int saldo;
    private int escolha;
    private int subopcao1, subopcao2;
    Random random = new Random();
    Scanner ler = new Scanner(System.in);
    Usuario usuario = new Usuario();

    public TelaInicial(int saldo) {
        this.saldo = 3000;
    }

    public int getEscolha() {
        return escolha;
    }

    public int getSaldo() {
        return saldo;
    }

    //variaveis do pix
    private int transferencia;
    private int saldoTransferencia;

    // FUNÇÃO DO PIX
    public void novaTransferencia(){
        System.out.println("Quantos deseja transferir: ");
        transferencia = ler.nextInt();
        int saldoTransferencia = getSaldo() - transferencia;
        System.out.println("Saldo final: " + saldoTransferencia);
    }

    // variaveis do cartao
    private int cartaoD, cartaoC;
    private int numeroCartaoDebito, cvcDebito = 100;
    private int numeroCartaoCredito, cvcCredito = 100;


    //FUNÇÃO CARTÃO
    public int getNumeroCartaoDebito() {
        return numeroCartaoDebito = random.nextInt(100000);
    }

    public int getCvcDebito() {
        return cvcDebito = random.nextInt(900);
    }

    public int getNumeroCartaoCredito() {
        return numeroCartaoCredito = random.nextInt(100000);
    }

    public int getCvcCredito() {
        return cvcCredito = random.nextInt(900);
    }

    public void cartaoDebito(){
        System.out.println("Cartão de débito");
        System.out.println("Nome no cartão: " + usuario.nomeNoCartao());
        System.out.println("Numero do cartão: " + getNumeroCartaoDebito());
        System.out.println("CVC: " + getCvcDebito());
    }

    public void cartaoCredito(){
        System.out.println("Cartão de crédito");
        System.out.println("Nome do cartão: " + usuario.nomeNoCartao());
        System.out.println("Numero do cartao: " + getNumeroCartaoCredito());
        System.out.println("CVC: " + getCvcCredito());
    }

    // Variaveis Emprestimo
    private int valorEmprestimo = 4000;
    private int emprestar;
    private int saldoAtualEmprestimo;

    // Função Emprestimo
    public void pegarEmprestimo(){
        System.out.println("Valor para emprestimo: " + valorEmprestimo);
        System.out.println("Quantos deseja emprestar: ");
        emprestar = ler.nextInt();
        saldoAtualEmprestimo = getSaldo() + emprestar;
        System.out.println("Saldo Atual: " + saldoAtualEmprestimo);
    }

    public int getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(int valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    // Variaveis Investimento
    private int investir;
    private int saldoAtualInvestimento;

    // Função investimento
    public void investirCDI(){
        System.out.println("Bem Vindo ao porquinho, aqui rende 100% do CDI\n");
        System.out.println("Quantos deseja investir: ");
        investir = ler.nextInt();

        System.out.println("Valor investido: " + investir);

        saldoAtualInvestimento = getSaldo() - investir;
        System.out.println("Saldo Atual da carteira: " + saldoAtualInvestimento);
    }

    public void poupanca(){
        System.out.println("Bem Vindo a Poupança\n");
        System.out.println("Quantos deseja investir: ");
        investir = ler.nextInt();

        System.out.println("Valor investido: " + investir);

        saldoAtualInvestimento = getSaldo() - investir;
        System.out.println("Saldo Atual da carteira: " + saldoAtualInvestimento);
    }


    // APARECE DEPOIS DO LOGIN OU CADASTRO
    public void escolherFuncao() {
        while (true) {
            System.out.println("1 - Área Pix\n");
            System.out.println("2 - Cartões\n");
            System.out.println("3 - Empréstimos\n");
            System.out.println("4 - Investimentos\n");
            escolha = ler.nextInt();

            switch (getEscolha()) {
                case 1:
                    novaTransferencia();
                    break;

                case 2:
                    System.out.println("1 - Cartão de Débito\n");
                    System.out.println("2 - Cartão de Crédito ");
                    subopcao1 = ler.nextInt();

                    switch (subopcao1){
                        case 1:
                            cartaoDebito();
                            break;
                        case 2:
                            cartaoCredito();
                            break;

                    }
                    break;

                case 3:
                    pegarEmprestimo();
                    break;
                case 4:
                    System.out.println("1 - Porquinho (100% CDI)\n");
                    System.out.println("2 - Poupança");
                    subopcao2 = ler.nextInt();

                    switch(subopcao2){
                        case 1:
                            investirCDI();
                            break;
                        case 2:
                            poupanca();
                            break;
                    }
                    break;
            }
        }


    }
}
