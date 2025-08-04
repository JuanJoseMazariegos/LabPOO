public class Batalla {
    private Entrenador entrenador1;
    private Entrenador entrenador2;

    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    public void iniciarBatalla() {
        for (int ronda = 0; ronda < 4; ronda++) {
            pokemon p1 = entrenador1.seleccionarPokemon(ronda);
            pokemon p2 = entrenador2.seleccionarPokemon(ronda);

            int ataque1 = p1.calcularAtaqueTotal(p2, true);
            int ataque2 = p2.calcularAtaqueTotal(p1, true);

            if (ataque1 > ataque2) {
                System.out.println("Ronda " + (ronda + 1) + ": Gana " + entrenador1.getNombre());
                entrenador1.ganarRonda();
            } else if (ataque2 > ataque1) {
                System.out.println("Ronda " + (ronda + 1) + ": Gana " + entrenador2.getNombre());
                entrenador2.ganarRonda();
            } else {
                System.out.println("Ronda " + (ronda + 1) + ": Empate");
            }
        }

        mostrarResultados();
    }

    public void mostrarResultados() {
        System.out.println("Resultado final:");
        System.out.println(entrenador1.getNombre() + ": " + entrenador1.getRondasGanadas() + " rondas ganadas.");
        System.out.println(entrenador2.getNombre() + ": " + entrenador2.getRondasGanadas() + " rondas ganadas.");
    }
}
