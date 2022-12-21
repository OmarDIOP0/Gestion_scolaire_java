public class Etudiant extends Personne{
    private double noteMoyenne;
    private String diplomeEnCours;
    public static int nbEtudiants;

    public Etudiant(String nom, String prenom, int age, String adresse ,double noteMoyenne,String diplomeEnCours) {
        super(nom, prenom, age, adresse);
        this.noteMoyenne=noteMoyenne;
        this.diplomeEnCours=diplomeEnCours;
        nbEtudiants++;
    }
    public double getNoteMoyenne(){
        return this.noteMoyenne;
    }
    public String getDiplomeEnCours(){
        return this.diplomeEnCours;
    }
    public void setNoteMoyenne(double noteMoyenne){
         this.noteMoyenne=noteMoyenne;
    }
    public void setDiplomeEnCours( String diplome){
        this.diplomeEnCours=diplome;
    }

    public String toString(){
        return prenom+" "+nom +" "+age+" ans adresse: "+adresse+" note de la Moyenne :" + noteMoyenne +" diplome: "+diplomeEnCours;
    }
    public void ecrirePersonne(){
        System.out.println("Etudiant :"+toString());
    }
    public static int nbEtudiants(){
        return nbEtudiants;
    }
     
    
}
