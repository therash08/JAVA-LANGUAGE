class LifePath {
    static double targetCGPA = 4.0;
    final String studentName;
    static String msg;

    LifePath() {
        studentName = "Baten";
        System.out.println("Welcome, " + studentName);
    }

    void startJourney(String msg) {
        msg = msg; // Note: This refers to the local parameter, not the static field
        System.out.println("Every challenge is an opportunity to learn and grow.");
    }

    {
        System.out.println("Life needs effort");
    }

    static void Goal() {
        System.out.println("Next CGPA target " + targetCGPA + " !! " + msg);
    }

    static {
        System.out.println("Keep learning");
    }

    public static void main(String[] args) {
        System.out.println("Journey begins");
        LifePath s1 = new LifePath();
        LifePath s2 = new LifePath();
        s2.startJourney("Are you Okay?");
        Goal();
    }
}