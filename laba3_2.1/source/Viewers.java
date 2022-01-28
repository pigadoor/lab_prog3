package source;
import libs.LifeObject;
import libs.SceneObject;
import libs.inter.WatchAble;


public class Viewers extends LifeObject implements WatchAble{
    public Viewers(String str) {
        super(str);
    }

    @Override
    public void watch(SceneObject obj) {
        System.out.printf("объект %s смотрят объект %s \n",toString(),obj);
    }
}
