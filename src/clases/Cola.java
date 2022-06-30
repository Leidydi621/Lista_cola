package clases;
import javax.swing.JOptionPane;

public class Cola {

    private Nodo initCola, finalCola;
    String Cola = "";

    public Cola() {
        initCola = null;
        finalCola = null;
    }

    //Metodo para saber si la cola esta vacia
    public boolean emptyCola(){
        if (initCola == null){
            return true;
        } else {
            return false;
        }
    }

    //Metodo para insertar a la cola
    public void Insert(int information) {
        Nodo new_nodo = new Nodo();
        new_nodo.information = information;
        new_nodo.next = null;

        if (emptyCola()){
            initCola = new_nodo;
            finalCola = new_nodo;
        } else {
            finalCola.next = new_nodo;
            finalCola = new_nodo;
        }
    }

    //Metodo para extraer la cola

    public int Extract(){
        if (!emptyCola()){
            int information = initCola.information;
        

            if (initCola == finalCola){
                initCola = null;
                finalCola = null;
            } else {
                initCola = initCola.next;
            }
            return information;
        }else {
            return Integer.MAX_VALUE;
        }
    }

    //Metodo para mostrar el contenido de la cola

    public void ShowContent(){
        Nodo route = initCola;
        String ColaInverter = "";

        while (route != null) {
            Cola += route.information + " ";
            route = route.next;
        }

        String cadena [] = Cola.split(" ");

        for (int i = cadena.length -1; i >= 0; i--){
            ColaInverter += " " + cadena[i];
        }
        JOptionPane.showMessageDialog(null, ColaInverter);
        Cola = "";
    }
}
