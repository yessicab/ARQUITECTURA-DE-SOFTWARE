
import java.util.Scanner;

public class entrada {
	public static void main(String a[]){
		Scanner X= new Scanner(System.in);
		int r= X.nextInt();
		int s= X.nextInt();
		int t=r+s;
		System.out.println("el valor digitado A es:"+r);
		System.out.println("el valor digitado B es:"+s);
		System.out.println("el valor digitado C es:"+t);
		System.out.println("el resultado de la suma es:"+t);
        r=s;
        s=t;
        t=s;
       
        System.out.println("intercambiando los valores asi: A=" +r+" "+ "B=" +s);
        
       if(r>s)
    	   System.out.println("el numero mayor es (r) y la potencia de (r,s)es:"+Math.pow(r,s));
       else{
           System.out.println("el numero mayor es (s) y la potencia de (s,r) es:"+Math.pow(r,s));
           
           if(r%3==0)
        	   System.out.println("el numero"+r+"es multiplo de:"+3);
           else
        	   System.out.println("el numero"+r+" no es multiplo de:"+3);
           if(s%3==0)
        	   System.out.println("el numero"+s+"es multiplo de:"+3); 
           else
        	   System.out.println("el numero"+s+"no es multiplo de:"+3);
           if(t%3==0)
        	   System.out.println("el numero"+t+"es multiplo de:"+3);
           else
        	   System.out.println("el numero"+t+"no es multiplo de:"+3);
           
        	double x1=(-s-Math.sqrt(s*s-4*r*t))/(2*r);
        	double x2=(-s+Math.sqrt(s*s-4*r*t))/(2*r);
        	
        	
        	
        	   
     }

   }

}

