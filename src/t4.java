public class t4 {
    static int getMax(int a, int b){

        int max1=a>b?a:b;
        return (int)max1;
    }
    static float getMax(float a, float b){

        float max1=a>b?a:b;
        return (float) max1;
    }
    public static void main(String[] args) {
        int max=getMax(5,5);
        float max2=getMax(5.6f,5.5f);
        System.out.println("max="+max);
        System.out.println("max2="+max2);
    }
}
