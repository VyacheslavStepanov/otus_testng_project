package FirstPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTest {
    @Test
    public void TestSum(){
        Unit s = new Unit();
        Assert.assertEquals(s.Sum(5, 6), 11);
    }
    @Test
    public void TestString(){
        Unit s = new Unit();
        Assert.assertEquals(s.TestText(), "HelloWorld");
    }
}
