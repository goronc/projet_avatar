import java.util.ArrayList;

public class test_Admin {

    public static void main(String[] args) {


        // Création d'un nouvel admin
        Admin admin = new Admin(1);


        // Affichage de l'admin
        System.out.println(admin);


        // Création d'une liste de question
        ListeQuestion listeQuestion = new ListeQuestion();


        // Création de quelques questions
        ArrayList<String> reponse_possible = new ArrayList<String>(4);
        reponse_possible.add("Paris");
        reponse_possible.add("Londres");
        reponse_possible.add("Madrid");
        reponse_possible.add("Berlin");
        Question question1 = new Question("Quel est le nom de la capitale de la France ?", reponse_possible, 1, 1, 1);


        ArrayList<String> reponse_possible2 = new ArrayList<String>(4);
        reponse_possible2.add("L'océan Atlantique");
        reponse_possible2.add("L'océan Pacifique");
        reponse_possible2.add("L'océan Indien");
        reponse_possible2.add("L'océan Arctique");
        Question question2 = new Question("Quel est le plus grand océan ?", reponse_possible2, 2, 2, 1);
        

        ArrayList<String> reponse_possible3 = new ArrayList<String>(3);
        reponse_possible3.add("6 millions");
        reponse_possible3.add("8 millions");
        reponse_possible3.add("7 millions");
        Question question3 = new Question("Quel est la population modiale ?", reponse_possible3, 2, 6, 1);


        // Ajout de questions à une liste de questions
        admin.ajout_question(question1, listeQuestion);
        admin.ajout_question(question2, listeQuestion);


        // Suppression d'une question
        admin.del_question(question1, listeQuestion);


        // On essaye d'ajouter une question qui a été supprimé
        admin.ajout_question(question1, listeQuestion);


        // Modification d'une question
        admin.modif_question(question2, listeQuestion, question3);

        
        // Affichage de la liste de questions
        System.out.println(listeQuestion);


        // Création d'avatar
        Avatar avatar1 = new Avatar();
        Avatar avatar2 = new Avatar();
        Avatar avatar3 = new Avatar();


        // On attribue des points de vie
        avatar1.setPtsVie(11);
        avatar2.setPtsVie(12);
        avatar3.setPtsVie(13);


        // Ajout des avatars à la liste d'avatar
        admin.addAvatar_toList_avatar(avatar1);
        admin.addAvatar_toList_avatar(avatar2);
        admin.addAvatar_toList_avatar(avatar3);


        // Affichage de la liste d'avatar
        System.out.println(admin.getList_avatar());


        // Suppression d'un avatar
        admin.del_avatar(avatar3);


        // Affichage de la liste d'avatar
        System.out.println(admin.getList_avatar());


        // Modification du pseudo de l'avatar
        admin.modif_pseudo_avatar(avatar1);


        // Affichage de l'avatar
        System.out.println(avatar1.toString());
    }
}