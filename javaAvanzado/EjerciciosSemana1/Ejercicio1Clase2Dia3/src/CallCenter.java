public class CallCenter  {
    private int cantAgentes;
    private int cantLlamadas;

    public CallCenter() {
    }

    public CallCenter(int cantAgentes, int cantLlamadas) {
        this.cantAgentes = cantAgentes;
        this.cantLlamadas = cantLlamadas;
    }

    public int getCantAgentes() {
        return cantAgentes;
    }

    public void setCantAgentes(int cantAgentes) {
        this.cantAgentes = cantAgentes;
    }

    public int getCantLlamadas() {
        return cantLlamadas;
    }

    public void setCantLlamadas(int cantLlamadas) {
        this.cantLlamadas = cantLlamadas;
    }

    public synchronized void finalizarLlamada(){
        cantAgentes+=1;
    }

    public synchronized void atenderLlamada(){
        if(cantLlamadas > cantAgentes){
            System.out.println("Por favor aguarde en línea, todos nuestros agentes se encuentran ocupados");
        } else {
            cantAgentes-=1;
            System.out.println("Su llamada está siendo atendida");
        }
    }
}
