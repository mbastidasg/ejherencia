
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
public class CompaniaSoftware {
    private ArrayList <Contrato> contratos;

    public CompaniaSoftware() {
        this.contratos = new ArrayList <>();
    }

    
    public boolean addContrato( Contrato contrato){
        return this.contratos.add(contrato);
        
    }
    
    public double calcularSalarioTotal(){
        double total = 0;
        for (Contrato contrato : contratos) {
            total += contrato.calcularSalario();
        }
        return total;
    }
    public ArrayList<Contrato> reportarNomina(){
        return this.contratos;
                
    }
}
