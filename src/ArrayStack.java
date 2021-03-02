import java.util.EmptyStackException;

public class ArrayStack <String>{
    private final static int DEFAULT_CAPACITY = 10;

    private int top;
    private final String[] stack;

    public ArrayStack(){
        this(DEFAULT_CAPACITY);
    }
    public ArrayStack(int initialCapacity){
        top = -1;
        stack = (String[])(new Object[initialCapacity]);
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(String element){
        if(top == (stack.length) - 1)
           throw new IndexOutOfBoundsException();

        top++;
        stack[top] = element;
    }
    public String pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        String result = stack[top];
        stack[top] = null;
        top--;
        return result;
    }
    public String peek() throws EmptyStackException{
        if (isEmpty()){
            throw new EmptyStackException();
        }
        String peek = stack[top];
        top--;
        return peek;
    }

    public String[] returnStack(){
        return stack;
    }

}

















/* public class ArrayStack<S> {

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

    public void push(Number element) {
        if (mHead == convertArr.length - 1)
            throw new IndexOutOfBoundsException();

        mHead++;
        convertArr[mHead] = element;
    }

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

*/