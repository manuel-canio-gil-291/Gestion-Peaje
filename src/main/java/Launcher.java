package main.java;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        float entrada;
        float salida;
        float bonificacion=0.00f;
        float precio;
        char optarifa;
        TicketGeneral general;
        TicketEspecial especial;

        Scanner sc = new Scanner(System.in);

        System.out.println("**********************************");
        System.out.println("** Sistema de gestion de peajes **");
        System.out.println("**********************************");

        try{
            System.out.println();
            System.out.print("Dime el punto kilometrico de entrada: ");
            entrada = sc.nextFloat();
            System.out.print("Dime el punto kilometrico de salida: ");
            salida = sc.nextFloat();
            System.out.print("Indica el precio de la tarifa: ");
            precio = sc.nextFloat();
            System.out.print("Tarifa general o especial? (g/e): ");
            optarifa = sc.next().charAt(0);
            if(optarifa=='e') {
                int pasajeros;
                System.out.print("Indica el numero de pasajeros: ");
                pasajeros = sc.nextInt();
                especial = new TicketEspecial(entrada, salida, precio, pasajeros);
                System.out.println("Kilometro de entrada: "+especial.registroInicial(entrada));
                System.out.println("Kilometro de salida: "+especial.registroFinal(salida));
                especial.calculoKmRecorrido(entrada, salida, precio, bonificacion);
            }else if(optarifa=='g') {
                general = new TicketGeneral(entrada, salida, precio);
                System.out.println("Kilometro de entrada: "+general.registroInicial(entrada));
                System.out.println("Kilometro de salida: "+general.registroFinal(salida));
                general.calculoKmRecorrido(entrada, salida, precio, bonificacion);
            }else{
                System.out.println("La opcion seleccionada no es la correcta");
            }
            System.out.println("Gracias por usar nuestro sistema de gestion de peajes\nCerrando el programa");
        }catch (Exception e){
            System.err.println("ERROR. Formato no valido");
            System.err.println(e.getMessage()+" "+e.getCause());
        }finally{
            try{
                sc.close();
            }catch (Exception e){
                System.err.println(e.getMessage()+" "+e.getCause());
            }
        }
    }
}
