import java.util.StringTokenizer;

public class PostfixCalculator
{
    private final static char A = '+';
    private final static char S = '-';
    private final static char M = '*';
    private final static char D = '/';
    private final static char Op = '(';
    private final static char Cp = ')';

    public PostfixCalculator()
    {
    }

    public static String infix2postfix(String infix) {

        // Algorithm to convert infix string to postfix string
        // create an empty string for postfix expression
        // create a stack of strings
        // tokenize the infix expression with a delimiter of space
        // while tokenizer has more tokens
        //   token = get next token from tokenizer``
        //  if token is an open parenthesis
        //     push token on stack
        //   else if token is a close parenthesis
        //     operator = pop top from stack
        //     while operator doesn't equal open parenthesis
        //       append operator and a single space to postfix expression
        //       operator = pop top from stack
        //     else if token is an operator
        //     while stack is not empty and precedence of token is less than top of stack (peek)
        //       pop top from stack and append it and single space to postfix expression
        //     after loop, push operator token onto stack
        //
        //   else
        //     append token and single space to postfix expression
        //
        // while stack is not empty
        //   pop and append operator and single space to postfix expression
        //
        //  return postfix expression

        StringBuilder NewExpression = new StringBuilder();
        String token = "";
        String operator = "";
        ArrayStack<String> stack = new ArrayStack<>();

        StringTokenizer expression = new StringTokenizer(infix);

        while (expression.hasMoreTokens()) {
            token = expression.nextToken();


            if (isOperand(token)) {
                NewExpression.append(token).append(" ");
            } else if (isOpen(token)) {
                stack.push(token);
            } else if (isClosed(token)) {


                while (stack.peek() != token &&
                        isOpen(token) && !stack.isEmpty()) {
                    NewExpression.append(stack.pop()).append(" ");

                    stack.pop();
                }

            } else if (isOperator(token)) {
                char OpType = NewExpression.charAt(Integer.parseInt(token));

                // check for precedence ???
                while (!stack.isEmpty() && precedence(OpType) <= precedence((stack.peek().charAt(1)))){
                    NewExpression.append(stack.pop()).append(" ");
                }
                stack.push(token);
            }
            while(!stack.isEmpty()){
             //   if(stack.peek().equals(isOpen(token))){
                  //  return "Invalid Expression";
                    NewExpression.append(stack.pop()).append(" ");

            }
            System.out.println(NewExpression);
        }
        return NewExpression.toString();


        }

    //   System.out.println(NewExpression);
      //  return NewExpression;




    public static double solve(String postfix)
    {
        SolvingStack<Double> stack = new SolvingStack<Double>();
        int OperandA = 0;
        int OperandB = 0;
        String token;
        StringTokenizer equation = new StringTokenizer(postfix);
        while(equation.hasMoreTokens()){
            token = equation.nextToken();
        }
        // Algorithm to solve postfix expression
        //
        // create a stack of doubles
        // tokenize the postfix expression with a delimiter of space
        //
        // while tokenizer has more tokens
        //   token = get next token from tokenizer
        //
        //   if token is an operator
        //     operand b = pop top of stack
        //     operand a = pop top of stack
        //     result = a operator b
        //     push result onto stack
        //
        //   else
        //     convert token to double and push onto stack
        //
        // there should only be 1 element left in the stack now
        // if there is more than 1 element or the stack is empty, you have a bug
        // answer = pop off top of stack
        //
        // return answer


        return 0;
    }

    public static boolean isOpen(String token){
        return (token.equals("("));
    }
    public static boolean isClosed(String token){
        return (token.equals(")"));
    }
    public static boolean isOperator(String token){
        return (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"));
    }
    public static boolean isOperand(String token){
        return (token.equals("0") || token.equals("1") || token.equals("2") ||token.equals("3") ||
                token.equals("4") ||token.equals("5") ||token.equals("6") ||token.equals("7") ||
                token.equals("8") ||token.equals("9"));
    }

    static int precedence(char Op)
    {
        switch (Op)
        {
            case '+':
                return 2;
            case '-':
                return 2;

            case '*':
                return 3;
            case '/':
                return 3;


                default:
                throw new IllegalStateException("Unexpected value: " + Op);
        }
    }

}
