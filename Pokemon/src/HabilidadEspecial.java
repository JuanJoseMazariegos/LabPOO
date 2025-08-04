
import java.util.Random;

public class HabilidadEspecial {
     
    private String nombre;
    private String tipoEfecto; 
    private int valor;
    private int probabilidad; 
    
    public HabilidadEspecial(String nombre, String tipoEfecto, int valor, int probabilidad) {
        this.nombre = nombre;
        this.tipoEfecto = tipoEfecto;
        this.valor = valor;
        this.probabilidad = probabilidad;}
    
        public boolean activar() {
    Random rand = new Random();
    int numero = rand.nextInt(101); 
    
    if (numero <= probabilidad) {
        return true;  
        
    } 
    
    else {
        return false; 
    }
        }
    
        
    public String getTipoEfecto() { return tipoEfecto; }
    public int getValor() { return valor; }
    public String getNombre() { return nombre; }



        
}
