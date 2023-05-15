import java.util.*;
import java.io.*;


public class Admin implements Serializable{
    

    private int id_admin;
    private ArrayList<Avatar> List_avatar;
    

    public Admin(int id_admin) {
        this.id_admin = id_admin;
        this.List_avatar = new ArrayList<Avatar>();
    }
    

    public int getId_admin() {
        return id_admin;
    }
    

    public ArrayList<Avatar> getList_avatar() {
        return List_avatar;
    }


    public void setId_admin(int newId_admin) {
        this.id_admin = newId_admin;
    }


    public void setList_avatar(ArrayList<Avatar> new_list_avatar) {
        this.List_avatar = new_list_avatar;
    }


    // Ajoute l'avatar à la liste d'avatar
    public void addAvatar_toList_avatar(Avatar avatar) {
        if (List_avatar.contains(avatar)) {
            System.out.println("L'avatar n'existe pas");
        }
        else {
            List_avatar.add(avatar);
            System.out.println("L'avatar a été ajouté à la liste");
        }
    }


    // Modifie le pseudo le l'avatar
    public void modif_pseudo_avatar(Avatar avatar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nouveau Pseudo: ");
        String newPseudo = sc.nextLine();
        avatar.setPseudo(newPseudo);
    }


    // Supprime l'avatar
    public void del_avatar(Avatar avatar) {
        List_avatar.remove(avatar);
        avatar = null;
    }


    // Ajoute une question à la liste
    public void ajout_question(Question question, ListeQuestion List_question) {
        List_question.AddQuestion(question);
    }


    // Modifie une question en l'a remplaçant avec une nouvelle
    public void modif_question(Question question, ListeQuestion List_question, Question new_question) {
        List_question.ModifQuestion(question, new_question);
    }


    // Supprime une question de la liste
    public void del_question(Question question, ListeQuestion List_question) {
        List_question.SupprQuestion(question);
    }


    // Affichage de l'admin
    public String toString() {
        return "Admin : {" +
                "id_admin = " + id_admin +
                "Liste d'avatar = " + List_avatar +
                "}";
    }    
}
