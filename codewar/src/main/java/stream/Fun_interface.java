package stream;

public class Fun_interface {
    public  static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("T1 is running... ");
            }
        });
        Thread t2 = new Thread(() -> System.out.println("T2 is running... "));
        t1.run();
        t2.run();
        Decoration dec = ()->{System.out.println("test");};
        dec.decorationWithcurtains();
    }
}
