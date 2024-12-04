public class Conteneur<T> {
    // Attribut privé de type T pour stocker l'élément
    private T element;

    // Constructeur pour initialiser l'élément
    public Conteneur(T element) {
        this.element = element;
    }

    // Méthode pour accéder à l'élément
    public T getElement() {
        return element;
    }

    // Méthode pour modifier l'élément
    public void setElement(T element) {
        this.element = element;
    }

    // Méthode pour afficher l'élément
    public void afficherElement() {
        System.out.println("L'élément est : " + element);
    }

    // Méthode pour comparer l'élément avec celui d'un autre conteneur
    public boolean comparer(Conteneur<T> autreConteneur) {
        return this.element.equals(autreConteneur.getElement());
    }
}
