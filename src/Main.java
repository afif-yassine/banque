public class Main {
    public static void main(String[] args) {
        Agence agence_1 = new Agence("N°:9 lot charaf afrag tiznit ");


        /*------------------------- client yassine------------------------------*/
        Client yassine = new Client(agence_1,"yassine","afif");
        Compte compteEpargneYassine = new CompteEpargne(agence_1, yassine, 1000);
        yassine.addCompte(compteEpargneYassine);
        System.out.println("le solde de MR yassine avant deposer est : "+yassine.getCompte(0).getSolde());
        yassine.deposer(0,1000);
        System.out.println("le solde de MR yassine apres deposer est : "+yassine.getCompte(0).getSolde());
        yassine.retirer(0,100);
        System.out.println("le solde de MR yassine apres retirer est : "+yassine.getCompte(0).getSolde());
        agence_1.addClient(yassine);

        /*------------------------- client mohamed------------------------------*/
        Client mohamed = new Client(agence_1,"mohamed", "Afif");
        Compte comptePayantMohamed = new ComptePayant(agence_1, mohamed, 2500);
        mohamed.addCompte(comptePayantMohamed);
        agence_1.addClient(mohamed);


        /*------------------------- client anas------------------------------*/
        Client anas = new Client(agence_1,"anas","aberchih");
        Compte comptePayantAnas1 = new ComptePayant(agence_1, anas, 0);
        anas.addCompte(comptePayantAnas1);
        Compte comptePayantAnas2 = new ComptePayant(agence_1, anas, 3000);
        anas.addCompte(comptePayantAnas2);
        agence_1.addClient(anas);


        /*------------------------- client redouan------------------------------*/
        Client redouan = new Client(agence_1,"redouan","Afif");
        Compte compteEpargneRedouan1 = new CompteEpargne(agence_1,redouan,0);
        redouan.addCompte(compteEpargneRedouan1);
        Compte compteEpargneRedouan2 = new CompteEpargne(agence_1,redouan,2300);
        redouan.addCompte(compteEpargneRedouan2);
        agence_1.addClient(redouan);






        /*--------------------  Liste des différents clients avec leurs différents comptes.  ------------*/
        System.out.println(" Liste des différents clients avec leurs différents comptes: ");
        for(int i=0;i<agence_1.getNbClients();i++) {
            System.out.println("------------------------------> " + agence_1.getLesClients()[i].getNom() + " " + agence_1.getLesClients()[i].getPrenom());
            for(int j=0;j<agence_1.getLesClients()[i].getNbComptes();j++) {
                System.out.println("-------------------------------------------------> " + agence_1.getLesClients()[i].getMesCompte()[j].getCode());
            }
        }


        /*-------------------------Liste des comptes d’épargne de l’agence.--------------------*/
        System.out.println("Liste des comptes d’épargne de l’agence : ");
        for(int i =0; i<agence_1.getNbComptes();i++){
            if(agence_1.getLesComptes()[i].getClass().getName()=="CompteEpargne"){
                System.out.println("      "+agence_1.getLesComptes()[i].getCode());
            }
        }
        System.out.println("\n\n");
        System.out.println("Liste des comptes Payant de l’agence : ");
        for(int i =0; i<agence_1.getNbComptes();i++){
            if(agence_1.getLesComptes()[i].getClass().getName()=="ComptePayant"){
                System.out.println("      "+agence_1.getLesComptes()[i].getCode());
            }
        }
        /*----------------------------------------------  polymorfizem--------------------------------*/
        System.out.println("returne un nombre de la function calcule ==>  "+(comptePayantAnas1.calcule()));


    }
}
