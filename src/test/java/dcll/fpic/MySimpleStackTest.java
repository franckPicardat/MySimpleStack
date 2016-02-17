package dcll.fpic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MySimpleStackTest {

    MySimpleStack list;

    @Before
    public void setUp() throws Exception {
        list = new MySimpleStack();
        System.out.println("Je suis exécuté avant chaque test");
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue("La liste doit être vide", list.isEmpty());
        Item item = new Item(new String("coucou"));
        list.push(item);
        assertFalse("La liste ne doit pas être vide", list.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        Item item = new Item(new String("coucou"));
        list.push(item);
        assertFalse("La liste ne doit pas être vide", list.isEmpty());
        assertEquals("La liste doit contenir un élément",1, list.getSize());
    }

    @Test
    public void testPush() throws Exception {
        Item item = new Item(new String("coucou"));
        list.push(item);
        assertFalse("La liste ne doit pas être vide", list.isEmpty());
        Item prevItem = list.peek();
        assertEquals("Les deux items doivent être égaux", item, prevItem);
    }

    @Test
    public void testPeek() throws Exception {
        Item item = new Item(new String("coucou"));
        list.push(item);
        assertFalse("La liste ne doit pas être vide", list.isEmpty());
        Item prevItem = list.peek();
        assertEquals("Les deux items doivent être égaux", item, prevItem);
        assertEquals("La liste doit contenir un élément",1, list.getSize());
    }

    @Test
    public void testPop() throws Exception {
        Item item = new Item(new String("coucou"));
        list.push(item);
        assertFalse("La liste ne doit pas être vide", list.isEmpty());
        Item prevItem = list.pop();
        assertEquals("Les deux items doivent être égaux", item, prevItem);
        assertEquals("La liste doit contenir un élément",0, list.getSize());
    }
}