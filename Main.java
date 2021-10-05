package laabs;

public class Main {
	 

	public static void main(String[] args) {
		
		
		
		Student dima = new Student(0,null, null, 0);
		
		
		dima.setAge(19);
		if(dima.age<18 || dima.age>70){
			
		}
		
		dima.setName("Tsutsyak Dmytriy I.");
		dima.setSex("male");
		dima.setGroup(2);
		Student yarik = new Student(0, null, null, 0);
		yarik.setAge(20);
		yarik.setName("Franko Yaroslav D.");
		yarik.setSex("male");
		yarik.setGroup(1);
		Student vitya = new Student(0, null, null, 0);
		vitya.setAge(18);
		vitya.setName("Pushko Viktor O.");
		vitya.setSex("male");
		vitya.setGroup(3);
		
		
		System.out.printf("Student ");
		System.out.printf(vitya.name);
		System.out.printf( ", Age:" );
		System.out.print( vitya.age );
		System.out.print( ", Gender:" );
		System.out.print( vitya.sex );
		System.out.print( ", Group:" );
		System.out.print( vitya.group );
		
	 }

}
