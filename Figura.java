/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseAbsFigura;

/**
 *
 * @author usuario
 */
public abstract class Figura {
    protected String cor;
    public abstract float CALCULA_AREA();
    public abstract void DIBUXARFIG();
    public abstract void AMOSANOME();
    public abstract void VER_DATOS();
    public void CAMBIA_COR(String cor){
        this.cor=cor;
    }
    public void VER_COR(){
        System.out.println("A cor e : "+this.cor);
    }
}
    
