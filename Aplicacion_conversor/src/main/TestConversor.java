
package main;
import javax.swing.JOptionPane;
public class TestConversor {
   
    public static void main(String[] args) {
        
        MetodoConversor convertir = new MetodoConversor();      
        String conversores[] = convertir.conversores;
        String conversorMoneda[] = convertir.conversorMoneda;
        String conversorTemperatura[] = convertir.conversorTemperatura;
        int num = 0;
        
    
       while(num==0){
    
        String msg = convertir.selectInput(
                conversores,
                "Conversor de Unidades",
                "Selecciona el tipo de conversión"
        );

        if (msg == conversores[1]) {
            msg = convertir.selectInput(
                    conversorMoneda,
                    "Conversor de Moneda",
                    "Selecciona la moneda en la que deseas convertir tu dinero"
            );
            double valor = 0;
            try{
                valor += Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el monto a convertir",
                        "Conversor de Moneda",JOptionPane.QUESTION_MESSAGE));
                if (valor<=0) {
                    JOptionPane.showMessageDialog(null,"El valor ingresado es inválido", "Error", JOptionPane.WARNING_MESSAGE);
                }else{
                   valor = convertir.conversor(valor, msg); 
                JOptionPane.showMessageDialog(null, "El valor final es de " + String.format("%.3f", valor),msg, 1);
                }
            }catch(Exception exe){
                System.out.println("Excepcion "+exe);
                JOptionPane.showMessageDialog(null,"El valor ingresado es inválido", "Error", JOptionPane.WARNING_MESSAGE);
            }
            

        } else if (msg == conversores[2]) {
             msg = convertir.selectInput(
                    conversorTemperatura,
                    "Conversor de temperatura",
                    "Selecciona unidad de medida en la que deseas convertir"
            );
            double valor = 0;
            try{
            valor += Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca la temperatura a convertir","Conversor de Temperatura",JOptionPane.QUESTION_MESSAGE));
            valor = convertir.conversor(valor, msg);
            JOptionPane.showMessageDialog(null, "Temperatura final: " + valor+" grados",msg, 1);
            
            }catch(Exception exe){
                System.out.println("Excepcion "+exe);
                JOptionPane.showMessageDialog(null,"El valor ingresado es inválido", "Error", JOptionPane.WARNING_MESSAGE);
            }

        }

        num = convertir.ventanaFin();
          
        
       }
     System.exit(0);
}
}
