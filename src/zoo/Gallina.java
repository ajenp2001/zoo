package zoo;

/**
 * Clase que representa una gallina, que es una subclase de la clase Ave.
 * Las gallinas pueden realizar acciones como rugir, comer y desplazarse.
 */
public class Gallina extends Ave {

    private String cacareo = "GRRRRR"; // El sonido característico de la gallina

    /**
     * Constructor vacío de la clase Gallina.
     */
    Gallina() {}

    /**
     * Constructor parametrizado de la clase Gallina.
     * 
     * @param habitat           El hábitat de la gallina.
     * @param comida            El tipo de comida de la gallina.
     * @param longevidad        La longevidad esperada de la gallina.
     * @param periodoIncubacion El periodo de incubación de los huevos de la gallina.
     */
    Gallina(Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
        super(habitat, comida, longevidad, periodoIncubacion);
    }

    /**
     * Establece el sonido característico (cacareo) de la gallina.
     * 
     * @param cacareo El sonido característico de la gallina.
     */
    public void setCacareo(String cacareo) {
        this.cacareo = cacareo;
    }

    /**
     * Obtiene el sonido característico (cacareo) de la gallina.
     * 
     * @return El sonido característico de la gallina.
     */
    public String getCacareo() {
        return cacareo;
    }

    /**
     * La gallina realiza su acción de rugir, que en este caso es cacarear.
     */
    public void rugir() {
        System.out.println(cacareo);
    }

    /**
     * La gallina realiza su acción de comer.
     * Imprime en consola qué está comiendo la gallina.
     */
    public void comer() {
        System.out.println("Estoy comiendo " + comida);
    }

    /**
     * La gallina realiza su acción de desplazarse.
     * En este caso, como es una gallina, se imprime un mensaje indicando que vuela con dificultad.
     */
    public void desplazar() {
        System.out.println("Estoy volando con mucha dificultad");
    }
}
