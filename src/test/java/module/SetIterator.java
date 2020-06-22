package module;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {
    public ArrayList<String> iterator(Set<String> windowIds, int i){
        Iterator<String> windowIdsIterator = windowIds.iterator();
        ArrayList<String> arr = new ArrayList<String>();

        for (int j=0;j<=i;j++){
            arr.add(windowIdsIterator.next());
        }

        return arr;
    }
}
