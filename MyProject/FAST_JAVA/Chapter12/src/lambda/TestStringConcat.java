package lambda;

public class TestStringConcat{
    public static void main(String[] args){
        StringConImpl impl = new StringConImpl();
//        impl.makeString("hello", "world");

        StringConcat concat = (S, v) -> System.out.println(S + "," +v);
        concat.makeString("hello", "world");
    }
}
