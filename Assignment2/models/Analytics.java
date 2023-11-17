package Assignment2.models;



public class Analytics {
    public static double calculateBMI(Member member, Assesment assessment) {
        double heightInMeters = member.getHeight() / 100.0; 
        double weight = assessment.getWieght();
        return weight / (heightInMeters * heightInMeters);
    }

    public static String determineBMICategory(double bmiValue) {
        if (bmiValue < 15) {
            return "VERY SEVERELY UNDERWEIGHT";
        } else if (bmiValue >= 15 && bmiValue < 16) {
            return "SEVERELY UNDERWEIGHT";
        } else if (bmiValue >= 16 && bmiValue < 18.5) {
            return "UNDERWEIGHT";
        } else if (bmiValue >= 18.5 && bmiValue < 25) {
            return "NORMAL";
        } else if (bmiValue >= 25 && bmiValue < 30) {
            return "OVERWEIGHT";
        } else if (bmiValue >= 30 && bmiValue < 35) {
            return "MODERATELY OBESE";
        } else if (bmiValue >= 35 && bmiValue < 40) {
            return "SEVERELY OBESE";
        } else {
            return "VERY SEVERELY OBESE";
        }
    }

    public static boolean isIdealBodyWeight(Member member, Assesment assessment) {
        char gender = member.getGender();
        double heightInInches = member.getHeight();
        double idealBodyWeight;
        if (gender == 'M' || gender == 'm') {
            idealBodyWeight = 50 + 2.3 * (heightInInches - 60);
        } else {
            idealBodyWeight = 45.5 + 2.3 * (heightInInches - 60);
        }
        return assessment.getWieght() <= idealBodyWeight;
    }
    
}
