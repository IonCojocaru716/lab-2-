package com.company;

public class Pantofi extends Incaltaminte {

   private String culoare;

    public Pantofi( String denumire, String material,String culoare){
        super(denumire, material);
        this.culoare =  culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    @Override
    public String toString() {
        return "Pantofi{" +
                "culoare='" + culoare + '\'' +
                '}';
    }
}
