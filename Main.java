//import java.util.Scanner;
// Scanner sc = new Scanner (System.in);
/** Rutina inicial de comparacion de objetos.
  * @author Renato Casanova
  **/
public class Main{
  
  public static void main(String[] args){
   
    
    
     // Mis objetos a comparar:
     RCVaca vaca1 = new RCVaca();
     RCVaca vaca2 = new RCVaca("I am a cow" ," miau");
     RCVaca vaca3 = new RCVaca();
    
     
     RCPuerco cerdo1 = new RCPuerco();
     RCPuerco cerdo2 = new RCPuerco("I am a little pig", "ooooink");
     
     RCDinosaurio dino1 = new RCDinosaurio ();
     RCDinosaurio dino2 = new RCDinosaurio ("tirexxx me llamo", "yahu!");
     
     RCZacapuntas zac1 = new RCZacapuntas();
     RCZacapuntas zac2 = new RCZacapuntas(coloresDeZacapuntas.azul,marcaDeZacapuntas.patito);
     RCZacapuntas zac3 = zac1;
     
     RCLapiz lapiz1 = new RCLapiz ();
     RCEmotions emo1 = new RCEmotions();
    
    //Comparacion de un par de estos objetos;
     
     if (vaca3.equals(vaca1))
       if(!cerdo2.equals(emo1))
       if(!emo1.equals(dino2))
       if(!cerdo1.equals(lapiz1))
       if(!zac1.equals(zac2))
       if(!zac1.equals(dino2))
       if(zac3.equals(zac1))
       System.out.println("Si se lee esto, es que esta perfecto");
  }
  
}