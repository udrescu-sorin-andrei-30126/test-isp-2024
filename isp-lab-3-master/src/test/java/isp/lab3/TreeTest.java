package isp.lab3;

import isp.lab3.exercise1.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mihai.hulea
 */
public class TreeTest {


    @Test
    public void testGrow(){
        Tree t=new Tree();
        t.grow(15);
        assertEquals("Tree should have height to 30",30,t.getHeight());
    }

    @Test
    public void testToString(){
        Tree t=new Tree();
        t.grow(15);
        assertEquals("The resuld should be ","This height is30",t.toString());
    }

}
