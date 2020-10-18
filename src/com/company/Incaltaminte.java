package com.company;

public class Incaltaminte {

    private String denumire;
    private String material;

    public Incaltaminte(String denumire, String material){
        this.denumire = denumire;
        this.material=material;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Incaltaminte{" +
                "denumire='" + denumire + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
