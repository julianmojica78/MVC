package modelo;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author DAVID
 */
public class Modelo {

    /**
     * atributo tipo string para recibir el mensaje
     */
    private String mensaje;
    /**
     * lista para agregar los mensajes
     */
    private ArrayList<String> lista = new ArrayList<String>();

    /**
     * agrega a la lista los mensajes
     *
     * @return lista
     */
    public ArrayList<String> agregar() {
        lista.add(this.mensaje);

        return lista;
    }

    /**
     * retorna el mensaje
     *
     * @return mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * modifica el emnsaje
     *
     * @param mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * retorna la lista de mensajes
     *
     * @return lista
     */
    public ArrayList<String> getLista() {
        return lista;
    }

    /**
     * modificca la lista de mensajes
     *
     * @param lista
     */
    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

}
