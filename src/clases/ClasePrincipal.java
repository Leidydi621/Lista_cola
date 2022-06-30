package clases;

import javax.swing.JOptionPane;

public class ClasePrincipal {
    public static void main(String[] args) {
        int opc = 0, nodo_info = 0;
        Cola cola = new Cola();

        do {
            try {

                opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de Opciones\n\n"
                                + "1. Insertar un Nodo\n"
                                + "2. Extraer un Nodo\n"
                                + "3. Mostrar contenido de la cola\n"
                                + "4. Salir\n"));

                switch (opc) {
                    case 1:
                        nodo_info = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Por favor ingresa el valor a guardar en el nodo."));
                        cola.Insert(nodo_info);
                        break;
                    case 2:
                        if(!cola.emptyCola()){
                            JOptionPane.showInputDialog(null, "Se extrajo un nodo con el valor " 
                            + cola.Extract());
                        }else{
                            JOptionPane.showInputDialog(null, "La cola esta vacia");
                        }
                        break;
                    case 3:
                        cola.ShowContent();
                        break;
                    case 4:
                        opc = 4;
                        break;
                    default:
                        JOptionPane.showInputDialog(null, "Opción no disponible");
                        break;

                }

            } catch (NumberFormatException e) {

            }
        } while (opc != 4);
    }

}
