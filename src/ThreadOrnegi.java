public class ThreadOrnegi {
    public static void main(String[] args) {
        uzunBirIslem();
        System.out.println("Merhaba Thread");
    }
    private static void uzunBirIslem() {
        try {
            // Burada uzun bir işlem yapılıyor.
            Thread.sleep(5 * 1000);
            System.out.println("Uzun işlem sonucu");
        }
        catch (InterruptedException ex) {
            System.err.println(ex);
        }
    }

}
