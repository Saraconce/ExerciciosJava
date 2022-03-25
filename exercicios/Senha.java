/*Faça um programa que leia um nome de usuário e a sua senha
e não aceite a senha igual ao nome do usuário,
mostrando uma mensagem de erro e voltando a pedir as informações.*/

import java.util.Objects;
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = new String("");
        String senha;

        System.out.println("Nome do Usuário: ");
        nome = scan.next();
        System.out.println("Senha: ");
        senha = scan.next();

        while (Objects.equals(nome, senha)) {
            System.out.println("Sua senha não pode ser igual ao nome do usuário, digite novamente: ");
            senha = scan.next ();

        }
    }
}
