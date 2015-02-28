/**
 * 
 */

/**
 * @author Erik
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Person p = new Person("jdbc:postgresql://192.168.142.129/namegenerator?user=erik&password=abcc1233");
//		genPerson(p);
//		genTrainerSegler();
		genBoot();
	}
	
	public static void genBoot() {
		Boot b = new Boot();
		b.genNames();
		String[][][] p =b.getb();
		new WriteInserts(new String[]{"name","personen","tiefgang"},p[0],"boot");
	}
	
	
	
	public static void genTrainerSegler() {
		String[][][] person_subs = new String[2][1][10000];
		for(int i = 1 ; i <= 10000; i++){
			person_subs[0][0][i-1]= ""+i;
		}
		for(int i = 10001 ; i <= 20000; i++){
			person_subs[1][0][i-10001]= ""+i;
		}
		new WriteInserts(new String[]{"key"},person_subs[1],"segler");
		new WriteInserts(new String[]{"key"},person_subs[0],"trainer");
	}
	public static void genPerson(Person p) {
		String[][] names = new String[2][2000];
		names = p.getp();
		new WriteInserts(new String[]{"name","geburtsdatum"}, names, "person");
	}
}
