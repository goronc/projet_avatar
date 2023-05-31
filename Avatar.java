import java.util.*;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * Cette classe représente un Avatar.
 */
public class Avatar implements Serializable {

    private int pts_vie;
    private String pseudo;
    private Bulletin note;
    private int level;
    private ArrayList<Question> question_attente;
    private ArrayList<Test> test_attente;
    private ArrayList<LocalDateTime> date_associer;
    private ArrayList<Avatar> adversaire;
    private String mdp;

    /**
     * Exception levée lorsque l'indice n'existe pas.
     */
    class MauvaisIndice extends Exception {
        /**
         * Retourne une représentation textuelle de l'exception.
         *
         * @return Une représentation textuelle de l'exception.
         */
        public String toString() {
            return "Erreur: Cette Option n'existe pas ";
        }
    }

    /**
     * Constructeur par défaut de la classe Avatar.
     * Initialise les attributs avec des valeurs par défaut.
     */
    public Avatar() {
        pts_vie = 20;
        pseudo = "Inconnu";
        note = new Bulletin();
        level = 1;
        question_attente = new ArrayList<Question>(10);
        test_attente = new ArrayList<Test>(10);
        date_associer = new ArrayList<LocalDateTime>(10);
        adversaire = new ArrayList<Avatar>(10);
        mdp = "admin";
    }

    /**
     * Constructeur de la classe Avatar.
     *
     * @param newPts_vie          Les points de vie de l'avatar.
     * @param newPseudo           Le pseudo de l'avatar.
     * @param newNote             Le bulletin de notes de l'avatar.
     * @param newLevel            Le niveau de l'avatar.
     * @param new_question_attente La liste des questions en attente de l'avatar.
     * @param new_test_attente     La liste des tests en attente de l'avatar.
     * @param new_date_associer    La liste des dates associées de l'avatar.
     * @param new_adversaire       La liste des adversaires de l'avatar.
     * @param new_mdp              Le mot de passe de l'avatar.
     */
    public Avatar(int newPts_vie, String newPseudo, Bulletin newNote, int newLevel, ArrayList<Question> new_question_attente, ArrayList<Test> new_test_attente, ArrayList<LocalDateTime> new_date_associer, ArrayList<Avatar> new_adversaire, String new_mdp) {
        pts_vie = newPts_vie;
        pseudo = newPseudo;
        note = newNote;
        level = newLevel;
        question_attente = new_question_attente;
        test_attente = new_test_attente;
        date_associer = new_date_associer;
        adversaire = new_adversaire;
        mdp = new_mdp;
    }

    /**
     * Retourne les points de vie de l'avatar.
     *
     * @return Les points de vie de l'avatar.
     */
    public int getPtsVie() {
        return pts_vie;
    }

    /**
     * Retourne le mot de passe de l'avatar.
     *
     * @return Le mot de passe de l'avatar.
     */
    public String getmdp() {
        return mdp;
    }

    /**
     * Retourne la liste des questions en attente de l'avatar.
     *
     * @return La liste des questions en attente de l'avatar.
     */
    public ArrayList<Question> getQuestionAttente() {
        return question_attente;
    }

    /**
     * Retourne la liste des tests en attente de l'avatar.
     *
     * @return La liste des tests en attente de l'avatar.
     */
    public ArrayList<Test> getTestAttente() {
        return test_attente;
    }

    /**
     * Retourne la liste des dates associées de l'avatar.
     *
     * @return La liste des dates associées de l'avatar.
     */
    public ArrayList<LocalDateTime> getDateAssocier() {
        return date_associer;
    }

    /**
     * Retourne la liste des adversaires de l'avatar.
     *
     * @return La liste des adversaires de l'avatar.
     */
    public ArrayList<Avatar> getAdversaire() {
        return adversaire;
    }

    /**
     * Retourne le pseudo de l'avatar.
     *
     * @return Le pseudo de l'avatar.
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * Retourne le bulletin de notes de l'avatar.
     *
     * @return Le bulletin de notes de l'avatar.
     */
    public Bulletin getNote() {
        return note;
    }

    /**
     * Retourne le niveau de l'avatar.
     *
     * @return Le niveau de l'avatar.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Définit les points de vie de l'avatar.
     *
     * @param newPts_Vie Les nouveaux points de vie.
     */
    public void setPtsVie(int newPts_Vie) {
        pts_vie = newPts_Vie;
    }

    /**
     * Définit le pseudo de l'avatar.
     *
     * @param newPseudo Le nouveau pseudo.
     */
    public void setPseudo(String newPseudo) {
        pseudo = newPseudo;
    }

    /**
     * Définit le bulletin de notes de l'avatar.
     *
     * @param newNote Le nouveau bulletin de notes.
     */
    public void setNote(Bulletin newNote) {
        note = newNote;
    }

    /**
     * Définit le niveau de l'avatar.
     *
     * @param newLevel Le nouveau niveau.
     */
    public void setLevel(int newLevel) {
        level = newLevel;
    }

    /**
     * Définit le bulletin de notes de l'avatar.
     *
     * @param new_bulletin Le nouveau bulletin de notes.
     */
    public void setBulletin(Bulletin new_bulletin) {
        note = new_bulletin;
    }

    /**
     * Définit le mot de passe de l'avatar.
     *
     * @param new_mdp Le nouveau mot de passe.
     */
    public void setmdp(String new_mdp) {
        mdp = new_mdp;
    }

    /**
     * Définit la liste des questions en attente de l'avatar.
     *
     * @param new_question_attente La nouvelle liste des questions en attente.
     */
    public void setQuestionAttente(ArrayList<Question> new_question_attente) {
        question_attente = new_question_attente;
    }

    /**
     * Définit la liste des tests en attente de l'avatar.
     *
     * @param new_test_attente La nouvelle liste des tests en attente.
     */
    public void setTestAttente(ArrayList<Test> new_test_attente) {
        test_attente = new_test_attente;
    }

    /**
     * Définit la liste des dates associées de l'avatar.
     *
     * @param new_date_associer La nouvelle liste des dates associées.
     */
    public void setDateAssocier(ArrayList<LocalDateTime> new_date_associer) {
        date_associer = new_date_associer;
    }

    /**
     * Définit la liste des adversaires de l'avatar.
     *
     * @param new_adversaire La nouvelle liste des adversaires.
     */
    public void setAdversaire(ArrayList<Avatar> new_adversaire) {
        adversaire = new_adversaire;
    }

    /**
    * Ajoute une note dans le bulletin de l'avatar, avec sa matière et son coefficient.
    *
    * @param newNote La nouvelle note à ajouter.
    * @param matiere La matière de la note.
    * @param coef Le coefficient de la note.
    */
    public void Ajouter_Note(int newNote, Matiere matiere, int coef) {
        note.ajout_note(newNote, matiere, coef);
        System.out.println("La note a bien été ajoutée");
        if (newNote > 10) {
            int nbpv = ((newNote - 10) * coef) * matiere.getCoef();
            this.augmenter_pv(nbpv);
        }
    }

    /**
     * Supprime une question de la liste des questions en attente de l'avatar, ainsi que sa date associée et l'adversaire qui l'a envoyée.
     *
     * @param question La question à supprimer.
     */
    public void supr_question(Question question) {
        int index = question_attente.indexOf(question);
        date_associer.remove(index);
        adversaire.remove(index);
        question_attente.remove(question);
    }

    /**
     * Supprime un test de la liste des tests en attente de l'avatar.
     *
     * @param test Le test à supprimer.
     */
    public void supr_test(Test test) {
        test_attente.remove(test);
    }

    /**
     * Ajoute une question à la liste des questions en attente de l'avatar, avec sa date associée et l'avatar qui l'a envoyée.
     *
     * @param question La question à ajouter.
     * @param avatar   L'avatar qui a envoyé la question.
     */
    public void ajout_question(Question question, Avatar avatar) {
        question_attente.add(question);
        adversaire.add(avatar);
        date_associer.add(LocalDateTime.now());
    }

    /**
     * Ajoute un test à la liste des tests en attente de l'avatar.
     *
     * @param test Le test à ajouter.
     */
    public void ajout_test(Test test) {
        test_attente.add(test);
    }

    /**
     * Crée un test à partir de la liste de questions donnée.
     *
     * @param liste La liste de questions pour le test.
     * @return Le test créé.
     */
    public Test creer_test(ListeQuestion liste) {
        ListeQuestion liste_test = new ListeQuestion();
        liste_test.AddQuestion_test(liste);
        Test test = new Test(this, liste_test);
        return test;
    }

    /**
     * Augmente les points de vie de l'avatar.
     *
     * @param nb_pv Le nombre de points de vie à ajouter.
     */
    public void augmenter_pv(int nb_pv) {
        pts_vie = pts_vie + nb_pv;
        System.out.println("Voici vos nouveaux points de vie : " + pts_vie);
    }

    /**
     * Diminue les points de vie de l'avatar.
     *
     * @param nb_pv Le nombre de points de vie à retirer.
     */
    public void diminuer_pv(int nb_pv, Avatar avatar) {
        if (pts_vie - nb_pv <= 0) {
            System.out.println("Les points de vie de " + avatar.getPseudo() + " tombe à 0");
            pts_vie = 0;
        } else {
            pts_vie = pts_vie - nb_pv;
            System.out.println("Il vous reste " + pts_vie + " points de vie");
        }
    }

    /**
     * Vérifie si la question est déjà dans la liste des questions en attente de l'avatar.
     * Si elle n'y est pas, l'ajoute avec son adversaire et la date associée.
     *
     * @param question La question à recevoir.
     * @param avatar   L'avatar qui a envoyé la question.
     */
    public void recevoir_question(Question question, Avatar avatar) {
        if (question_attente.contains(question)) {
            System.out.println("La question est déjà en attente");
        } else {
            ajout_question(question, avatar);
        }
    }

    /**
     * Modifie une note dans le bulletin de l'avatar.
     *
     * @param note    La note à modifier.
     * @param matiere La matière de la note.
     * @param coef    Le coefficient de la note.
     * @param new_note La nouvelle note.
     */
    public void modifer_note(int note, Matiere matiere, int coef, int new_note) {
        this.note.modif_note(note, matiere, coef, new_note);
    }

    /**
     * Vérifie si le test est déjà en attente. S'il ne l'est pas, l'ajoute à la liste des tests en attente de l'avatar.
     *
     * @param test Le test à recevoir.
     */
    public void recevoir_test(Test test) {
        if (test_attente.size() == 0) {
            ajout_test(test);
            System.out.println("Le test a été ajouté");
        } else if (test_attente.contains(test)) {
            System.out.println("Le test est déjà en attente");
        } else {
            ajout_test(test);
            System.out.println("Le test a été ajouté");
        }
    }

    /**
     * Permet à l'avatar de faire un test.
     *
     * @throws MauvaisIndice Si l'indice de réponse choisi par l'utilisateur est invalide.
     */
    public void faire_test() throws MauvaisIndice {
        Random rand = new Random();
        int lvl = level;
        int cpt = 0;
        int cpt_pv = 0;
        Scanner scanner_reponse = new Scanner(System.in);
        int indice = rand.nextInt(test_attente.size());
        Test test = test_attente.get(indice);

        for (int j = 0; j < test.getQuestions().size(); j++) {
            ListeQuestion liste = test.getQuestions();
            Question question = liste.getListeQuestions(j);

            // Afficher l'intitulé de la question
            System.out.println(question.getIntitule());

            // Afficher les réponses disponibles
            System.out.println("Voici les réponses disponibles, laquelle choisissez-vous ?");
            int indice2 = 1;
            for (String element : question.getReponsePossible()) {
                System.out.println(indice2 + " : " + element);
                indice2 += 1;
            }

            // Lire la réponse de l'utilisateur
            String user_reponse = scanner_reponse.nextLine();

            String str2 = "";
            for (int k = 1; k < indice2; k++) {
                str2 += Integer.toString(k);
            }

            // Vérifier si l'indice de réponse choisi est valide
            if (!str2.contains(user_reponse)) {
                throw new MauvaisIndice();
            }

            int reponse_utilisateur = Integer.parseInt(user_reponse) - 1;

            // Vérifier si la réponse est correcte
            if (reponse_utilisateur == question.getReponseCorrect()) {
                System.out.println("Cette reponse était juste ;)");
                cpt += 1;
                cpt_pv += question.getNbPts();
                level += question.getLevel();
            } else {
                System.out.println("Cette reponse était fausse :(");
                System.out.println("La réponse était " + question.getReponsePossible().get(question.getReponseCorrect()));
                cpt_pv -= question.getNbPts();
                if (level - question.getLevel() >= 1) {
                    level -= question.getLevel();
                } else {
                    level = 1;
                }
            }
        }

        // Augmenter ou diminuer les points de vie de l'avatar en fonction des résultats du test
        if (cpt_pv >= 0) {
            this.augmenter_pv(cpt_pv);
        } else {
            this.diminuer_pv(Math.abs(cpt_pv), this);
        }

        // Afficher le taux de réussite du test
        System.out.println("Vous avez un taux de réussite à ce test de : " + cpt * 20 + "%");

        // Afficher le changement de niveau de l'avatar
        if (level > lvl) {
            System.out.println("Vous êtes monté niveau " + level + ". Bravo !");
        } else if (level == lvl) {
            System.out.println("Vous êtes toujours niveau " + level + ". Dommage !");
        } else {
            System.out.println("Vous êtes descendu niveau " + level + ". Dommage !");
        }

        // Supprimer le test de la liste des tests en attente de l'avatar
        supr_test(test);
    }



    /**
     * Permet à l'avatar de faire un défi.
     *
     * @throws MauvaisIndice Si l'indice de choix ou de réponse choisi par l'utilisateur est invalide.
     */
    public void faire_question() throws MauvaisIndice {
        int lvl = level;
        int indice = 0;

        // Vérifier si l'utilisateur a répondu à une question dans les délais
        for (LocalDateTime element : date_associer) {
            LocalDateTime now = LocalDateTime.now();
            if (now.isAfter(element.plusDays(2))) {
                Question question = question_attente.get(indice);
                System.out.println("Vous avez été trop lent pour répondre à la question : " + question.getIntitule() + " vous avez donc perdu " + question.getNbPts() + " points de vie");
                this.diminuer_pv(question.getNbPts(), this);
                adversaire.get(question_attente.indexOf(question)).augmenter_pv(question.getNbPts());
                supr_question(question);
            }
            indice += 1;
        }

        Scanner scanner = new Scanner(System.in);
        Scanner scanner_reponse = new Scanner(System.in);
        System.out.println("Quelle question choisissez-vous ?");
        indice = 1;
        for (Question element : question_attente) {
            System.out.println(indice + " : " + element.getIntitule());
            indice += 1;
        }

        String user_choice = scanner.nextLine();

        String str = "";
        for (int i = 1; i < indice; i++) {
            str += Integer.toString(i);
        }

        if (!str.contains(user_choice)) {
            throw new MauvaisIndice();
        }

        Question question = question_attente.get(Integer.parseInt(user_choice) - 1);
        System.out.println(question.getIntitule());
        System.out.println("Voici les réponses disponibles, laquelle choisissez-vous ?");
        indice = 1;
        for (String element : question.getReponsePossible()) {
            System.out.println(indice + " : " + element);
            indice += 1;
        }

        String user_reponse = scanner_reponse.nextLine();

        String str2 = "";
        for (int i = 1; i < indice; i++) {
            str2 += Integer.toString(i);
        }

        if (!str2.contains(user_reponse)) {
            throw new MauvaisIndice();
        }

        int reponse_utilisateur = Integer.parseInt(user_reponse) - 1;

        if (reponse_utilisateur == question.getReponseCorrect()) {
            System.out.println("Cette reponse était juste ;) vous gagnez " + question.getNbPts() + " points de vie ");
            this.augmenter_pv(question.getNbPts());
            System.out.println("L'adversaire :");
            adversaire.get(question_attente.indexOf(question)).diminuer_pv(question.getNbPts(), adversaire.get(question_attente.indexOf(question)));
            supr_question(question);
            level += question.getLevel();
        } else {
            System.out.println("Cette reponse était fausse :( vous perdez " + question.getNbPts() + " points de vie ");
            System.out.println("la réponse était " + question.getReponsePossible().get(question.getReponseCorrect()));
            this.diminuer_pv(question.getNbPts(), this);
            System.out.println("L'adversaire :");
            adversaire.get(question_attente.indexOf(question)).augmenter_pv(question.getNbPts());
            supr_question(question);
            if (level - question.getLevel() >= 1) {
                level -= question.getLevel();
            } else {
                level = 1;
            }
        }

        if (level > lvl) {
            System.out.println("Vous êtes monté niveau " + level + ". Bravo !");
        } else if (level == lvl) {
            System.out.println("Vous êtes toujours niveau " + level + ". Dommage !");
        } else {
            System.out.println("Vous êtes descendu niveau " + level + ". Dommage !");
        }
    }



    /**
     * Lance une question d'un défi en vérifiant les exceptions.
     * Si une exception MauvaisIndice est levée lors de la tentative de réponse à la question, elle est affichée.
     */
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

    /**
     * Lance un test en vérifiant les exceptions.
     * Si une exception MauvaisIndice est levée lors de la tentative de réponse à une question du test, elle est affichée.
     */
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

    /**
     * Crée un défi puis l'envoie à un adversaire spécifié.
     * Si le nombre de points de vie de l'avatar est nul, il affiche un message indiquant qu'il ne peut plus défier.
     *
     * @param avatar2 L'avatar à qui envoyer le défi.
     * @param listequestion1 La liste de questions pour choisir une question pour le défi.
     */
    public void defier(Avatar avatar2, ListeQuestion listequestion1) {
        if(pts_vie == 0){
            System.out.println("Vous n'avez plus de pv, vous ne pouvez plus défier. Veuillez augmenter vos pv en répondant à des tests, des défis ou en rajoutant des notes dans votre bulletin");
        }
        else{
            Defi defi1 = new Defi(this, avatar2);
            Question question = defi1.choix_question(listequestion1);
            defi1.envoie_question(question);
        }
    }

    /**
     * Envoie un ticket à l'admin pour le changement de pseudo.
     * L'utilisateur est invité à entrer son nouveau pseudo, puis un ticket est créé et envoyé à l'admin.
     *
     * @param admin L'administrateur à qui envoyer le ticket.
     */
    public void ticket_pseudo(Admin admin) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre nouveau pseudo: ");
        String new_pseudo = scanner.nextLine();
        Ticket ticket = new Ticket(admin, this, "pseudo", new_pseudo);
        admin.recevoir_ticket(ticket);
    }

    /**
     * Envoie un ticket à l'admin pour le changement de mot de passe.
     * L'utilisateur est invité à entrer son nouveau mot de passe, puis un ticket est créé et envoyé à l'admin.
     *
     * @param admin L'administrateur à qui envoyer le ticket.
     */
    public void ticket_mdp(Admin admin) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre nouveau mot de passe: ");
        String new_mdp = scanner.nextLine();
        Ticket ticket = new Ticket(admin, this, "mdp", new_mdp);
        admin.recevoir_ticket(ticket);
    }

    /**
     * Renvoie une représentation en chaîne de caractères de l'avatar.
     *
     * @return La représentation de l'avatar sous la forme d'une chaîne de caractères.
     */
    @Override
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
