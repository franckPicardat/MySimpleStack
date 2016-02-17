package dcll.fpic;

import java.util.EmptyStackException;

/**
 * Created by 21502887 on 10/02/2016.
 */
public interface SimpleStack {
    public boolean isEmpty();

    public int getSize();

    public void push(Item item);

    public Item peek() throws EmptyStackException;

    public Item pop() throws EmptyStackException;
}
