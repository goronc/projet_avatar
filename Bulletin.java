import java.util.HashMap;
import java.util.ArrayList;
import java.io.*;

public class Bulletin implements Serializable {

    private HashMap<Matiere, ArrayList<Integer>> bulletin; // Le bulletin contenant les notes par matière

    /**
     * Constructeur par défaut de la classe Bulletin.
     * Initialise un nouveau bulletin vide.
     */
    public Bulletin() {
        bulletin = new HashMap<Matiere, ArrayList<Integer>>();
    }

    /**
     * Constructeur de la classe Bulletin.
     * Initialise le bulletin avec un contenu spécifié.
     *
     * @param new_bulletin le bulletin à utiliser
     */
    public Bulletin(HashMap<Matiere, ArrayList<Integer>> new_bulletin) {
        bulletin = new_bulletin;
    }

    /**
     * Retourne le bulletin.
     *
     * @return le bulletin
     */
    public HashMap<Matiere, ArrayList<Integer>> getBulletin() {
        return bulletin;
    }

    /**
     * Modifie le bulletin.
     *
     * @param bulletin le nouveau bulletin
     */
    public void setBulletin(HashMap<Matiere, ArrayList<Integer>> bulletin) {
        this.bulletin = bulletin;
    }

    /**
     * Ajoute une note avec sa matière et son coefficient au bulletin.
     *
     * @param note    la note à ajouter
     * @param matiere la matière de la note
     * @param coef    le coefficient de la note
     */
    public void ajout_note(int note, Matiere matiere, int coef) {
        for (int i = 0; i < coef; i++) {
            if (bulletin.containsKey(matiere)) {
                bulletin.get(matiere).add(note);
            } else {
                ArrayList<Integer> liste_note = new ArrayList<Integer>(100);
                liste_note.add(note);
                bulletin.put(matiere, liste_note);
            }
        }
    }

    /**
     * Supprime une ou plusieurs notes suivant le coefficient pour une matière donnée.
     *
     * @param note    la note à supprimer
     * @param matiere la matière de la note
     * @param coef    le coefficient de la note
     */
    public void supr_note(int note, Matiere matiere, int coef) {
        int cpt = 0;
        for (int i = 0; i < bulletin.get(matiere).size(); i++) {
            if (bulletin.get(matiere).get(i) == note) {
                cpt = cpt + 1;
            }
        }
        if (cpt >= coef) {
            for (int j = 0; j < coef; j++) {
                if (bulletin.containsKey(matiere)) {
                    if (bulletin.get(matiere).contains(note)) {
                        bulletin.get(matiere).remove(Integer.valueOf(note));
                    } else {
                        System.out.println("La note n'existe pas");
                    }
                } else {
                    System.out.println("La matiere n'existe pas");
                }
            }
        } else {
            System.out.println("La note n'existe pas ou le coefficient est trop élevé");
        }
    }

    /**
     * Modifie une ou plusieurs notes suivant le coefficient pour une matière donnée.
     *
     * @param note     la note à modifier
     * @param matiere  la matière de la note
     * @param coef     le coefficient de la note
     * @param new_note la nouvelle note
     */
    public void modif_note(int note, Matiere matiere, int coef, int new_note) {
        int cpt = 0;
        for (int i = 0; i < bulletin.get(matiere).size(); i++) {
            if (bulletin.get(matiere).get(i) == note) {
                cpt = cpt + 1;
            }
        }
        if (cpt >= coef) {
            this.supr_note(note, matiere, coef);
            this.ajout_note(new_note, matiere, coef);
        } else {
            System.out.println("La note n'existe pas ou le coefficient est trop élevé");
        }
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du bulletin.
     *
     * @return la représentation du bulletin
     */
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Bulletin : {\n");
        for (Matiere matiere : bulletin.keySet()) {
            res.append("\t").append(matiere).append(": ").append(bulletin.get(matiere)).append("\n");
        }
        res.append("}");
        return res.toString();
    }
}
