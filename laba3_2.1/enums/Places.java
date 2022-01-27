package enums;
import java.util.Arrays;

public enum Places {
    NEELOVKA("деревне Нееловке"),
    GOLOPYATKINO("селе Голопяткине"),
    BESHLEBOVO("селе Бесхлебове"),
    GOLODAEVKA("селе Голодаевке"),
    NEPROLAZNOE("селе Непролазном");

    private String val;
    private Places(String s){
        val = s;
    }
    public String toString(){
        return val;
    }

    public static void listOfPlaces(){
        System.out.println(Arrays.toString(Places.values()));
    }
}