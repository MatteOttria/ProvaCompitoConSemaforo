public class Persona {
    private String name;
    private Bagno wc;

    public Persona(String name, Bagno wc) {
        this.name = name;
        this.wc = wc;
    }

    public void run() throws InterruptedException{
        wc.semaforo.p();
        wc.use(name);
        wc.semaforo.v();
    }
}
