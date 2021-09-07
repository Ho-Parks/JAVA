public class Main01 {

	public static void main(String[] args) {
			Army am = new Army("육군");
			Navy nv = new Navy("해군");
			AirForce af = new AirForce("공군");
			
			am.attack();
			am.tank();     
			
			nv.attack();
			nv.nucleus();
			
			af.attack();
			af.bombing();
	}

}
