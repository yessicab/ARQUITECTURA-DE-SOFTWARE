
public class condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double y=1,x=2,z=3;
	
	if (Math.sqrt(x)*Math.sqrt(x)==x){
		System.out.println(x+" tiene una raiz exacta");
	}else{System.out.println(x+" tiene una raiz inexacta");}
	

	if(x%2==0){
		System.out.println(x+" es par");
		
	}else{System.out.println(x+" es impar");}
	if(y%2==0){
		System.out.println(y+" es par");
		
	}else{System.out.println(y+" es impar");}
	if(y%2==0){
		System.out.println(z+" es par");
		
	}else{System.out.println(z+" es impar");}
	if (x>y){ 
		if (x>z){
			if (y>z){
				
				System.out.println("el resultado de mayor a menor es        "        +x    +y+     z);
			}else{
				System.out.println("el resultado de mayor a menor es         "            +x+z+y);	
			}
			
		}else{System.out.println("el resultado de mayor a menor e      "       +   z    +    x     +    y);
			
		}
		
			
	}else if(x>z){
		if(y>z){System.out.println("el resultado de mayor a menor es          "        +y+x+z);
			
		}else{System.out.println("el resultado de mayor a menor es           "       +z+y+x);
			
		}
	}else{System.out.println("el resultado de mayor a menor es       "+y+z+x);}
	
	
	}

}
