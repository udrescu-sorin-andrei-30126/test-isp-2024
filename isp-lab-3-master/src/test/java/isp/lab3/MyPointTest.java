package isp.lab3;

import isp.lab3.exercise1.Tree;
import isp.lab3.exercise4.MyPoint;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mihai.hulea
 */
public class MyPointTest {


    @Test
    public void DistanceTest(){
        MyPoint p1=new MyPoint(1,2,3);
        MyPoint p2=new MyPoint(10,20,30);

        assertEquals("Should pass the test ",33.67491648096547,p1.distance(p2));
    }

}
