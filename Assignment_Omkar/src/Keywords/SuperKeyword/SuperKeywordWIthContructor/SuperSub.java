package Keywords.SuperKeyword.SuperKeywordWIthContructor;

public class SuperSub extends SuperBase {
    public SuperSub(String str) {
        super(str);
    }

    public static void main(String[] args) {
        SuperSub sub = new SuperSub("hello");
    }
}
