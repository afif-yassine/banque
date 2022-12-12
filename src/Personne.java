public abstract class  Personne {
    protected String nom;
    protected String prenom;

    protected Agence monAgence;

    public Personne(Agence monAgence,String nom,String prenom ){
        this.nom = nom;
        this.prenom = prenom;
        this.monAgence = monAgence;
    }
}
