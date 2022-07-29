package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria Java");
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devErica = new Dev();
        devErica.setNome("Erica");
        devErica.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Erica " + devErica.getConteudosInscritos());
        devErica.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Erica " + devErica.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Erica" + devErica.getConteudosConcluidos());
        System.out.println("XP " + devErica.calcularXp());

        System.out.println("--------");

        Dev devCesari = new Dev();
        devCesari.setNome("Cesari");
        devCesari.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Cesari " + devCesari.getConteudosInscritos());
        devCesari.progredir();
        devCesari.progredir();
        devCesari.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Cesari " + devCesari.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Cesari" + devCesari.getConteudosConcluidos());
        System.out.println("XP " + devErica.calcularXp());




    }
}
