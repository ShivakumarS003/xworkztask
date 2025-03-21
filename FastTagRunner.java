class FastTagRunner {

    public static void main(String fast[]) {

        FastTag tag1 = new FastTag();
        tag1.tagId = "FT001";
        tag1.vehicleNumber = "KA01AB1234";
        tag1.ownerName = "Ravi Kumar";
        tag1.vehicleType = "Car";
        tag1.balance = 500.75;
        System.out.println("Tag1 ID: " + tag1.tagId);
        System.out.println("Vehicle Number: " + tag1.vehicleNumber);
        System.out.println("Owner Name: " + tag1.ownerName);
        System.out.println("Vehicle Type: " + tag1.vehicleType);
        System.out.println("Balance: " + tag1.balance);

        FastTag tag2 = new FastTag();
        tag2.tagId = "FT002";
        tag2.vehicleNumber = "MH12CD5678";
        tag2.ownerName = "Anjali Desai";
        tag2.vehicleType = "Bike";
        tag2.balance = 250.50;
        System.out.println("Tag2 ID: " + tag2.tagId);
        System.out.println("Vehicle Number: " + tag2.vehicleNumber);
        System.out.println("Owner Name: " + tag2.ownerName);
        System.out.println("Vehicle Type: " + tag2.vehicleType);
        System.out.println("Balance: " + tag2.balance);

        FastTag tag3 = new FastTag();
        tag3.tagId = "FT003";
        tag3.vehicleNumber = "TN01EF4321";
        tag3.ownerName = "Vikram Singh";
        tag3.vehicleType = "Truck";
        tag3.balance = 1000.00;
        System.out.println("Tag3 ID: " + tag3.tagId);
        System.out.println("Vehicle Number: " + tag3.vehicleNumber);
        System.out.println("Owner Name: " + tag3.ownerName);
        System.out.println("Vehicle Type: " + tag3.vehicleType);
        System.out.println("Balance: " + tag3.balance);

        FastTag tag4 = new FastTag();
        tag4.tagId = "FT004";
        tag4.vehicleNumber = "DL03GH9876";
        tag4.ownerName = "Priya Gupta";
        tag4.vehicleType = "Car";
        tag4.balance = 700.25;
        System.out.println("Tag4 ID: " + tag4.tagId);
        System.out.println("Vehicle Number: " + tag4.vehicleNumber);
        System.out.println("Owner Name: " + tag4.ownerName);
        System.out.println("Vehicle Type: " + tag4.vehicleType);
        System.out.println("Balance: " + tag4.balance);

        FastTag tag5 = new FastTag();
        tag5.tagId = "FT005";
        tag5.vehicleNumber = "UP14XY1234";
        tag5.ownerName = "Rahul Sharma";
        tag5.vehicleType = "Bus";
        tag5.balance = 1500.50;
        System.out.println("Tag5 ID: " + tag5.tagId);
        System.out.println("Vehicle Number: " + tag5.vehicleNumber);
        System.out.println("Owner Name: " + tag5.ownerName);
        System.out.println("Vehicle Type: " + tag5.vehicleType);
        System.out.println("Balance: " + tag5.balance);
    }
}