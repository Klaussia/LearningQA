package Test_3;

import org.junit.jupiter.api.Assertions;

public class MainClass {

    private String class_string = "hello, world";

    private int limit = 5;
    private String hello = "hello";
    private String Hello = "Hello";

    private String getClassString(){
        return this.class_string;
    }
    private String word(){
        String check = getClassString().codePointCount(0, getClassString().length()) > limit ? getClassString().substring(0, getClassString().offsetByCodePoints(0, limit)) : getClassString();
        return check;
    }

    public String checkString(){
        if(getClassString().contains(Hello)|getClassString().contains(hello)){
            System.out.println(getClassString() + " : Содержит слово " + word());
        }else{
            Assertions.fail(getClassString() + " : Не содержит слово " + Hello + " или " + hello);
        }
        return "";
    }


}
