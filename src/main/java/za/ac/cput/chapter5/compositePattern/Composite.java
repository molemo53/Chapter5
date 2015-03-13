package za.ac.cput.chapter5.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/10.
 */
public class Composite implements Component {

    List<Component> components = new ArrayList<Component>();

    @Override
    public void sayHello() {
        for (Component component : components) {
            component.sayHello();
        }
    }

    @Override
    public void sayGoodbye() {
        for (Component component : components) {
            component.sayGoodbye();
        }
    }

    public void addComponent(Component component)
    {
        components.add(component);

    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    public Component getComponent(int index) {
        return components.get(index);
    }





}
