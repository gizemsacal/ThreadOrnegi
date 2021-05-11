public class ThreadOrnegi2 extends Thread {
    public static void main(String[] args) {
        ThreadOrnegi2 threadOrnegi = new ThreadOrnegi2();
        threadOrnegi.start();
        System.out.println("Merhaba Thread");
    }
    @Override
    public void run() {
        try {
            // Burada uzun bir işlem yapılıyor.
            Thread.sleep(5 * 1000);
            System.out.println("Uzun işlem sonucu");
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
    }
}
