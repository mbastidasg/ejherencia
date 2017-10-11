
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTUDIANTE
 */
public class Lider extends Programador {
    private ArrayList <Programador> Programadores;

    public Lider(String lenguaje, int id, double salario, String nombre) {
        super(lenguaje, id, salario, nombre);
            this.Programadores = new ArrayList<>();
    }
    
    @Override
     public double calcularSalario(){
        for (int i = 0; i < this.Programadores.size(); i++) {
            double salario = this.calcularSalario();
            salario *= 0.1;
            
        }
         return this.calcularSalario() + salario;
     }
     @Override
     public String reportarNomina(){
         String reporte = "lider" + this.getNombre() + "programadores";
         for (int i = 0; i < this.Programadores.size(); i++) {
             Programador programador = this.Programadores.get(i);
             reporte += programador.reportarNomina();
         }
        return reporte;
     }
     public boolean addProgramador(Programador programador){
         return this.Programadores.add(programador);
     }
}
