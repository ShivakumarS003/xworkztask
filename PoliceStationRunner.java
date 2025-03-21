class PoliceStationRunner {

    public static void main(String[] police) {

        PoliceStation station1 = new PoliceStation();
        station1.stationId = 101;
        station1.stationName = "City Police Station";
        station1.location = "Bangalore";
        station1.noOfOfficers = 150;
        station1.jurisdictionArea = "Central Bangalore";
        System.out.println("Station1 ID: " + station1.stationId);
        System.out.println("Station1 Name: " + station1.stationName);
        System.out.println("Location: " + station1.location);
        System.out.println("Number of Officers: " + station1.noOfOfficers);
        System.out.println("Jurisdiction Area: " + station1.jurisdictionArea);

        PoliceStation station2 = new PoliceStation();
        station2.stationId = 102;
        station2.stationName = "West End Police Station";
        station2.location = "Mumbai";
        station2.noOfOfficers = 200;
        station2.jurisdictionArea = "Andheri West";
        System.out.println("Station2 ID: " + station2.stationId);
        System.out.println("Station2 Name: " + station2.stationName);
        System.out.println("Location: " + station2.location);
        System.out.println("Number of Officers: " + station2.noOfOfficers);
        System.out.println("Jurisdiction Area: " + station2.jurisdictionArea);

        PoliceStation station3 = new PoliceStation();
        station3.stationId = 103;
        station3.stationName = "North Police Station";
        station3.location = "Delhi";
        station3.noOfOfficers = 120;
        station3.jurisdictionArea = "North Delhi";
        System.out.println("Station3 ID: " + station3.stationId);
        System.out.println("Station3 Name: " + station3.stationName);
        System.out.println("Location: " + station3.location);
        System.out.println("Number of Officers: " + station3.noOfOfficers);
        System.out.println("Jurisdiction Area: " + station3.jurisdictionArea);

        PoliceStation station4 = new PoliceStation();
        station4.stationId = 104;
        station4.stationName = "South Police Station";
        station4.location = "Chennai";
        station4.noOfOfficers = 180;
        station4.jurisdictionArea = "T Nagar";
        System.out.println("Station4 ID: " + station4.stationId);
        System.out.println("Station4 Name: " + station4.stationName);
        System.out.println("Location: " + station4.location);
        System.out.println("Number of Officers: " + station4.noOfOfficers);
        System.out.println("Jurisdiction Area: " + station4.jurisdictionArea);

        PoliceStation station5 = new PoliceStation();
        station5.stationId = 105;
        station5.stationName = "East Police Station";
        station5.location = "Kolkata";
        station5.noOfOfficers = 160;
        station5.jurisdictionArea = "Salt Lake City";
        System.out.println("Station5 ID: " + station5.stationId);
        System.out.println("Station5 Name: " + station5.stationName);
        System.out.println("Location: " + station5.location);
        System.out.println("Number of Officers: " + station5.noOfOfficers);
        System.out.println("Jurisdiction Area: " + station5.jurisdictionArea);
    }
}