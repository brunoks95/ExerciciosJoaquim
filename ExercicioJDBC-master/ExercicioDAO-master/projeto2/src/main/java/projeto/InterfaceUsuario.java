package projeto;

import projeto.entidades.Aluno;
import projeto.persistencia.AlunoDAO;

import java.util.List;
import java.util.Scanner;

public class InterfaceUsuario {
    AlunoDAO dao;
    Scanner in;

    public InterfaceUsuario(AlunoDAO dao) {
        this.dao = dao;
        this.in = new Scanner(System.in);
    }

    public void iniciar() {
        imprimirMenu();
    }

    private void imprimirMenu() {
        int opc = 0;
        do {
            System.out.println("\n==============");
            System.out.println("==== Menu ====");
            System.out.println("==============");
            System.out.println("\t1. Consultar todos");
            System.out.println("\t2. Consultar todos nomes que começam por A");
            System.out.println("\t3. sair");
            System.out.print("Escolha uma opção: ");
            opc = in.nextInt();

            //necessário para ler a quebra de linha (enter)
            in.nextLine();

            switch (opc) {
                case 1:
                    this.read();
                    break;
                case 2:
                    this.read1();
                    break;
                case 3:
                    System.out.println("tchau :)");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        }while (opc != 3);
    }



    private void read() {
        List<Aluno> alunos = dao.read();

        System.out.println("\n***********************************");
        System.out.println("*** Lista de Alunos Cadastrados ***");
        System.out.println("***********************************");
        for(Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    private void read1() {
        List<Aluno> alunos = dao.read1();

        System.out.println("\n***********************************");
        System.out.println("*** Lista de Alunos Cadastrados ***");
        System.out.println("***********************************");
        for(Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }


}
