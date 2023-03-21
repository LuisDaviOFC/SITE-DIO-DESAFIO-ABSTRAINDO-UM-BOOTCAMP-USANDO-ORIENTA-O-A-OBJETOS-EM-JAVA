package DesafioBootcamp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //CURSOS
        Curso curso = new Curso("Java","Curso Java para Iniciante",40);
        Curso curso2 = new Curso("JavaPOO","Curso JavaPOO para Iniciante",40);
        System.out.println(curso);
        System.out.println(curso2);
        // MODIFICADOR DE DATA
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //MENTORIAS
        Mentoria mentoria = new Mentoria("Banco Pan Developer Java", "Bootcamp Completo de Java ao Java POO");
        System.out.println(mentoria + ", data= " + formatter.format(date) + " }");
    }
}
