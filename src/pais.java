public class pais {
    private String nombre;
    private int numeroDeHabitantes;
    private String idiomaOficial;
    private double extensionGeografica;
    private String continente;
    private boolean democratico = true;

    private static int numPaises;

    public pais(String n) {
        nombre = n;
        numPaises++;
    }

    public pais(String n2, String i, String c) {
        nombre = n2;
        idiomaOficial = i;
        continente = c;
        numPaises++;
    }

    public pais(String n3, int nH, String i2, double eG, String c2, boolean d) {
        nombre = n3;
        numeroDeHabitantes = nH;
        idiomaOficial = i2;
        extensionGeografica = eG;
        continente = c2;
        democratico = d;
        numPaises++;
    }

    public boolean Mas100000H() {
        if (numeroDeHabitantes > 100000) {
            return true;
        }
        return false;

    }

    public void imprimeContinente() {
        System.out.println("El pais pertenece al siguiente continente: " + continente);
    }

    public void imprimeExtension() {
        System.out.println("El pais pertenece a la siguiente extension: " + extensionGeografica);

    }

    public boolean apareceNombre() {
        return continente.contains(nombre);
    }


    //EJERCICIO 2

    public void setNombre(String n) {
        nombre = n;
    }

    public void setNumeroDeHabitantes(int nh) {
        numeroDeHabitantes = nh;
    }

    public void setIdiomaOficial(String i) {
        idiomaOficial = i;
    }

    public void setExtensionGeografica(double e) {
        extensionGeografica = e;
    }

    public void setContinente(String c) {
        continente = c;
    }

    public void setDemocratico(boolean d) {
        democratico = d;
    }


    public String getNombre() {
        return nombre;
    }

    public int getNumeroDeHabitantes() {
        return numeroDeHabitantes;
    }

    public String getIdiomaOficial() {
        return idiomaOficial;
    }

    public double getExtensionGeografica() {
        return extensionGeografica;
    }

    public String getContinente() {
        return continente;
    }

    public boolean getDemocratico() {
        return democratico;
    }

    public void muestraResumen() {
        System.out.println("El nombre del pais es " + nombre + " tiene " + numeroDeHabitantes + " habitantes " + "su idioma oficial es " + idiomaOficial + " su extension es " + extensionGeografica + " su continente es " + continente + " y es democratico:" + democratico + " y van en total: " + numPaises + " paises");
    }
//EJERCICIO 3 MAS EN EL MAIN
}

