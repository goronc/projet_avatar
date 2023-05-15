public class ChaineNonTrouveeException extends Exception {


    private String chaine;


    public ChaineNonTrouveeException(String chaine) {
        this.chaine = chaine;
    }

    
    public String getChaine() {
        return chaine;
    }
}