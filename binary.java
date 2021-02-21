import java.io.*;

public class binary{
    public static void main(String args[]){
        int n=10;
        int a[]=new int[10];
        int i=0;   
        while(n!=0){
          a[i]=n%2;
          n=n/2;
	 n=n*n;
          i++;      
        }
for(int j=i-1;j>=0;j--){
System.out.print(a[j]);
    }
}
}
