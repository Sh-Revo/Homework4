public class main {
    public static void main(String[] args) {
        int g = 62;
        int a, c=0, b,k=0,f=0;
        a = g;
        b = g;
        String str = "";
       // String reverse = new StringBuffer(str).reverse().toString();

        System.out.println("2 система: ");
        while (g != 0) {

            int n=g % 2;
            System.out.print(n);
            g = g / 2;
        }



        System.out.println("\n8 система: ");
        while (a != 0) {
            System.out.print(a % 8);
            a = a / 8;
        }

        System.out.print("\n16 система: ");
        //while (b!=0) {
        //System.out.print(b % 16);
       // b=111;

 //       if (b > 16) {
            while (b > 16) {

                k=b%16;
               // System.out.print(k);


   //        }
          if (k < 16) {
              f=b/16;
             //  System.out.print(f);

            switch (k) {
                case 11: {
                    System.out.print("A");
                    break;
                }
                case 12: {
                    System.out.print("B");
                    break;
                }
                case 13: {
                    System.out.print("C");
                    break;
                }
                case 14: {
                    System.out.print("D");
                    break;
                }
                case 15: {
                    System.out.print("E");
                    break;
                }
                case 16: {
                    System.out.print("F");
                    break;
                }

            default:{
                System.out.print(""+k);
            }
              /*  c=b%16;
                System.out.print(c);
                b=b/16;*/
    }}b=b/16;
    //    }
    }System.out.print(f);
       /* while (b!=0) {

            switch (b) {
                case 11: {
                    System.out.print(b + "A");
                    break;
                }
                case 12: {
                    System.out.print(b + "B");
                    break;
                }
                case 13: {
                    System.out.print(b + "C");
                    break;
                }
                case 14: {
                    System.out.print(b + "D");
                    break;
                }
                case 15: {
                    System.out.print(b + "E");
                    break;
                }
                case 16: {
                    System.out.print(b + "F");
                    break;
                }

                default: {
                    k=b%16;
                    System.out.print(k);
                    b=b/16;
                }
            }
        }*/
}
}