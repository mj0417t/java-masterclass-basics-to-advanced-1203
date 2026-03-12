public class SwitchTest {
    public static void main(String[] args) {
        int n=7;
        switch (n) {
            case 1, 2 -> System.out.println("Value is " + n);
            case 3, 4, 5 -> System.out.println("Value is 3 or 4 or 5 and is accurately " + n);
            default -> System.out.println("Value is neither 1 or 2 or 3 or 4 or 5 and is accurately " + n);
        }

        String month = "December";
        System.out.println("Quarter is "+ getQuarter(month));

        String dayofWeek = dayOfTheWeek(6);
        System.out.println(dayOfTheWeek(2));
        System.out.println(dayofWeek);
    }

    public static  String getQuarter(String month){
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponse = month +"is bad";
                yield badResponse;
            }
            };
        }

        public static String dayOfTheWeek(int day){
            return switch (day) {
                case 0 -> "Sunday";
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> "Invalid Day";
            };

        }
    }

