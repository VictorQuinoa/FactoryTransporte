public class FactoryTransporte {
    /**
     * Clase que establece los diferentes medios de transporte
     */

    public static final int CAMION = 1;
    public static final int BICICLETA = 2;

    /**
     * Switch que define que metodos  clase seran llamados
     * @param type
     * @return
     */

    public static Comun getTransporte(int type) {
        switch (type) {

        case CAMION:
        return new Camion();
        case BICICLETA:
        return new Bicicleta();
        default:
        return null;
    }
    }
}
