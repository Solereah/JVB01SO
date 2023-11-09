public class Main {
    public static void main(String[] args) {
        CallCenter Abm = new CallCenter(5,20);
        Thread agente1 = new Thread(new Agente("Luis Alfonso", Abm));
        Thread agente2 = new Thread(new Agente("María Alem", Abm));
        Thread agente3 = new Thread(new Agente("Juan perez", Abm));
        Thread agente4 = new Thread(new Agente("Marta Lopez", Abm));
        Thread agente5 = new Thread(new Agente("Antonia Perico", Abm));


        agente2.start();
        agente1.start();
        agente3.start();
        agente4.start();
        agente5.start();

    }
}