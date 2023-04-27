import java.util.Random;

public class Defi {

    private Avatar Avatar1;
    private Avatar Avatar2;

    public Defi(){
        Avatar1 = new Avatar();
        Avatar2 = new Avatar();
    }

    public Defi(Avatar new_Avatar1,Avatar new_Avatar2){
        Avatar1 = new_Avatar1;
        Avatar2 = new_Avatar2;
    }

    public Avatar getAvatar1() {
        return Avatar1;
    }

    public void setAvatar1(Avatar new_Avatar1) {
        Avatar1 = new_Avatar1;
    }

    public Avatar getAvatar2() {
        return Avatar2;
    }

    public void setAvatar2(Avatar new_Avatar2) {
        Avatar2 = new_Avatar2;
    }

    public Question choix_question(ListeQuestion liste_question){

        Random rand = new Random();
        int indice = rand.nextInt(liste_question.size());
        Question res_question = liste_question.getListeQuestions(indice);
        return res_question;

    }

    public void envoie_question(Question question,Avatar avatar){
        avatar.recevoir_question(question);
    }
}
