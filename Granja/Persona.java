public class Persona{
  
   String nombre;
   
   public Persona(String nombre){
     this.nombre = nombre;
   }
   
   public void alimentarPerro(Perro perro, int alimento){
     System.out.println("le doy de comer a: " perro.getNombre());
     perro.comer();
     alimento-=5;
   }
}