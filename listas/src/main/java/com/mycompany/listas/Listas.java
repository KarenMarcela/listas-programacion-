package com.mycompany.listas;

import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {
        String[] names= new String[5];
        ArrayList<String> list= new ArrayList<>();
       
        list.add("Hola");
        list.add("Mundo");
        list.add("cruel");
        list.set(1, "Gente"); //para sustituir un objetos que ya ha sido añadido
        
        list.remove(2); //Para eliminar un objeto
        System.out.println(list.get(0));
        
        System.out.println("Tamaño de la lista: "+list.size());
        System.out.println("¿Està vacìa? "+list.isEmpty());
        System.out.println("Valores de la lista: "+list);
        
        System.out.println("¿Saluda?"+list.contains("Hola"));
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(String item : list){
            System.out.println(item);
        }
    }
}
