/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseAbsFigura;
import java.util.*;
/**
 *
 * @author usuario
 */
public class Rectangulo extends Figura {
    Scanner teclado=new Scanner(System.in);
    protected int ancho,alto;
    public Rectangulo(){
        System.out.println("Introduce el ancho del rectangulo.");
        this.ancho=teclado.nextInt();
        System.out.println("Introduce el alto del rectangulo.");
        this.alto=teclado.nextInt();
        System.out.println("Introduce o cor da figura");
        this.cor=teclado.next();
    }
    public float CALCULA_AREA(){
        float area=this.alto*this.ancho;
        return area;
    }
    public void DIBUXSARFIG(){
        System.out.println("*******");
        System.out.println("*     *");
        System.out.println("*******");
    }
    public void AMOSANOME(){
        System.out.println("Introduce o nome da figura");
        String nome=teclado.next();
        System.out.println("L afigura es un: "+nome);
    }
    public void VER_DATOS(){
        System.out.println("El ancho mide: "+this.ancho);
        System.out.println("El alto mide: "+this.alto);   
        System.out.println("O cor da figura e: "+this.cor);
    }
    public void CAMBIA_COR(){
        System.out.println("Introuce o novo cor");
        String n_cor=teclado.next();
        super.CAMBIA_COR(n_cor);
    }
    public void VER_COR(){
        super.VER_COR();
    }
}
