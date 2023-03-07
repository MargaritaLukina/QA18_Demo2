public class Calculator3 {
    int a;
    int b;

    public void calc(char action){
       switch (action){
           case '+':
               int res= this.a+this.b;
               System.out.println("Calculator3: a + b= "+res);
               break;

       }

    }
}
