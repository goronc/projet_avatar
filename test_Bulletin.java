public class test_Bulletin {
    public static void main(String[] args) {
        Bulletin bulletin = new Bulletin();

        System.out.println(bulletin.toString());

        Matiere math = new Matiere("Math", 2);
        Matiere histoire = new Matiere("Histoire", 1);

        System.out.println(math.toString());
        System.out.println(histoire.toString());

        // Ajouter des notes pour les matières
        bulletin.ajout_note(12, math,5);
        bulletin.ajout_note(18, math,1);
        bulletin.ajout_note(14, histoire,1);

        // Afficher le bulletin
        System.out.println(bulletin.toString());

        // Supprimer une note

        bulletin.modif_note(12, math, 2, 15);
        

        // Afficher le bulletin après suppression de la première note de Math
        System.out.println(bulletin.toString());
    }
}
