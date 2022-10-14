package veterinaria;

import java.util.ArrayList;

/**
 *
 * @author Hernan Murcia & Dirley Puentes
 */
public class Logica {
    //Se crean los ArrayList para gato y perro

    public ArrayList dogs = new ArrayList();
    public ArrayList cats = new ArrayList();
    //de declara la variable contador
    int cont;

    public Logica() {

        dogs.add(new Dogs("Rufo", "Chanderman", "Cafe", contador(2), 10));
        dogs.add(new Dogs("Lupe", "Chanderman", "Cafe", contador(1), 1));
        dogs.add(new Dogs("Perla", "Bichón frisé", "Blaco", contador(3), 7));

        cats.add(new Cats("Orion", "Persa", "Amarillo-Blanco", contador(2), true));
        cats.add(new Cats("Estrellita", "Angora", "Negra", contador(3), false));
        cats.add(new Cats("Costalito", "Callejero", "Gris", contador(1), true));

    }
     
    // proceso para guardar las edades  
    public int contador(int edad) {

        cont += edad;
        setCont(cont);
        return edad;

    }

    //encapsulamiento
    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String imprimir() {

        return null;

    }

}
