package controlador;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.text.View;
import modelo.Modelo;
import vista.Vista;

/**
 * clase controlador para detectar los click en un boton de la lista para esto se implementara el ActionListener para que pueda escuchar los eventos de algun boton
 * @author DAVID
 */
public class Controlador implements ActionListener{
    
    /**
     * atributo de clase Vista
     */
    private Vista view;
    /**
     * atributo de la clase Modelo
     */
    private Modelo model;

    /**
     * Constructor de los atributos de la clase controlador
     * @param view
     * @param model 
     */
    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnAgregar.addActionListener(this);
    }
    /**
     *  funcion para iniciar la vista
     */
    public void iniciar(){
        view.setTitle("Lista");
        view.setLocationRelativeTo(null);
    }
    /**
     * funcion para enviar los datos y nos retorna la lista 
     * @param e 
     */
    public void actionPerformed(ActionEvent e){

        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement(model.getLista());
        model.setMensaje(view.txtMensaje.getText());
        model.agregar();
        view.listGeneral.setModel(modelo);
        view.txtMensaje.setText("");
    }
}
