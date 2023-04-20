import java.util.ArrayList;

public class ListeQuestion {
    
    private ArrayList<Question> List_question;

    public ListeQuestion() {
        List_question = new ArrayList<Question>();
    }

    public ArrayList<Question> getListeQuestions() {
        return List_question;
    }

    public void setListeQuestions(ArrayList<Question> newList_question) {
        List_question = newList_question;
    }

    public void AddQuestion(Question question) {
        List_question.add(question);
    }

    public void SupprQuestion(Question question) {
        List_question.remove(question);
        question = null;
    }

    public void ModifQuestion(Question question) {

    }

    public String toString() {
        return "ListeQuestion{ " +
                "List_question = " + List_question +
                " }";
    }
}
