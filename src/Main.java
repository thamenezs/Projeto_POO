import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Curso muito bom");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThais = new Dev();
        devThais.setNome("Thaís");
        devThais.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Thaís " + devThais.getConteudosInscritos());
        devThais.progredir();
        devThais.progredir();
        devThais.progredir();
        System.out.println("----");
        System.out.println("Conteúdos Inscritos Thaís " + devThais.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Thaís " + devThais.getConteudosConcluidos());
        System.out.println("XP: " + devThais.calcularTotalXp());




        System.out.println("----------------");

        Dev devJojo = new Dev();
        devJojo.setNome("Jojo");
        devJojo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jojo " + devJojo.getConteudosInscritos());
        devJojo.progredir();
        devJojo.progredir();
        devJojo.progredir();
        System.out.println("----");
        System.out.println("Conteúdos Inscritos Jojo " + devJojo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jojo " + devJojo.getConteudosConcluidos());
        System.out.println("XP: " + devJojo.calcularTotalXp());




    }
}
