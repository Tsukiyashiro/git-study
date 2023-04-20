package lambda;

public class Test {
    public static void main(String[] args) {
        Eatable eatable = new EatableImp();
        eat(eatable);
        eat(new Eatable() {
            @Override
            public void eat() {
                System.out.println("吃什么呢");
            }
        });
        eat(()->{
            System.out.println("吃锤子");
        });



    }

    private static void eat(Eatable e){
        e.eat();
    }
}
