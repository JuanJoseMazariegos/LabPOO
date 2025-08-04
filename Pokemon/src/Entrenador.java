import java.util.List;
import java.util.Scanner;

public class Entrenador {
    private String nombre;
    private List<pokemon> equipo;
    private int rondasGanadas;

    public Entrenador(String nombre, List<pokemon> equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.rondasGanadas = 0;
    }

    public pokemon seleccionarPokemon(int ronda) {
        Scanner sc = new Scanner(System.in);
        System.out.println(nombre + ", elige el índice de Pokémon para la ronda " + (ronda + 1) + ":");
        for (int i = 0; i < equipo.size(); i++) {
            System.out.println(i + ": " + equipo.get(i).getNombre());
        }
        int index = sc.nextInt();
        return equipo.get(index);
    }

    
    public void ganarRonda() {
        rondasGanadas++;
    }

    public int getRondasGanadas() { return rondasGanadas; }
    public String getNombre() { return nombre; }
}
