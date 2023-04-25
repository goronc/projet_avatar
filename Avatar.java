import java.util.*;
import java.time.LocalDateTime;

public class Avatar {
    
    private int pts_vie;
    private String pseudo;
    private Bulletin note;
    private int level;
    private HashMap<Question, LocalDateTime> question_attente;

    public Avatar() {
        pts_vie = 0;
        pseudo = "Inconnue";
        note = new Bulletin();
        level = 0;
    }

    public Avatar(int newPts_vie, String newPseudo, Bulletin newNote, int newLevel) {
        pts_vie = newPts_vie;
        pseudo = newPseudo;
        note = newNote;
        level = newLevel;
    }

    public int getPtsVie() {
        return pts_vie;
    }

    public HashMap<Question, LocalDateTime> getQuestionAttente() {
        return question_attente;
    }

    public void setBulletin(HashMap<Question, LocalDateTime> new_question_attente) {
        question_attente = new_question_attente;
    }

    public String getPseudo() {
        return pseudo;
    }

    public Bulletin getNote() {
        return note;
    }

    public int getLevel() {
        return level;
    }

    public void setPtsVie(int newPts_Vie) {
        pts_vie = newPts_Vie;
    }

    public void setPseudo(String newPseudo) {
        pseudo = newPseudo;
    }

    public void setNote(Bulletin newNote) {
        note = newNote;
    }

    public void setLevel(int newLevel) {
        level = newLevel;
    }

    public void Ajouter_Note(int newNote, Matiere matiere, int coef) {
        note.ajout_note(newNote, matiere, coef);
    }

    public void supr_question(Question question) {
        question_attente.remove(question);
    }

    public void ajout_question(Question question) {
        question_attente.put(question,LocalDateTime.now());
    }

    public void augmenter_pv(int nb_pv) {
        pts_vie = pts_vie + nb_pv;
    }

    public void diminuer_pv(int nb_pv) {
        pts_vie = pts_vie - nb_pv;
    }

    public void recevoir_question(Question question) {
        // System.out.println(question.getIntitule());
        // for(int i =0; i<question.getReponsePossible().size();i++){
        //     System.out.println(i+1 + " : ");
        //     System.out.println(question.getReponsePossible().get(i));
        //     System.out.println("\n");
        // }
        if (question_attente.containsKey(question)) {
            System.out.println("La question est deja en attente");
        } 
        else {
            ajout_question(question);
        }
    }

    public void faire_question() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quel question choisissez vous ?");
        for (Question question : question_attente.keySet()) {
            System.out.println(question);
        }

        ArrayList<Question> keys = new ArrayList<Question>(question_attente.keySet());



        String user_question_intitule = scanner.nextLine();
        for(Question question : question_attente.keySet()){
            if (question_attente.get(question).getIntitule()) {

                System.out.println(user_question.getIntitule());
    
            }
        }
         
        else {
            System.out.println("Clé invalide !");
        }
            
    }




    // public void defier() {
    //     this.startDefi();
    // }

    // public void test() {
    //     this.startTest();
    // }

    public String toString() {
        return "Avatar{" +
                "pseudo = '" + pseudo + '\'' +
                ", pts_vie = " + pts_vie +
                ", level = " + level +
                ", notes = " + note.toString() +
                '}';
    }
    
}
