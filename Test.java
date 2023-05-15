import java.io.*;


public class Test implements Serializable {


    private Avatar avatar1;
    private ListeQuestion questions;


    public Test(Avatar newAvatar, ListeQuestion newQuestions) {
        this.avatar1 = newAvatar;
        this.questions = newQuestions;
    }


    public Avatar getAvatar1() {
        return avatar1;
    }


    public ListeQuestion getQuestions() {
        return questions;
    }


    public void setAvatar1(Avatar new_avatar1) {
        this.avatar1 = new_avatar1;
    }


    public void setQuestions(ListeQuestion newQuestions) {
        this.questions = newQuestions;
    }


    // Affichage du Test
    public String toString() {
        return "Test = {" +
                questions.toString() +
                '}';
    }
}