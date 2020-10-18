package com.company;

public class Main {

    public static void main(String[] args) {

        Incaltaminte incaltaminte= new Incaltaminte("pantof","piele");

        incaltaminte.getDenumire();
        incaltaminte.getMaterial();
        System.out.println(incaltaminte.getDenumire() + "  este din " +  incaltaminte.getMaterial());
        System.out.println("________________________________________");

        System.out.println(incaltaminte.toString());

        System.out.println("__________________________________________");

        Pantofi pantofi=new Pantofi(": crosuri ","jeans ", "gri");
        System.out.println(pantofi.toString());
    }
}
