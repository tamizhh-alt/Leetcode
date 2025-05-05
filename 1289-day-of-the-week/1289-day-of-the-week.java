class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int totalDays = 0;
        for (int y = 1971; y < year; y++) {
            if (isLeap(y)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (isLeap(year)) {
            days[1] = 29;
        }
        for (int m = 1; m < month; m++) {
            totalDays += days[m - 1];
        }
        totalDays += day - 1;
        String[] weekDays = { "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday" };
        return weekDays[totalDays%7];

    }
    private boolean isLeap(int year){
        if(year%4!=0){
            return false;
        } else if(year % 100 !=0){
            return true;
        } else {
            return year%400==0;
        }
    }
}