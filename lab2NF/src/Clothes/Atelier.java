package Clothes;

public class Atelier {
    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof MensСlothing) {
                ((MensСlothing) item).dressMan();
            }
        }
    }
    public void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof WomensСlothing) {
                ((WomensСlothing) item).dressWoman();
            }
        }
    }
}
