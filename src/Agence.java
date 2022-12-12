public class Agence {
    private String Numero;
    private static int id = 0;
    private String adresse;
    private Directeur directeur;
    private Employés[] lesEmployes;
    private Client[] lesClients;
    private int nbClientActuel;
    private int nbCompteActuel;
    private Compte[] lesComptes;


    public Agence(String adresse) {
        nbClientActuel = 0;
        nbCompteActuel = 0;
        Numero = this.getClass().getName() + ":" + (id + 1);
        this.id = id + 1;
        this.adresse = adresse;
        this.lesClients = new Client[30];
        this.lesComptes = new Compte[30];

    }


    public String getAdresse() {
        return adresse;
    }

    public String getNumero() {
        return Numero;
    }

    public Compte getCompte(int numCompte) {
        if (numCompte >= 0 && numCompte < getNbComptes()) {
            return lesComptes[numCompte];
        }
        return null;
    }

    public Client getClient(int numClient) {
        if (numClient >= 0 && numClient < getNbClients()) {
            return lesClients[numClient];
        }
        return null;
    }

    public int getNbClients() {
        return this.nbClientActuel;
    }

    public int getNbComptes() {
        return this.nbCompteActuel;
    }

    public void addCompte(Compte newCompte) {
        boolean isInTabel = false;
        for(int i =0; i < getNbComptes();i++){
            if(lesComptes[i].getCode() == newCompte.getCode()){
                isInTabel=true;
            }
        }
        if(isInTabel==false) {
            lesComptes[nbCompteActuel++] = newCompte;
        }
    }

    public Compte[] getLesComptes() {
        return lesComptes;
    }

    public Client[] getLesClients() {
        return lesClients;
    }

    public void addClient(Client newClient) {
        lesClients[nbClientActuel++] = newClient;
        for(int i=0;i< newClient.getNbComptes();i++)
            addCompte(newClient.getMesCompte()[i]);
    }
}
