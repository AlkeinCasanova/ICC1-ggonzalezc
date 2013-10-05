/**
 * Representacion de un puerco.
 * @version 1
 * @author Renato Casanova
 * */
public class RCPuerco{
  
  String saludo;
  String sonido;
  /** Constructor de puercos**/
  public RCPuerco(){
     saludo = "hola soy un cerdito";
     sonido = "oink";
  }
  /** Constructor de puercos con saludo y sonido.
    * @param saludo Saludo de mi cerdo.
    * @param sonido Sonido de mi cerdo.
    * */
  public RCPuerco(String saludo, String sonido){
     this.saludo = saludo;
     this.sonido = sonido;
  }
  
  /**Metodo para hacer que el puerco coma.
    * Imprime un msn que indica que esta cominedo
    * @param comida nombre de la comida.
    * */
  public void comer(String comida){
    
    System.out.println(" estoy comiendo" + comida);
  }
  
  /** Convierte mi objeto en una descripcion textual
    * */
  public String toString(){
    return "Puerco;\n" +"Saludo:"+ saludo + " Sonido: " + sonido;
  }
  
  /** Comprueba si este objeto es igual a otro cualquier objeto.
    * @param o Cualquier objeto.
    * @return si, si es identico.
    */
  public boolean equals(Object o){ 

    boolean isEqual= false;
    if (o instanceof RCPuerco)
    { 
      RCPuerco tmp = (RCPuerco)o;
      if(tmp.saludo == this.saludo)
      if(tmp.sonido == this.sonido)
        isEqual = true;
     
    }
    return isEqual; 
  }
}