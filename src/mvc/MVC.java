package mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 * Clase principal
 *
 * @author DAVID
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Modelo mod = new Modelo();
        Vista view = new Vista();

        Controlador cntrl = new Controlador(view, mod);
        cntrl.iniciar();
        view.setVisible(true);

    }

}
