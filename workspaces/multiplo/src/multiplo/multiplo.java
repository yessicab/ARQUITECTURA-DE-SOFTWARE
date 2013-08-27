package multiplo;

public class multiplo {
	public static void main (String args []){ 
		Scanner sc= new Scanner (System.in);
		System.out.println("escriba el numero: ");
		int A = sc.nextInt ();
		System.out.println("escriba el numero");
		int B = sc.nextInt () ;
		
		if (A%B==0) {
			System.out.println("el numero:"+B+" "+ "es multiplo de : "+A);
		}else 
				System.out.println("el numero:"+B+" "+ "no es multiplo de : "+A);
		
		if (A%2==0)
			System.out.println("el numero:"+A+" "+"es par");
		else
			System.out.println("el numero:"+A+" "+"es impar");
		if (B%2==0)
			System.out.println("el numero:"+B+" "+"es par");
		else
			System.out.println("el numero:"+B+" "+"es impar");
		
	
			
			
		}
		
	}


