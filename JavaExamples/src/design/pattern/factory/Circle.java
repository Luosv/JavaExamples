package design.pattern.factory;

/**
 * 2、创建实现接口的实体类Circle
 * Created by luosv on 2017/12/5 0005.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
