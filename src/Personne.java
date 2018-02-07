
public class Personne {

	protected int age;
	protected String nom;
	
	public Personne() {
	}
	
	public Personne(int a, String n){
		this.age = a;
		this.nom = n;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Personne [age=" + age + ", nom=" + nom + "]";
	}
	
	
	
}
