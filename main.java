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
        

        ArrayList<String> liste_pseudo = new ArrayList<>();
        ArrayList<String> liste_mdp = new ArrayList<>();
        for(int i = 0; i<avatars.size();i++){
            liste_pseudo.add(avatars.get(i).getPseudo());
            liste_mdp.add(avatars.get(i).getPseudo());
        }
        Scanner scanner_pseudo = new Scanner(System.in);
        Scanner scanner_mdp = new Scanner(System.in);
        String user_pseudo;
        int indice = 0;

        boolean running = true;
        while(true){
            do {
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
            while(running){
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
                System.out.println("q - Ce deconnecter ");
                System.out.println("Votre choix : ");
                String choix_possible = "1234567q";
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
                else if(user_choice.equals("q")){
                    running = false;
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // Ignorer l'exception
                }
            

        }
    }
}
}

