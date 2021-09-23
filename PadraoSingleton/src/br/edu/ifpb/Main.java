package br.edu.ifpb;

import br.edu.ifpb.singleton.Funcionario;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = Funcionario.getInstance();

        System.out.println(funcionario);
        System.out.println(Funcionario.getInstance());

    }

}
