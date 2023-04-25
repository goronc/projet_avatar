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
        if (List_question.contains(question)) {
            System.out.println("La question existe déjà");
        }
        else {
            List_question.add(question);
        }
    }

    public void SupprQuestion(Question question) {
        if (List_question.contains(question)) {
            List_question.remove(question);
            question = null;
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
        }
        else {
            System.out.println("La question n'existe pas");
        }
    }

    public String toString() {
        return "ListeQuestion{ " +
                "List_question = " + List_question +
                " }";
    }
}
