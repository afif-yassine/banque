public class ComptePayant extends Compte{
    private final static double TAUX_OPERATION = 5;

    public ComptePayant(Agence myAgence , Client proprietaire,double solde){
        super(myAgence, proprietaire,solde);
    }

    @Override
    public void deposer(double sommeADeposer){
        this.solde = this.solde + sommeADeposer - TAUX_OPERATION;
    }
    @Override
    public void retirer(double sommeARetirer){
        this.solde = this.solde - sommeARetirer - TAUX_OPERATION;
    }




}
