package lambda3;

public class AddableDemo {
    public static void main(String[] args) {
        useAdd(new Addable() {
            @Override
            public int add(int x, int y) {
                return x * y;
            }
        });

        useAdd((int x, int y) -> {
            return x + y;
        });


    }

    private static void useAdd(Addable addable) {
        int z = addable.add(10, 60);
        System.out.println(z);
    }
}
