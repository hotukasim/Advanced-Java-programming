import java.util.Scanner;
public class Numberofnumber {
    public static void main(String[] args){
        int s = 0;
        Scanner a = new Scanner(System.in);23
        while(true){
            System.out.println("bhai ekta number input den: ");
            
            int b = a.nextInt();
            
            if(b == 0){
                break;
            }
            else{
                s++;
            }
        }
        System.out.print(s);
    }
}
