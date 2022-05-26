package com.company;


import java.util.Scanner;

public class Banco {


    public static void main(String[] args) {
        String nombre, pin;
        int saldo;
        int monto=0;

        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        Scanner cs= new Scanner(System.in);
        System.out.println("Seleccione una opcion: ");
        System.out.println("1. Usar una cuenta:");
        System.out.println("2. Crear una cuenta: ");
        System.out.println("3. Salir");
        int i= cs.nextInt();
        c1.setNombre("Miguel Aleman");
        c1.setSaldo(1000);
        c1.setPin("1234");
        c1.setMonto(0);
        regreso: while(true) {
            switch (i) {
                case 1 -> {
                    Scanner cs2 = new Scanner(System.in);
                    Scanner p = new Scanner(System.in);
                    System.out.println("Datos de la cuenta");
                    System.out.println("Nombre: " + c1.getNombre());
                    System.out.println("pin: " + c1.getPin());
                    System.out.println("Que desea hacer?");
                    System.out.println("1. Depositar");
                    System.out.println("2. Retirar");
                    System.out.println("3. Ver saldo");
                    System.out.println("4. Salir");
                    int j = cs2.nextInt();
                    System.out.println("Ingrese su pin: ");
                    String pin2 = p.nextLine();
                    if (j == 1 && pin2.equals(c1.getPin())) {
                        System.out.println("Ingrese el monto a depositar:");
                        c1.setMonto(cs2.nextInt());
                        System.out.println("Su saldo es: " + (c1.getSaldo() + c1.getMonto()));
                        continue regreso;
                    }
                    if (j == 2 && pin2.equals(c1.getPin())) {
                        System.out.println("Ingrese el monto a retirar:");
                        c1.setMonto(cs2.nextInt());
                        if (c1.getSaldo() >= c1.getMonto()) {
                            System.out.println("Su saldo es: " + (c1.getSaldo() - c1.getMonto()));
                        } else {
                            System.out.println("No puede retirar una cantidad mayor a su saldo actual");
                            System.exit(0);
                            continue regreso;
                        }

                    }

                    if (j == 3 && pin2.equals(c1.getPin())) {
                        System.out.println("Su saldo actual es: " + c1.getSaldo());
                    }
                    if(j == 4 && pin2.equals(c1.getPin())){
                        System.exit(0);
                    }


                }
                case 2 -> {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Ingrese el nombre ");
                    nombre = sc.nextLine();
                    saldo = 0;
                    System.out.println("Ingrese el pin ");
                    pin = sc.nextLine();
                    c2.setNombre(nombre);
                    c2.setSaldo(saldo);
                    c2.setPin(pin);
                    System.out.println("Datos de la cuenta 2");
                    System.out.println("Nombre: " + c2.getNombre());
                    System.out.println("Saldo: " + c2.getSaldo());
                    System.out.println("pin: " + c2.getPin());
                    System.out.println("Ingrese el monto a depositar: ");
                    monto = sc.nextInt();
                    System.out.println("Su saldo es: " + (c2.getSaldo() + monto));
                    System.exit(0);
                }

                case 3 -> {
                    System.out.println("Hasta pronto");
                    System.exit(0);
                }

            }
        }
    }
}
