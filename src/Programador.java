/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTUDIANTE
 */
public class Programador extends Empleado{
    protected String lenguajeExperto;
    protected double bonificacion;
    
    public Programador(String lenguaje, int id,double salario, String nombre) {
        super(id, salario, nombre);
        this.lenguajeExperto = lenguaje;
        if (this.lenguajeExperto.equals("java") )
            this.bonificacion = (this.salario *0.2);
    }

    @Override
    public double calcularSalario() {
    return this.salario + this.bonificacion;   
    }

    @Override
    public String reportarNomina() {
    return "programador" + this.id + this.calcularSalario();
    }

    public String getLenguajeExperto() {
        return lenguajeExperto;
    }

    public void setLenguajeExperto(String lenguajeExperto) {
        this.lenguajeExperto = lenguajeExperto;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    
    
}
