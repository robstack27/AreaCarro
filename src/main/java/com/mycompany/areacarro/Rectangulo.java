/*
* Click
nbfs://nbhost/SystemFileSystem/Templates/Licenses/licensedefault.txt to change this license
* Click
nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to
edit this template
*/
package com.mycompany.areacarro;
/**
*
* @author labctr
*/
public class Rectangulo {
 private double alto;
 private double ancho;
 private String color;
 public Rectangulo(double alto, double ancho, String color){
 this.alto = (double) alto;
 this.ancho = (double) ancho;
 this.color = color;
 }
 public double calcularArea (){
 double area = alto * ancho;
 return area;
 }
}