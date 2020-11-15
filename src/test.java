public class test {
    public static void main(String[] args) {
        fac(2);
    }
    static void fac(int n) {
        for(int i=0; i<n; i++) {
            System.out.println(n);
            fac(n-1);
        }
    }
}
