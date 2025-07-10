/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c22025.clase9;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C22025Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        NinosMalcriados fiestaNinos[] = new NinosMalcriados[10];
        
        JOptionPane.showMessageDialog(null, fiestaNinos[0]);
        if (fiestaNinos[0]==null)
            JOptionPane.showMessageDialog(null, "El valor es nulo necesita ser inicializado ");
        fiestaNinos[0]= new NinosMalcriados();
        fiestaNinos[0].setName("Pepito");
        fiestaNinos[0].setBirthday(new Date());
        fiestaNinos[0].setTypeNino("Bulgar");
        JOptionPane.showMessageDialog(null, fiestaNinos[0].toString());
        fiestaNinos[5]= new NinosMalcriados("Jose", new Date(), "Moleston");
        JOptionPane.showMessageDialog(null, fiestaNinos[5].toString());
        */
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes"));
        Estudiante estudiantes[]=new Estudiante[cantidad];
        //estudiantes[1].grita(); //Esto genera el error mas comun java el nullpointer expcetion  pq no esta inicializado el objeto
        
        solicitaDatosEstudiantes(estudiantes);
        imprimeDatosEstudiantes(estudiantes);
        
        
    }
    
    public static void solicitaDatosEstudiantes(Estudiante[] vector ){
        for (int i = 0; i < vector.length; i++) {
            String nombre = JOptionPane.showInputDialog("Digite el nombre del estudiante");
            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del estudiante"));
            String carnet = JOptionPane.showInputDialog("Digite el carnet del estudiante");
            vector[i]= new Estudiante(nombre, cedula, carnet);
        }
    }
    
     public static void imprimeDatosEstudiantes(Estudiante[] vector ){
        StringBuilder resultado=new StringBuilder();
        for (int i = 0; i < vector.length; i++) {
            resultado.append(vector[i]);
            resultado.append("\n");
        }
        
        JOptionPane.showMessageDialog(null, resultado );
    }
    
}
