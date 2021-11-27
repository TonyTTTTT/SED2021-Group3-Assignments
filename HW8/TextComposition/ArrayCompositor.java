package TextComposition;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class ArrayCompositor implements Compositor{
    public void compose(LinkedHashMap<Integer, Component> components){
        int i = 1;
        Iterator<Component> componentIter = components.values().iterator();
        while (componentIter.hasNext()){
            Component component = componentIter.next();
            System.out.printf("[%d]%s", 
                component.getNaturalSize(),
                component.getContent()
            );
            if ((i++) % 3 == 0){
                System.out.println();
            }
            else if (componentIter.hasNext()){
                System.out.print(" ");
            }
            else if (!componentIter.hasNext()){
                System.out.println();
            }
        }
    }
}
