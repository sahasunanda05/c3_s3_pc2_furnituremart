package com.furniture;

public class FunitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem obj = new FurnitureItem();
        obj.setFurnitureCode(101);
        System.out.println("Furniture Code = " + obj.getFurnitureCode());
        obj.setFurnitureType("table");
        System.out.println("Furniture Type = " + obj.getFurnitureType());
        obj.setGradeOfFurniture("grade1");
        System.out.println("gradeOfFurniture = " + obj.getGradeOfFurniture());
        obj.setFurnitureUsage("outdoor");
        System.out.println("getFurnitureUsage = " + obj.getFurnitureUsage());
        obj.setPrice(10);
        System.out.println("price = $" + obj.getPrice());

        System.out.println("Discounted Price is = $" + obj.calculateDiscount());


    }
}
