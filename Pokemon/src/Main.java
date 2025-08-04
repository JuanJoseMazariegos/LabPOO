import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        
        HabilidadEspecial cuerpoLlama = new HabilidadEspecial("Cuerpo Llama", "ataque", 10, 55);
        HabilidadEspecial campoHierba = new HabilidadEspecial("Campo Hierba", "ataque", 20, 60);
        HabilidadEspecial caparazon = new HabilidadEspecial("Caparazón", "defensa", 50, 45);
        HabilidadEspecial electricidadEstatica = new HabilidadEspecial("Electricidad Estática", "ataque", 20, 75);

        
        pokemon charmander = new pokemon("Charmander", "Fuego", 40, 30, cuerpoLlama); 
        pokemon bulbasaur = new pokemon("Bulbasaur", "Planta", 30, 30, campoHierba);  
        pokemon squirtle = new pokemon("Squirtle", "Agua", 20, 50, caparazon);        
        pokemon pikachu = new pokemon("Pikachu", "Electrico", 50, 10, electricidadEstatica); 

        
        List<pokemon> equipo1 = new ArrayList<>();
        equipo1.add(charmander);
        equipo1.add(bulbasaur);
        equipo1.add(squirtle);
        equipo1.add(pikachu);

        List<pokemon> equipo2 = new ArrayList<>();
        equipo2.add(pikachu);
        equipo2.add(squirtle);
        equipo2.add(bulbasaur);
        equipo2.add(charmander);

        
        Entrenador t1 = new Entrenador("Ash", equipo1);
        Entrenador t2 = new Entrenador("Gary", equipo2);

        
        Batalla batalla = new Batalla(t1, t2);
        batalla.iniciarBatalla();
}
}
