import java.util.Random;
import java.io.*;

/**
 * La classe Defi représente un défi entre deux avatars.
 * Elle implémente l'interface Serializable pour permettre la sérialisation des objets.
 */
public class Defi implements Serializable {

    private Avatar Avatar1; // Le premier avatar du défi
    private Avatar Avatar2; // Le deuxième avatar du défi

    /**
     * Constructeur par défaut de la classe Defi.
     * Initialise les avatars du défi avec de nouveaux avatars vides.
     */
    public Defi() {
        Avatar1 = new Avatar();
        Avatar2 = new Avatar();
    }

    /**
     * Constructeur de la classe Defi avec deux avatars spécifiés.
     *
     * @param new_Avatar1 le premier avatar du défi
     * @param new_Avatar2 le deuxième avatar du défi
     */
    public Defi(Avatar new_Avatar1, Avatar new_Avatar2) {
        Avatar1 = new_Avatar1;
        Avatar2 = new_Avatar2;
    }

    /**
     * Retourne le premier avatar du défi.
     *
     * @return le premier avatar du défi
     */
    public Avatar getAvatar1() {
        return Avatar1;
    }

    /**
     * Modifie le premier avatar du défi avec un nouvel avatar spécifié.
     *
     * @param new_Avatar1 le nouvel avatar pour le premier joueur du défi
     */
    public void setAvatar1(Avatar new_Avatar1) {
        Avatar1 = new_Avatar1;
    }

    /**
     * Retourne le deuxième avatar du défi.
     *
     * @return le deuxième avatar du défi
     */
    public Avatar getAvatar2() {
        return Avatar2;
    }

    /**
     * Modifie le deuxième avatar du défi avec un nouvel avatar spécifié.
     *
     * @param new_Avatar2 le nouvel avatar pour le deuxième joueur du défi
     */
    public void setAvatar2(Avatar new_Avatar2) {
        Avatar2 = new_Avatar2;
    }

    /**
     * Permet de choisir une question au hasard parmi toutes les questions disponibles.
     * La question ne doit pas déjà être en attente chez l'avatar 2.
     *
     * @param liste_question la liste de questions disponibles
     * @return la question choisie
     */
    public Question choix_question(ListeQuestion liste_question) {
        Random rand = new Random();
        int indice = rand.nextInt(liste_question.size());
        while (Avatar2.getQuestionAttente().contains(liste_question.getListeQuestions(indice))) {
            indice = rand.nextInt(liste_question.size());
        }
        Question res_question = liste_question.getListeQuestions(indice);
        return res_question;
    }

    /**
     * Envoie une question à l'adversaire (Avatar2).
     * La question est reçue par l'avatar 2 et ajoutée à sa liste de questions en attente.
     *
     * @param question la question à envoyer
     */
    public void envoie_question(Question question) {
        Avatar2.recevoir_question(question, Avatar1);
        System.out.println("La question a bien été envoyée");
    }
}
