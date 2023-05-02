import java.util.*;

public class test_Avatar {
    public static void main(String[] args){


        // Création de quelques questions
        ArrayList<String> reponse_possible = new ArrayList<String>(3);
        reponse_possible.add("Russie");
        reponse_possible.add("Canada");
        reponse_possible.add("Chine");
        Question q1 = new Question("Quel est le plus grand pays du monde ?", reponse_possible, 0, 9, 4);
    

        ArrayList<String> reponse_possible2 = new ArrayList<String>(3);
        reponse_possible2.add("O");
        reponse_possible2.add("Ox");
        reponse_possible2.add("O2");
        Question q2 = new Question("Quel est le symbole chimique de l'oxygène ?", reponse_possible2, 0, 8, 2);
    

        ArrayList<String> reponse_possible3 = new ArrayList<String>(3);
        reponse_possible3.add("6 millions");
        reponse_possible3.add("8 millions");
        reponse_possible3.add("7 millions");
        Question q3 = new Question("Quel est la population modiale ?", reponse_possible3, 1, 6, 1);


        // Création d'avatar
        Avatar avatar1 = new Avatar();
        Avatar avatar2 = new Avatar();
        Avatar avatar3 = new Avatar();


        avatar2.setPtsVie(10);
        avatar3.setPtsVie(10);
        System.out.println(avatar2.getPtsVie());
        System.out.println(avatar3.getPtsVie());


        // Affichage de l'avatar
        System.out.println(avatar1.toString());


        // Ajout de question dans la liste d'attente
        avatar1.ajout_question(q1,avatar2);


        // Affichage des questions en attente et des dates associées
        System.out.println(avatar1.getQuestionAttente().toString());
        System.out.println(avatar1.getDateAssocier().toString());

        // Ajout de question dans la liste d'attente
        avatar1.ajout_question(q2,avatar3);


        // Affichage des questions en attente et des dates associées
        System.out.println(avatar1.getQuestionAttente().toString());
        System.out.println(avatar1.getDateAssocier().toString());
        System.out.println(avatar1.getAdversaire().toString());


        // Ajout des question dans la liste d'attente
        avatar1.ajout_question(q3,avatar3);


        // Affichage des questions en attente et des dates associées
        System.out.println(avatar1.getQuestionAttente().toString());
        System.out.println(avatar1.getDateAssocier().toString());
        System.out.println(avatar1.getAdversaire().toString());


        // Suppression d'une question
        avatar1.supr_question(q3);


        // Affichage des question en attente et des dates associées
        System.out.println(avatar1.getQuestionAttente().toString());
        System.out.println(avatar1.getDateAssocier().toString());
        System.out.println(avatar1.getAdversaire().toString());


        // On lance une question a faire
        avatar1.erreur_faire_question();


        // Affichage des points de vie de l'avatar
        // System.out.println(avatar1.getPtsVie());


        // // Affichage des question en attente et des dates associées
        // System.out.println(avatar1.getQuestionAttente().toString());
        // System.out.println(avatar1.getDateAssocier().toString());
        // System.out.println(avatar1.getAdversaire().toString());

        // System.out.println(avatar2.getPtsVie());
        // System.out.println(avatar3.getPtsVie());
    }
}


