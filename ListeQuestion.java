import java.util.ArrayList;

public class ListeQuestion {
    
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
