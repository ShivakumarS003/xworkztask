package com.xworkz.tilesapp.tiles;

public class TilesRunner {
    public static void main(String[] args) {

        Tiles tiles1 = new Tiles();
        tiles1.setTileId(1);
        tiles1.setBrand("Kajaria");
        tiles1.setMaterial("Ceramic");
        tiles1.setColor("Beige");
        tiles1.setSize("600x600 mm");
        tiles1.setPrice(45.50);
        tiles1.setSurfaceType("Glossy");

        int tile1Id = tiles1.getTileId();
        String brand1 = tiles1.getBrand();
        String material1 = tiles1.getMaterial();
        String color1 = tiles1.getColor();
        String size1 = tiles1.getSize();
        double price1 = tiles1.getPrice();
        String surfaceType1 = tiles1.getSurfaceType();

        System.out.println("Tile1 Id is: " + tile1Id);
        System.out.println("Tile1 Brand is: " + brand1);
        System.out.println("Tile1 Material is: " + material1);
        System.out.println("Tile1 Color is: " + color1);
        System.out.println("Tile1 Size is: " + size1);
        System.out.println("Price of Tile1 is: " + price1);
        System.out.println("Tile1 Surface Type is: " + surfaceType1);
        System.out.println("-----------------------------------------------------");

        Tiles tiles2 = new Tiles();
        tiles2.setTileId(2);
        tiles2.setBrand("Somany");
        tiles2.setMaterial("Porcelain");
        tiles2.setColor("Grey");
        tiles2.setSize("300x300 mm");
        tiles2.setPrice(40.00);
        tiles2.setSurfaceType("Matte");

        int tile2Id = tiles2.getTileId();
        String brand2 = tiles2.getBrand();
        String material2 = tiles2.getMaterial();
        String color2 = tiles2.getColor();
        String size2 = tiles2.getSize();
        double price2 = tiles2.getPrice();
        String surfaceType2 = tiles2.getSurfaceType();

        System.out.println("Tile2 Id is: " + tile2Id);
        System.out.println("Tile2 Brand is: " + brand2);
        System.out.println("Tile2 Material is: " + material2);
        System.out.println("Tile2 Color is: " + color2);
        System.out.println("Tile2 Size is: " + size2);
        System.out.println("Price of Tile2 is: " + price2);
        System.out.println("Tile2 Surface Type is: " + surfaceType2);
        System.out.println("-----------------------------------------------------");

        Tiles tiles3 = new Tiles();
        tiles3.setTileId(3);
        tiles3.setBrand("Johnson");
        tiles3.setMaterial("Vitrified");
        tiles3.setColor("White");
        tiles3.setSize("800x800 mm");
        tiles3.setPrice(55.75);
        tiles3.setSurfaceType("Polished");

        int tile3Id = tiles3.getTileId();
        String brand3 = tiles3.getBrand();
        String material3 = tiles3.getMaterial();
        String color3 = tiles3.getColor();
        String size3 = tiles3.getSize();
        double price3 = tiles3.getPrice();
        String surfaceType3 = tiles3.getSurfaceType();

        System.out.println("Tile3 Id is: " + tile3Id);
        System.out.println("Tile3 Brand is: " + brand3);
        System.out.println("Tile3 Material is: " + material3);
        System.out.println("Tile3 Color is: " + color3);
        System.out.println("Tile3 Size is: " + size3);
        System.out.println("Price of Tile3 is: " + price3);
        System.out.println("Tile3 Surface Type is: " + surfaceType3);
        System.out.println("-----------------------------------------------------");

        Tiles tiles4 = new Tiles();
        tiles4.setTileId(4);
        tiles4.setBrand("Orientbell");
        tiles4.setMaterial("Ceramic");
        tiles4.setColor("Black");
        tiles4.setSize("450x450 mm");
        tiles4.setPrice(38.25);
        tiles4.setSurfaceType("Textured");

        int tile4Id = tiles4.getTileId();
        String brand4 = tiles4.getBrand();
        String material4 = tiles4.getMaterial();
        String color4 = tiles4.getColor();
        String size4 = tiles4.getSize();
        double price4 = tiles4.getPrice();
        String surfaceType4 = tiles4.getSurfaceType();

        System.out.println("Tile4 Id is: " + tile4Id);
        System.out.println("Tile4 Brand is: " + brand4);
        System.out.println("Tile4 Material is: " + material4);
        System.out.println("Tile4 Color is: " + color4);
        System.out.println("Tile4 Size is: " + size4);
        System.out.println("Price of Tile4 is: " + price4);
        System.out.println("Tile4 Surface Type is: " + surfaceType4);
        System.out.println("-----------------------------------------------------");

        Tiles tiles5 = new Tiles();
        tiles5.setTileId(5);
        tiles5.setBrand("Nitco");
        tiles5.setMaterial("Porcelain");
        tiles5.setColor("Brown");
        tiles5.setSize("600x1200 mm");
        tiles5.setPrice(62.00);
        tiles5.setSurfaceType("Glossy");

        int tile5Id = tiles5.getTileId();
        String brand5 = tiles5.getBrand();
        String material5 = tiles5.getMaterial();
        String color5 = tiles5.getColor();
        String size5 = tiles5.getSize();
        double price5 = tiles5.getPrice();
        String surfaceType5 = tiles5.getSurfaceType();

        System.out.println("Tile5 Id is: " + tile5Id);
        System.out.println("Tile5 Brand is: " + brand5);
        System.out.println("Tile5 Material is: " + material5);
        System.out.println("Tile5 Color is: " + color5);
        System.out.println("Tile5 Size is: " + size5);
        System.out.println("Price of Tile5 is: " + price5);
        System.out.println("Tile5 Surface Type is: " + surfaceType5);
        System.out.println("-----------------------------------------------------");
    }
}
