import java.util.*;
import java.time.LocalDateTime;
import java.io.*;

public class Avatar implements Serializable{
    
    private int pts_vie;
    private String pseudo;
    private Bulletin note;
    private int level;
    private ArrayList<Question> question_attente;
    private ArrayList<Test> test_attente;
    private ArrayList<LocalDateTime> date_associer;
    private ArrayList<Avatar> adversaire;
    private String mdp;

    class MauvaisIndice extends Exception{
        public String toString(){
            return "Erreur: Cette Option n'existe pas ";
        }
    }

    public Avatar() {
        pts_vie = 1;
        pseudo = "Inconnue";
        note = new Bulletin();
        level = 1;
        question_attente = new ArrayList<Question>(10);
        test_attente = new ArrayList<Test>(10);
        date_associer = new ArrayList<LocalDateTime>(10);
        adversaire = new ArrayList<Avatar>(10);
        mdp = "admin";
    }

    

    public Avatar(int newPts_vie, String newPseudo, Bulletin newNote, int newLevel , ArrayList<Question> new_question_attente, ArrayList<Test> new_test_attente, ArrayList<LocalDateTime> new_date_associer,ArrayList<Avatar> new_adversaire) {
        pts_vie = newPts_vie;
        pseudo = newPseudo;
        note = newNote;
        level = newLevel;
        question_attente = new_question_attente;
        test_attente = new_test_attente;
        date_associer = new_date_associer;
        adversaire = new_adversaire;
    }


    public int getPtsVie() {
        return pts_vie;
    }

    public String getmdp() {
        return mdp;
    }

    public ArrayList<Question> getQuestionAttente() {
        return question_attente;
    }

    public ArrayList<Test> getTestAttente() {
        return test_attente;
    }

    public ArrayList<LocalDateTime> getDateAssocier() {
        return date_associer;
    }

    public ArrayList<Avatar> getAdversaire() {
        return adversaire;
    }


    public void setBulletin(ArrayList<Question> new_question_attente) {
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

    public void setmdp(String new_mdp) {
        mdp = new_mdp;
    }

    public void setQuestionAttente(ArrayList<Question> new_question_attente) {
        question_attente = new_question_attente;
    }

    public void setTestAttente(ArrayList<Test> new_test_attente) {
        test_attente = new_test_attente;
    }

    public void setDateAssocier(ArrayList<LocalDateTime> new_date_associer) {
        date_associer = new_date_associer;
    }

    public void setAdversaire(ArrayList<Avatar> new_adversaire) {
        adversaire = new_adversaire;
    }

    public void Ajouter_Note(int newNote, Matiere matiere, int coef) {

        note.ajout_note(newNote, matiere, coef);
        System.out.println("La note a bien été ajoutée");
        if(newNote > 10 ){
            int nbpv = ((newNote - 10) * coef) * matiere.getCoef();
            this.augmenter_pv(nbpv);
        }

    }

    public void supr_question(Question question) {
        date_associer.remove(question_attente.indexOf(question));
        adversaire.remove(question_attente.indexOf(question));
        question_attente.remove(question);
        
    }

    public void supr_test(Test test) {
        test_attente.remove(test);
    }

    public void ajout_question(Question question,Avatar avatar) {
        question_attente.add(question);
        adversaire.add(avatar);
        date_associer.add(LocalDateTime.now());
    }

    public void ajout_test(Test test) {
        test_attente.add(test);
    }

    public Test creer_test(ListeQuestion liste) {
        ListeQuestion liste_test = new ListeQuestion();
        liste_test.AddQuestion_test(liste);
        Test test = new Test(this, liste_test);
        return test;
    }

    public void augmenter_pv(int nb_pv) {
        pts_vie = pts_vie + nb_pv;
        System.out.println("voici vos nouveaux points de vies : " + pts_vie);
    }

    public void diminuer_pv(int nb_pv) {
        if(pts_vie - nb_pv <= 0){
            System.out.println("vous n'avez plus de Pv vous ne pouvez plus jouer");
            pts_vie = 0;
        }
        else{
            
            pts_vie = pts_vie - nb_pv;
            System.out.println("il vous reste " + pts_vie + " points de vie");
        }
    }

    public void recevoir_question(Question question, Avatar avatar) {
        if (question_attente.contains(question)) {
            System.out.println("La question est deja en attente");
        } 
        else {
            ajout_question(question,avatar);
        }
    }

    public void recevoir_test(Test test) {
        if (test_attente.size() == 0) {
            ajout_test(test);
        } 
        else if (test_attente.contains(test)) {
            System.out.println("Le test est déjà en attente");
        } 
        else {
            ajout_test(test);
        }
    }

    public void faire_test() throws MauvaisIndice{
        Random rand = new Random();
        Scanner scanner_reponse = new Scanner(System.in);
        int indice = rand.nextInt(test_attente.size());
        Test test = test_attente.get(indice);
        for (int j = 0; j < test.getQuestions().size(); j++) {
            ListeQuestion liste = test.getQuestions();
            Question question = liste.getListeQuestions(j);
            System.out.println(question.getIntitule());
            System.out.println("Voici les réponses disponible laquel choisissez vous ?");
            int indice2 = 1;
            for (String element : question.getReponsePossible()) {
                System.out.println(indice2 +" : " +element);
                indice2 += 1;
            }
            String user_reponse = scanner_reponse.nextLine();

            String str2 = "";
            for(int k = 1; k < indice2; k++){
                    str2 += Integer.toString(k);
            }

            if(!str2.contains(user_reponse)){
                throw new MauvaisIndice();
            }
            int reponse_utilisateur = Integer.parseInt(user_reponse)-1;
            if(reponse_utilisateur == question.getReponseCorrect()){
                System.out.println("Cette reponse etait juste ;) vous gagnez " + question.getNbPts() + " points de vie ");
                this.augmenter_pv(question.getNbPts());
            }
            else{
                System.out.println("Cette reponse etait fausse :( vous perdez " + question.getNbPts() + " points de vie ");
                System.out.println("la réponse etait " + question.getReponsePossible().get(question.getReponseCorrect()));
                this.diminuer_pv(question.getNbPts());
            }
        }
        supr_test(test);
    }

    public void faire_question() throws MauvaisIndice{

        int indice = 0;
        for (LocalDateTime element : date_associer) {
            LocalDateTime now = LocalDateTime.now();
            if(now.isAfter(element.plusDays(2))){
                Question question = question_attente.get(indice);
                System.out.println("Vous avez été trop lent pour répondre a la question : " + question.getIntitule() +" vous avez donc perdu "+ question.getNbPts() +" point de vie");
                this.diminuer_pv(question.getNbPts());
                adversaire.get(question_attente.indexOf(question)).augmenter_pv(question.getNbPts());
                supr_question(question);

            }
            indice +=1;
        }
        
        Scanner scanner = new Scanner(System.in);
        Scanner scanner_reponse = new Scanner(System.in);
        System.out.println("quel question choisissez vous ?");
        indice = 1;
        for (Question element : question_attente) {
            System.out.println(indice + " : " + element.getIntitule());
            indice+=1;
        }
        String user_choice = scanner.nextLine();

        String str = "";
        for(int i=1; i<indice; i++){
                str += Integer.toString(i);
        }

        if(!str.contains(user_choice)){
            throw new MauvaisIndice();
        }

        Question question = question_attente.get(Integer.parseInt(user_choice)-1);
        System.out.println(question.getIntitule());
        System.out.println("Voici les réponses disponible laquel choisissez vous ?");
        indice = 1;
        for (String element : question.getReponsePossible()) {
            System.out.println(indice +" : " +element);
            indice+=1;
        }
        String user_reponse = scanner_reponse.nextLine();

        String str2 = "";
        for(int i=1; i<indice; i++){
                str2 += Integer.toString(i);
        }

        if(!str2.contains(user_reponse)){
            throw new MauvaisIndice();
        }

        int reponse_utilisateur = Integer.parseInt(user_reponse)-1;
        if(reponse_utilisateur == question.getReponseCorrect()){
            System.out.println("Cette reponse etait juste ;) vous gagnez " + question.getNbPts() + " points de vie ");
            this.augmenter_pv(question.getNbPts());
            adversaire.get(question_attente.indexOf(question)).diminuer_pv(question.getNbPts());
            supr_question(question);
        }
        else{
            System.out.println("Cette reponse etait fausse :( vous perdez " + question.getNbPts() + " points de vie ");
            System.out.println("la réponse etait " + question.getReponsePossible().get(question.getReponseCorrect()));
            this.diminuer_pv(question.getNbPts());
            adversaire.get(question_attente.indexOf(question)).augmenter_pv(question.getNbPts());
            supr_question(question);
        }       
    }

    public void erreur_faire_question() {
        boolean valide = false;
        while(!valide){
            try{
                faire_question();
                valide = true;
            }
            catch(MauvaisIndice mi){
                mi.printStackTrace();
            }
        }
    }

    public void erreur_faire_test() {
        boolean valide = false;
        while(!valide){
            try{
                faire_test();
                valide = true;
            }
            catch(MauvaisIndice mi){
                mi.printStackTrace();
            }
        }   
    }
    
    public void defier(Avatar avatar2,ListeQuestion listequestion1) {
        if(pts_vie == 0){
            System.out.println("Vous n'avez plus de pv vous ne pouvez plus defier veuillez augmentez vos pv en repondant a des test ou a des defis ou en rajoutant des notes dans votres bulletins");
        }
        else{
            Defi defi1 = new Defi(this,avatar2);
            Question question = defi1.choix_question(listequestion1);
            defi1.envoie_question(question);
        }
    }

    public String toString() {
        return "Avatar = {" +
                "pseudo = '" + pseudo + '\'' +
                ", pts_vie = " + pts_vie +
                ", level = " + level +
                ", notes = " + note.toString() +
                ", question_attente = " + question_attente.toString() +
                ", test_attente = " + test_attente.toString() +
                ", date_associer = " + date_associer.toString() +
                ", adversaire = " + adversaire.toString() + 
                ", mdp = " + mdp + 
                '}';
    }
    
}
