package Problems;

import java.util.Scanner;

// I/P = Birthdate
//complete Year
// complete Month
// how many days, hour, min, seconds

// 1 yr --> 364 days
// 24 yr --> ? days

// 1 yr --> 12 months
// 24 yr --> ? months

// 9 m 2000 yr --> 1
// 4 m 2024 yr --> 8 m 23 yr
public class CompletedYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your BirthYear: ");
        int birthYear = sc.nextInt();

        System.out.println("Enter your BirthMonth: ");
        int birthMonth = sc.nextInt();

        System.out.println("Enter your Birthdate: ");
        int birthDate = sc.nextInt();

        int currYear = 2024;
        int totalMonth = 12;
        int currMonth = 4;
        int hour = 24;
        int minutes = 60;
        int seconds = 60;

        int  totalDays = 30;
        int currDate = 23;

        int January = 31, March = 31, May = 31, July = 31, August = 31, October = 31, December = 31;
        int April = 30, June = 30, September = 30, November = 30;
        int leapYearFeb = 29;
        int notLeapYearFeb = 28;

        int daysInYear = January + notLeapYearFeb + March + April + May + June + July + August + September + October +  November + December;
//        int daysInLeapYear = January + leapYearFeb + March + April + May + June + July + August + September + October + November + December;



//        int completedMonth = (currMonth - birthMonth);
//        for (int i = birthYear; i <= currYear; i++){
//            if (i % 400 == 0){
//                System.out.println("It is a leap year: " + daysInLeapYear);
//            }else if (i % 100 == 0){
//                System.out.println("It is not a leap year: " + daysInYear);
//            }else if (i % 4 == 0){
//                System.out.println("It is a leap year: " + daysInLeapYear);
//            }else {
//                System.out.println("It is not a leap year: " + daysInYear);
//            }
//        }


        if (birthYear < 1 || birthYear > currYear){
            System.out.println("Invalid Year. The value should be between 1 to " + currYear);
        }
//        1st. Completed Years
        if (birthMonth < 1 || birthMonth > totalMonth ){
            System.out.println("Invalid month. The value should be between 1 to " + totalMonth);
            return;
        }

        if (birthDate < 1 || birthDate > totalDays){
            System.out.println("Invalid Day. The value should be between 1 to " + totalDays);
            return;
        }
        int completedYears;
        if (currYear == birthYear){
            completedYears = (currYear - birthYear);
            System.out.println("Completed Years is: " + completedYears);
        }else {
            completedYears = (currYear - birthYear) - 1;
            System.out.println("Completed Years is: " + completedYears);
        }
//
        int completedDay;
        if (currDate >= birthDate){
            completedDay = (currDate - birthDate);
            System.out.println("Completed Day is: " + completedDay);
        }  else {
            completedDay = (totalDays - birthDate) + currDate;
            System.out.println("Completed Day is: " + completedDay);

        }
        int completedMonths;
        if (currMonth >= birthMonth){
            completedMonths = currMonth - birthMonth - 1;
            System.out.println("Completed month is: " + completedMonths);
        } else {
            completedMonths = (totalMonth - birthMonth) + currMonth;
            System.out.println("Completed month is: " + completedMonths);
        }


        System.out.println("Completed year is: " + completedYears + " Years. Completed Month is: " + completedMonths + " months. Completed Days are: " + completedDay);

////        3rd. How many day
        int DaysUntilNow = completedYears * daysInYear + completedMonths *  totalDays + completedDay;
        System.out.println("From Birthdate till today: " + DaysUntilNow);

        int timeHr = DaysUntilNow * hour;
        System.out.println("From BirthDay Till Now: " + timeHr + " Hr. this much hours. I have lived...!");

        long timeMin = (long) (timeHr * minutes);
        System.out.println("From BirthDay Till Now: " + timeMin + " Min. this much hours. I have lived...!");

        long timeSec = timeMin * seconds;
        System.out.println("From BirthDay Till Now: "+ timeSec + " Sec. this much hours. I have lived...!");
    }
}
