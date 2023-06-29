/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ale;

import javax.swing.JOptionPane;

/**
 *
 * @author 11alp
 */
public class datosempresa {
    String Nombre="";
    int cedula = 0;
    public void setNombre(){
        Nombre = JOptionPane.showInputDialog("Digite su nombre: ");
        this.Nombre = Nombre;
    }
    public String getNombre() {
    return Nombre;
    }
    public void setcedula(){
        cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite su cedula: "));
    this.cedula = cedula;

    }
    public int getcedula() {
    return cedula;
    }

   
    
    
    
    

}
    


    
    
    

