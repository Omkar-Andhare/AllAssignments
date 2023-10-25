package PassByRef;


 class Mug {

    private String contents;


    public Mug(String contents) {
        this.contents = contents;

    }


    public String getContents() {
        return contents;

    }


    public void setContents(String contents) {
        this.contents = contents;

    }

}


public class Run {


    public static void spill(Mug mugToBeSpilled) {
        mugToBeSpilled.setContents("Nothing");

    }


    public static void main(String args[]) {
        Mug myMug = new Mug("Tea"); // myMug contains "Tea".
        System.out.println(myMug.getContents());

        spill(myMug);  // myMug now contains "Nothing".
        System.out.println(myMug.getContents());

    }

}

