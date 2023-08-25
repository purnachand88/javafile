public class Stringdt{

    public static String toLowerCase(String str){

        String result="";

        for(int i=0;i<str.length(); i++) {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z') {

                result+=(char) (str.charAt(i)+32);
            }

            else {
                result+= str.charAt(i);
            }

            
        }
            return result;

    }
    public static void main(String[] args) {
        String str ="HeLLow WoRLd!!";
        str=toLowerCase(str);
        System.out.println(str);
        
        
    }
}