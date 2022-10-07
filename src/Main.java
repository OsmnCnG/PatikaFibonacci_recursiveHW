public class Main {
    //1-1-2-3-5-8-13-21

    static int fibonacci(int n){
        if(n>=1) {
            if (n <= 2)
                return 1;
            else
                return fibonacci((n - 1)) + fibonacci(n - 2);//fibo(3)=2+fibo(1)
        }else {

            throw new RuntimeException("HATA");

        }
    }
        /*
        f(1)=1
        f(2)=1
        f(3)=f(2)+f(1)
        f(4)=f(3)+f(2)
        f(n)=f(n-1)+f(n-2)
         */


    public static void main(String[] args) {

        try{
            System.out.println(fibonacci(45));
        }catch (Exception e){
            System.out.println(e);
        }

    }
}