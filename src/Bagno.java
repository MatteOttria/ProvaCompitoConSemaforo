public class Bagno {
    private static int wait = 2000;
    public Semaforo semaforo;

    public Bagno(Semaforo semaforo) {
        this.semaforo = semaforo;
    }


    public void use(String name) throws InterruptedException{
        System.out.println(name + " è entrato in bagno.");
        Thread.sleep(wait);
        System.out.println(name + " è uscito dal bagno.");
    }
}
