package com.banco.modelos;

import java.util.Scanner;

public class Usuario {
    Scanner ler = new Scanner(System.in);
    private String nomeUsuario;
    private int senhaUsuario;
    private String criarUsuario;
    private int criarSenha;
    private int cadastro;
    private String nomeCartao;

    public void novoUsuario(){
        System.out.println("Crie um nome de usuario: ");
        nomeUsuario = ler.nextLine();
    }

    public void novaSenha(){
        System.out.println("Crie uma senha (somente numeros): ");
        senhaUsuario = ler.nextInt();
    }

    public void nomeDoUsuario(){
        System.out.println("Digite o seu nome de usuario: ");
        nomeUsuario = ler.nextLine();

    }

    public void senhaDoUsuario(){
        System.out.println("Digite a sua senha: ");
        senhaUsuario = ler.nextInt();
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public int getCadastro() {
        return cadastro;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String nomeNoCartao(){
        System.out.println("Nome no Cartão: ");
        nomeCartao = ler.nextLine();
        return nomeCartao;
    }
}
