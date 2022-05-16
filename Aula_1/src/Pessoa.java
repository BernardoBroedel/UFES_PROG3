import java.util.Scanner;

public class Pessoa {

    String nome;
    String cpf;
    String telefone;
    int idade;

    Pessoa(){ }

    Pessoa(String n, String c, String t, int i){
        nome = n;
        cpf = c;
        telefone = t;
        idade = i;
    }

    public String toString(){
        return "Pessoa(Nome: " + nome + ", cpf: " + cpf + ", telefone: " + telefone + ", idade: " + idade + ").";
    }

    static Pessoa ler(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o CPF da pessoa: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o telefone da pessoa: ");
        String telefone = scanner.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, cpf, telefone, idade);

        return pessoa;
    }
}
