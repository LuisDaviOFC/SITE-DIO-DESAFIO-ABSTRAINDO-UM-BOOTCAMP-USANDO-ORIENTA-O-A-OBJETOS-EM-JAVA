package DesafioBootcamp;

import DesafioBootcamp.Bootcamp;
import DesafioBootcamp.Curso;
import DesafioBootcamp.Dev;
import DesafioBootcamp.Mentoria;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        //CURSOS
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaPOO");
        curso2.setDescricao("descrição curso JavaPOO");
        curso2.setCargaHoraria(40);

        //MENTORIAS
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //MENTORIAS 2
        Mentoria2 mentoria2 = new Mentoria2();
        mentoria2.setTitulo("mentoria de java");
        mentoria2.setDescricao("descrição mentoria java");

        //BOOTCAMPS
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //BOOTCAMPS 2
        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp Java Developer");
        bootcamp2.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp2.getConteudos().add(curso1);
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(mentoria2);

        System.out.println("------------SEM MODIFICAÇÃO NA DATA-----------");
        System.out.println("--------------------DEVS----------------------");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Aluno DEV: " + devCamila.getNome());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos = " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos = " + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
        System.out.println("---------------------------------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Aluno DEV: " + devJoao.getNome());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        System.out.println("----------------------FIM---------------------");
        System.out.println("-----------------DATA MODIFICADA--------------");
        System.out.println("--------------------DEVS----------------------");
        Dev devCamila2 = new Dev();
        devCamila2.setNome("Camila");
        devCamila2.inscreverBootcamp(bootcamp2);
        System.out.println("Aluno DEV: " + devCamila2.getNome());
        devCamila2.progredir();
        devCamila2.progredir();
        System.out.println("Conteúdos Inscritos = " + devCamila2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos = " + devCamila2.getConteudosConcluidos());
        System.out.println("XP:" + devCamila2.calcularTotalXp());
        System.out.println("---------------------------------------------");
        Dev devJoao2 = new Dev();
        devJoao2.setNome("Joao");
        devJoao2.inscreverBootcamp(bootcamp2);
        System.out.println("Aluno DEV: " + devJoao2.getNome());
        devJoao2.progredir();
        devJoao2.progredir();
        devJoao2.progredir();
        System.out.println("Conteúdos Inscritos:" + devJoao2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos:" + devJoao2.getConteudosConcluidos());
        System.out.println("XP:" + devJoao2.calcularTotalXp());
        System.out.println("---------------------FIM-------------------");
    }
}
