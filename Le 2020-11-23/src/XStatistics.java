/*
findLargest():

largest = getFirst();
while( hasMore()){
    next = getNext();
    if( isLargerThan(next, largest)) {
         largest = next;
    }
}

Se konceptet med pseudospråk för att beskriva algoritmer.

Generics

 */

public abstract class XStatistics {
    
    abstract int getFirst();
    abstract int getNext();
    abstract boolean hasMore();
    /*
     * Är i1 större än i2?
     */
    abstract boolean isLargerThan(int i1, int i2);
    
    public int findLargest() {
        int largest = getFirst();
        while( hasMore()) {
            int next = getNext();
            if( isLargerThan(next, largest)) {
                largest = next;
            }
        }
        return largest;
    }

}
