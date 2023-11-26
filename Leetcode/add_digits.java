import java.util.*;
public class Prac{
    static void proddel(int [] arr){
        int sum=0;
        int temp;
        for(int i=0; i<arr.length; i++){
                while (arr[i]>0){
                    temp=arr[i]%10;
                    sum=sum+temp;
                    arr[i]=arr[i]/10;
                }  
                System.out.print(sum+" "); 
                sum=0;
        }
       
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();// Jab bhi input lena ho jo bhi cheez yaad rkhna scanner ke object ko.
        int [] result=new int[size];
        for(int i=0; i<size; i++){
            result[i]=sc.nextInt();
        }
        proddel(result);
    }
}