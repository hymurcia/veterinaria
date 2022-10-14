package veterinaria;

import javax.swing.JOptionPane;

/**
 *
 * @author Dirley Puentes & Hernan Murcia
 */
public class Gatos extends Logica {

     // proceso para guardar las edades  
    @Override
    public int contador(int edad){
        cont+=edad;
        setCont(cont);
        return edad;
    }
    
    //metodo para agregar mascota
    public void addCat() {
       cats.add(new Cats(JOptionPane.showInputDialog("Nombre del gato:"), JOptionPane.showInputDialog("Tipo de raza:"), JOptionPane.showInputDialog("Color:"),contador(Integer.parseInt(JOptionPane.showInputDialog("Edad: "))), Boolean.valueOf(JOptionPane.showInputDialog("Libre de toxoplasmosis(true o false):"))));
    }
    
    //metodo para borrar un gato
    public void deleteCat(int value) {
        cats.remove(value);
    }

    //procedimiento para imprimir mascotas
    @Override
    public String imprimir() {

        String viewAll = "Cantidad de Gatos: " + cats.size() + "\n";
        for (int i = 0; i < cats.size(); i++) {
           
            viewAll += i + "." + cats.get(i) + "\n";
        }
        return viewAll;

    }

    

}
class Cats {
    
    //Declarar variables
    private final String nombre;
    private final int edad;
    private final String raza;
    private final String color;
    private final boolean toxoplasmosis;
    
    //constructor sobrecargado
    public Cats(String nombre, String raza, String color, int edad, boolean toxoplasmosis) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.toxoplasmosis = toxoplasmosis;
        
    }

    //toString para eliminar el nombre de los objetos
    @Override
    public String toString() {      
        return (" Nombre: " + this.nombre + ", Raza: " + this.raza + ", Edad: " + this.edad + " años, Libre de toxoplasmosis: " + this.toxoplasmosis);
    }

    //metodos de encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public boolean isToxoplasmosis() {
        return toxoplasmosis;
    }
}
