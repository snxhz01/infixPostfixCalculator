public class SolvingStack<Double> {
    private Number[] solveArr;
    private int mHead;
    // private int size;

    public SolvingStack() {

    }
    public SolvingStack(int size) {
        solveArr = new Number[size];
        // size = (convertArr.length - 1);
        mHead = 0;
    }



    public boolean isEmpty() {
        if (solveArr[mHead] == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Number element) {
        if (mHead == solveArr.length - 1)
            throw new IndexOutOfBoundsException();

        mHead++;
        solveArr[mHead] = element;
    }

    public Number pop() {
        if (isEmpty())
            throw new IndexOutOfBoundsException();

        Number element = (Number) solveArr[mHead];
        mHead--;
        return element;
    }

    public Number peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        if (isEmpty() == false) {
            return (Number) solveArr[mHead];
        }

        return null;
    }

}
