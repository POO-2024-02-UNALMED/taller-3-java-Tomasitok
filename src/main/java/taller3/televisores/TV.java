package taller3.televisores;

/**
 *
 * @author tomas
 */
            
public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }
    
    public void turnOn(){
        estado = true;
    }
    
    public void turnOff(){
        estado = false;
    }
    
    public void canalUp(){
        if(estado && canal < 120){
            canal += 1;
        }
    }
    
    public void canalDown(){
        if(estado && canal > 1){
            canal -= 1;
        }
    }
    
    public void volumenUp(){
        if(estado && volumen < 7){
            volumen += 1;
        }
    }
    
    public void volumenDown(){
        if(estado && volumen > 0){
            volumen -= 1;
        }
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public Marca getMarca() {
        return marca;
    }

    public int getCanal() {
        return canal;
    }

    public int getPrecio() {
        return precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public Control getControl() {
        return control;
    }
    
    public static int getNumTV() {
        return numTV;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setCanal(int canal) {
        if(estado && canal >= 1 && canal <= 120){
            this.canal = canal;
        }
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(int volumen) {
        if(estado && volumen >= 0 && volumen <= 7){
            this.volumen = volumen;
        }
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }    
    
}
