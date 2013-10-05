/**
 * Representacion de un dinosaurio.
 * @version 1
 * @author Renato Casanova
 * */
public class RCDinosaurio{
  
  String saludo;
  String sonido;
  
  /**Constructor de dinosaurio*/
  public RCDinosaurio(){
     saludo = "Soy un dino";
     sonido = "grrrr";
  }
  
  /**Constructor de dinosaurio.
   * @param saludo Se define el saludo que tendra el dinosurio
   * */
  public RCDinosaurio(String saludo, String sonido){
     this.saludo = saludo;
     this.sonido = sonido;
  }
  /**Metodo para hacer que el el dionsaurio coma.
    * Imprime un msn que indica que esta cominedo
    * @param comida nombre de la comida.
    * */
  public void comer(String comida){
    
    System.out.println(" estoy comiendo" + comida);
  }
  /** Convierte mi objeto en una descripcion textual
    * */
  public String toString(){
    return "Dinosaurio;\n" +"Saludo:"+ saludo + " Sonido: " + sonido;
  }
  /** Comprueba si este objeto es igual a otro cualquier objeto.
    * @param o Cualquier objeto.
    * @return si, si es identico.
    */
  
  public boolean equals(Object o){ 

    boolean isEqual= false;
  
    if (o instanceof RCDinosaurio)
    { 
      
      RCDinosaurio tmp = (RCDinosaurio)o;
      if(tmp.saludo == this.saludo)
      if(tmp.sonido == this.sonido)
        isEqual = true;
     
    }
    return isEqual; 
  }

}