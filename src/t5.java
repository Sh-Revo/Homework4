public class t5 {
    static int recurs(int x){

        int g;
        for (int i=0;i<x;i++) {
            g = i + 1;
            System.out.println("g=" + g);
        }
        return (1+recurs(x))==x;
    }
    public static void main(String[] args) {
       recurs(5);
    }
}
