package githubproject;


class Signal extends Thread {
    public Signal(String signal) {
        super(signal);
    }

    public void run() {

        while (true) {

            try {
               Thread.sleep(20000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println();
            System.out.println("signal Changed");
            System.out.println("");

            System.out.println(this.getName());
            //notifyAll();
        }
    }
}

class Signal2 extends Thread {
    public Signal2(String signal) {
        super(signal);
    }

    public void run() {

        while (true) {

            try {
                Thread.sleep(2200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println();
            System.out.println("signal Changed");
            System.out.println("");

            System.out.println(this.getName());

        }

    }

}

public class Thread1 {

    public static void main(String argv[]) {
        Signal s1 = new Signal("!!!Red Signal !!!");
        Signal2 s2 = new Signal2("!!!green Signal !!!");

        s1.start();

        

        s2.start();
    }
}