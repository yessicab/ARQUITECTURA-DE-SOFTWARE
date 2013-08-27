
public class abc {
	int dt,suel;
	double fes,noc,dom,he;
	
	double sueldo(int dt,int suel){
		double total=suel/30*dt;
		return total;
	}
	double sueldo(int fes,int noc,int  dom,double suel,int dt){
		double total =suel/240*(fes*1.75+noc*1.25+dom*2.25);
		return total;
	}
	int va,can,iva;
	int factura(int va,int can){
		int total=va*can;
		return total;
	}
	double factura(int va, int can, int iva){
		double total=((va*can)+((va*can)*0.16));
		return total;
	}
	int np,cs,dir,tel;
	void pedido(int np, int cs,int dir){
		this.np=np;
		this.cs=cs;
		this.dir=dir;
	}
	void pedido(int np, int cs){
		this.np=np;
		this.cs=cs;
	}
	void pedido(int np,int cs, int dir,int tel){
		this.np=np;
		this.cs=cs;
		this.dir=dir;
		this.tel=tel;
	}
	public static void main(String[] args) {
		abc tra=new abc();
		System.out.println(tra.sueldo(15, 500000));
		System.out.println(tra.factura(2000, 5));
		
	}

}
