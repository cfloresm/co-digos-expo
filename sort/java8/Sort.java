import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
  static class Persona {
        String nombre;
        String apellido;
        Integer edad;

        public Persona(String nombre, String apellido, Integer edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        @Override
        public String toString() {
            return new StringBuilder(nombre).append(" ")
                    .append(apellido).append(" ").append(edad).toString();
        }
    }

    static List<Persona> personas = new ArrayList<Persona>(){{
            add(new Persona("Gabriel", "Lobato", 24));
            add(new Persona("Carlos", "Flores", 30));
            add(new Persona("Josué", "Incháurregui", 24));
            add(new Persona("Marco", "Acevedo", 32));
            add(new Persona("Cristian", "Alanís", 27));
            add(new Persona("Ernesto", "Carrilo", 32));
        }};

    public static void main(String[] args) {
        System.out.println(personas);
        //JAVA7
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.apellido.compareTo(p2.apellido);
            }
        });
        System.out.println(personas);
        //Lambdas
        Collections.sort(personas, (p1, p2) -> p1.edad.compareTo(p2.edad));
        System.out.println(personas);

        Collections.sort(personas, (p1, p2) -> p1.nombre.compareTo(p2.nombre));
        System.out.println(personas);

    }
}
