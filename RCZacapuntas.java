/** Clase para la representacion de un zacapuntas
  * *@author Renato Casanova 
  * */
public class RCZacapuntas{
   
  coloresDeZacapuntas color;
  marcaDeZacapuntas marca;
  
  int porcentajeDeError, velocidadDeOperacion;
  
  
  /**Zaca punta a un lapiz.
    * @param lapiz Al lapiz, le genera una punta de 100 porciento.
    */
  void zacarPuntaAUnLapiz(RCLapiz lapiz){ lapiz.punta = 1;}
  
  /**Zaca punta a varios lapices.
    * @param lapices A los lapices, le genera una punta de 100 porciento.
    */
  void zacarPuntaAVariosLapices (RCLapiz[] lapices) {
  
    for (int i = 0 ;i<lapices.lenght();i++)
    {
      this.zacarPuntaAUnLapiz(lapices[i]);
    }
  }
  
  
  /** Constructor de zacapuntas.
    * */
  RCZacapuntas ()
  { color = coloresDeZacapuntas.amarillo;
    marca = marcaDeZacapuntas.delmont ;
  }
  
  /** Constructor de zacapuntas  de color y marca.
    * @param colorA El color de mi zacaputnas
    * @param marcaA La marca de mi zacapuntas.
    * */
  RCZacapuntas (coloresDeZacapuntas colorA, marcaDeZacapuntas marcaA) {
  color = colorA;
  marca = marcaA;
  } 
  
  /** Convierte mi objeto en una descripcion textual
    * */
  public String toString()
  {
      return "Zacapuntas;\n" + "Color: " + this.color + " Marca: "+ this.marca;
  }
  /** Comprueba si este objeto es igual a otro cualquier objeto.
    * @param o Cualquier objeto.
    * @return si, si es identico.
    */
  public boolean equals(Object o)
  {
    boolean isEqual = false;
    if (o instanceof RCZacapuntas )
    { 
     
      RCZacapuntas tmp = (RCZacapuntas)o;
     if (this.color == tmp.color)
     if (this.marca == tmp.marca)
        isEqual = true;
    }
    return isEqual;
  }
 

}