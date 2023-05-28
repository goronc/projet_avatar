/**
 * Cette exception est levée lorsqu'une chaîne n'est pas trouvée.
 * Elle est une sous-classe de la classe Exception.
 */
public class ChaineNonTrouveeException extends Exception {

    private String chaine; // La chaîne non trouvée

    /**
     * Constructeur de l'exception ChaineNonTrouveeException.
     *
     * @param chaine la chaîne qui n'a pas été trouvée
     */
    public ChaineNonTrouveeException(String chaine) {
        this.chaine = chaine;
    }

    /**
     * Retourne la chaîne qui n'a pas été trouvée.
     *
     * @return la chaîne non trouvée
     */
    public String getChaine() {
        return chaine;
    }
}
