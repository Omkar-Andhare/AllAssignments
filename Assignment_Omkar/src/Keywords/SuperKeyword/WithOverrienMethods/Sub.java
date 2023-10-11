package Keywords.SuperKeyword.WithOverrienMethods;
public class Sub extends Base {


    @Override
    public void m1() {
        System.out.println("Sub class method here");
        super.m1();// not  recommeded

    }
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.m1();
    }
}
