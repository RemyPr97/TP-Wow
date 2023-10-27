import java.util.ArrayList;
import java.util.Random;

class Jeu {
    private ArrayList<Personnage> equipeHeros = new ArrayList<>();
    private ArrayList<Personnage> equipeMonstres = new ArrayList<>();

    public void initialiserEquipes() {
        equipeHeros.add(new Personnage("Arthur", 30, new Arme("Excalibur", 10, 100, 1000)));
        equipeHeros.add(new Personnage("Perceval", 30, new Arme("L'épée du roi Burgonde", 10, 100, 1000)));

        equipeMonstres.add(new Personnage("Grum", 25, new Arme("L'abattoir", 8, 80, 1200)));
        equipeMonstres.add(new Personnage("Garmonbozia", 25, new Arme("Le couteau de boucher", 8, 80, 1200)));
        equipeMonstres.add(new Personnage("Molosse", 15, new Arme("Les crocs", 4, 80, 1200)));
    }

    public void lancerJeu() {
        while (!equipeHeros.isEmpty() && !equipeMonstres.isEmpty()) {
            Personnage heros = equipeHeros.get(0);
            Personnage monstre = equipeMonstres.get(0);

            if (new Random().nextInt(2) == 0) {
                heros.attaquer(monstre);
            } else {
                monstre.attaquer(heros);
            }

            if (!heros.estVivant()) {
                System.out.println(heros.nom + " est mort.");
                equipeHeros.remove(heros);
            }

            if (!monstre.estVivant()) {
                System.out.println(monstre.nom + " est mort.");
                equipeMonstres.remove(monstre);
            }
        }

        System.out.println(equipeHeros.isEmpty() ? "Les monstres ont gagné !" : "Les héros ont gagné !");
    }
}


