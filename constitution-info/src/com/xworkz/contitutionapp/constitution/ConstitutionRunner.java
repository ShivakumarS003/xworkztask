package com.xworkz.contitutionapp.constitution;

public class ConstitutionRunner {
    public static void main(String[] args) {

        Constitution c1 = new Constitution();
        c1.setConstitutionId(1);
        c1.setCountry("India");
        c1.setArticles(448);
        c1.setAmendments(105);
        c1.setAdoptedDate("26 November 1949");
        c1.setLanguage("English");
        c1.setIsFederal(true);

        int constitutionId1 = c1.getConstitutionId();
        String country1 = c1.getCountry();
        int articles1 = c1.getArticles();
        int amendments1 = c1.getAmendments();
        String adoptedDate1 = c1.getAdoptedDate();
        String language1 = c1.getLanguage();
        boolean federal1 = c1.getIsFederal();

        System.out.println("Constitution1 ID: " + constitutionId1);
        System.out.println("Constitution1 Country: " + country1);
        System.out.println("Constitution1 Articles: " + articles1);
        System.out.println("Constitution1 Amendments: " + amendments1);
        System.out.println("Constitution1 Adopted Date: " + adoptedDate1);
        System.out.println("Constitution1 Language: " + language1);
        System.out.println("Constitution1 is Federal: " + federal1);
        System.out.println("---------------------------------------------------");

        Constitution c2 = new Constitution();
        c2.setConstitutionId(2);
        c2.setCountry("USA");
        c2.setArticles(7);
        c2.setAmendments(27);
        c2.setAdoptedDate("17 September 1787");
        c2.setLanguage("English");
        c2.setIsFederal(true);

        int constitutionId2 = c2.getConstitutionId();
        String country2 = c2.getCountry();
        int articles2 = c2.getArticles();
        int amendments2 = c2.getAmendments();
        String adoptedDate2 = c2.getAdoptedDate();
        String language2 = c2.getLanguage();
        boolean federal2 = c2.getIsFederal();

        System.out.println("Constitution2 ID: " + constitutionId2);
        System.out.println("Constitution2 Country: " + country2);
        System.out.println("Constitution2 Articles: " + articles2);
        System.out.println("Constitution2 Amendments: " + amendments2);
        System.out.println("Constitution2 Adopted Date: " + adoptedDate2);
        System.out.println("Constitution2 Language: " + language2);
        System.out.println("Constitution2 is Federal: " + federal2);
        System.out.println("---------------------------------------------------");

        Constitution c3 = new Constitution();
        c3.setConstitutionId(3);
        c3.setCountry("Germany");
        c3.setArticles(146);
        c3.setAmendments(60);
        c3.setAdoptedDate("23 May 1949");
        c3.setLanguage("German");
        c3.setIsFederal(true);

        int constitutionId3 = c3.getConstitutionId();
        String country3 = c3.getCountry();
        int articles3 = c3.getArticles();
        int amendments3 = c3.getAmendments();
        String adoptedDate3 = c3.getAdoptedDate();
        String language3 = c3.getLanguage();
        boolean federal3 = c3.getIsFederal();

        System.out.println("Constitution3 ID: " + constitutionId3);
        System.out.println("Constitution3 Country: " + country3);
        System.out.println("Constitution3 Articles: " + articles3);
        System.out.println("Constitution3 Amendments: " + amendments3);
        System.out.println("Constitution3 Adopted Date: " + adoptedDate3);
        System.out.println("Constitution3 Language: " + language3);
        System.out.println("Constitution3 is Federal: " + federal3);
        System.out.println("---------------------------------------------------");

        Constitution c4 = new Constitution();
        c4.setConstitutionId(4);
        c4.setCountry("France");
        c4.setArticles(89);
        c4.setAmendments(24);
        c4.setAdoptedDate("4 October 1958");
        c4.setLanguage("French");
        c4.setIsFederal(false);

        int constitutionId4 = c4.getConstitutionId();
        String country4 = c4.getCountry();
        int articles4 = c4.getArticles();
        int amendments4 = c4.getAmendments();
        String adoptedDate4 = c4.getAdoptedDate();
        String language4 = c4.getLanguage();
        boolean federal4 = c4.getIsFederal();

        System.out.println("Constitution4 ID: " + constitutionId4);
        System.out.println("Constitution4 Country: " + country4);
        System.out.println("Constitution4 Articles: " + articles4);
        System.out.println("Constitution4 Amendments: " + amendments4);
        System.out.println("Constitution4 Adopted Date: " + adoptedDate4);
        System.out.println("Constitution4 Language: " + language4);
        System.out.println("Constitution4 is Federal: " + federal4);
        System.out.println("---------------------------------------------------");

        Constitution c5 = new Constitution();
        c5.setConstitutionId(5);
        c5.setCountry("Japan");
        c5.setArticles(103);
        c5.setAmendments(0);
        c5.setAdoptedDate("3 May 1947");
        c5.setLanguage("Japanese");
        c5.setIsFederal(false);

        int constitutionId5 = c5.getConstitutionId();
        String country5 = c5.getCountry();
        int articles5 = c5.getArticles();
        int amendments5 = c5.getAmendments();
        String adoptedDate5 = c5.getAdoptedDate();
        String language5 = c5.getLanguage();
        boolean federal5 = c5.getIsFederal();

        System.out.println("Constitution5 ID: " + constitutionId5);
        System.out.println("Constitution5 Country: " + country5);
        System.out.println("Constitution5 Articles: " + articles5);
        System.out.println("Constitution5 Amendments: " + amendments5);
        System.out.println("Constitution5 Adopted Date: " + adoptedDate5);
        System.out.println("Constitution5 Language: " + language5);
        System.out.println("Constitution5 is Federal: " + federal5);
        System.out.println("---------------------------------------------------");
    }
}
