package Lector3.lesson1;

public class lesson1 {
    public static void main(String args[]){
        Flower flower1 = new Rose();
        System.out.println("Rose: " + flower1.getPrice());
        Flower flower3 = new Tyulpan();
        System.out.println("Tyulpan: " + flower3.getPrice());
        Flower flower4 = new Lilius();
        System.out.println("Lilius: " + flower4.getPrice());
        Flower flower5 = new Chrizanteums();
        System.out.println("Chrizanteums: " + flower5.getPrice());

        Flower f1 = new Rose();
        Flower f2 = new Tyulpan();
        Flower f3 = new Chrizanteums();

        Flower f4 = new Rose();
        Flower f5 = new Tyulpan();
        Flower f6 = new Rose();
        Flower f7 = new Lilius();
        Flower f8 = new Rose();

        Flower f9 = new Rose();
        Flower f10 = new Chrizanteums();
        Flower f11 = new Tyulpan();
        Flower f12 = new Lilius();


        Flower[] buket1 = {f1,f2,f3};
        Flower[] buket2 = {f4,f5,f6,f7,f8};
        Flower[] buket3 = {f9,f10,f11,f12};

        System.out.println("Buket1: " + Flower.getBuketPrice(buket1));
        System.out.println("Buket2: " + Flower.getBuketPrice(buket2));
        System.out.println("Buket3: " + Flower.getBuketPrice(buket3));

        Flower[][] bukets = {buket1, buket2, buket3};
        System.out.println("Flower count in all bukets: " + Flower.getFlowerCount(bukets));

    }
}
