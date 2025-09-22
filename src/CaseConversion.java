public class CaseConversion {
    public static void main(String[] args) {
        String newJava;
        String java = "Java";

        System.out.println("원본 문자열: "+ java);
        newJava = java.substring(0,1).toLowerCase();
        newJava += java.substring(1,4).toUpperCase();

        // newJava += java.substring(1,2).toUpperCase();
        // newJava += java.substring(2,3).toUpperCase();
        // newJava += java.substring(3,4).toUpperCase();

        System.out.println("변환 문자: " + newJava);

    }
}
