import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {

		List<Personne> lPersonne = Arrays.asList(
				new Personne(10,"Toto"),
				new Personne(20,"Titi"),
				new Personne(30,"Tata"),
				new Personne(40,"Tutu"));
		
		Function<Personne, String> f1 = (Personne p) -> p.getNom();
		Function<Personne, Integer> f2 = (Personne p) -> p.getAge() * 2;
		

	}
	
	public static List<String> transformToListString(List<Personne> list, Function<Personne, String> func){
		
		List<String> ls = new ArrayList<>();
		
		
		return ls;
		
	}

}