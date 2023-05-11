import java.util.ArrayList;
import java.util.Random;
import java.io.*;

public class ListeQuestion implements Serializable {
    
    private ArrayList<Question> List_question;

    public ListeQuestion() {
        List_question = new ArrayList<Question>();
    }

    public ArrayList<Question> getListeQuestions() {
        return List_question;
    }

    public Question getListeQuestions(int indice) {
        return this.List_question.get(indice);
    }

    public void setListeQuestions(ArrayList<Question> newList_question) {
        List_question = newList_question;
    }

    public int size() {
        return this.List_question.size();
    }

    public void AddQuestion(Question question) {
        if (List_question.contains(question)) {
            System.out.println("La question existe déjà");
        }
        else {
            List_question.add(question);
            System.out.println("La question a bien été ajouté");
        }
    }

    public void AddQuestion_test(ListeQuestion liste) {
        Random rand = new Random();
        int indice = rand.nextInt(liste.size());
        for (int i = 0; i < 3; i++) {
            while(List_question.contains(liste.getListeQuestions(indice))) {
                indice = rand.nextInt(liste.size());
            }
            Question question = liste.getListeQuestions(indice);
            List_question.add(question);
        }
    }

    public void SupprQuestion(Question question) {
        if (List_question.contains(question)) {
            List_question.remove(question);
            question = null;
            System.out.println("La question a bien été supprimé");
        }
        else {
            System.out.println("La question n'existe pas");
        }
    }

    public void ModifQuestion(Question question, Question new_question) {
        if (List_question.contains(question)) {
            for (int i = 0; i < List_question.size(); i++) {
                if (List_question.get(i).equals(question)) {
                    List_question.set(i, new_question);
                }
            }
            System.out.println("La question a bien été modifié");
        }
        else {
            System.out.println("La question n'existe pas");
        }
    }

    public String toString() {
        return "List_question = {" + List_question + 
                "}";
    }
}
