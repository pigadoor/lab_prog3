package source;
import libs.SceneObject;
import libs.inter.PowerAble;

public class Telecast extends SceneObject implements PowerAble{

    private boolean Power=false;

    public Telecast(String s) {
        super(s);
    }

    public void power(){
        if (Power == false){
            System.out.println("Передача включена");
            this.Power = true;
        }
        else{
            System.out.println("Передача выключена");
            this.Power = false;
        }
    }
}
