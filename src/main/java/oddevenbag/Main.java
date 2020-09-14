package oddevenbag;

/* Simple harness for experimenting with OddEvenBag */
public class Main {
    public static void main(String[] args) {
        OddEvenBag oeb1;
        int[] inputArray = {1, 2, 3, 4, 5};
        OddEvenBag oeb2;

        oeb1 = new OddEvenBag();
        oeb2 = new OddEvenBag(inputArray);

        oeb1.add(10);
        oeb2.add(-1);

        oeb2.remove(4);
        oeb1.remove(1);

        oeb2.increment();
    }
}
