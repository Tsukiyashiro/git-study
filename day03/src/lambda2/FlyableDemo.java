package lambda2;

public class FlyableDemo {
    public static void main(String[] args) {
        useFly(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("起飞");
            }
        });
        /*useFly((String s) -> {
            System.out.println(s);
            System.out.println("飞机自驾游");
        });*/
        useFly((String s)->{
            System.out.println(s+"fly");
        });
    }

    public static void useFly(Flyable f){
        f.fly("风和日丽，阳光正好");
    }
}
