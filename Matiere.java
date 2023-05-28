import java.io.*;

/**
 * La classe Matiere représente une matière avec un nom et un coefficient.
 * Elle implémente l'interface Serializable pour permettre la sérialisation des objets.
 */
public class Matiere implements Serializable {

    private String nom; // Le nom de la matière
    private int coef;   // Le coefficient de la matière

    /**
     * Constructeur par défaut de la classe Matiere.
     * Initialise le nom avec "Inconnue" et le coefficient avec 0.
     */
    public Matiere() {
        nom = "Inconnue";
        coef = 0;
    }

    /**
     * Constructeur de la classe Matiere.
     * Permet d'initialiser le nom et le coefficient de la matière avec les valeurs spécifiées.
     *
     * @param new_nom  le nom de la matière
     * @param new_coef le coefficient de la matière
     */
    public Matiere(String new_nom, int new_coef) {
        nom = new_nom;
        coef = new_coef;
    }

    /**
     * Retourne le nom de la matière.
     *
     * @return le nom de la matière
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne le coefficient de la matière.
     *
     * @return le coefficient de la matière
     */
    public int getCoef() {
        return coef;
    }

    /**
     * Modifie le nom de la matière.
     *
     * @param new_nom le nouveau nom de la matière
     */
    public void setNom(String new_nom) {
        nom = new_nom;
    }

    /**
     * Modifie le coefficient de la matière.
     *
     * @param new_coef le nouveau coefficient de la matière
     */
    public void setCoef(int new_coef) {
        coef = new_coef;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de la matière.
     *
     * @return la représentation de la matière sous forme de chaîne de caractères
     */
    public String toString() {
        return "Matiere = {" +
                "nom = '" + nom + '\'' +
                ", coef = " + coef +
                '}';
    }
}
