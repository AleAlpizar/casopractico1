/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ale;

import javax.swing.JOptionPane;


public class factura {
        int numerofactura = 0;
        int montofactura = 0;
        String mesfactura="";
        int anofactura=0;
        int estadofactura=0; 
        int cantfacturas=0;

        public int getCantfacturas() {
            return cantfacturas;
        }

        public void setCantfacturas() {
        cantfacturas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de facturas: "));
            this.cantfacturas = cantfacturas;
    
        }   
   
    
        public int getNumerofactura() {
         return numerofactura;
        }

        public void setNumerofactura() {
        numerofactura = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de factura: "));
            this.numerofactura = numerofactura;
        }

        public int getMontofactura() {
         return montofactura;
        }

        public void setMontofactura() {
         montofactura = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto de la factura: "));
            this.montofactura = montofactura;
        }

        public String getMesfactura() {
         return mesfactura;
        }

        public void setMesfactura() {
        mesfactura = JOptionPane.showInputDialog("Digite el mes de la factura: ");
            this.mesfactura = mesfactura;
        }

        public int getAnofactura() {
            return anofactura;
        }

        public void setAnofactura() {
        anofactura = Integer.parseInt(JOptionPane.showInputDialog("Digite el año de factura: "));
           this.anofactura = anofactura;
        }

        public int getEstadofactura() {
            return estadofactura;
        }

    public void setEstadofactura() {
        estadofactura = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si su estado de cuenta esta paga o 2 si no esta pagada: "));
        if (estadofactura==1)
            JOptionPane.showMessageDialog(null, "pagado", null,0);
        else{
            JOptionPane.showMessageDialog(null,"No pagado",null,0);
        this.estadofactura = estadofactura;
        }
    }
 
}
