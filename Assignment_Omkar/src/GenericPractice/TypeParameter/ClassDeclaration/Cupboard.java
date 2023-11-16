package GenericPractice.TypeParameter.ClassDeclaration;

// Generic class with a type parameter 'T'
public class Cupboard<T> {
    private T content;

    // Constructor
    public Cupboard(T content) {
        this.content = content;
    }

    // Getter and setter methods
    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    // Method that works with the generic type
    public void displayCupboardContents() {
        System.out.println("Cupboard contains: " + content);
    }


}

