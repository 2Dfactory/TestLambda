import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Essai de redefinition des méthodes d'interface fonctionnelle avec les lambdas
 */
public class TestPredicate {

	public static void main(String[] args) {

		boolean variante = false;
		
		List<Personne> lPersonne = Arrays.asList(
				new Personne(10,"Toto"),
				new Personne(20,"Titi"),
				new Personne(30,"Tata"),
				new Personne(40,"Tutu"));
		
		//Redéfinition de la méthode de l'interface fonctionnelle Predicate
		//Teste si l'âge est supérieur à 20
		Predicate<Personne> predicate = (Personne p) -> p.getAge() > 20;
		
		for(Personne p : lPersonne){
			if(predicate.test(p)) System.out.println(p.getNom() + " a l'âge requis.");
		}
			
	}	

}
