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
        }
    }
        
        
        
        

}

