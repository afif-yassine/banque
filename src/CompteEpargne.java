public class CompteEpargne extends Compte {
    public double taux = 6;

    public CompteEpargne(Agence myAgence, Client proprietaire,double solde) {
        super(myAgence, proprietaire, solde);
    }


    public double getTaux() {
        return taux;
    }
    public void setTaux(double taux) {
        this.taux = taux;
    }
    public void calculInteret(){
        this.solde = this.solde + (solde*100)/taux;
    }

}
