/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseAbsFigura;
import java.awt.BorderLayout;
import java.util.*;
/**
 *
 * @author usuario
 */
public class Cuadrado extends  Figura {
    Scanner teclado=new Scanner(System.in);
    protected int lado;
    public Cuadrado(){
        System.out.println("Introduzca o numero de lados do cuadrado");
        this.lado=teclado.nextInt();
        System.out.println("Introduce o cor da figura");
        this.cor=teclado.next();
    }
    public float CALCULA_AREA(){
        System.out.println("Introduce el tamaño del primer lado");
        int t_lado=teclado.nextInt();
        float area=t_lado*t_lado;
        return area;
    }
    public void DIBUXARFIG(){
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*****");
    }
    public void AMOSANOME(){
        System.out.println("Introduzca o nome da figura");
        String nome=teclado.next();
        System.out.println("O nome da figura e: "+nome);
    }
    public void VER_DATOS(){
        System.out.println("A Cor da figura e: "+this.cor);
        System.out.println("O numeor de lados da figura e de :"+this.lado);
        
    }
    public void CAMBIA_COR(){
        System.out.println("Introuce o novo cor");
        String n_cor=teclado.next();
        super.CAMBIA_COR(n_cor);
    }
}
