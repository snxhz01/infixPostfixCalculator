public class ConvertingStack {

    private String[] convert;
    private char mHead;
    private int length;

    public ConvertingStack(){
        length = -1;
        convert = new String[];
    }

    public boolean isEmpty(){
        if(mHead.next == null){
            return true;
        } else{
            return false;
        }
    }

    public void push(){

    }

    public pop(){

    }
}
