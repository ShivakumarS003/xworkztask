package com.xworkz.toString.restraunt;

public class RestaurantRunner {
    public static void main(String[] args) {
        RestaurantDto restaurant = new RestaurantDto();
        restaurant.setName("The Royal Feast");
        restaurant.setCuisineType("Indian");
        restaurant.setLocation("Delhi");
        restaurant.setRating(5);
        restaurant.setEmployeeCount(25);

        System.out.println(restaurant);
    }
}
