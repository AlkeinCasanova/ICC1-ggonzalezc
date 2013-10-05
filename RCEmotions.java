
/**
 * Classe para representar 10 diferentes emociones. Las cuales, pueden ir cambiando segun el usario lo desee.
 * @version 1
 * @author Renato Casanova
 * */
public class RCEmotions
  
{
  String currentEmotion;
  /** Constructor basico**/
  RCEmotions ()
  {
    this.happyFace();
  }
  
  void happyFace () {currentEmotion = "=)"; };
  void sadFace () {currentEmotion = "=("; };
  void whateverFace () {currentEmotion = "-.-"; };
  void exitedFace () {currentEmotion = "=D"; };
  void outragedFace () {currentEmotion = "XD"; };
  void suspiciousFace () {currentEmotion = "<.<"; };
  void otherSuspiciousFace () {currentEmotion = ">.>"; };
  void moneyFace () {currentEmotion = "$.$"; };
  void monkeyFace () {currentEmotion = "<(o.o)>"; };
  void toungeFace () {currentEmotion = "=P" ;};
  void defaultFace () { currentEmotion =  "angry at you now, becasuse you didnt do as I said.";};
  
  /** Convierte mi objeto en una descripcion textual
    * */
  public String toString()
  { return "Emocion; \n" + "Look at me!\n" + "I am " + currentEmotion; };
  /** Comprueba si este objeto es igual a otro cualquier objeto.
    * @param o Cualquier objeto.
    * @return si, si es identico.
    */
  public boolean equals(Object o)
  {
    boolean isEqual = false;
    if (o instanceof RCEmotions )
    { 
      RCEmotions tmp = (RCEmotions)o;
     if (this.currentEmotion == tmp.currentEmotion)
        isEqual = true;
    }
    return isEqual;
  }
}