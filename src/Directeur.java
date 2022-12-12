import java.time.LocalDate;

public class Directeur extends Personne{
    LocalDate dateInscription;
    public Directeur(Agence monAgence,String nom,String prenom) {
        super(monAgence,nom,prenom);
        LocalDate dateInscription = LocalDate.now();
    }
}
