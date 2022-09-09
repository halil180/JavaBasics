public class Palindrom {
    public static void main(String[] args) {

        String text = "LOL";
        String unreversed = "",reversed  = "";

        for(char c : text.toLowerCase().toCharArray()){
            if (Character.isLetter(c)){
                unreversed += c;
                reversed = c + reversed;
            }
        }

        if(reversed.equals(unreversed)){
            System.out.println("palindrom gefunden");
        }else{
            System.out.println("kein palindrom");
        }
    }
}
