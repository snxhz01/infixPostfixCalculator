import java.util.Arrays;

public class StackTest {
    public static void main(String[] args){

        ArrayStack<String> stack = new ArrayStack<>();
        stack.push("hey");
        System.out.println(stack.peek());

        stack.push("hey");
      stack.push("hi");
      stack.push("hello");
      stack.push("hello");


        System.out.println(Arrays.toString(stack.returnStack()));
    }


}
