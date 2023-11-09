import java.util.Random;

public class Agente implements Runnable {

    private String name;

    private CallCenter agente;

    public Agente() {
    }

    public Agente(String name, CallCenter agente) {
        this.name = name;
        this.agente = agente;
    }


    @Override
    public void run() {


        Random random = new Random();
        //int cantLlamadas = (int) (Math.random() * 10) + 1;
        for (int i = 0; i < agente.getCantLlamadas(); i++) {

          int estadoLlamada = random.nextInt(2);// 0 atendió /1 finalizó

            if (estadoLlamada == 0) {
                agente.atenderLlamada();
            } else {
                agente.finalizarLlamada();

            }

            try {
                Thread.sleep(1000); // Simula un tiempo de procesamiento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}