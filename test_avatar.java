import java.util.*;

public class test_avatar {
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

        Avatar avatar1 = new Avatar();
        System.out.println(avatar1.toString());

        avatar1.ajout_question(q1);
        System.out.println(avatar1.getQuestionAttente().toString());
        System.out.println(avatar1.getDateAssocier().toString());
        avatar1.ajout_question(q2);
        System.out.println(avatar1.getQuestionAttente().toString());
        System.out.println(avatar1.getDateAssocier().toString());
        avatar1.ajout_question(q3);
        System.out.println(avatar1.getQuestionAttente().toString());
        System.out.println(avatar1.getDateAssocier().toString());
        avatar1.supr_question(q3);
        System.out.println(avatar1.getQuestionAttente().toString());
        System.out.println(avatar1.getDateAssocier().toString());
        avatar1.faire_question();
        System.out.println(avatar1.getPtsVie());
        System.out.println(avatar1.getQuestionAttente().toString());
        System.out.println(avatar1.getDateAssocier().toString());

    }
}
