/**

   Created by ComputerChem


*/

/**
 * Clase para representar estudiantes. Un estudiante tiene nombre, número de
 * cuenta, promedio y edad.
 */
public class Estudiante {

    private String nombre;
    private int cuenta;
    private double promedio;
    private int edad;

   public Estudiante(String nombre, int cuenta, double promedio, int edad) {
    this.nombre = nombre;
    this.cuenta = cuenta;
    this.promedio = promedio;
    this.edad = edad;
}

    public String getNombre() {
      
	return nombre;
    }

    public void setNombre(String nombre) {
        
	this.nombre = nombre;
    }

    
    public int getCuenta() {
   	
	return cuenta; 

    }

    public void setCuenta(int cuenta) {
    
	this.cuenta = cuenta; 

    }

    public double getPromedio() {
        
	return promedio; 
	

    }

     
    public void setPromedio(double promedio) {

	this.promedio = promedio;
     
  }

    
    public int getEdad() {

	return edad;

    }

    public void setEdad(int edad) {
 
	this.edad = edad; 
    }

 public String toString() {

        return "Nombre: " + nombre + ", Cuenta: " + cuenta + ", Promedio: " + promedio + ", Edad: " + edad;
    
 }

    public boolean equals(Estudiante estudiante) {
        if (estudiante == null)
            return false;

	else 
	    return true;
    }
}






