import org.junit.jupiter.api.Assertions;

public class MainTest {

    private int getLocalNumber(){
        MainClassTest mainClassTest = new MainClassTest();
        return mainClassTest.x;
    }

    private int localNumber(){
        return 14;
    }

    private String textMessage(){
        return "К сожалению мы не можем вернуть число " + getLocalNumber();
    }

    private String returnMessage(){
        return "Отлично, мы вернули число " + getLocalNumber();
    }

    public String check(){
        Assertions.assertTrue(getLocalNumber() == localNumber(), textMessage());
        return returnMessage();
    }
}