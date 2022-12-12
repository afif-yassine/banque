import java.time.LocalDate;

public class Employés extends Personne{
    private LocalDate dateInscription;
    private int numClientAdmineActuelle;
    private int numClientAdmineMax=20;
    public Client[] lesClients ;

    public Employés(Agence monAgence,String nom,String prenom) {
        super(monAgence,nom,prenom);
        numClientAdmineActuelle=0;
        Client[] lesClients = new Client[numClientAdmineMax];
        LocalDate dateInscription = LocalDate.now();
    }

    public LocalDate getDateInscription() {
        return dateInscription;
    }

    public int getNumClientAdmineActuelle() {
        return numClientAdmineActuelle;
    }

    public void setNumClientAdmineActuelle(int numClientAdmineActuelle) {
        this.numClientAdmineActuelle = numClientAdmineActuelle;
    }

    public Client[] getLesClients() {
        return lesClients;
    }
    public void addLesClient(Client newClient){
        if(getNumClientAdmineActuelle()>numClientAdmineMax){
            this.lesClients[numClientAdmineActuelle++]=newClient;
        }else System.out.println("le conseiller "+newClient.prenom+" "+newClient.nom+" a déjà le nombre maximale des clients ");

    }

    public void setLesClients(Client[] lesClients) {
        this.lesClients = lesClients;
    }
}
