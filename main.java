import java.io.*;
import java.util.*;



public class main {

    public static void verifierPresenceChaine(ArrayList<String> liste, String chaine) throws ChaineNonTrouveeException {
        if (!liste.contains(chaine)) {
            throw new ChaineNonTrouveeException(chaine);
        }
    }

    
    public static void main(String[] args) {
        // On lit le fichier pour recuperer les avatars

        ArrayList<Avatar> avatars = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("avatar.ser"))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Avatar) {
                        avatars.add((Avatar) obj);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<Question> questions = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("question.ser"))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Question) {
                        questions.add((Question) obj);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<Ticket> tickets = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tickets.ser"))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Question) {
                        tickets.add((Ticket) obj);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        ArrayList<String> liste_pseudo = new ArrayList<>();
        ArrayList<String> liste_mdp = new ArrayList<>();
        for(int i = 0; i<avatars.size();i++){
            liste_pseudo.add(avatars.get(i).getPseudo());
            liste_mdp.add(avatars.get(i).getPseudo());
        }
        liste_pseudo.add("Admin");
        Scanner scanner_pseudo = new Scanner(System.in);
        Scanner scanner_mdp = new Scanner(System.in);
        String user_pseudo;
        int indice = 0;

        boolean running = true;
        boolean running2 = true;
        boolean running3 = true;
        Admin admin = new Admin(0, avatars, tickets);

        while(running){
            do {
                Scanner Choix = new Scanner(System.in);
                System.out.println("1 - S'insrire");
                System.out.println("2 - Se connecter");
                System.out.println("Entrez ce que vous voulez faire : ");
                String user_choix = Choix.nextLine();
                String choix_possibles = "12";
                while(!choix_possibles.contains(String.valueOf(user_choix))){
                    System.out.println("Option non disponible");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // Ignorer l'exception
                    }
                    System.out.println("1 - S'insrire");
                    System.out.println("2 - Se connecter");
                    System.out.println("Entrez ce que vous voulez faire : ");
                    user_choix = Choix.nextLine();
                }
                if (user_choix.equals("1")) {
                    Scanner pseudo = new Scanner(System.in);
                    Scanner mdp = new Scanner(System.in);
                    System.out.println("Entrez votre pseudo");
                    String user_pseudo_choix = pseudo.nextLine();
                    System.out.println("Entrez votre mot de passe");
                    String user_mdp_choix = mdp.nextLine();
                    Avatar avatar = new Avatar();
                    avatar.setPseudo(user_pseudo_choix);
                    avatar.setmdp(user_mdp_choix);
                    liste_pseudo.add(user_pseudo_choix);
                    liste_mdp.add(user_mdp_choix);
                    avatars.add(avatar);
                }
                running2 = true;
                System.out.print("Entrez votre pseudo : ");
                user_pseudo = scanner_pseudo.nextLine();

                try {
                    verifierPresenceChaine(liste_pseudo, user_pseudo);
                    System.out.println("Pseudo correct");
                } catch (ChaineNonTrouveeException e) {
                    System.out.println("le Pseudo '" + e.getChaine() + "' n'a pas été trouvée !");
                }
                
            } while (!liste_pseudo.contains(user_pseudo));

            for(int i = 0; i<avatars.size();i++){
                if(avatars.get(i).getPseudo().equals(user_pseudo)){
                    indice = i;
                }
            }

            if(user_pseudo.equals("Admin")){
                System.out.println("entrez votre mot de passe : ");
                String user_mdp = scanner_mdp.nextLine();
                while(!user_mdp.equals("admin") ){
                    System.out.println("mot de passe incorrect acces refuse ");
                    System.out.println("réessayer a nouveau  ");
                    System.out.println("entrez votre mot de passe q pour quitter: ");
                    user_mdp = scanner_mdp.nextLine();
                    if(user_mdp.equals("q")){
                        break;
                    }
                }
                if(user_mdp.equals("admin")){
                    Admin admin2 = new Admin(0,avatars,tickets);
                    while(running3){
                        System.out.println("Bienvenue dans le Systeme D'administration que voulez vous faire?");
                        Scanner admin_scanner = new Scanner(System.in);
                        System.out.println("1 - Voir la liste des Avatars");
                        System.out.println("2 - Voir la Liste des tickets ");
                        System.out.println("3 - Changez le pseudo d'un Avatars");
                        System.out.println("4 - Ajoutez de nouvelle Question");
                        System.out.println("4 - Changez le mdp d'un Avatars");
                        System.out.println("q - Ce deconnecter ");
                        System.out.println("Votre choix : ");
                        String admin_choix_possible = "1234q";
                        String admin_choice = admin_scanner.nextLine();
                        while(!admin_choix_possible.contains(String.valueOf(admin_choice))){
                            System.out.println("Option non disponible");
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                // Ignorer l'exception
                            }
                            System.out.println("1 - Voir la liste des Avatars");
                            System.out.println("2 - Voir la Liste des tickets ");
                            System.out.println("3 - Changez le pseudo d'un Avatars");
                            System.out.println("4 - Changez le mdp d'un Avatars");
                            System.out.println("q - Ce deconnecter ");
                            System.out.println("Votre choix : ");
                            admin_choice = admin_scanner.nextLine();
                        }
                        if(admin_choice.equals("1")){
                            System.out.println("Voici la liste de tout les avatars");
                            for(int i =0 ;i<avatars.size();i++){
                                System.out.println("- " + avatars.get(i).getPseudo());
                            }
                        }
                        else if(admin_choice.equals("2")){
                            for(int i =0 ;i<avatars.size();i++){
                                System.out.println((i+1) + "-" + tickets.get(i));
                            }
                        }
                        else if(admin_choice.equals("3")){
                            String choix_possible = "";
                            Scanner admin_scanner_avatar = new Scanner(System.in);
                            String admin_choice_avatar = "0";
                            int indice_pseudo = 0;
                            while(!choix_possible.contains(String.valueOf(admin_choice_avatar))){
                                System.out.println("Voici la liste de tout les avatars");
                                for(int i =0 ;i<avatars.size();i++){
                                    System.out.println((i+1) + " - " + avatars.get(i).getPseudo());
                                    choix_possible = choix_possible + (i+1);
                                }
                                System.out.println("q pour quitter");
                                choix_possible = choix_possible + ("q");
                                System.out.println("Quels avatar choisissez vous?");
                                admin_choice_avatar = admin_scanner_avatar.nextLine();
                            }
                            if(choix_possible.contains(admin_choice_avatar)){
                                System.out.println("Quel est son nouveau Pseudo?");
                                Scanner scanner_new_pseudo = new Scanner(System.in);
                                String  new_pseudo = scanner_new_pseudo.nextLine();
                                avatars.get(Integer.parseInt(admin_choice_avatar)-1).setPseudo(new_pseudo);
                            }
                        }
                        else if(admin_choice.equals("4")){
                            String choix_possible = "";
                            Scanner admin_scanner_avatar = new Scanner(System.in);
                            String admin_choice_avatar = "0";
                            int indice_pseudo = 0;
                            while(!choix_possible.contains(String.valueOf(admin_choice_avatar))){
                                System.out.println("Voici la liste de tout les avatars");
                                for(int i =0 ;i<avatars.size();i++){
                                    System.out.println((i+1) + " - " + avatars.get(i).getPseudo());
                                    choix_possible = choix_possible + (i+1);
                                }
                                System.out.println("q pour quitter");
                                choix_possible = choix_possible + ("q");
                                System.out.println("Quels avatar choisissez vous?");
                                admin_choice_avatar = admin_scanner_avatar.nextLine();
                            }
                            if(choix_possible.contains(admin_choice_avatar)){
                                System.out.println("Quel est son nouveau MDP?");
                                Scanner scanner_new_mdp = new Scanner(System.in);
                                String  new_mdp = scanner_new_mdp.nextLine();
                                avatars.get(Integer.parseInt(admin_choice_avatar)-1).setmdp(new_mdp);
                            }

                        }
                        else if(admin_choice.equals("q")){
                            break;
                        }
                        try {
    
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            // Ignorer l'exception
                        }
                        try {
                            FileOutputStream fileOut = new FileOutputStream("avatar.ser");
                            ObjectOutputStream out = new ObjectOutputStream(fileOut);
                            for(int i = 0 ; i<avatars.size();i++){
                                out.writeObject(avatars.get(i));
                            }
                            out.close();
                            fileOut.close();
                            FileOutputStream fileOut2 = new FileOutputStream("question.ser");
                            ObjectOutputStream out2 = new ObjectOutputStream(fileOut);
                            for(int i = 0 ; i<questions.size();i++){
                                out.writeObject(questions.get(i));
                            }
                            out2.close();
                            fileOut2.close();
                            FileOutputStream fileOut3 = new FileOutputStream("tickets.ser");
                            ObjectOutputStream out3 = new ObjectOutputStream(fileOut);
                            for(int i = 0 ; i<tickets.size();i++){
                                out.writeObject(tickets.get(i));
                            }
                            out3.close();
                            fileOut3.close();
                        } catch (IOException i) {
                            i.printStackTrace();
                        }
                    }
                } 
                
            }
            else{
                System.out.println("entrez votre mot de passe : ");
                String user_mdp = scanner_mdp.nextLine();
                while(!user_mdp.equals(avatars.get(indice).getmdp()) ){
                    System.out.println("mot de passe incorrect acces refuse ");
                    System.out.println("réessayer a nouveau  ");
                    System.out.println("entrez votre mot de passe q pour quitter: ");
                    user_mdp = scanner_mdp.nextLine();
                    if(user_mdp.equals("q")){
                        break;
                    }
                }
                if(user_mdp.equals(avatars.get(indice).getmdp())){
                    while(running2){
                        Avatar avatar = avatars.get(indice);
                        Scanner scanner_choice = new Scanner(System.in);
                        System.out.println("Que voulez vous faire : ");
                        System.out.println("1 - Voir vos points de vie ");
                        System.out.println("2 - Faire une question ");
                        System.out.println("3 - Faire un test");
                        System.out.println("4 - Voir ton niveau ");
                        System.out.println("5 - Ajouter des notes ");
                        System.out.println("6 - Modifier des notes ");
                        System.out.println("7 - Voir tes notes ");
                        System.out.println("8 - Défier quelqu'un ");
                        System.out.println("9 - Créer un ticket ");
                        System.out.println("q - Ce deconnecter ");
                        System.out.println("Votre choix : ");
                        String choix_possible = "123456789q";
                        String user_choice = scanner_choice.nextLine();
                        while(!choix_possible.contains(String.valueOf(user_choice))){
                            System.out.println("Option non disponible");
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                // Ignorer l'exception
                            }
                            System.out.println("Que voulez vous faire : ");
                            System.out.println("1 - Voir vos points de vie ");
                            System.out.println("2 - Faire une question ");
                            System.out.println("3 - Faire un test");
                            System.out.println("4 - Voir ton niveau ");
                            System.out.println("5 - Ajouter des notes ");
                            System.out.println("6 - Modifier des notes ");
                            System.out.println("7 - Voir tes notes ");
                            System.out.println("8 - Défier quelqu'un ");
                            System.out.println("9 - Créer un ticket ");
                            System.out.println("q - Ce deconnecter ");
                            System.out.println("Votre choix : ");
                            user_choice = scanner_choice.nextLine();
        
                        }
                        if(user_choice.equals("1")){
                            System.out.println(" Points de vie : " + avatar.getPtsVie());
                        }
                        else if(user_choice.equals("2")){
                            avatar.erreur_faire_question();
                        }
                        else if(user_choice.equals("3")){
                            ListeQuestion liste_question = new ListeQuestion(questions);
                            Test test = avatar.creer_test(liste_question);
                            avatar.recevoir_test(test);
                            avatar.erreur_faire_test();
                        }
                        else if(user_choice.equals("4")){
                            System.out.println(" Level : " + avatar.getLevel());
                        }
                        else if(user_choice.equals("5")){
                            Scanner scanner_note = new Scanner(System.in);
                            Scanner scanner_matiere = new Scanner(System.in);
                            Scanner scanner_coef_matiere = new Scanner(System.in);
                            Scanner scanner_coef = new Scanner(System.in);
                            int user_note = -1;
                            while (user_note < 0 || user_note > 20) {
                                System.out.print("Entrez un nombre entre 0 et 20 : ");
                                String input = scanner_note.nextLine();
                                try {
                                    user_note = Integer.parseInt(input);
                                } catch (NumberFormatException e) {
                                    System.out.println("Le format de saisie est incorrect. Veuillez entrer un nombre.");
                                    continue;
                                }
        
                                if (user_note < 0 || user_note > 20) {
                                    System.out.println("Le nombre saisi est hors de la plage valide. Veuillez réessayer.");
                                }
                            }
                            System.out.print("Entrez une matiere : ");
                            String user_matiere = scanner_matiere.nextLine();
                            Set<Matiere> keys = avatar.getNote().getBulletin().keySet();
                            ArrayList<Matiere> list = new ArrayList<Matiere>(keys);
                            int user_coef = -1;
                            Matiere matiere = new Matiere();
                            int i = 0;
                            for (i = 0 ; i < keys.size() ; i++) {
                                if(list.get(i).getNom().equals(user_matiere)){
                                    user_coef = -1;
                                    while(user_coef < 0){
                                        System.out.print("Entrez un coefficient : ");
                                        String input = scanner_coef.nextLine();
                                        try {
                                            user_coef = Integer.parseInt(input);
                                        } catch (NumberFormatException e) {
                                            System.out.println("Le format de saisie est incorrect. Veuillez entrer un nombre.");
                                            continue;
                                        }
                                    }
                                    break;
                                    
                                }
                            }
                            if(i == keys.size()){
                                System.out.println("C'est la premiere note dans cette matiere quel est le coef de la matiere ? :");
                                int user_matiere_coef = -1;
                                while(user_matiere_coef < 0){
                                    System.out.print("Entrez un coefficient : ");
                                        String input = scanner_coef_matiere.nextLine();
                                    try {
                                        user_matiere_coef = Integer.parseInt(input);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Le format de saisie est incorrect. Veuillez entrer un nombre.");
                                        continue;
                                    }
                                }
        
                                matiere.setNom(user_matiere);
                                matiere.setCoef(user_matiere_coef);
        
                                user_coef = -1;
                                while(user_coef < 0){
                                    System.out.print("Entrez un coefficient pour la note : ");
                                    String input = scanner_coef.nextLine();
                                    try {
                                        user_coef = Integer.parseInt(input);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Le format de saisie est incorrect. Veuillez entrer un nombre.");
                                        continue;
                                    }
                                }
        
                            }
                            avatar.Ajouter_Note(user_note, matiere, user_coef);
                        }
                        else if (user_choice.equals("6")){
                            Scanner scanner_matiere = new Scanner(System.in);
                            System.out.print("Entrez une matiere : ");
                            String user_matiere = scanner_matiere.nextLine();
                            Set<Matiere> keys = avatar.getNote().getBulletin().keySet();
                            ArrayList<Matiere> list = new ArrayList<Matiere>(keys);
                            int i = 0;
                            int res = i;
                            for (i = 0 ; i < keys.size() ; i++) {
                                if(list.get(i).getNom().equals(user_matiere)){
                                    res = i;
                                }
                            }
                            if((i+1) == (keys.size())){
                                System.out.println("Vous n'avez aucune note dans cette matiere");
                            }
                            else{
                                Matiere matiere = list.get(res);
                                System.out.println("Quel est la note a modifier ?");
                                Scanner scanner_note = new Scanner(System.in);
                                int user_note = -1;
                                while (user_note < 0 || user_note > 20) {
                                    System.out.print("Entrez un nombre entre 0 et 20 : ");
                                    String input = scanner_note.nextLine();
                                    try {
                                        user_note = Integer.parseInt(input);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Le format de saisie est incorrect. Veuillez entrer un nombre.");
                                        continue;
                                    }
        
                                    if (user_note < 0 || user_note > 20) {
                                        System.out.println("Le nombre saisi est hors de la plage valide. Veuillez réessayer.");
                                    }
                                }
                                int user_coef = -1;
                                Scanner scanner_coef = new Scanner(System.in);
                                while(user_coef < 0){
                                    System.out.print("Quel est son coefficient : ");
                                    String input = scanner_coef.nextLine();
                                    try {
                                        user_coef = Integer.parseInt(input);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Le format de saisie est incorrect. Veuillez entrer un nombre.");
                                        continue;
                                    }
                                }
                                Scanner scanner_new_note = new Scanner(System.in);
                                int user_new_note = -1;
                                while (user_new_note < 0 || user_new_note > 20) {
                                    System.out.print("Quel est la nouvelle note ?\n");
                                    System.out.print("Entrez un nombre entre 0 et 20 : ");
                                    String input = scanner_new_note.nextLine();
                                    try {
                                        user_new_note = Integer.parseInt(input);
                                    } catch (NumberFormatException e) {
                                        System.out.println("Le format de saisie est incorrect. Veuillez entrer un nombre.");
                                        continue;
                                    }
            
                                    if (user_new_note < 0 || user_new_note > 20) {
                                        System.out.println("Le nombre saisi est hors de la plage valide. Veuillez réessayer.");
                                    }
                                }
                                avatar.getNote().modif_note(user_note, matiere, user_coef,user_new_note);
                            }
                            
                        }    
                        else if(user_choice.equals("7")){
                            System.out.println(avatar.getNote());
                        }
                        else if(user_choice.equals("8")){
                            if(avatar.getPtsVie() == 0){
                                System.out.println("Vous ne pouvez pas défiez car vous n'avez plus de points de vie");
                            }
                            else{
                                int choix;
                                Scanner scanner_adversaire = new Scanner(System.in);
                                System.out.println("Qui voulez vous défiez ?");
                                for(int i = 0;i<avatars.size();i++){
                                    System.out.println((i+1)+ " - " + avatars.get(i).getPseudo());
                                }
                                System.out.println("Votre choix : ");
                                String user_adversaire = scanner_adversaire.nextLine();
                                try {
                                    choix = Integer.parseInt(user_adversaire);
                                    Avatar adversaire = avatars.get(choix-1);
                                    if(adversaire.getPseudo().equals(avatar.getPseudo())){
                                        System.out.println("Vous ne pouvez pas vous defiez vous meme");
                                    }
                                    else{
                                        ListeQuestion liste_question = new ListeQuestion();
                                        liste_question.setListeQuestions(questions);
                                        avatar.defier(adversaire,liste_question);
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Option non valide");
                                }
                            }
                        }
                        else if(user_choice.equals("q")){
                            running2 = false;
                        }
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            // Ignorer l'exception
                        }
        
                        try {
                            FileOutputStream fileOut = new FileOutputStream("avatar.ser");
                            ObjectOutputStream out = new ObjectOutputStream(fileOut);
                            for(int i = 0 ; i<avatars.size();i++){
                                out.writeObject(avatars.get(i));
                            }
                            out.close();
                            fileOut.close();
                            FileOutputStream fileOut2 = new FileOutputStream("question.ser");
                            ObjectOutputStream out2 = new ObjectOutputStream(fileOut);
                            for(int i = 0 ; i<questions.size();i++){
                                out.writeObject(questions.get(i));
                            }
                            out2.close();
                            fileOut2.close();
                            FileOutputStream fileOut3 = new FileOutputStream("tickets.ser");
                            ObjectOutputStream out3 = new ObjectOutputStream(fileOut);
                            for(int i = 0 ; i<tickets.size();i++){
                                out.writeObject(tickets.get(i));
                            }
                            out3.close();
                            fileOut3.close();
                        } catch (IOException i) {
                            i.printStackTrace();
                        }
                    }
                }
            } 
        }
    }
}

