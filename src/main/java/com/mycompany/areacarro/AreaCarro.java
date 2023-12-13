/*
* Click
nbfs://nbhost/SystemFileSystem/Templates/Licenses/licensedefault.txt to change this license
*/
package com.mycompany.areacarro;
import java.util.Scanner;
/**
*
* @author labctr
*/
public class AreaCarro {
 public static void main(String[] args) {
 // Crear un objeto Scanner para leer desde la entrada estándar
 Scanner ingresar = new Scanner(System.in);
 double alto, ancho, radio;
 String color, colorRectangulo;
 // Crear un array para almacenar las llantas
 Circulo[] llantas = new Circulo[4];
 // Utilizar un bucle for para ingresar el radio y color de las llantas
 for (int i = 0; i < llantas.length; i++) {
 System.out.print("Ingrese el radio de la llanta " + (i + 1) + ": ");
 radio = ingresar.nextDouble();
 System.out.print("Ingrese el color de la llanta " + (i + 1) + ": ");
 color = ingresar.next();
 // Crear la instancia de Circulo y asignarla alarray
 llantas[i] = new Circulo(radio, color);
 }
 // Ingresar la longitud y el ancho de la carrocería y elcolor
 System.out.println("Ingrese el largo de la carrocería:");
 alto = ingresar.nextDouble();
 ingresar.nextLine(); // Limpiar el buffer del teclado
 System.out.println("Ingrese el ancho de la carrocería:");
 ancho = ingresar.nextDouble();
 ingresar.nextLine(); // Limpiar el buffer del teclado
 System.out.println("Ingrese el color de la carrocería:");
 colorRectangulo = ingresar.nextLine();
 // Crear una instancia de Rectangulo para la carrocería
 Rectangulo caroceria = new Rectangulo(alto, ancho,
colorRectangulo);
 // Crear una instancia de Carro con las instancias de 6Circulo y Rectangulo
 Carro carro = new Carro(llantas[0], llantas[1],
llantas[2], llantas[3], caroceria);
 // Calcular y mostrar el área total del carro
 double areaCarro = carro.calcularArea();
 System.out.println("El área total del carro es: " +
areaCarro);
 // Cerrar el objeto Scanner
 ingresar.close();
 }
}
