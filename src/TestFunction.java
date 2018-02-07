import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
 * Essai de redefinition des m�thodes d'interface fonctionnelle avec les lambdas
 */
public class TestFunction {

	public static void main(String[] args) {

		boolean variante = false;
		
		List<Personne> lPersonne = Arrays.asList(
				new Personne(10,"Toto"),
				new Personne(20,"Titi"),
				new Personne(30,"Tata"),
				new Personne(40,"Tutu"));

			
		if (variante) {
			//red�finition de la m�thode de l'interface fonctionnelle Function<T, U>
			Function<Personne, String> f1 = (Personne p) -> p.getNom();
			Function<Personne, Integer> f2 = (Personne p) -> p.getAge() * 2;
			
			System.out.println(transformToListString(lPersonne, f1));
			System.out.println(transformToListInt(lPersonne, f2));
		}
		else {
			//red�finition de la m�thode de l'interface fonctionnelle Function<T, U>
			Function<Personne, String> f1 = (Personne p) -> p.getNom();
			Function<Personne, Integer> f2 = (Personne p) -> p.getAge();
			Function<Integer, Integer> f3 = (Integer a) -> a * 2;
			
			System.out.println("Essai avec la m�thode par d�faut \"andThen\"");
			System.out.println(transformToListString(lPersonne, f1));
			System.out.println(transformToListInt(lPersonne, f2.andThen(f3)));
		}
		
		

	}
	
	public static List<String> transformToListString(List<Personne> list, Function<Personne, String> func){
		
		List<String> ls = new ArrayList<>();
		
		for(Personne p : list){
			//func.apply(p) retournera ici le nom de l'objet Personne
			ls.add(func.apply(p));
		}
		
		return ls;
		
	}
	
	public static List<Integer> transformToListInt(List<Personne> list, Function<Personne, Integer> func){
		
		List<Integer> ls = new ArrayList<>();
		
		for(Personne p : list){
			//func.apply(p) retournera ici l'age de l'objet Personne multipli� par 2 (voir la red�finition de la m�thode de l'interface)
			ls.add(func.apply(p));
		}
		
		return ls;
		
	}

}
