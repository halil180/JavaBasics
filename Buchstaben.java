public class Buchstaben {
    public static void main(String[] args) {
        String text = "Java ist eine tolle Programmiersprache!" ;
        int lower =0,upper = 0,space = 0,other = 0;

        System.out.println(text.toCharArray());
        for(char c : text.toCharArray()){
            if (c == ' '){
                space++;
            }else if(Character.isUpperCase(c)){
                upper++;
            }else if(Character.isLowerCase(c)){
                lower++;
            }else{
                other++;
            }
        }

        System.out.printf("Der Satz enthält %d kleinbuchstaben. \n",lower);
        System.out.printf("Der Satz enthält %d Grossbuchstaben. \n",upper);
        System.out.printf("Der Satz enthält %d Leerzeichen. \n",space);
        System.out.printf("Der Satz enthält %d andere Zeichen. \n",other);


    }
}
