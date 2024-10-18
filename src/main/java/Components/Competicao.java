package Components;

public class Competicao {
    private int numeroDeEtapas;

    public Competicao(int numeroDeEtapas) {
        this.numeroDeEtapas = numeroDeEtapas;
    }

    public Ciclista quemTerminouNaFrenteEntreDoisCiclistas(Ciclista ciclista, Ciclista outroCiclista) {
        if (ciclista.compararCiclistas(outroCiclista) < 0) {
            return ciclista;
        } else {
            return outroCiclista;
        }
    }

    public int diferencaDeTempoDoisCiclistas(Ciclista ciclista, Ciclista outroCiclista) {
        return ciclista.diferencaTempo(outroCiclista);
    }

    // Getters and Setters
    public int getNumeroDeEtapas() {
        return numeroDeEtapas;
    }

    public void setNumeroDeEtapas(int numeroDeEtapas) {
        this.numeroDeEtapas = numeroDeEtapas;
    }
}
