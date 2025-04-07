package com.xworkz.simcardapp.simcard;

public class SimCardRunner {
    public static void main(String[] args) {

        SimCard sim1 = new SimCard();
        sim1.setSimId(1);
        sim1.setNetworkProvider("Jio");
        sim1.setSimType("Nano");
        sim1.setMobileNumber("9876543210");
        sim1.setIsActive(true);
        sim1.setPlanType("Prepaid");
        sim1.setBalance(199.00);

        int simId1 = sim1.getSimId();
        String provider1 = sim1.getNetworkProvider();
        String type1 = sim1.getSimType();
        String number1 = sim1.getMobileNumber();
        boolean active1 = sim1.getIsActive();
        String plan1 = sim1.getPlanType();
        double balance1 = sim1.getBalance();

        System.out.println("Sim1 ID is: " + simId1);
        System.out.println("Sim1 Network Provider is: " + provider1);
        System.out.println("Sim1 Type is: " + type1);
        System.out.println("Sim1 Mobile Number is: " + number1);
        System.out.println("Sim1 is Active: " + active1);
        System.out.println("Sim1 Plan Type is: " + plan1);
        System.out.println("Sim1 Balance is: ₹" + balance1);
        System.out.println("------------------------------------------------");

        SimCard sim2 = new SimCard();
        sim2.setSimId(2);
        sim2.setNetworkProvider("Airtel");
        sim2.setSimType("Micro");
        sim2.setMobileNumber("9988776655");
        sim2.setIsActive(true);
        sim2.setPlanType("Postpaid");
        sim2.setBalance(0.00);

        int simId2 = sim2.getSimId();
        String provider2 = sim2.getNetworkProvider();
        String type2 = sim2.getSimType();
        String number2 = sim2.getMobileNumber();
        boolean active2 = sim2.getIsActive();
        String plan2 = sim2.getPlanType();
        double balance2 = sim2.getBalance();

        System.out.println("Sim2 ID is: " + simId2);
        System.out.println("Sim2 Network Provider is: " + provider2);
        System.out.println("Sim2 Type is: " + type2);
        System.out.println("Sim2 Mobile Number is: " + number2);
        System.out.println("Sim2 is Active: " + active2);
        System.out.println("Sim2 Plan Type is: " + plan2);
        System.out.println("Sim2 Balance is: ₹" + balance2);
        System.out.println("------------------------------------------------");

        SimCard sim3 = new SimCard();
        sim3.setSimId(3);
        sim3.setNetworkProvider("Vi");
        sim3.setSimType("Nano");
        sim3.setMobileNumber("9123456780");
        sim3.setIsActive(false);
        sim3.setPlanType("Prepaid");
        sim3.setBalance(10.00);

        int simId3 = sim3.getSimId();
        String provider3 = sim3.getNetworkProvider();
        String type3 = sim3.getSimType();
        String number3 = sim3.getMobileNumber();
        boolean active3 = sim3.getIsActive();
        String plan3 = sim3.getPlanType();
        double balance3 = sim3.getBalance();

        System.out.println("Sim3 ID is: " + simId3);
        System.out.println("Sim3 Network Provider is: " + provider3);
        System.out.println("Sim3 Type is: " + type3);
        System.out.println("Sim3 Mobile Number is: " + number3);
        System.out.println("Sim3 is Active: " + active3);
        System.out.println("Sim3 Plan Type is: " + plan3);
        System.out.println("Sim3 Balance is: ₹" + balance3);
        System.out.println("------------------------------------------------");

        SimCard sim4 = new SimCard();
        sim4.setSimId(4);
        sim4.setNetworkProvider("BSNL");
        sim4.setSimType("Mini");
        sim4.setMobileNumber("9012345678");
        sim4.setIsActive(true);
        sim4.setPlanType("Postpaid");
        sim4.setBalance(0.00);

        int simId4 = sim4.getSimId();
        String provider4 = sim4.getNetworkProvider();
        String type4 = sim4.getSimType();
        String number4 = sim4.getMobileNumber();
        boolean active4 = sim4.getIsActive();
        String plan4 = sim4.getPlanType();
        double balance4 = sim4.getBalance();

        System.out.println("Sim4 ID is: " + simId4);
        System.out.println("Sim4 Network Provider is: " + provider4);
        System.out.println("Sim4 Type is: " + type4);
        System.out.println("Sim4 Mobile Number is: " + number4);
        System.out.println("Sim4 is Active: " + active4);
        System.out.println("Sim4 Plan Type is: " + plan4);
        System.out.println("Sim4 Balance is: ₹" + balance4);
        System.out.println("------------------------------------------------");

        SimCard sim5 = new SimCard();
        sim5.setSimId(5);
        sim5.setNetworkProvider("Jio");
        sim5.setSimType("eSIM");
        sim5.setMobileNumber("9876501234");
        sim5.setIsActive(true);
        sim5.setPlanType("Prepaid");
        sim5.setBalance(299.00);

        int simId5 = sim5.getSimId();
        String provider5 = sim5.getNetworkProvider();
        String type5 = sim5.getSimType();
        String number5 = sim5.getMobileNumber();
        boolean active5 = sim5.getIsActive();
        String plan5 = sim5.getPlanType();
        double balance5 = sim5.getBalance();

        System.out.println("Sim5 ID is: " + simId5);
        System.out.println("Sim5 Network Provider is: " + provider5);
        System.out.println("Sim5 Type is: " + type5);
        System.out.println("Sim5 Mobile Number is: " + number5);
        System.out.println("Sim5 is Active: " + active5);
        System.out.println("Sim5 Plan Type is: " + plan5);
        System.out.println("Sim5 Balance is: ₹" + balance5);
        System.out.println("------------------------------------------------");
    }
}
