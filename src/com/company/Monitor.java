package com.company;

public class Monitor {
    private String color;
    private String brand;
    private String serial;
    private int size;

    public Monitor(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }
    public Monitor(int size){
        this.size=size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    //Sobre carga de metodos: Nombrar un metodo igual, pero con distintos parametros lo que hace diferenciar
    // uno de otro
    // Para utilizarlos, simplemente se llama el metodo y se envia el parametro, este automaticamente escoge cual
    // de los metodos va a utilizar
}
