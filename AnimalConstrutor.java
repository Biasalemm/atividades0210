package Atividade0210;

public class AnimalConstrutor {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal (65.00f,"Branco");
		Animal animal2 = new Animal (28.00f,"Preto");
		
		System.out.println(animal1.getTamanho());
		System.out.println(animal1.getCor());
		
		System.out.println(animal2.getTamanho());
		System.out.println(animal2.getCor());

	}

}
