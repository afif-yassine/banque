public class Main {
    public static void main(String[] args) {
        Agence agence_1=new Agence("agadir ");
        Agence agence_2=new Agence("tiznit ");
        Agence agence_3=new Agence("gelmim ");
        Agence agence_4=new Agence("taza ");

        Client yassine = new Client(agence_1);
        agence_1.addClient(yassine);
        agence_1.addClient(yassine);
        agence_1.addClient(yassine);
        agence_1.addClient(yassine);
        Client anas = new Client(agence_1);
        Client imane = new Client(agence_1);
        Client hassane = new Client(agence_1);

        System.out.println("le numero de l'agence est : "+agence_1.getNumero());
        System.out.println("le numero de l'agence est : "+agence_2.getNumero());
        System.out.println("le numero de l'agence est : "+agence_3.getNumero());
        System.out.println("le numero de l'agence est : "+agence_4.getNumero());

        System.out.println("le nombre des clients dans l'agence est : "+agence_1.getNbClients());
        System.out.println("Hello world!");
    }
}