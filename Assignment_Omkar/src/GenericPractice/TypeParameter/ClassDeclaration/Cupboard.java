package GenericPractice.TypeParameter.ClassDeclaration;


public class Cupboard<T> {
    private T content;


    public Cupboard(T content) {
        this.content = content;
    }


    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }


    public void displayCupboardContents() {
        System.out.println("Cupboard contains: " + content);
    }


}

