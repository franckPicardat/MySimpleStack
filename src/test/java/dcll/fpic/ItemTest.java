package dcll.fpic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item item;

    @Before
    public void setUp() throws Exception {
        item = new Item("coucou");
        System.out.println("Je suis exécuté avant chaque test");
    }

    @Test
    public void testGetValeur() throws Exception {
        assertEquals(item.getValeur(), "coucou");
    }

    @Test
    public void testSetValeur() throws Exception {
        item.setValeur("salut");
        assertEquals(item.getValeur(), "salut");
    }
}