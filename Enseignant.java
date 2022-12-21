import javax.lang.model.type.PrimitiveType;

public class Enseignant extends Personne{
    private int nbHeuresCours=0;
    private boolean grincheux;
    private String specialite;
    public static int nbEnseignants;

    public Enseignant(String nom, String prenom,int age, String adresse,int nbHeuresCours,boolean grincheux,String specialite){
        super(nom, prenom, age, adresse);
        this.nbHeuresCours=nbHeuresCours;
        this.grincheux=grincheux;
        this.specialite=specialite;
        nbEnseignants++;
    }
    public int getNbHeureCours(){
        return this.nbHeuresCours;
    }
    public boolean getGrincheux(){
        return this.grincheux;
    }
    public String getSpecialite(){
        return this.specialite;
    }
    public void setNbHeureCours(int nb){
        this.nbHeuresCours=nb;
    }
    public void setGrinceux( boolean grincheux){
        this.grincheux=grincheux;
    }
    public void setSpecialite( String specialite){
        this.specialite=specialite;
    }
    public String toString(){
        return prenom+" "+nom +" "+age+" ans adresse: "+adresse + "grincheux "+grincheux +" nbHeuresCours :" + nbHeuresCours +" specialite :"+ specialite;
    }
    public void ecrirePersonne(){
         System.out.println("Enseignant :"+toString());
    }
    public static int nbEnseignants(){
        return nbEnseignants;
    }
    public double salaireEnsignant(double p){
        double salaire=0;
         if(getNbHeureCours()==40 && getGrincheux()==false){
            salaire=p*100;
         }
         else if(getNbHeureCours()>40 && getGrincheux()==false){
             salaire=p*150;
         }
         return salaire;
    }
}
