package com.mohmdev.gym;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Member {

    private String name; // Data structure details;
    private List<Visit> visits; // Relation
    private MembershipLevel level;  // Relation

    public Member(String name){
        this.name = name;
        visits = new ArrayList<>();
    }

    // getters
    public String getName() { return name; }
    public MembershipLevel getLevel() { return level; }
    public List<Visit> getVisitHistory() { return visits; }

    // MODIFIES: this
    // EFFECTS: sets this member's name to given name
    public void setName(String name){
        this.name = name;
    }

    // MODIFIES: this
    // EFFECTS: returns this member's membership level
    public void setMembershipLevel(MembershipLevel level){
        this.level = level;
    }

    // MODIFIES: this
    // EFFECTS: adds current date to member's visit history
    public void checkIn(){
        Calendar current = Calendar.getInstance();
        int day = current.get(Calendar.DAY_OF_MONTH);
        int month = current.get(Calendar.MONTH);
        month++;
        int year = current.get(Calendar.YEAR);

        Visit v = new Visit(day, month, year);
        visits.add(v);
    }

    // MODIFIES: this
    // EFFECTS: upgrades this member's membership level, if possible
    public void upgrade(){
        if(level == MembershipLevel.BASIC){
            setMembershipLevel(MembershipLevel.CLASSES);
        } else if (level == MembershipLevel.CLASSES){
            setMembershipLevel(MembershipLevel.DELUXE);
        }
    }

    // EFFECTS: returns true if this member can reserve classes
    public boolean canReserveClasses() {
        return level != MembershipLevel.BASIC;
    }


}
