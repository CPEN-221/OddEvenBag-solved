// TODO implement this class and associated methods

package oddevenbag;

import java.util.ArrayList;

public class OddEvenBag {
    private ArrayList<Integer> list;
    private int sum;
    private int countOdd;

    /**
     * Create an empty OddEvenBag
     */
    public OddEvenBag() {
        list = new ArrayList<Integer>();
    }

    /**
     * Create an OddEvenBag using the contents of an array
     * @param array is not null
     */
    public OddEvenBag(int[] array) {
        list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
            sum += array[i];
            if (array[i] % 2 == 1) {
                countOdd++;
            }
        }
    }

    /**
     * Add a new entry to an OddEvenBag
     * @param newEntry
     */
    public void add(int newEntry) {
        list.add(newEntry);
        sum += newEntry;
        if (newEntry % 2 == 1) {
            countOdd++;
        }
    }

    /**
     * Remove an occurrence of a value from OddEvenBag; if the value does not exist then the OddEvenBag is unchanged
     * @param x value to remove
     */
    public void remove(int x) {
        boolean removal = list.remove(new Integer(x));
        if (removal) {
            sum -= x;
            if (x % 2 == 1) {
                countOdd--;
            }
        }
    }

    /**
     * Increment all entries by 1
     */
    public void increment() {
        for (int i = 0; i < list.size(); i++) {
            int e = list.get(i);
            e++;
            list.set(i, e);
        }
        sum += list.size();
        countOdd = list.size() - countOdd;
    }

    /**
     * Decrement all entries by 1
     */
    public void decrement() {
        for (int i = 0; i < list.size(); i++) {
            int e = list.get(i);
            e--;
            list.set(i, e);
        }
        sum -= list.size();
        countOdd = list.size() - countOdd;
    }

    /**
     * Check if the OddEvenBag contains a value
     * @param x the value to search for
     * @return true if x is in OddEvenBag and false otherwise
     */
    public boolean contains(int x) {
        return list.contains(x);
    }

    /**
     * Count the number of occurrences of a value in OddEvenBag
     * @param x the value to find the number of occurrences of
     * @return the number of occurrences of x in the OddEvenBag
     */
    public int getCount(int x) {
        int count = 0;
        for (int i: list) {
            if (i == x) {
                count++;
            }
        }
        return count;
    }

    /**
     * Obtain the sum of elements in the OddEvenBag
     * @return the sum of elements in the OddEvenBag
     */
    public int sum() {
        return sum;
    }

    /**
     * Checks if an OddEvenBag is equal to another object.
     * Two OddEvenBags are equal if they contain exactly the same number of
     * odd and even elements.
     * @param o object to compare with
     * @return true if this is equal to o
     */
    public boolean equals(Object o) {
        if (o instanceof OddEvenBag) {
            OddEvenBag other = (OddEvenBag) o;
            if (this.countOdd == other.countOdd && this.list.size() == other.list.size()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return a hash code for OddEvenBag.
     * If two OddEvenBags are equal then they must return the same hash code.
     * Two OddEvenBags that are not equal may return the same hash code.
     * @return the hash code for OddEvenBag
     */
    @Override
    public int hashCode() {
        return this.countOdd;
    }

}
