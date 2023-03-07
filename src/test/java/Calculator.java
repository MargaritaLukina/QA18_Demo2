//- с полями int a, int b, char action, String res
//- статическим методом void, печатающим "This is a calculator"
//- не статическим методом void calc(int a, int b, char action), печатающим результаты арифметических действий со значениями a и b,
// в зависимости от значения action ('*','/'.'+','-')
//- вызвать эти методы из класса Main

public class Calculator {
    int a;
    int b;
    char action;
    String res;

    public static void Print(){

            System.out.println("This is calculator");
    }

    public void calc(int a, int b, char action){


        System.out.println("Result");
    }
}
