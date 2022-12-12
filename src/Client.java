public class Client extends Personne {
    private Employés conseiller;
    private String code;
    private static int id=0;
    protected String adresse;
    private Compte[] mesCompte;
    private int nbCompteActuel;


    public Client(Agence monAgence,String nom,String prenom ){
        super(monAgence,nom,prenom);
        this.mesCompte = new Compte[4];
        nbCompteActuel = 0;
        code = this.getClass().getName()+": "+(++id);
    }

    public Compte getCompte(int numCompte){
        if(numCompte>=0 && numCompte < getNbComptes() && numCompte < 4){
            return mesCompte[numCompte];
        }
        return null;
    }


    public void addCompte(Compte newCompte){
        if(nbCompteActuel<4)
            this.mesCompte[nbCompteActuel++]=newCompte; //if if attention
    }


    public void deposer(int numCompte, double sommeADeposer){
        if (numCompte<4 && numCompte>=0){
            mesCompte[numCompte].deposer(sommeADeposer);   // polimorphisem car ci il lence compte epaghn ou payant
        }
    }

    public void retirer(int numCompte, double sommeARetirer){
        if (numCompte<4 && numCompte>=0){
            mesCompte[numCompte].retirer(sommeARetirer);
        }
    }

    public int getNbComptes(){
        return this.nbCompteActuel;
    }

    public String getCode(){
        return this.code;
    }


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

    public Compte[] getMesCompte() {
        Compte[] tableauARetoure = new Compte[getNbComptes()];
        for(int i=0;i<getNbComptes();i++){
            tableauARetoure[i]=mesCompte[i];
        }
        return tableauARetoure;
    }    // attention il y a une beug
}
