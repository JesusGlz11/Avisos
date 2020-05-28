/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Aviso {
    float matricula;
    String Tipoaviso;
    String titulo;
    String  texto;
    String resumen;
    String Nombre;
    String fechapublicacion;
    String fechaalta;
    String fechabaja;
    String status;
    


    
    @Override
    public String toString() {
        return "Avisos{" + "Matricula " + matricula + ", tipo de aviso =" + Tipoaviso + ", titulo =" + titulo + ", Texto=" + texto+ ", Resumen =" + resumen + ", Nombre " + Nombre + ", Fecha Publicacion = " + fechapublicacion+ ", Fecha Baja = " + fechabaja + ", Fecha alta = " + fechaalta + ", Status = " + status;
    }


    
}
