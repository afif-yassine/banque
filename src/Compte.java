public class Compte {
    private String code;
    protected double solde;
    protected Agence lAgence;
    protected Client Proprietaire;


    public Compte(Agence myAgence , Client proprietaire){
        this.lAgence = myAgence;
        this.Proprietaire = proprietaire;
        code= this.getClass().getName()+":"+lAgence.getNbComptes()+1;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public void deposer(double depo){

    }
    public void retirer(double  retir){

    }





}
