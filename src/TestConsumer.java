import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;;

/*
 * Essai de redefinition des méthodes d'interface fonctionnelle avec les lambdas
 */
public class TestConsumer {

	public static void main(String[] args) {

		boolean variante = false;
		
		List<Personne> lPersonne = Arrays.asList(
				new Personne(10,"Toto"),
				new Personne(20,"Titi"),
				new Personne(30,"Tata"),
				new Personne(40,"Tutu"));
		
		System.out.println(lPersonne);
		
		//Redéfinition de la méthode de l'interface fonctionnelle Consumer
		Consumer<Personne> c = (Personne p) -> p.setAge(p.getAge() + 13);
		
		for(Personne p : lPersonne) c.accept(p);
		
		System.out.println(lPersonne);
			
	}	

}
