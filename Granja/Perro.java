public class Perro{

    public boolean cuidar; 
    public String nombre;
    public int edad;
    

    public Perro(String nombre){
      cuidar = false;
      edad = 1;
      this.nombre = nombre;
    }

    public void setEdad(int edad){ 
      this.edad = edad;
    }

    public void setNombre(String nombre){
      this.nombre = nombre;
    }

    public int getEdad(){ return edad; }
    public String getNombre(){ return nombre; }
    public boolean estaCuidando(){ return cuidar; }
    
    public void cuidarCasa(){
 System.out.println("estoy cuidando la casa");
 cuidar = true;
    }

    public void dormir(){
 System.out.println("me voy a echar una siestesita te encargo el changarro");
 cuidar = false;
    }
    
    public void avisoHambre(){
      System.out.println("tengo hambre");
    }

    public String toString(){
 String estado_perro = "";
 if(cuidar){
     estado_perro = "se supone que cuido la casa\n";
 }else{
     estado_perro = "deja dormir ZzZzZzzZZzz\n";
 }
 return ""+
     "/\\__/\\\n"+
     "| O_O| "+  " HOLA SOY UN PERRO FEO Y ME LLAMO: " + nombre +"\n"+ 
     "\\___/\n"+
     "y tengo esta edad: " + edad+ "\n"+ 
     estado_perro;
    }

    public boolean equals(Object o){
 boolean status = false;
 if(o instanceof Perro){
     Perro tmp = (Perro)o;
     if(tmp.edad == this.edad && tmp.nombre.equalsIgnoreCase(this.nombre) && tmp.cuidar == this.cuidar)
  status = true;
 }
 return status;
    }

    public static void main(String[] parametros){
 Perro pancho = new Perro("pancho");
 Perro canuto = new Perro("canuto");
 pancho.setEdad(2);
 canuto.setEdad(4);
 canuto.cuidarCasa();
 System.out.println(pancho);
 System.out.println(canuto);
 System.out.println("Sera que son iguales estos perros?");
 String estado = "nop";
 if(canuto.equals(pancho))
     estado = "sip";
 System.out.println(estado);
    }
}

 

    
 