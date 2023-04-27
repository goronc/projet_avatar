public class Matiere {

    private String nom;
    private int coef;

    public Matiere(){
        nom = "Inconnue";
        coef = 0;
    }

    public Matiere(String new_nom,int new_coef){
        nom = new_nom;
        coef = new_coef;
    }

    public String getNom() {
        return nom;
    }

    public int getCoef() {
        return coef;
    }

    public void setNom(String new_nom) {
        nom = new_nom;
    }

    public void setCoef(int new_coef) {
        coef = new_coef;
    }

    public String toString() {
        return "Matiere = {" +
                "nom = '" + nom + '\'' +
                ", coef = " + coef +
                '}';
    }
}