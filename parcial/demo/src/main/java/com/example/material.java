package com.example;

public abstract class material {

    public String titulo;
    public String material;
    public int añopublicacion;
    public boolean disponible;

    public material( String titulo, String material, int añopublicacion, boolean disponible){
        this.titulo=titulo;
        this.material=material;
        this.añopublicacion= añopublicacion;
        this.disponible=disponible; 

    public void mostrarinformacion(){
   System.out.println("titulo:" + titulo);

    }       


}
}
