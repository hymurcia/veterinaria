package veterinaria;

import javax.swing.JOptionPane;

/**
 *
 * @author Hernan Murcia & Dirley Puentes
 */
public class Perros extends Logica {

    // proceso para guardar las edades  
    @Override
    public int contador(int edad){
        cont+=edad;
        setCont(cont);
        return edad;
    }
    
    //metodo para agregar mascota
    public void addDog() {
        dogs.add(new Dogs(JOptionPane.showInputDialog("Nombre del perro:"), JOptionPane.showInputDialog("Tipo de raza:"), JOptionPane.showInputDialog("Color:"), contador(Integer.parseInt(JOptionPane.showInputDialog("Edad(años):"))), Integer.parseInt(JOptionPane.showInputDialog("nivel de entrenamiento:"))));
    }

    //metodo para borrar un gato
    public void deleteDoc(int value){
        dogs.remove(value);
        
       
    }
    //procedimiento para imprimir mascotas
    @Override
    public String imprimir() {
        String viewAll = "Cantidad de Perros: " + dogs.size() + "\n";
        for (int i = 0; i < dogs.size(); i++) {
            viewAll += i + "." + dogs.get(i) + "\n";
        }

        return viewAll;

    }
}



class Dogs {

    //Declarar variables
    private final String nombre;
    private final int edad;
    private final String raza;
    private final String color;
    private final int nivel;
    
    
    
    //constructor sobrecargado
    public Dogs(String nombre, String raza, String color, int edad, int nivel) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.nivel = nivel;
        
       
    }
    
//toString para eliminar el nombre de los objetos
    @Override
    public String toString() {
        
        return (" Nombre: " + this.nombre + ", Raza: " + this.raza + ", Edad: " + this.edad + " años, Nivel de entrenamiento: " + this.nivel);
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

    public int getNivel() {
        return nivel;
    }

    
}

