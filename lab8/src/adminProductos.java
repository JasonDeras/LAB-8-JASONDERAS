
import java.io.*;
import java.util.ArrayList;

public class adminProductos {

    private ArrayList<Productos> listaPersonas = new ArrayList();
    private File archivo = null;

    public adminProductos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Productos> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Productos> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }

    //extra mutador
    public void setPersona(Productos p) {
        this.listaPersonas.add(p);
    }

    public void cargarArchivo() {
        try {
            listaPersonas = new ArrayList();
            Productos temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Productos) objeto.readObject()) != null) {
                        listaPersonas.add(temp);
                    }
                } catch (EOFException ex) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Productos t : listaPersonas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
