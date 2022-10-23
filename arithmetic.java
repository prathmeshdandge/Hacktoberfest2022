import java.util.Scanner;
public class arithmetic{

    public static void main(String[] args){

        Scanner sc= new Scanner(system.in);

        System.out.println("enter int 1");
        int a= sc.nextInt();
        System.out.println("enter int 2");
        int b= sc.nextInt();
        
        int sum= a+b;
        int mul= a*b;
        int div= a/b;
        int sub= a-b;

        System.out.println("enter operation number : /n 1.sum /n 2.mul /n 3.div /n 4.sub");
        int n = sc.nextInt();

        if(n=1){
        System.out.println(sum);
        }
        else
        {
                if(n=2){
                    System.out.println(mul);
            
                }

                else{

                    if(n=3){
                        System.out.println(div);
                    }
                    else{

                        if(n=4){
                            System.out.println(sub);
                        }
                        else{
                            System.out.println("wrong choice");
                        }
                    }
                }
        }


    }
}