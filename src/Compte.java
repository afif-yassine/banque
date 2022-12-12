public class Compte {
    private String code;
    static int numbreCodeActuelle=0;
    protected double solde;
    protected Agence lAgence;
    protected Client Proprietaire;


    public Compte(Agence myAgence , Client proprietaire,double solde){
        this.lAgence = myAgence;
        this.Proprietaire = proprietaire;
        code= this.getClass().getName()+":"+numbreCodeActuelle++;
        this.solde=solde;
    }

    public int calcule(){return 55;}

    public String getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Agence getlAgence() {
        return lAgence;
    }

    public void setlAgence(Agence lAgence) {
        this.lAgence = lAgence;
    }

    public Client getProprietaire() {
        return Proprietaire;
    }

    public void setProprietaire(Client proprietaire) {
        Proprietaire = proprietaire;
    }

    public void deposer(double sommeADeposer){
        this.solde = this.solde + sommeADeposer;
    }
    public void retirer(double  sommeARetirer){
        if(sommeARetirer<this.solde)this.solde = this.solde - sommeARetirer;
    }





}
