package br.edu.ifpb.singleton;

public class Funcionario {

    private static Funcionario uniqueInstance;

    private Funcionario(){

    }

    public static synchronized Funcionario getInstance(){

        if(uniqueInstance == null){
            uniqueInstance = new Funcionario();
        }
        return uniqueInstance;
    }

}
