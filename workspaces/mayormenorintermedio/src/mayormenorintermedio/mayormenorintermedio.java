package mayormenorintermedio;

public class mayormenorintermedio {
	static double A=10, B=5, C=15;
	public static void main (String t []){
			if(A%2==0)
				System.out.println(A+"ES PAR");
		    else
				System.out.println(A+"ES IMPAR");
			if(B%2==0)
				System.out.println(B+"ES PAR");
			else{
				System.out.println(B+"ES IMPAR");
			if(C%2==0)
				System.out.println(C+"ES PAR");
			else
				System.out.println(B+"ES IMPAR");
			if(Math.sqrt(A)*Math.sqrt(A)==A)
				System.out.println(Math.sqrt(A)+"RAIZ EXACTA");
			else
				System.out.println(Math.sqrt(A)+"RAIZ NO EXACTA");
			if(Math.sqrt(B)*Math.sqrt(B)==B)
				System.out.println(Math.sqrt(B)+"RAIZ EXACTA");
			else
				System.out.println(Math.sqrt(B)+"RAIZ NO EXACTA");
			if(Math.sqrt(C)*Math.sqrt(C)==C)
				System.out.println(Math.sqrt(C)+"RAIZ EXACTA");
			else
				System.out.println(Math.sqrt(C)+"RAIZ NO EXACTA");
				
		if(A>B)
			if(A>C)
				if(B>C)
					System.out.println(""+A+" "+B+" "+C);
				else
					System.out.println(""+A+" "+C+" "+B);
			    else
			    	System.out.println(""+C+" "+A+" "+B);
		else if(B>C)
			    if(A>C)
			    	System.out.println(""+B+" "+A+" "+C);
			    else
			    	System.out.println(""+B+" "+C+" "+A);
		        else 
		        	System.out.println(""+C+" "+B+" "+A);
		
	       }

        }

    }
				
		