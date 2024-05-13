package Curs16;

public class PublicAdnotation {

	public static void main(String[] args) {

			Tester tester = new Tester();
			Developer developer = new Developer();
			
			
			if(tester.getClass().isAnnotationPresent(MostImportant.class)) {
				
				System.out.println("This employee is very important!");
				
			}else {
				
				System.out.println("This employee is NOT important!");

			}
			
		

	}

}
