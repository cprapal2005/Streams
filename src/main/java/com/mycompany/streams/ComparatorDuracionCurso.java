/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.streams;

import java.util.Comparator;

/**
 *
 * @author DAM
 */
public class ComparatorDuracionCurso implements Comparator<Curso>{

    @Override
    public int compare(Curso o1, Curso o2) {
        
        if(o1.getDuracion()>o2.getDuracion()) return 1;
        
        else if(o1.getDuracion()<o2.getDuracion()) return -1;
        
        else return 0;
        
    }
    
    
    
}
