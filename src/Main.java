import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        pais p = new pais("españa");
        System.out.println();
        p.setNombre("España");
        System.out.println("El pais es " + p.getNombre());
        p.setContinente("Europa");
        System.out.println("Pertenece al continente de " + p.getContinente());
        p.setIdiomaOficial("Castellano");
        System.out.println("Su idioma oficial es el " + p.getIdiomaOficial());
        p.setExtensionGeografica(506.030);
        System.out.println("Su extension geografica es de " + p.getExtensionGeografica() + "Km2");

        pais p2 = new pais("Francia", "Frances", "Europa");
        System.out.println();
        p2.setNombre("Francia");
        System.out.println("El pais es " + p2.getNombre());
        p2.setContinente("Europa");
        System.out.println("Pertenece al continente de " + p2.getContinente());
        p2.setIdiomaOficial("Frances");
        System.out.println("Su idioma oficial es el " + p2.getIdiomaOficial());
        p2.setExtensionGeografica(551.695);
        System.out.println("Su extension geografica es de " + p2.getExtensionGeografica() + "Km2");

        pais p3 = new pais("Peru", 5564877, "Castellano", 551.695, "america", true);
        System.out.println();
        p3.setNombre("Peru");
        System.out.println("El pais es " + p3.getNombre());
        p3.setContinente("America");
        System.out.println("Pertenece al continente de " + p3.getContinente());
        p3.setIdiomaOficial("Castellano");
        System.out.println("Su idioma oficial es el " + p3.getIdiomaOficial());
        p3.setExtensionGeografica(551.695);
        System.out.println("Su extension geografica es de " + p3.getExtensionGeografica() + "Km2");
        System.out.println();
        p3.muestraResumen();
//EJERCICIO 3 Y EJERCICIO 5
        System.out.println();

        java.util.ArrayList<Integer> a;

        ArrayList aL = new ArrayList<>(0);

        aL.add(12);
        aL.add(5);
        aL.add(18);
        aL.add(9);
        aL.add(1);


        for (int i = 0; i < aL.size(); i++) {
        }

        System.out.println("el contenido del arraylist es " + aL);
        if (aL.contains(12)) {
            System.out.println("La arraylist contiene el numero 12");
        }
        if (aL.contains(13)) {
            System.out.println("La arraylist contiene el numero 13");
        }
        if (aL.contains(14)) {
            System.out.println("La arraylist contiene el numero 14");
        }

        if (aL.size() == 0) {
            System.out.println("El array esta vacio ");
        }

        aL.remove(3);

        System.out.println("el contenido del arraylist es " + aL);

        System.out.println("El tamaño de la arraylist es " + aL.size());

        aL.clear();
    }
}