import java.util.ArrayList;
import java.util.Random;

class Arme {
    String nom;
    int degats;
    int longueur;
    int poids;

    public Arme(String nom, int degats, int longueur, int poids) {
        this.nom = nom;
        this.degats = degats;
        this.longueur = longueur;
        this.poids = poids;
    }

    public int getDegats() {
        return degats;
    }
}
