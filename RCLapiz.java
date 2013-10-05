/**Clase para representar a un lapiz
  *@author Renato Casanova 
  */
class RCLapiz
{
  int punta = 0;
  
  /** Convierte mi objeto en una descripcion textual
    * */
  public String toString()
  {
      return "Lapiz;" + "\nPunta: "+punta;
  }
  /** Comprueba si este objeto es igual a otro cualquier objeto.
    * @param o Cualquier objeto.
    * @return si, si es identico.
    */
  public boolean equals(Object o)
  {
    boolean isEqual = false;
    if (o instanceof RCLapiz )
    { 
     
      RCLapiz tmp = (RCLapiz)o;
     if (this.punta == tmp.punta)
        isEqual = true;
    }
    return isEqual;
  }
}