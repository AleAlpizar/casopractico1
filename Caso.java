/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion.ale;

import javax.swing.JOptionPane;

import programacion.clase7.cliente;

/**
 *
 * @author 11alp
 */
public class Caso {

    
    public static void main(String[] args) {
    int pagopendiente = 0;
    int pagosechos = 0;
    factura datos = new factura();
    datosempresa registro = new datosempresa();
    registro.setNombre();
    registro.setcedula();
    String leer = JOptionPane.showInputDialog(null, "para añadir factura digite 1 \n para ver la informacion final 2", null, 0);
    int menu = Integer.parseInt(leer);
    while(menu==1){
    datos.setNumerofactura();
    datos.setMontofactura();
    datos.setMesfactura();
    datos.setAnofactura();
    datos.setEstadofactura();
    if(datos.getEstadofactura()==1){
        pagosechos += datos.getMontofactura();
    }else{
        pagopendiente += datos.getMontofactura();
    }
    JOptionPane.showMessageDialog(null, "numero de factura "+datos.getNumerofactura()+"\nmonto de la factura "+datos.getMontofactura()+"\n fecha de la factura "+datos.getMesfactura()+"/"+datos.getAnofactura()+"\nestado de la factura:"+datos.getEstadofactura(), "datos de la factura", 0);
    leer = JOptionPane.showInputDialog(null, "para añadir factura digite 1 \n para ver la informacion final 2", null, 0);
    menu = Integer.parseInt(leer);
    }
    JOptionPane.showMessageDialog(null, "total pagado:"+pagosechos, null, 0);
    double impuesto = pagopendiente*0.05;
    double planparapagar = impuesto+pagopendiente;
    double pago = planparapagar/6;
    JOptionPane.showMessageDialog(null,"el cliente debe:"+pago+"\na 6 meses de cuotas seria \ncuota de julio: "+pago+"\ncuota de agosto: "+pago+"\ncuota de septimbre: "+pago+"\ncuota de octubre: "+pago+"\ncuota de noviembre: "+pago+"\ncuota de diciembre: "+pago, null, 0);
}
}
