public class GestionScolaire {
    public static void main(String[] args) {
        Personne listePersonne[]=new Personne[100];
        listePersonne[0]=new Secretaire("Diop","Awa", 25, "Maristes",12);
        listePersonne[1]=new Enseignant("Ba","Mandikou",40,"Dakar",20, false, "Systeme dexploitation");
        listePersonne[2]=new Enseignant("Diop","Mouhamed",27,"Dakar",20, false, "Programmation web");
        listePersonne[3]=new Etudiant("Fall","Fatou", 20, "Dakar", 18,"technicienne superieure");
        listePersonne[4]=new Etudiant("Faye","Assane", 22, "Dakar", 15,"Master");
        listePersonne[5]=new Etudiant("Diaw","Kana", 18, "Dakar", 14,"technicien superieur");
        int lastIndexPersonne=6;
        int i=0;
        while(i<lastIndexPersonne){
            System.out.println(listePersonne[i]);
            i++;
        }
        Personne.nbPersonne();
        //System.out.println("Apres modif");

        
    }
}
