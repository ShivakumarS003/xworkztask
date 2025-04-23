package com.xworkz.app.calendar;

import com.xworkz.app.meeting.Meetings;

public class Calendar {

    public String name;
    public  Meetings []meetings;


  /*  for (type variableName : arrayName) {
               variableName.method();
    }*/

    public void getInfo(){
          for (Meetings meeting:meetings) {
                meeting.meetingInfo();


              String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
              for (String i : cars) {
                  System.out.print(i +",");
              }
          }
    }
}
