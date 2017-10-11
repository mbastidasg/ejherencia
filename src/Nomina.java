/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ESTUDIANTE
 */
public class Nomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consultor consultor = new Consultor ("RH", 1);
        Administrador admin = new Administrador (2, "f");
        Programador programadorUno = new Programador ("java", 3, 100, "v");
        Programador programadorDos = new Programador ("javaS", 4, 200, "iv");
        Lider lider = new Lider ("java", 5, 200, "h");
        lider.addProgramador(programadorDos);
        lider.addProgramador(programadorUno);
        CompaniaSoftware compania = new CompaniaSoftware();
        compania.addContrato(admin);
        compania.addContrato(consultor);
        compania.addContrato(programadorUno);
        compania.addContrato(programadorDos);
        
        
    }
    
}
