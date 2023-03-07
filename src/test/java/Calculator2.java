public class Calculator2 {
    int a;
    int b;
    String res;

    public void calc(int c, int d, char opr) {
        int val;

        switch (opr) {
            case '+':
                val = c + d;
                res=Integer.toString(val);
                System.out.println("a="+c);
                System.out.println("b="+d);
                System.out.println("a + b ="+res);
                break;
            case '-':
                System.out.println("a - b");
            case '*':
                System.out.println("a * b");
            case '/':
                System.out.println("a / b");

        }

    }
}