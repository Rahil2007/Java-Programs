public class MarksCalculator{

    public static void Calculate(String studentName, char section, int studentClass, int language, int math, int science, int english, int totalMarks){
        float studentTotalMarks = language + math + science + english;
        double percentage = (studentTotalMarks/totalMarks) * 100;
        System.out.println(studentName + " from class " + studentClass + section + " has secured a total of " + totalMarks + " marks!");
        System.out.println("Your final percentage is " + percentage + "%");
    } 
}