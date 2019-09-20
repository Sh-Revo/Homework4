import folder1.*;
import java.util.Scanner;
 class t7 {

    public static void main(String[] args) {
        t1 t1= new t1();
        t2 t2= new t2();
        t3 t3= new t3();
        t4 t4= new t4();
        t5 t5= new t5();
        t6 t6= new t6();

        Scanner in = new Scanner(System.in);
        //Scanner is = new Scanner(System.in);
        String yes="y,yes,Y";
        String no="n,no,N";
        String contin;
        boolean flag=true;
        boolean flag2=true;
        while (flag) {

            System.out.println("Введите число: (0-выход)");
            String i = in.nextLine();
            switch (i) {
                case "0":{
                    System.exit(0);
                }
                case "1": {
                    t1.main();
                    System.out.println("");
                    flag = false;
                    flag2 = true;
                    break;
                }
                case "2": {
                    t2.main();
                    System.out.println("");
                    flag = false;
                    flag2 = true;
                    break;
                }
                case "3": {
                    t3.main();
                    System.out.println("");
                    flag = false;
                    flag2 = true;
                    break;
                }
                case "4": {
                    t4.main();
                    System.out.println("");
                    flag = false;
                    flag2 = true;
                    break;
                }
                case "5": {
                    t5.main();
                    System.out.println("");
                    flag = false;
                    flag2 = true;
                    break;
                }
                case "6": {
                    t6.main();
                    System.out.println("");
                    flag = false;
                    flag2 = true;
                    break;
                }
                default:
                    System.out.println("Введите другое i: ");
                    flag2=false;
            }

            while (flag2) {
                System.out.println("Продолжить?   (yes(y) or no(n))");
                contin=in.nextLine();
                if (contin.equals("y")||contin.equals("yes")||contin.equals("Y")) {
                    flag = true;
                    flag2=false;
                } else if (contin.equals("n")||contin.equals("no")||contin.equals("N")) {
                    flag = false;
                    flag2=false;
                    break;
                } else {
                    System.out.println("Введите другую букву: ");
                    flag=false;
                    flag2=true;}
            }
        }
    }
}
