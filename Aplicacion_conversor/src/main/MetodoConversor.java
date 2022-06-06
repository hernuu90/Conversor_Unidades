
package main;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MetodoConversor {
    
        String conversores[] = {
            "Seleccione",
            "Conversor de Moneda",
            "Conversor de Temperatura",
        };

        String conversorMoneda[] = {
            "Pesos a Dólares",
            "Pesos a Euros",
            "Pesos a Libras Esterlinas",
            "Pesos a Yen Japonés",
            "Pesos a Won sul-coreano",
            "Dólares a Pesos",
            "Euros a Pesos",
            "Libras Esterlinas a Pesos",
            "Yen Japonés a Pesos",
            "Won sul-coreano a Pesos"
        };
        
        String conversorTemperatura[] = {
            "Grados Celcius a Grados Farenheit",
            "Grados Celcius a Grados Kelvin",
            "Grados Farenheit a Grados Celcius",
            "Grados Kelvin a Grados Celcius",
            "Grados Kelvin a Grados Farenheit"
        };
        
    String prueba = conversorMoneda[0];

    public String selectInput(Object msg, String titulo, String descripcion) {

        Object msg1 = JOptionPane.showInputDialog(new JFrame(),
                descripcion,
                titulo,
                JOptionPane.QUESTION_MESSAGE,
                null, (Object[]) msg,
                "Seleccione"
        );

        return String.valueOf(msg1);
    }

    public int ventanaFin() {

        return JOptionPane.showConfirmDialog(
                null,
                "¿Deseas continuar?",
                "Conversor",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
    }

    public double conversor(double valor, String msg) {
        switch(msg)
        {
    case "Pesos a Dólares":
        valor /= 125.36;
          break; 
    case "Pesos a Euros" :
        valor /= 129.23;
         break; 
    case "Pesos a Libras Esterlinas":
        valor /= 150.1;
          break; 
    case "Pesos a Yen Japonés" :
        valor /= 0.94;
         break;             
    case "Pesos a Won sul-coreano":
        valor /= 0.095;
          break; 
    case "Dólares a Pesos" :
        valor *= 125.36;
         break; 
    case "Euros a Pesos":
        valor *= 129.23;
          break; 
    case "Libras Esterlinas a Pesos":
        valor *= 150.1;
         break;  
    case "Yen Japonés a Pesos":
        valor *= 0.94;
         break;  
    case "Won sul-coreano a Pesos":
        valor *= 0.095;
         break;  
    case "Grados Celcius a Grados Farenheit":
        valor = (valor * 9/5) + 32 ;
         break;  
    case "Grados Celcius a Grados Kelvin":
        valor += 273.15 ;
         break;       
    case "Grados Farenheit a Grados Celcius":
        valor = (valor - 32)*5/9;
         break;  
    case "Grados Kelvin a Grados Celcius":
        valor -=273.15 ;
         break;       
    case  "Grados Kelvin a Grados Farenheit":
        valor = (valor - 273.15) * 9/5 + 32 ;
         break;  
          
    default : 
       
   }
    return valor;
   }
}
    