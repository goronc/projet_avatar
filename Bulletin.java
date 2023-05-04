import java.util.HashMap;
import java.util.ArrayList;

public class Bulletin {

    private HashMap<Matiere, ArrayList<Integer>> bulletin;


    public Bulletin() {
        bulletin = new HashMap<Matiere, ArrayList<Integer>>();
    }


    public Bulletin(HashMap<Matiere, ArrayList<Integer>> new_bulletin) {
        bulletin = new_bulletin;
    }


    public void ajout_note(int note,Matiere matiere,int coef){

        for(int i =0;i<coef;i++){
            if (bulletin.containsKey(matiere)) {
                bulletin.get(matiere).add(note);
            } 
            else {
                ArrayList<Integer> liste_note;
                liste_note = new ArrayList<Integer>(100);
                liste_note.add(note);
                bulletin.put(matiere,liste_note);
            }
        }
        

    }


    public void supr_note(int note,Matiere matiere,int coef){
        int cpt = 0;
        for(int i =0;i<bulletin.get(matiere).size();i++){
            if(bulletin.get(matiere).get(i) == note){
                cpt = cpt + 1;
            }
        }
        if(cpt>=coef){
            for(int j =0;j<coef;j++){
                if (bulletin.containsKey(matiere)) {
                    if(bulletin.get(matiere).contains(note))
                    bulletin.get(matiere).remove(Integer.valueOf(note));
                    else{
                        System.out.println("La note n'existe pas");
                    }
                } 
                else {
                    System.out.println("La matiere n'existe pas");
                }
            }
            
        }
        else{
            System.out.println("La note n'existe pas coef trop eleve");
        }
    }


    public void modif_note(int note,Matiere matiere,int coef,int new_note){
        int cpt = 0;
        for(int i =0;i<bulletin.get(matiere).size();i++){
            if(bulletin.get(matiere).get(i) == note){
                cpt = cpt + 1;
            }
        }
        if(cpt>=coef){
            this.supr_note(note,matiere,coef);
            this.ajout_note(new_note, matiere, coef);
        }
        else{
            System.out.println("La note n'existe pas coef trop eleve");
        }
    }


    public HashMap<Matiere, ArrayList<Integer>> getBulletin() {
        return bulletin;
    }


    public void setBulletin(HashMap<Matiere, ArrayList<Integer>> bulletin) {
        this.bulletin = bulletin;
    }


    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Bulletin : {");
        for (Matiere matiere : bulletin.keySet()) {
            res.append(matiere).append(": ").append(bulletin.get(matiere)).append("\n");
        }
        res.append(" }");
        return res.toString();
    }
}