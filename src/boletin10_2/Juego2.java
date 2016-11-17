 package boletin10_2;

import javax.swing.JOptionPane;


/**
 *
 * @author atejidosolla
 */
public class Juego2 {
    
    int num;
    int num2;
    int intentos;
    int valorabsoluto;
    public void juegorandom(){
    
    num = (int) (Math.random()* (1-50)+50);
    
    do{    
    intentos=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de intentos"));
        for(int i = 1;i<intentos;i++){
        
    num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre 0 y 50"));
    
    if(num2<0 || num2>50)
        System.err.println("Número no válido vuelve a introducir un número");
    
    
    
           if(num==num2){
               System.out.println("Enhorabuena has ganado");
           break;}
    
           
           valorabsoluto= Math.abs(num-num2);
           
         if(valorabsoluto>20)
             System.out.println("E número esta muy lejos");
         else if(valorabsoluto>=10 && valorabsoluto <=20)
             System.out.println("Lejos");
         else if(valorabsoluto>=5 && valorabsoluto<=10)
             System.out.println("Cerca");
         else
             System.out.println("Muy cerca");}
                     
    
    }while(num2<0 || num2>50);
    
    }
}
    

