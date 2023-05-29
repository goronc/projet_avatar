public class test_Ticket {
    
    public static void main(String[] args) {


        // Création d'un nouvel admin
        Admin admin = new Admin(1);


        // Création d'un avatar
        Avatar avatar = new Avatar();


        // Affichage de l'avatar
        System.out.println(avatar.toString());


        // Demande de changement de pseudo
        avatar.ticket_pseudo(admin);


        // Modification du pseudo et du mot de passe de l'avatar
        admin.modif_avatar();


        // Affichage de l'avatar
        System.out.println(avatar.toString());
    }
}
