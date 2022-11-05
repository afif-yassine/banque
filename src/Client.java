public class Client {
    private String code;
    private static int id=0;
    private String nom;
    private String prenom;
    private String adresse;
    private Agence monAgence;
    private Compte[] mesCompte;

    private int nbCompteActuel;


    public Client(Agence monAgence){
        nbCompteActuel = 0;
        this.monAgence = monAgence;
        code = this.getClass().getName()+": "+(++id);
    }

    public Compte getCompte(int numCompte){
        if(numCompte>=0 && numCompte < getNbComptes() && numCompte < 4){
            return mesCompte[numCompte];
        }
        return null;
    }


    public void addCompte(Compte newCompte){
        boolean test = true;
        for(Compte compteCheck : mesCompte){
            if(compteCheck.getCode() ==  newCompte.getCode() && getNbComptes() > 4){
                test=false;
                System.out.println("le Compte est deja existe \n le nombre depasser 4 !! !! \n");
            }
        }
        if(test==true){
            this.mesCompte[nbCompteActuel++]=newCompte;
            newCompte.lAgence.addCompte(newCompte);
        }

    }


    public void depoder(int numCompte, double cashDepo){

    }

    public void retirer(int numCompte, double cashRetir){

    }

    public int getNbComptes(){
        return this.nbCompteActuel;
    }

    public String getCode(){
        return this.code;
    }


                                                            //les seter and geter


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Agence getMonAgence() {
        return monAgence;
    }

    public void setMonAgence(Agence monAgence) {
        this.monAgence = monAgence;
    }

    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }





}
