
public class Personne {
	private String nom;
	private String prenom;
	private int age;

	// methode constructeur
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne() {
		super();
	}

	// assesseurs
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// méthodes demandée par client
	public void methode1() {
		System.out.println("je suis dans la méthode 1 ");
		System.out.println("et je me sens bien");
	}

	// méthode demandée par le client
	public String methode2(String x) {
		return x;
	}

	public String methode3(Personne p) {
		return p.toString();
	}

	public int methode4(Personne p) {
		return p.getAge();
	}

	public void methode5() {
		for (int i = 0; i < 5; i++) {
			System.out.println("BONJOUR");
		}
	}

	public void methode6(int y) {
		for (int i = 0; i < y; i++) {
			System.out.println("BONJOUR2");
		}
	}

	public void methode7() {
		int i = 0;
		while (i < 5) {
			System.out.println("BONJOUR3");
			i++;
		}
	}

	public void methode8(int z) {
		int i = 0;
		while (i < z) {
			System.out.println("BONJOUR4");
			i++;
		}
	}

	public void methode9(int k) {
		switch (k) {
		case 0:
			System.out.println("la valeur de k est 0");
			break;
		case 1:
			System.out.println("la valeur de k est 1");
			break;
		default:
			System.out.println("la valeur de k est autre que 0 et 1");
			break;
		}
	}

	// redéfinition de la méthode toString
	@Override
	public String toString() {
		if (age != 0) {
			return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
		} else {
			return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
		}
	}

}
