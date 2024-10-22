package practica01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {

	public static void main(String[] args) {
		//genero las 5 personas
		Persona persona01 = new Persona();
		Persona persona02 = new Persona();
		Persona persona03 = new Persona();
		Persona persona04 = new Persona();
		Persona persona05 = new Persona();
		//Le asigno los valores nombre y apellido a cada persona con su respectivo setter
		persona01.setNombre("Andres");
		persona01.setApellido("Padilla");
		persona02.setNombre("Adrian");
		persona02.setApellido("Muzza");
		persona03.setNombre("Federico");
		persona03.setApellido("Ferrer");
		persona04.setNombre("Hugo");
		persona04.setApellido("Sanchez");
		persona05.setNombre("Sebastian");
		persona05.setApellido("Gaitan");
		
	    // creor una lista para almacenar las personas
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        // agrego las personas a la lista
        listaPersonas.add(persona01);
        listaPersonas.add(persona02);
        listaPersonas.add(persona03);
        listaPersonas.add(persona04);
        listaPersonas.add(persona05);

        // imprimo los nombres y apellidos de las personas en la lista
        System.out.println("Lista como se cargo");
        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }
     
        
        // Ordenar la lista por el nombre de la persona
        Collections.sort(listaPersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });        
        System.out.println("\nLista ordenada por nombre:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }
        Collections.sort(listaPersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p2.getApellido().compareTo(p1.getApellido()); // Orden inverso
            }
        });
        System.out.println("\nLista ordenada por Apellido:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido());
        }
	}

}
