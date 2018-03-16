import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance(){

        Point p2 = new Point(3,3);
        Point p1 = new Point(1,3);

        Assert.assertEquals(p1.distance(p2),2.0);

    }

    @Test
    public void testDistance2(){

        Point p2 = new Point(6,3);
        Point p1 = new Point(1,3);

        Assert.assertEquals(p1.distance(p2),5.0);

    }
}
