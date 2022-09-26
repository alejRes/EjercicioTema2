package com.alejrest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            double precio = 0;
            System.out.println("Introduce el precio del producto:");
            precio = scanner.nextDouble();
            System.out.println("Intoduce la cantidad de IVA");
            int iva = scanner.nextInt();
            System.out.println("El precio de producto con iva es: " + precioConIva(precio, iva));
        }catch(InputMismatchException e){
            System.out.println("Datos mal introducidos");
            e.printStackTrace();
        }finally{
            scanner.close();
        }

    }

    private static double precioConIva(double precioSinIva, int catidadIva){
        double factorMultiplicacion = 1.00 + (catidadIva/100.00);
        return precioSinIva * factorMultiplicacion;
    }
}