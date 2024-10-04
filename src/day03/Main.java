package day03;

public class Main {
    


    public static void main(String[] args) {
        Monster m = new Monster();

        m.setName("Kaiju");
        m.setHitPoints(100);

        System.out.println(m);

        Link link = new Link();

        link.hit(m);
        
        System.out.println(m);
        System.out.println("-------------------\n");


        Godzilla g = new Godzilla();

        link.hit(g);

        System.out.println(g);

        Box b = new Box();
        link.hit(b);

        Dog d = new Dog();


        // link.hit(d);




    }



}
