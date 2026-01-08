public class Infix2Postfix {
    public static void main(String[] args) {
        String operator = "+-*/";
        String expression = "(a+b-c)*d-(e+f)";
        System.out.println("Infix: " + expression);
        ArrayStackChar stack = new ArrayStackChar();

        char[] exp =  expression.toCharArray();
        char[] postfix = new char[expression.length()];
        int size = 0;
        System.out.print("\nPostfix: ");
        for(char c : exp){
            if(c == '('){
                stack.push(c);
            }
            else if(operator.indexOf(c) != -1){
                if(operator.indexOf(stack.peek()) != -1){
                    postfix[size] = (char) stack.pop();
                    size++;
                    stack.push(c);
                }
                else{
                    stack.push(c);
                }
            }
            else if(c == ')'){
                while(stack.peek() != '('){
                    if(!stack.isEmpty()){
                        postfix[size] = (char) stack.pop();
                        size++;
                    }
                    else{
                        System.out.println("Expression not matched");
                    }
                }
                stack.pop();
            }
            else{
                postfix[size] = c;
                size++;
            }
        }
        if(!stack.isEmpty()){
            if(operator.indexOf(stack.peek()) != -1){
                postfix[size] = (char) stack.pop();
                size++;
            }
            else if(stack.peek() == '('){
                System.out.println("Expression not matched");
            }
        }
        for(char b: postfix){
            System.out.print(b);
        }
    }
}
