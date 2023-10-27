import java.util.Random;

class Personnage {
    String nom;
    int pointsDeVie;
    Arme arme;

    public Personnage(String nom, int pointsDeVie, Arme arme) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.arme = arme;
    }

    public void attaquer(Personnage adversaire) {
        System.out.println(nom + " attaque " + adversaire.nom + " avec " + arme.nom);
        adversaire.recevoirDegats(arme.getDegats());

        if (adversaire.estVivant()) {
            adversaire.contreAttaquer(this);
        }
    }

    public void contreAttaquer(Personnage adversaire) {
        if(new Random().nextInt(2) == 0) {
            System.out.println(nom + " rate sa contre-attaque.");
            return;
        }
        System.out.println(nom + " contre-attaque " + adversaire.nom + " avec " + arme.nom);
        adversaire.recevoirDegats(arme.getDegats());
    }

    public void recevoirDegats(int degats) {
        this.pointsDeVie -= degats;
        System.out.println(nom + " reçoit " + degats + " dégâts. Il lui reste " + pointsDeVie + " PV.");
    }

    public boolean estVivant() {
        return pointsDeVie > 0;
    }
}





