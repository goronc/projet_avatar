import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * La classe ListeQuestion représente une liste de questions.
 * Elle implémente l'interface Serializable pour permettre la sérialisation des objets.
 */
public class ListeQuestion implements Serializable {

    private ArrayList<Question> List_question; // La liste de questions

    /**
     * Constructeur par défaut de la classe ListeQuestion.
     * Initialise une liste de questions vide.
     */
    public ListeQuestion() {
        List_question = new ArrayList<Question>();
    }

    /**
     * Retourne la liste de questions.
     *
     * @return la liste de questions
     */
    public ArrayList<Question> getListeQuestions() {
        return List_question;
    }

    /**
     * Retourne la question à l'indice spécifié dans la liste de questions.
     *
     * @param indice l'indice de la question
     * @return la question à l'indice spécifié
     */
    public Question getListeQuestions(int indice) {
        return this.List_question.get(indice);
    }

    /**
     * Modifie la liste de questions avec une nouvelle liste spécifiée.
     *
     * @param newList_question la nouvelle liste de questions
     */
    public void setListeQuestions(ArrayList<Question> newList_question) {
        List_question = newList_question;
    }

    /**
     * Retourne le nombre de questions dans la liste.
     *
     * @return le nombre de questions dans la liste
     */
    public int size() {
        return this.List_question.size();
    }

    /**
     * Ajoute une question à la liste.
     * Affiche un message d'erreur si la question existe déjà dans la liste.
     *
     * @param question la question à ajouter
     */
    public void AddQuestion(Question question) {
        if (List_question.contains(question)) {
            System.out.println("La question existe déjà");
        } else {
            List_question.add(question);
            System.out.println("La question a bien été ajoutée");
        }
    }

    /**
     * Ajoute 5 questions de la liste spécifiée à la liste actuelle.
     * Les questions sont sélectionnées aléatoirement.
     *
     * @param liste la liste de questions à partir de laquelle sélectionner les questions à ajouter
     */
    public void AddQuestion_test(ListeQuestion liste) {
        Random rand = new Random();
        int indice = rand.nextInt(liste.size());
        for (int i = 0; i < 5; i++) {
            while (List_question.contains(liste.getListeQuestions(indice))) {
                indice = rand.nextInt(liste.size());
            }
            Question question = liste.getListeQuestions(indice);
            List_question.add(question);
        }
    }

    /**
     * Supprime une question de la liste.
     * Affiche un message d'erreur si la question n'existe pas dans la liste.
     *
     * @param question la question à supprimer
     */
    public void SupprQuestion(Question question) {
        if (List_question.contains(question)) {
            List_question.remove(question);
            question = null;
            System.out.println("La question a bien été supprimée");
        } else {
            System.out.println("La question n'existe pas");
        }
    }

    /**
     * Modifie une question dans la liste.
     * Affiche un message d'erreur si la question n'existe pas dans la liste.
     *
     * @param question     la question à modifier
     * @param new_question la nouvelle question
     */
    public void ModifQuestion(Question question, Question new_question) {
        if (List_question.contains(question)) {
            for (int i = 0; i < List_question.size(); i++) {
                if (List_question.get(i).equals(question)) {
                    List_question.set(i, new_question);
                }
            }
            System.out.println("La question a bien été modifiée");
        } else {
            System.out.println("La question n'existe pas");
        }
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de la liste de questions.
     *
     * @return la représentation de la liste de questions sous forme de chaîne de caractères
     */
    public String toString() {
        return "List_question = {" + List_question +
                "}";
    }
}
