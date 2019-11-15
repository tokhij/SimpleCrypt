package src;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    private String lowercaseStart = "abcdefghijklmnopqrstuvwxyz";
    private String uppercaseStart = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String startUpper;
    private String registerUpper;
    private String startLower;
    private String registerLower;
    private boolean symmetric = false;

    ROT13(Character cs, Character cf) {
        if(toLowerCase(cs) == 'a' &&
        toLowerCase(cf) == 'n') symmetric = true;

        startUpper = ROT13.rotate(uppercaseStart, Character.toUpperCase(cs));
        startLower = ROT13.rotate(lowercaseStart, Character.toLowerCase(cs));
        registerUpper = ROT13.rotate(uppercaseStart, Character.toUpperCase(cf));
        registerLower = ROT13.rotate(lowercaseStart, Character.toLowerCase(cf));

        System.out.println(startUpper);
        System.out.println(registerUpper);
        System.out.println(startLower);
        System.out.println(registerLower);
    }

    ROT13() {
        this( 'a',  'n');
    }


    public String crypt(String text) throws UnsupportedOperationException {
        if (this.symmetric != true) throw new UnsupportedOperationException();
        return substituteIn(text, startUpper, registerUpper, startLower, registerLower);
    }

    public String encrypt(String text) {
        return substituteIn(text, startUpper, registerUpper, startLower, registerLower);
    }

    public String decrypt(String text) {
        return substituteIn(text, startUpper, registerUpper, startLower, registerLower);
    }

    public static String rotate(String s, Character c) {
        int offset = s.indexOf(c);
        int i = offset % s.length();

        return s.substring(i) + s.substring(0,1);
    }

    private String substituteIn(String text, String startUpper, String registerUpper, String startLower, String registerLower){
        return substituteIn(text, startUpper, registerUpper, startLower, registerLower);
    }





}
