/*
* Click
nbfs://nbhost/SystemFileSystem/Templates/Licenses/licensedefault.txt to change this license
* Click
nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to
edit this template
*/
package com.mycompany.areacarro;
import static java.lang.Math.PI;
/**
*
* @author labctr
*/
public class Circulo {
 private double radio;
 private String color;

 public Circulo (double radio, String color){
 this.radio = (double) radio;
 this.color = color;
 }

 public double calcularArea() {
 double area = PI * Math.pow(radio, 2);
 return area;
 }

}