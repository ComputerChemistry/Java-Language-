/*

  Created by ComputerChem

*/


public class Estudiante {

private String nombre;
private int edad;
private int expediente;
private double promedio;

   
 public Estudiante (String nombre,
		     int edad,
		     int expediente,
		     double promedio){

   this.nombre = nombre; 
   this.edad = edad;
   this.expediente = expediente;
   this.promedio = promedio;
   
}
  public String getNombre(String nombre){
    
     

      return nombre;

}
     
 public void setNombre(String nombre){


     this.nombre = nombre;  


}  

 public int getEdad(int edad){
     
      return edad; 


}

 public void setEdad(int edad){

      
       this.edad = edad;

    

 }

  public void setExpediente(int expediente){

   
     this.expediente = expediente;


}
 
  public static int getExpediente(int expediente){

   
      

      return expediente;

     
 }

  public void setPromedio(double promedio){


      this.promedio = promedio;

      
 }

  public double getPromedio(double promedio){


      return promedio;

 }

  public String toString(){


	return nombre + edad + expediente + promedio;


 }
    

  public boolean equals(Estudiante estudiante){

    if (estudiante == null) 

       return false;

    else 

	return true;      
   

  }
 
 }




   
 
    



