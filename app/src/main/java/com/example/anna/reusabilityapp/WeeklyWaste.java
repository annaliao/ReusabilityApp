package com.example.anna.reusabilityapp;

import java.util.ArrayList;

public class WeeklyWaste {
    private ArrayList<DailyWaste> weeklyWaste;

    public WeeklyWaste(){
        weeklyWaste = new ArrayList<DailyWaste>();
        for (int i =0; i<7; i++){
            weeklyWaste.add(new DailyWaste());
        }
    }

    public int getWeeklyTrash(){
        int weeklyTrash =0;
        for (DailyWaste dailyWaste: weeklyWaste){
            weeklyTrash += dailyWaste.getTrash();
        }
        return weeklyTrash;
    }
    public int getWeeklyRecycling(){
        int weeklyRecycling =0;
        for (DailyWaste dailyWaste: weeklyWaste){
            weeklyRecycling += dailyWaste.getRecycling();
        }
        return weeklyRecycling;
    }
    public int getWeeklyCompost(){
        int weeklyCompost =0;
        for (DailyWaste dailyWaste: weeklyWaste){
            weeklyCompost += dailyWaste.getCompost();
        }
        return weeklyCompost;
    }
}
