public class Sample1{
    public static void main(String[] args) {
        pattern16(4);
        pattern18(4);
        pattern19(4);
    }
    static void pattern16(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
                    char ch='A';
                    int b=(2*i +1)/2;

            for(int j=1;j<=2*i +1;j++){
                System.out.print(ch);
                if(j<=b){
                    ch++;
                }
                else{
                    ch--;
                }

            }
            System.out.println("");

        }
    }
    static void pattern18(int n) {
        for (int i = 0; i <= n; i++) {
            for (char ch = (char)('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch );
            }
            System.out.println();
        }
    }
    static void pattern19(int n){
       int s=2*(n-1);
       int p=2*(n+1);
       for(int i=1;i<=n;i++){
        for(int j=5;j>=i;j--){
            System.out.print("*");
        }
         for(int j=1;j<=p;j++){
            System.out.print(" ");
        }
        for(int j=5-i;j>=1;j--){
            System.out.print("*");
        }
        System.out.println("");
       }
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=s;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print("*");
        } System.out.println("");
        s-=2;
    }

    }
}

    
