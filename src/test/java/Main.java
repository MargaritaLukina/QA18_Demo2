public class Main {
    public static void main(String[] args) {

       Calculator.Print();

       //Calculator c = new Calculator();
       Calculator c;
       Calculator c1;
       //...
       c= new Calculator();
       c.a=5;
       c.b=7;
       c.action='+';
       c.res="???";

       c1= new Calculator();
       c1.a=2;
       c1.b=2;
       c1.action='*';
       c1.res="Resultat=";

      // c.calc(3,4,'*');

      // c1.calc(c1.a, c1.b, c1.action);

Calculator2 c2=new Calculator2();
//c2.calc(2,2,'+');

Calculator3 c3=new Calculator3();
c3.a=4;
c3.b=7;
//c3.calc('+');

       Calculator4  calc4 = new Calculator4();

       calc4.calc( 6,6,'*');

    }
}


