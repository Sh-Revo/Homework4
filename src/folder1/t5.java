package folder1;

public class t5 {
    static int recurs(int x,int y){
        System.out.println(x);
        return x==y-1?y:recurs(x+1,y);
    }

    public static void main() {

        System.out.println(recurs(1,6));
    }
}
