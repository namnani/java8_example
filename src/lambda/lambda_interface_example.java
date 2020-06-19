package lambda;

public class lambda_interface_example {
    public static void main(String[] args) {
        MyFunction mf = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        MyFunction mf2 = (a, b) -> {
            return a > b ? a : b;
        };

        MyFunction mf3 = (a, b) ->
                a > b ? a : b;

        System.out.println(mf.max(4, 3));
        System.out.println(mf2.max(3, 4));
        System.out.println(mf3.max(3, 4));
    }
}

interface MyFunction {
    public abstract int max(int a, int b);
}
