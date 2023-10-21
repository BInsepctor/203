import Clothes.*;

public class Main{
    public static void main(String[] args) {
//        Vector v = new Vector(1,1,3,3);
//        Vector c = new Vector(3,3,9,9);
//        System.out.println(Vector.scalarProduct(c,v));
//        System.out.println(Vector.vectorLength(v));
//        Vector newV = Vector.multiplyingVectorOnNumber(v,3);
//        Vector.printVector(newV);
//        Vector.printVector(Vector.sumVectors(v,c));
//        Vector.printVector(Vector.minusVectors(c,v));
        Clothes[] clothes = {
                new Tshirt(ClothingSize.M, 25.99, "Синяя"),
                new Tshirt(ClothingSize.XXS, 19.99, "Розовая"),
                new Trousers(ClothingSize.L, 49.99, "Черные"),
                new Trousers(ClothingSize.S, 39.99, "Серые"),
                new Skirt(ClothingSize.S, 29.99, "Зеленая"),
                new Tie(ClothingSize.XS, 14.99, "Красный")
        };

        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        atelier.dressWoman(clothes);

    }
}
