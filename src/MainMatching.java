public class MainMatching {
    public static void main(String[] args) {
        String opening = "({[";
        String closing = ")}]";
        String expression = "()(()){([()])}";

        System.out.println("Expression: " + expression);
        System.out.println("\n");

        ArrayStackChar stack = new ArrayStackChar(expression.length());
        char[] exp = expression.toCharArray();

        for(char c : exp){
            if(opening.indexOf(c) != -1){
                System.out.println("Input ...." + c);
                System.out.println("Stack push ...." + c);
                stack.push(c);
            }
            else if(closing.indexOf(c) != -1){
                if(stack.isEmpty()){
                    System.out.println("\n ----- MisMatched Delimiter ----- ");
                    return;
                }
                System.out.println("\nInput ...." + c);
                char p = (char) stack.pop();
                System.out.println("Stack pop ...." + p);
                System.out.println("Matching ..." + p + " with " + c);

                if(opening.indexOf(p) == closing.indexOf(c)){
                    System.out.println("----- Delimiter matched");
                }
                else{
                    System.out.println("----- Delimiter mismatched");
                    return;
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("\n ----- All Matched ------");
        }
        else{
            System.out.println("\n ----- Mismatched Delimiter ----- ");
            return;
        }
    }
}
