import java.util.ArrayList;
import java.io.*;

public class Question implements Serializable {

    private String intitule; // L'intitulé de la question
    private ArrayList<String> reponse_possible; // Les réponses possibles
    private int reponse_correct; // L'indice de la réponse correcte
    private int nb_pts; // Le nombre de points de la question
    private int level; // Le niveau de difficulté de la question

    /**
     * Constructeur par défaut de la classe Question.
     * Initialise une question avec des valeurs par défaut.
     */
    public Question() {
        intitule = "Inconnue";
        reponse_possible = new ArrayList<String>(10);
        reponse_correct = 0;
        nb_pts = 0;
        level = 0;
    }

    /**
     * Constructeur de la classe Question.
     * Initialise une question avec les valeurs spécifiées.
     *
     * @param new_intitule         l'intitulé de la question
     * @param new_reponse_possible les réponses possibles
     * @param new_reponse_correct  l'indice de la réponse correcte
     * @param new_nb_pts           le nombre de points de la question
     * @param new_level            le niveau de difficulté de la question
     */
    public Question(String new_intitule, ArrayList<String> new_reponse_possible, int new_reponse_correct,
                    int new_nb_pts, int new_level) {
        intitule = new_intitule;
        reponse_possible = new_reponse_possible;
        reponse_correct = new_reponse_correct;
        nb_pts = new_nb_pts;
        level = new_level;
    }

    /**
     * Retourne l'intitulé de la question.
     *
     * @return l'intitulé de la question
     */
    public String getIntitule() {
        return intitule;
    }

    /**
     * Retourne les réponses possibles.
     *
     * @return les réponses possibles
     */
    public ArrayList<String> getReponsePossible() {
        return reponse_possible;
    }

    /**
     * Retourne l'indice de la réponse correcte.
     *
     * @return l'indice de la réponse correcte
     */
    public int getReponseCorrect() {
        return reponse_correct;
    }

    /**
     * Retourne le nombre de points de la question.
     *
     * @return le nombre de points de la question
     */
    public int getNbPts() {
        return nb_pts;
    }

    /**
     * Retourne le niveau de difficulté de la question.
     *
     * @return le niveau de difficulté de la question
     */
    public int getLevel() {
        return level;
    }

    /**
     * Modifie l'intitulé de la question.
     *
     * @param new_intitule le nouvel intitulé de la question
     */
    public void setIntitule(String new_intitule) {
        intitule = new_intitule;
    }

    /**
     * Modifie les réponses possibles.
     *
     * @param new_reponse_possible les nouvelles réponses possibles
     */
    public void setReponsePossible(ArrayList<String> new_reponse_possible) {
        reponse_possible = new_reponse_possible;
    }

    /**
     * Modifie l'indice de la réponse correcte.
     *
     * @param new_reponse_correct le nouvel indice de la réponse correcte
     */
    public void setReponseCorrect(int new_reponse_correct) {
        reponse_correct = new_reponse_correct;
    }

    /**
     * Modifie le nombre de points de la question.
     *
     * @param new_nb_pts le nouveau nombre de points de la question
     */
    public void setNbPts(int new_nb_pts) {
        nb_pts = new_nb_pts;
    }

    /**
     * Modifie le niveau de difficulté de la question.
     *
     * @param new_level le nouveau niveau de difficulté de la question
     */
    public void setLevel(int new_level) {
        level = new_level;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de la question.
     *
     * @return la représentation de la question
     */
    public String toString() {
        return "Question : {" +
                "intitule = '" + intitule + '\'' +
                ", reponse_possible = " + reponse_possible +
                ", reponse_correct = " + reponse_correct +
                ", nb_pts = " + nb_pts +
                ", level = " + level +
                "}";
    }
}
