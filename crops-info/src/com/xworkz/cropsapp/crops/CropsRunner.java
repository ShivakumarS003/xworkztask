package com.xworkz.cropsapp.crops;

public class CropsRunner {
    public static void main(String[] args) {

        Crops crop1 = new Crops();
        crop1.setCropId(1);
        crop1.setName("Wheat");
        crop1.setSeason("Rabi");
        crop1.setType("Cereal");
        crop1.setSoilType("Loamy");
        crop1.setPricePerKg(25.50);
        crop1.setOrigin("Punjab");

        int crop1Id = crop1.getCropId();
        String name1 = crop1.getName();
        String season1 = crop1.getSeason();
        String type1 = crop1.getType();
        String soilType1 = crop1.getSoilType();
        double pricePerKg1 = crop1.getPricePerKg();
        String origin1 = crop1.getOrigin();

        System.out.println("Crop1 Id is: " + crop1Id);
        System.out.println("Crop1 Name is: " + name1);
        System.out.println("Crop1 Season is: " + season1);
        System.out.println("Crop1 Type is: " + type1);
        System.out.println("Crop1 Soil Type is: " + soilType1);
        System.out.println("Price per Kg of Crop1 is: " + pricePerKg1);
        System.out.println("Crop1 Origin is: " + origin1);
        System.out.println("-----------------------------------------------------");

        Crops crop2 = new Crops();
        crop2.setCropId(2);
        crop2.setName("Rice");
        crop2.setSeason("Kharif");
        crop2.setType("Cereal");
        crop2.setSoilType("Clayey");
        crop2.setPricePerKg(30.00);
        crop2.setOrigin("West Bengal");

        int crop2Id = crop2.getCropId();
        String name2 = crop2.getName();
        String season2 = crop2.getSeason();
        String type2 = crop2.getType();
        String soilType2 = crop2.getSoilType();
        double pricePerKg2 = crop2.getPricePerKg();
        String origin2 = crop2.getOrigin();

        System.out.println("Crop2 Id is: " + crop2Id);
        System.out.println("Crop2 Name is: " + name2);
        System.out.println("Crop2 Season is: " + season2);
        System.out.println("Crop2 Type is: " + type2);
        System.out.println("Crop2 Soil Type is: " + soilType2);
        System.out.println("Price per Kg of Crop2 is: " + pricePerKg2);
        System.out.println("Crop2 Origin is: " + origin2);
        System.out.println("-----------------------------------------------------");

        Crops crop3 = new Crops();
        crop3.setCropId(3);
        crop3.setName("Cotton");
        crop3.setSeason("Kharif");
        crop3.setType("Cash Crop");
        crop3.setSoilType("Black");
        crop3.setPricePerKg(60.00);
        crop3.setOrigin("Maharashtra");

        int crop3Id = crop3.getCropId();
        String name3 = crop3.getName();
        String season3 = crop3.getSeason();
        String type3 = crop3.getType();
        String soilType3 = crop3.getSoilType();
        double pricePerKg3 = crop3.getPricePerKg();
        String origin3 = crop3.getOrigin();

        System.out.println("Crop3 Id is: " + crop3Id);
        System.out.println("Crop3 Name is: " + name3);
        System.out.println("Crop3 Season is: " + season3);
        System.out.println("Crop3 Type is: " + type3);
        System.out.println("Crop3 Soil Type is: " + soilType3);
        System.out.println("Price per Kg of Crop3 is: " + pricePerKg3);
        System.out.println("Crop3 Origin is: " + origin3);
        System.out.println("-----------------------------------------------------");

        Crops crop4 = new Crops();
        crop4.setCropId(4);
        crop4.setName("Sugarcane");
        crop4.setSeason("Annual");
        crop4.setType("Commercial");
        crop4.setSoilType("Alluvial");
        crop4.setPricePerKg(20.00);
        crop4.setOrigin("Uttar Pradesh");

        int crop4Id = crop4.getCropId();
        String name4 = crop4.getName();
        String season4 = crop4.getSeason();
        String type4 = crop4.getType();
        String soilType4 = crop4.getSoilType();
        double pricePerKg4 = crop4.getPricePerKg();
        String origin4 = crop4.getOrigin();

        System.out.println("Crop4 Id is: " + crop4Id);
        System.out.println("Crop4 Name is: " + name4);
        System.out.println("Crop4 Season is: " + season4);
        System.out.println("Crop4 Type is: " + type4);
        System.out.println("Crop4 Soil Type is: " + soilType4);
        System.out.println("Price per Kg of Crop4 is: " + pricePerKg4);
        System.out.println("Crop4 Origin is: " + origin4);
        System.out.println("-----------------------------------------------------");

        Crops crop5 = new Crops();
        crop5.setCropId(5);
        crop5.setName("Potato");
        crop5.setSeason("Rabi");
        crop5.setType("Vegetable");
        crop5.setSoilType("Sandy");
        crop5.setPricePerKg(15.00);
        crop5.setOrigin("Bihar");

        int crop5Id = crop5.getCropId();
        String name5 = crop5.getName();
        String season5 = crop5.getSeason();
        String type5 = crop5.getType();
        String soilType5 = crop5.getSoilType();
        double pricePerKg5 = crop5.getPricePerKg();
        String origin5 = crop5.getOrigin();

        System.out.println("Crop5 Id is: " + crop5Id);
        System.out.println("Crop5 Name is: " + name5);
        System.out.println("Crop5 Season is: " + season5);
        System.out.println("Crop5 Type is: " + type5);
        System.out.println("Crop5 Soil Type is: " + soilType5);
        System.out.println("Price per Kg of Crop5 is: " + pricePerKg5);
        System.out.println("Crop5 Origin is: " + origin5);
        System.out.println("-----------------------------------------------------");
    }
}
