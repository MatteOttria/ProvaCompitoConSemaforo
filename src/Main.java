public class Main {
    public static void main(String[] args) throws Exception {
        Semaforo s_ms = new Semaforo(2);
        Semaforo s_fm = new Semaforo(2);

        Bagno ms = new Bagno(s_ms);
        Bagno fm = new Bagno(s_fm);

        Persona p1 = new Persona("A", ms);
        Persona p2 = new Persona("B", ms);
        Persona p3 = new Persona("c", ms);

        Persona p4 = new Persona("D", fm);
        Persona p5 = new Persona("E", fm);
        Persona p6 = new Persona("F", fm);

        p1.run();
        p2.run();
        p3.run();

        p4.run();
        p5.run();
        p6.run();
    }
}
