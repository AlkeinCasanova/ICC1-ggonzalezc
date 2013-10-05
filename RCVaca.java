/**
 * Representacion de un dinosaurio.
 * @version 1
 * @author Renato Casanova
 * */
public class RCVaca{
  
  String saludo;
  String sonido;
  
  /** Constructor de vacas.
    * */
  public RCVaca(){
     saludo = "hola soy una vaca";
     sonido = "muu";
  }
  
  /** Constructor de vacas con saludo y sonido.
    * @param saludo Saludo de mi vaca.
    * @param sonido Sonido de mi vaca.
    * */
  public RCVaca(String saludo, String sonido){
     this.saludo = saludo;
     this.sonido = sonido;
  }
  
  /**Metodo para hacer que el vaca coma.
    * Imprime un msn que indica que esta cominedo
    * @param comida nombre de la comida.
    * */
  public void comer(int comida){
    
    System.out.println(" estoy comiendo" + comida);
  }
  
  /** Convierte mi objeto en una descripcion textual
    * */
  public String toString(){
    return "Vaca;\n" +"Saludo:"+ saludo + " Sonido: " + sonido;
  }
  /** Comprueba si este objeto es igual a otro cualquier objeto.
    * @param o Cualquier objeto.
    * @return si, si es identico.
    */
  public boolean equals(Object o){ 

    boolean isEqual= false;
    if (o instanceof RCVaca)
    { 
      RCVaca tmp = (RCVaca) o;
      if(tmp.saludo == this.saludo)
      if(tmp.sonido == this.sonido)
        isEqual = true;
     
    }
    return isEqual; 
  }
}
