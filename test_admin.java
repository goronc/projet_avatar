import java.util.ArrayList;

public class test_admin {

    public static void main(String[] args) {
        // Création d'un nouvel admin
        Admin admin = new Admin(1);

        // Affichage de l'admin
        System.out.println(admin);

        // Ajout de questions à une liste de questions
        ListeQuestion listeQuestion = new ListeQuestion();
        ArrayList<String> reponse_possible = new ArrayList<String>(4);
        reponse_possible.add("Paris");
        reponse_possible.add("Londres");
        reponse_possible.add("Madrid");
        reponse_possible.add("Berlin");
        ArrayList<String> reponse_possible2 = new ArrayList<String>(4);
        reponse_possible2.add("L'océan Atlantique");
        reponse_possible2.add("L'océan Pacifique");
        reponse_possible2.add("L'océan Indien");
        reponse_possible2.add("L'océan Arctique");
        Question question1 = new Question("Quel est le nom de la capitale de la France ?", reponse_possible, 1, 1, 1);
        Question question2 = new Question("Quel est le plus grand océan ?", reponse_possible2, 2, 2, 1);
        admin.ajout_question(question1, listeQuestion);
        admin.ajout_question(question2, listeQuestion);

        // Affichage de la liste de questions
        System.out.println(listeQuestion);
    }
}

