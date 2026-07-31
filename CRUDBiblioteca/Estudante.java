package CRUDBiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudante extends Pessoa{
    private String curso;
    private int semestre;
    protected String matricula;



    public Estudante(String nome, String cpf, String curso, int semestre, String matricula) {
        super(nome, cpf);
        this.curso = curso;
        this.semestre = semestre;
        this.matricula = matricula;
    }
    

    public int getSemestre() {
        return semestre;
    }

    public String getCurso() {
        return curso;
    }


    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", semestre='" + semestre + '\'' +
                '}';
    }

    /*public void incluir() {
        System.out.println("seu nome: ");
        nome = scan.nextLine();
        System.out.println("seu cpf: ");
        cpf = scan.nextLine();
        System.out.println("seu curso: ");
        curso = scan.nextLine();
        System.out.println("seu semestre: ");
        semestre = scan.nextLine();
        System.out.println("seu semestre: ");
        matricula = scan.nextLine();

    }*/

}
