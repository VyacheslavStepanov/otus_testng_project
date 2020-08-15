package FirstPackage;

public class Editor {
    public static String CleanOutput(String output){

        return output.replace("Password: ", "");
    }

    public static Boolean IsStringContainsSpaces(String text){
        return text.contains(" ");
    }
}
