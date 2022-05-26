package com.company;


public class Cuenta {

    private String nombre;
    private int saldo;
    private String pin;
    private int monto;

    //Constructor por defecto
    public Cuenta() {
    }

    //Constructor con parámetros
    public Cuenta(String nombre, int saldo,String pin,int monto) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.pin=pin;
        this.monto=monto;
    }


    //getters y setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {

        return nombre;
    }

    public void setSaldo(int saldo) {

        this.saldo = saldo;
    }


    public int getSaldo() {

        return saldo;
    }

    public void setPin(String pin){

        this.pin= pin;
    }

    public String getPin(){

        return pin;
    }
    public void setMonto(int monto) {

        this.monto = monto;
    }


    public int getMonto() {

        return monto;
    }


}
