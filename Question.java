import java.util.ArrayList;
import java.io.*;

public class Question implements Serializable{

    private String intitule;
    private ArrayList<String> reponse_possible;
    private int reponse_correct;
    private int nb_pts;
    private int level;

    public Question(){
        intitule = "Inconnue";
        reponse_possible = new ArrayList<String>(10);
        reponse_correct = 0;
        nb_pts = 0;
        level = 0;
    }

    public Question(String new_intitule,ArrayList<String> new_reponse_possible,int new_reponse_correct, int new_nb_pts,int new_level){
        intitule = new_intitule;
        reponse_possible = new_reponse_possible;
        reponse_correct = new_reponse_correct;
        nb_pts = new_nb_pts;
        level = new_level;
    }

    public String getIntitule() {
        return intitule;
    }

    public ArrayList<String> getReponsePossible() {
        return reponse_possible;
    }

    public int getReponseCorrect() {
        return reponse_correct;
    }

    public int getNbPts() {
        return nb_pts;
    }

    public int getLevel() {
        return level;
    }

    public void setIntitule(String new_intitule) {
        intitule = new_intitule;
    }

    public void setReponsePossible(ArrayList<String> new_reponse_possible) {
        reponse_possible = new_reponse_possible;
    }

    public void setReponseCorrect(int new_reponse_correct) {
        reponse_correct = new_reponse_correct;
    }

    public void setNbPts(int new_nb_pts) {
        nb_pts = new_nb_pts;
    }

    public void setLevel(int new_level) {
        level = new_level;
    }

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