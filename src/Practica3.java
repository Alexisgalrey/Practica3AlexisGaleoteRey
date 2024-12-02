public class Practica3 {

    private boolean actividades_entregadas;  //ATRIBUTO. Este atributo se usara en el metodo "imprimirNotas" para saber si ha entregado las actividades
    private double nota_practica;       // ATRIBUTO. Este atributo se usa en el metodo "calculoMedia" y "aprobarExamen" para hacer los calculos
    private double nota_examen;         // ATRIBUTO. Este atributo se usa en el metodo "calculoMedia" y "aprobarExamen" para hacer los calculos


    //EJERCICIO 4
    public Practica3(double nP, double nE, boolean a) {
        nota_practica = nP;
        nota_examen = nE;
        actividades_entregadas = a;

    }
/* No hay que declarar un destructor, ya que el recolector
de basura integrado en el lenguaje de programación se encarga de automatizar estas
tareas */
//FINAL EJERCICIO 4



    /* ¿Que son los atributos? Todos los objetos pertenecen a una clase y se identificarán por ATRIBUTOS comunes
    que podrán variar dependiendo del objeto */

    public void imprimirNotas() {
        System.out.println("La nota de clase es la siguiente: ");
        if (actividades_entregadas) {
            System.out.println("Se han entregado las actividades del tema.");
        }
        System.out.println("Nota de prácticas: " + nota_practica);
        System.out.println("Nota de examen: " + nota_examen);
    }            /* METODO. Este metodo te dice si has entregado las actividades,
        si es asi lo imprime en pantalla y te imprime los atributos "nota_practica" y "nota_examen" */

    public double calculoMedia() {
        double media;
        media = ((nota_practica * 0.6) + (nota_examen * 0.4));
        return media;
    }            //METODO. Este metodo hace la media de el atributo "nota_practica" y "nota_examen" y te devuelve la media

    public boolean aprobarExamen() {
        boolean nota_minima = ((nota_practica >= 5) && (nota_examen >= 5));
        boolean media_aprobada = (calculoMedia() >= 5);
        if (nota_minima && media_aprobada) {
            return true;
        }
        return false;
    }           /*METODO. Este metodo comprueba mediante un boolean si los atributos
    "nota_practica" y "nota_examen" son mayores o iguales que 5, comprueba si el metodo "media_aprobada"
    y si es mayor o igual a 5 junto a nota_minima devuelve true, sino false */
}

//EJERCICIO 1

