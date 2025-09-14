import com.banco.modelos.TelaInicial;
import com.banco.modelos.Usuario;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Scanner ler = new Scanner(System.in);

        System.out.println("Bem vindo ao yujubank\n");
        System.out.println("Cadastrar (1)\n");
        System.out.println("Login (2)");
        usuario.setCadastro(ler.nextInt());

        if (usuario.getCadastro() == 1) {
            usuario.novoUsuario();
            usuario.novaSenha();
        }
        else if(usuario.getCadastro() == 2) {
            usuario.nomeDoUsuario();
            usuario.senhaDoUsuario();
        }

        TelaInicial inicial = new TelaInicial(3000);
        inicial.escolherFuncao();

    }
    }
