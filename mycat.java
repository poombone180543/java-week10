package week10;


class fish{
	fish(){
		String name="rose \n";
		System.out.println("Class A "+ name);
	}
}

class mydog{
	mydog(){
		String name="lisa";
		System.out.println("Class B "+ name);
	}
}


public class mycat{
	
	mycat(){
		String name="pond";
		System.out.println("Cat C "+name);
	}
	
	String breed;
	String size;
	String color;
	int age;
	
	String eat;
	String sleep;
	String run;
		
	public void getdate() {
		System.out.println("Breed :"+breed);
		System.out.println("Size :"+size);
		System.out.println("Color :"+color);
		System.out.println("Age :"+age+"\n");
	}
	public void gethave() {
		System.out.println(eat);
		System.out.println(sleep);
		System.out.println(run);
	}
	public static void main(String[]args) {
		mycat a = new mycat();
		mycat b = new mycat();
		mydog c = new mydog();
		fish  d = new fish();
		a.breed="america";
		a.size ="small";
		a.color="white";
		a.age  = 5;
		
		b.eat = "cat eat fish";
		b.sleep = "cat like sleep";
		b.run = "cat like run";
		a.getdate();
		b.gethave();
		
		
		
		
	}
}