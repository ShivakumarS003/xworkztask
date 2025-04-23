package com.xworkz.app;

import com.xworkz.app.calendar.Calendar;
import com.xworkz.app.days.Days;
import com.xworkz.app.invitee.Invitees;
import com.xworkz.app.meeting.Meetings;

public class CalendarRunner {

    public static void main(String[] args) {

        Calendar calendar = new Calendar();
        calendar.name ="Microsoft Calendar";

        Meetings []meetings = new Meetings[2];

        Meetings meetings1 = new Meetings();
        meetings1.days = Days.Monday;
        meetings1.startTime = "11:00 AM";
        meetings1.endTime = "12:00 PM";

        Invitees []inviteesm1 = new  Invitees[2];

        Invitees invitees1 = new Invitees();
        invitees1.Id = 1;
        invitees1.name = "Baba";
        invitees1.phoneNumber = 9984512357L;

        Invitees invitees2 = new Invitees();
        invitees2.Id = 2;
        invitees2.name = "Babu";
        invitees2.phoneNumber = 6645784512L;

        meetings[0] = meetings1;
        inviteesm1[0]= invitees1;
        inviteesm1[1]=invitees2;

        calendar.meetings = meetings;
        meetings1.invitees = inviteesm1;

        Meetings meetings2 = new Meetings();
        meetings2.days = Days.Wednesday;
        meetings2.startTime = "1:00 PM";
        meetings2.endTime = "2:00PM";

        Invitees []inviteesm2 = new Invitees[2];

        Invitees invitees3 = new Invitees();
        invitees3.Id = 1;
        invitees3.name = "Ram";
        invitees3.phoneNumber= 7845123697L;

        Invitees invitees4 =new Invitees();
        invitees4.Id = 2;
        invitees4.name = "Seeta";
        invitees4.phoneNumber = 8456123741L;

        meetings[1]= meetings2;
        inviteesm2[0] = invitees3;
        inviteesm2[1]=invitees4;

       meetings2.invitees =inviteesm2;

       calendar.getInfo();
    }
}
