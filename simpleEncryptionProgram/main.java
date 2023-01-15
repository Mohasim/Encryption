public class Main {
    public static void main(String[] args) {
        String message="we found a treasure!";
        String encryptedMessage="";

        for (int i=0;i< message.length();i++){
            int maxAscii=122;
            int minAscii=97;

            char currChar=message.charAt(i);
            if (currChar>=97 && currChar<=122){
                int ascii= (int)currChar;
                int enAscii= maxAscii-ascii+minAscii;
                encryptedMessage+=Character.toString((char)enAscii);
            }
            else{
                encryptedMessage+=currChar;
            }
        }
        System.out.println(encryptedMessage);
    }
}
