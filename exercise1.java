public class App {
    
    static boolean iwillbehave = true;
    static boolean iwillGraduate = true;

    public static void main (String[] args) throws Exception {

        //Agreement
        //Precondition

        assert iwillbehave == false : "Kasi magaling ako";

        College();

        assert iwillGraduate == true : "sigurado na to";

    }
static void College() {
   iwillGraduate = false;
   System.out.println("Ang galing");     
    }
}
