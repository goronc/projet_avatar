import java.util.ArrayList;

public class test_ListeQuestion {
    public static void main(String[] args) {

        ListeQuestion liste = new ListeQuestion();
    
        // Création de quelques questions
        ArrayList<String> reponse_possible = new ArrayList<String>(3);
        reponse_possible.add("Russie");
        reponse_possible.add("Canada");
        reponse_possible.add("Chine");
        Question q1 = new Question("Quel est le plus grand pays du monde ?", reponse_possible, 1, 9, 4);
    
        ArrayList<String> reponse_possible2 = new ArrayList<String>(3);
        reponse_possible2.add("O");
        reponse_possible2.add("Ox");
        reponse_possible2.add("O2");
        Question q2 = new Question("Quel est le symbole chimique de l'oxygène ?", reponse_possible2, 1, 8, 2);
    
        // Ajout des questions à la liste
        liste.AddQuestion(q1);
        liste.AddQuestion(q2);
    
        // Affichage de la liste
        System.out.println(liste.toString());

        // On essaye d'ajouter une question qui existe déjà
        liste.AddQuestion(q2);
    
        // Suppression d'une question
        liste.SupprQuestion(q1);

        // On essaye d'ajouter une question qui a été supprimé
        liste.AddQuestion(q1);
    
        // Affichage de la liste mise à jour
        System.out.println(liste.toString());
    }
    
}
