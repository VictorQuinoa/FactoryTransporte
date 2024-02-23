import javax.swing.*;

public class Bicicleta implements Comun {

    /**
     * Metodo que establece el precio del envio con un número aleatorio
     * @param cp
     * @return
     */
    @Override
    public float costeTotal(int cp) {
        int codigoPostal = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el código postal"));

        float coste = (float)  Math.random()*1000+1;

        return coste;
    }


    /**
     * Metodo que establece el tipo de embalaje mediante un calculo del volumen calculado con los datos introducidos
     * @param x
     * @param y
     * @param z
     * @param peso
     * @return
     */

        @Override
        public int tipoEmbalaje(float x, float y, float z, float peso) {


            float volumen;


            volumen = (float) (x*y*z);

            int embalaje = 0;


            if (volumen < 10){
                embalaje= CARTON;
            } else if (volumen > 10 && volumen<100){
                embalaje=CAJA;
            } else if(volumen>100){
                embalaje=PALET;
            }
            return embalaje;

        }


}
