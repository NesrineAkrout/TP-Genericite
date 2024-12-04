
public class TestConteneurString {

	    public static void main(String[] args) {
	        // Créer un Conteneur pour des String
	        Conteneur<String> conteneurString = new Conteneur<>("Bonjour");

	        // Afficher l'élément
	        conteneurString.afficherElement(); // Affiche : L'élément est : Bonjour

	        // Modifier l'élément
	        conteneurString.setElement("Salut");

	        // Afficher l'élément après modification
	        conteneurString.afficherElement(); // Affiche : L'élément est : Salut

	        // Créer un autre Conteneur pour des String
	        Conteneur<String> autreConteneurString = new Conteneur<>("Salut");

	        // Comparer les deux conteneurs
	        System.out.println(conteneurString.comparer(autreConteneurString)); // Affiche : true
	    }
	}


