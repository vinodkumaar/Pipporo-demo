package novi;

import ro.pippo.core.Pippo;

public class BasicDemo {

    public static void main(String[] args) {
        Pippo pippo = new Pippo(new BasicApplication());
        pippo.start();
    }

}