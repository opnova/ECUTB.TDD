/*
    findLargest():
    
    largest = getFirst();
    while( hasMore()){
        next = getNext();
        if( isLargerinthan(next, largest)) {
             largest = next;
        }
    }
    
    Se konceptet med pseudospråk för att beskriva algoritmer.    
 */

public abstract class XStatistics<T> {

    abstract T getFirst();

    abstract T getNext();

    abstract boolean hasMore();

    /*
     * Är i1 större än i2?
     */
    abstract boolean isLargerThan(T i1, T i2);

    public T findLargest() {

        T largest = getFirst();
        while (hasMore()) {
            T next = getNext();
            if (isLargerThan(next, largest)) {
                largest = next;
            }
        }

        return largest;
    }

}
