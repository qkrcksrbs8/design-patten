package cg.park.designpattern.observer;

public class PreOrder {

    public static void main(String[] args) {
        PreorderData preorderData = new PreorderData();

        MeatShop meatShop           = new MeatShop(preorderData);
        FruitShop fruitShop         = new FruitShop(preorderData);
        VegetableShop vegetableShop = new VegetableShop(preorderData);
        FoodShop foodShop           = new FoodShop(preorderData);

        preorderData.setFoodMaterials(10, 20, 30);
        preorderData.setFoodMaterials(5, 20, 30);

        preorderData.removeObserver(vegetableShop);

        preorderData.setFoodMaterials(5, 10, 30);
    }
}
