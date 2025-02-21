package section3.lesson19;

public class CodingEx04 {
    public static void main(String[] args) {
        int month = 12; // do NOT change this line
        String season;

        switch (month) {
            case 1,2,12 :
                season = "Winter";
                break;
            case 3,4,5 :
                season = "Spring";
                break;
            case 6,7,8 :
                season = "Summer";
                break;
            case 9,10,11 :
                season = "Autumn";
                break;
            default :
                season = "Invalid month";
        }
        /*
            TODO:
            Implement the switch statement to assign the correct season based on the month
            if month equals to 1, 2 or 12               -> assign "Winter" to the 'season' variable
            if month equals to 3, 4 or 5                -> assign "Spring" to the 'season' variable
            if month equals to 6, 7 or 8                -> assign "Summer" to the 'season' variable
            if month equals to 9, 10 or 11              -> assign "Autumn" to the 'season' variable
            if month is not within the range of 1 to 12 -> assign "Invalid month" to the 'season' variable
        */

        System.out.println(season);
    }
}
//Switch Statements
//Write a Java program that determines the season of the year based on the month provided. Use a switch statement to implement the logic. The months are classified into the following seasons:
//
//Winter: December, January, February
//
//Spring: March, April, May
//
//Summer: June, July, August
//
//Autumn: September, October, November
//
//If the month is not within the range of 1 to 12, the output should be "Invalid month". The program should print the season corresponding to the given month.