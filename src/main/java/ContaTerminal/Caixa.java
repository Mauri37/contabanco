package ContaTerminal;

import java.util.Random;
import java.util.Scanner;

public class Caixa {
    
    
    public static void main(String[] args){
        // Declarando as variáveis, Scanner e Random
        String nome;
        String agencia = "0134";
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(99999);
    
        //Obtendo os dados iniciais do Cliente
        System.out.println("Cadastrando novo cliente.");
        System.out.print("Ente com seu nome: ");
        nome = entrada.nextLine();
        
        System.out.print("Entre com o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();
        
        //Criando a conta de um cliente
        Conta minhaConta = new Conta(nome, agencia, conta, inicial);
        minhaConta.iniciar();
    }
    
}
