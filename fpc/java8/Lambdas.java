import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author Rodrigo Ruiz Murguía <rmurguia@anzen.com.mx>
 */
public class Lambdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random r = new Random();
        List<Integer> aleatorios = r.ints(1, 10).limit(10).boxed().collect(Collectors.toList());

        List<Integer> aleatoriosCuad = aleatorios.stream().map((Integer i) -> {return i  * i;}).collect(Collectors.toList());
                      aleatoriosCuad = aleatorios.stream().map(i -> {return i  * i;}).collect(Collectors.toList());
                      aleatoriosCuad = aleatorios.stream().map(i -> i  * i).collect(Collectors.toList());

        System.out.println(aleatorios);
        System.out.println(aleatoriosCuad);

        for(int i = 0; i < 10; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(String.format("Se muere el thread %s", Thread.currentThread().getName()));
                }
            }, "" + i);
            t.start();
        }

        for(int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> {
                System.out.println(String.format("Murió thread %s", Thread.currentThread().getName()));
            }, "" + i);
            t.start();
        }
    }
}
