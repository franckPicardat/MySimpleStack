package dcll.fpic;

import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 * Created by 21502887 on 10/02/2016.
 */
public class MySimpleStack implements SimpleStack {

    private LinkedList<Item> listItem;

    public MySimpleStack(){
        listItem = new LinkedList<Item>();
    }
    @Override
    public boolean isEmpty() {

        return listItem.isEmpty();
    }

    @Override
    public int getSize() {

        return listItem.size();
    }

    @Override
    public void push(Item item) {

        listItem.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {

        return listItem.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {

        return listItem.pop();
    }
}
