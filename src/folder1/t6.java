package folder1;

public class t6 {
    static int recurs2(int x, int y, int d,int s){
        //System.out.println("+");
        String r="\n";
        String g="+";
        System.out.print("+");
        if(y==0){
            System.out.println("");
        }
        return x<d?(y<s?(recurs2(x,y+1,d,s)):recurs2(x+1,0,d,s)):y;
   }
    public static void main() {
        recurs2(1,1,5,6);

        }
    }

