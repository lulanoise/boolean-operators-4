package it.develhope.booleanoperators;
public class Start {
    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = a*b;
        int d = c;

        boolean A = (d / c + 2) >= b || !(c + b - c / a == 3);

        int x = 5;
        int y = 6;

        boolean t = false;
        boolean f = true;

        boolean B = (x * x - y * y / 2 != 12) || !t && f;

        System.out.println("A: "+ A);
        System.out.println("B: "+ B);

    }
}

/*
A: (d / c + 2) >= b || !(c + b - c / a == 3)
   (3/3 + 2) >= 3 || !(3 + 3 - 3/1 == 3)
   (1+2) >= 3 || !(3+3- 3 ==3)
   3 >= 3 || !(6-3==3)
   3 >= 3 || !(3==3)
   3 >= 3 || !(true)
   3 >= 3 || false
   true || false
   true


B: (x * x - y * y / 2 != 12) || !t && f
   (25-36/2 != 12) || !t && f
   (25-18 != 12) || !t && f
   (7 != 12) || !t && f
   true || !t && f
   true || true && true
   true || true
   true
 */


