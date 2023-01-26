package Test_2;

import org.junit.jupiter.api.Assertions;

public class MainClass {

    private int class_number = 20;

    public int getClassNumber(){
        MainClassTest mt = new MainClassTest();
        return this.class_number = mt.x;
    }

    private int anotherNumber(){
        return 45;
    }

    private String testMessage(){
        return "Ваше число равно ";
    }
    private String testMessage_1(){
        return "Ваше число меньше чем ";
    }
    private String testMessage_2(){
        return "Возвращаем ";
    }
    private String testMessage_3(){
        return "";
    }

    public String check(){
        if(getClassNumber() == anotherNumber()){
            Assertions.fail(testMessage() + anotherNumber());
        }else{
            Assertions.assertTrue(getClassNumber() > anotherNumber(), testMessage_1() + anotherNumber());
            return testMessage_2() + getClassNumber();
        }
        return testMessage_3();
    }

}
