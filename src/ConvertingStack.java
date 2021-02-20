public class ConvertingStack {

    private Number[] convertArr;
    private int mHead;
   // private int size;


    public ConvertingStack(int size) {
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

    public void push(Number element) {
        if (mHead == convertArr.length - 1)
            throw new IndexOutOfBoundsException();

        mHead++;
        convertArr[mHead] = element;
    }

    public Number pop() {
        if (isEmpty())
            throw new IndexOutOfBoundsException();

        Number element = (Number) convertArr[mHead];
        mHead--;
        return element;
    }

    public Number peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        if (isEmpty() == false) {
            return (Number) convertArr[mHead];
        }

        return null;
    }

}