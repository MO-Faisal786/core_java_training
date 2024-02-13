class ConditionalStatements {
    public static void main(String[] args) {
        // switch case statements
        int day = 5;
        System.out.print("Today is ");
        switch (day) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            default:
                System.out.print("Invalid Day!");
        }

    }
}
