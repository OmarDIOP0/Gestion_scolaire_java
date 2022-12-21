public class Secretaire extends Personne{
   private int numeroBureau;
    public static int nbSecretaires;

    public Secretaire(String nom, String prenom, int age, String adresse,int numeroBureau) {
        super(nom, prenom, age, adresse);
        this.numeroBureau=numeroBureau;
        nbSecretaires++;
    }
    
    public String toString(){
        return prenom+" "+nom +" "+age+" ans adresse: "+adresse+" numero du Bureau :" + numeroBureau;
    }
    public void ecrirePersonne(){
        System.out.println("Secretaire :"+toString());
    }
    public static int nbSecretaires(){
        return nbSecretaires;
    }
}
