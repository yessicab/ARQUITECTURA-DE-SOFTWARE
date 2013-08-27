
public class formato {
	int edad, telefono;
	String nombre;
	boolean sexo;
	formato (int edad,String nombre) {
		this.nombre=nombre;
		this.edad=edad;
	}
	formato (int edad,String nombre,boolean sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}	
	String comprobar(){
		if(edad<18){
			return "menor";
		}
		else {
			return "mayor";
		}
		
		
	}
		public static void main(String r[]){
			formato X=new formato(12,"guillermo");
			System.out.println(X.comprobar());
			X.comprobar(80,"memo");
		}
	
	void comprobar(int edad,String nombre){
		if(edad>=0 && edad<=7){
			System.out.println("niño");
		}
		else if(edad>7 && edad<=15){
			System.out.println("puber");
		}
		else if(edad>15 && edad<=18){
			System.out.println("adolescente");
		}
		else if(edad>18 && edad<=25){
			System.out.println("joven");
		}
		else if(edad>25 && edad<=50){
			System.out.println("mayor");
		}
		
		else if (edad>50 && edad<=120){
			System.out.println("anciano");
		}
		else System.out.println("edad inexistente");
	}
	}


