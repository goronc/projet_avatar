public class Admin {
    
    private int id_admin;
    
    public Admin(int id_admin) {
        this.id_admin = id_admin;
    }
    
    public int getId_admin() {
        return id_admin;
    }
    
    public void setId_admin(int newId_admin) {
        this.id_admin = newId_admin;
    }

    public void modif_avatar(Avatar avatar) {

    }

    public void del_avatar(Avatar avatar) {
        avatar = null;
    }

    public void ajout_question(Question question, ListeQuestion List_question) {
        List_question.AddQuestion(question);
    }

    public void modif_question(Question question, ListeQuestion List_question) {
        List_question.ModifQuestion(question);
    }

    public void del_question(Question question, ListeQuestion List_question) {
        List_question.SupprQuestion(question);
    }

    public String toString() {
        return "Admin{ " +
                "id_admin = " + id_admin +
                " }";
    }    
}
