
public class TestConteneurInteger {
	
	    public static void main(String[] args) {
	        // Créer un Conteneur pour des Integer
	        Conteneur<Integer> conteneurInteger = new Conteneur<>(42);

	        // Afficher l'élément
	        conteneurInteger.afficherElement(); // Affiche : L'élément est : 42

	        // Modifier l'élément
	        conteneurInteger.setElement(100);

	        // Afficher l'élément après modification
	        conteneurInteger.afficherElement(); // Affiche : L'élément est : 100

	        // Créer un autre Conteneur pour des Integer
	        Conteneur<Integer> autreConteneurInteger = new Conteneur<>(100);

	        // Comparer les deux conteneurs
	        System.out.println(conteneurInteger.comparer(autreConteneurInteger)); // Affiche : true
	    }
	}


