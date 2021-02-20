public class ArrayStack<S> {

    private final Number[] convertArr;
    private int mHead;
   // private int size;


    public ArrayStack(int size) {
        convertArr = new Number[size];
       // size = (convertArr.length - 1);
        mHead = 0;
    }

    public boolean isEmpty() {
        if (convertArr[mHead] == null) {
            return true;
        } else {
            return false;
        }
    }

    /* public void push(Number element) {
        if (mHead == convertArr.length - 1)
            throw new IndexOutOfBoundsException();

        mHead++;
        convertArr[mHead] = element;
    }
*/
    public Number pop() {
        if (isEmpty())
            throw new IndexOutOfBoundsException();

        Number element = convertArr[mHead];
        mHead--;
        return element;
    }

    public Number peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        if (!isEmpty()) {
            return convertArr[mHead];
        }

        return null;
    }

    public void push(S nextToken) {
    }
}