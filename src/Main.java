

public class Main {
    /**
     * Clase main en la que se llama a las otras clases y metodos mediante factory
     */
    static Comun salida;

    public static void main(String[] args) {


salida=FactoryTransporte.getTransporte(FactoryTransporte.CAMION);
if (salida instanceof Camion) System.out.println("CAMION:");
        System.out.println("Coste total:" + salida.costeTotal(36000)+ "Tipo de transporte: "+ salida.tipoEmbalaje(15,20 ,35,10));

        salida=FactoryTransporte.getTransporte(FactoryTransporte.BICICLETA);
        if (salida instanceof Bicicleta) System.out.println("BICICLETA:");
        System.out.println("Coste total:" + salida.costeTotal(36000)+ "Tipo de transporte: "+ salida.tipoEmbalaje(15,20 ,35,10));


    }
}
