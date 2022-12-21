public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected int age;
    protected String adresse;
    protected static int nbPersonne=0;

    public Personne( String nom, String prenom, int age, String adresse){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
        this.adresse=adresse;
        nbPersonne++;
    }
     public String getNom(){
         return this.nom;
     }
     public String getPrenom(){
        return this.prenom;
    }
    public int getAge(){
        return this.age;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public void setNom(String nom){
       this.nom=nom;
    }
    public void setPrenom( String prenom){
        this.prenom=prenom;
     }
     public void setAge(int age){
        this.age=age;
     }
     public void setAdresse(String adresse){
        this.adresse=adresse;
     }

    public String toString(){
        return prenom +" "+ nom + " "+ age +"ans et votre adresse"+adresse;
    }
    public void modifierPersonne(String adresse){
       this.adresse=adresse;
       ecrirePersonne();
    }
    //public static int nbPersonne(){
      //  return nbPersonne;
    
    abstract void ecrirePersonne();
    public static void nbPersonne(){
           System.out.println("Le nombre de Personne est: "+nbPersonne +"\n le nombre d'enseignant :"+Enseignant.nbEnseignants+"\n le nombre d'etudiant :"+Etudiant.nbEtudiants +"\n le nombre de secretaire :"+Secretaire.nbSecretaires);
    }
}

