public class XpowN {
    public static int printXpowN(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int Xpownm1 = printXpowN(x, n-1);
        int Xpown = x * Xpownm1;
        return Xpown;
    }
    public static void main(String[] args) {
        int x=2;
        int n=2;
        System.out.println(printXpowN(x, n));
    }
}
