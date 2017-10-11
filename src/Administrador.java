/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTUDIANTE
 */
public class Administrador  extends Empleado{
    
    public Administrador(int id, String nombre) {
        super(id,100, nombre);
    }

    @Override
    public double calcularSalario() {
            return this.salario;
    }

    @Override
    public String reportarNomina() {
        return "administrador" + this.id + this.salario;
    }
    
}
