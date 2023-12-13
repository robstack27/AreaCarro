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
public class Carro {
 private Circulo llanta1;
 private Circulo llanta2;
 private Circulo llanta3;
 private Circulo llanta4;
 private Rectangulo caroceria;

 public Carro (Circulo llanta1, Circulo llanta2, Circulo
llanta3, Circulo llanta4, Rectangulo caroceria){
 this.llanta1 = llanta1;
 this.llanta2 = llanta2;
 this.llanta3 = llanta3;
 this.llanta4 = llanta4;
 this.caroceria = caroceria;
 }
 public double calcularArea (){
 double areaTotal = llanta1.calcularArea() +
llanta2.calcularArea() + llanta3.calcularArea() +
llanta4.calcularArea() + caroceria.calcularArea();
 return areaTotal;
 }
}