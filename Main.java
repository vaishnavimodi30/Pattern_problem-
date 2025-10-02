public class Main{
    public static void main(String[] args) {
       pattern5(4);
       pattern6(5);
       pattern28(5);
       pattern8(5);
       pattern14(6);
       pattern3(5);
       pattern4(5);
       pattern56(5 );
       pattern7(5);
       pattern10(5);
       pattern11(5);
       pattern12(4);
       pattern13(5);
       pattern144(5);
       pattern15(5);
       
    }

static void pattern5(int n){
     for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
} 
static void pattern6(int n){
    for(int i=1;i<=n;i++){
        for(int j=5;j>1;j--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
    }
   // static void 
    static void pattern28(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=5;j>i;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern8(int n){
        for(int i=1;i<=n;i++){
             for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    static void pattern14(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    static void pattern4(int n){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern56(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");  }
        for(int j=0;j<2*n-(2*i+1);j++){
            System.out.print("*");
        }
        System.out.println("");
    }
  }
  static void pattern10(int n){
    for(int i=0;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
    for(int i=1;i<n;i++){
        for(int j=4;j>=i;j--){
            System.out.print("*");
        }
        System.out.println("");
    }
  }
  static void pattern11(int n){
    for(int i=0;i<5;i++){
       int start=1;
            if(i%2==0){
                start=1;
            }
            else{
                start=0;
            } 
             for(int j=0;j<i;j++){
                System.out.print(start);
                start=1-start;
    }
    System.out.println("");}
  }
  static void pattern12(int n){
    int s=2*(n-1);
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+"");
        }
        for(int j=1;j<=s;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j+"");
        } System.out.println("");
        s-=2;
    }
  }
  static void pattern13(int n){
    int z=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(z+" ");
            z++;
        }
        System.out.println();
    }
  }
  
  static void pattern144(int n){
    for(int i=1;i<=5;i++){
            char ch='A'; 
        for(int j=1;j<=i;j++){
            System.out.print(ch+" ");
                    ch++;
        }
        System.out.println("");
    }
  }
  static void pattern15(int n){
    for(int i=1;i<=n;i++){
        char c='A';
        for(int j=5;j>=i;j--){
            System.out.print(c+" ");
            c++;
        }
        System.out.println();
    } 
}

}
