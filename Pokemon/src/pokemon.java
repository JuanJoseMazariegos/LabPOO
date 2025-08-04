public class pokemon {
    private String nombre;
    private String tipo;  
    private int ataque;
    private int defensa;
    private HabilidadEspecial habilidad;

    public pokemon(String nombre, String tipo, int ataque, int defensa, HabilidadEspecial habilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.habilidad = habilidad;
    }

    public int calcularAtaqueTotal(pokemon enemigo, boolean usarHabilidad) {
    int ataqueTotal = ataque;

   
    int modificadorTipo = 0;
    if ((this.tipo.equalsIgnoreCase("Fuego") && enemigo.tipo.equalsIgnoreCase("Planta")) ||
        (this.tipo.equalsIgnoreCase("Planta") && enemigo.tipo.equalsIgnoreCase("Agua")) ||
        (this.tipo.equalsIgnoreCase("Agua") && enemigo.tipo.equalsIgnoreCase("Fuego")) ||
        (this.tipo.equalsIgnoreCase("Electrico") && enemigo.tipo.equalsIgnoreCase("Agua"))) {
        modificadorTipo = 20; 
    } else if ((this.tipo.equalsIgnoreCase("Fuego") && enemigo.tipo.equalsIgnoreCase("Agua")) ||
               (this.tipo.equalsIgnoreCase("Planta") && enemigo.tipo.equalsIgnoreCase("Fuego")) ||
               (this.tipo.equalsIgnoreCase("Agua") && enemigo.tipo.equalsIgnoreCase("Planta"))) {
        modificadorTipo = -10; 
    }

    ataqueTotal += modificadorTipo;

  
    if (usarHabilidad && habilidad.activar()) {
        if (habilidad.getTipoEfecto().equalsIgnoreCase("ataque") ||
            habilidad.getTipoEfecto().equalsIgnoreCase("danio")) {
            ataqueTotal += habilidad.getValor();
        }
        
    }

   
    ataqueTotal -= enemigo.defensa;

    
    if (ataqueTotal < 0) ataqueTotal = 0;

    return ataqueTotal;

    }
    public String getNombre() { return nombre; }
}