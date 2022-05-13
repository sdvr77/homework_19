package homework;

public class Generator {

    public int doGenerateVar () {
        int i = (int) (Math.random() * 1001);
        System.out.println("(" + i + ")");
        return i;
    }

}
