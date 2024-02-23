/**
 * Interfaz con los metodos comunes
 */
public interface Comun {

    /**
     * @param Palet
     * @param Carton
     * @param Caja
     *
     */

    int PALET = 0;
    int CARTON = 1;
    int CAJA = 2;

    /**
     * Metodo del coste
     * @param cp
     * @return
     */
    float costeTotal(int cp);

    /**
     * Metodo del embalaje
     * @param x
     * @param y
     * @param z
     * @param peso
     * @return
     */

    int tipoEmbalaje(float x, float y, float z, float peso);
}
