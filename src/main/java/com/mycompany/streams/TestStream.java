package com.mycompany.streams;

import java.util.ArrayList;
import java.util.List;

public class TestStream {
    
    public static void main(String[] args) {
        
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));
        
        System.out.println("Obtener la cantidad de cursos con una duración mayor a 5 horas.");
        cursos.stream().filter((curso) -> curso.getDuracion()>5).forEach((curso) -> {System.out.println(curso.toString());});
       
        System.out.println("\nObtener la cantidad de cursos con una duración menor a 2 horas.");
        cursos.stream().filter((curso) -> curso.getDuracion()<2).forEach((curso) -> {System.out.println(curso.toString());});
        
        System.out.println("\nListar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.");
        cursos.stream().filter((curso) -> curso.getVideos()>50).forEach((curso) -> {System.out.println(curso.getTitulo());});
        
        System.out.println("\nMostrar en consola el título de los 3 cursos con mayor duración.");
        cursos.stream().sorted(new ComparatorDuracionCurso().reversed()).limit(3).forEach((curso) -> {System.out.println(curso.getTitulo());});
        
        System.out.println("\nMostrar en consola la duración total de todos los cursos.");
        //cursos.stream().
        
    }
    
}
