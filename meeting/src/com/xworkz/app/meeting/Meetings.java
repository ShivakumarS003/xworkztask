package com.xworkz.app.meeting;

import com.xworkz.app.days.Days;
import com.xworkz.app.invitee.Invitees;

public class Meetings {
    public Days days;
    public String startTime;
    public String endTime;
    public Invitees invitees[];


    public  void meetingInfo(){
        System.out.println(days);
        System.out.println(startTime);
        System.out.println(endTime);

        for(Invitees invitee : invitees){
            invitee.inviteeInfo();
        }
    }
}
