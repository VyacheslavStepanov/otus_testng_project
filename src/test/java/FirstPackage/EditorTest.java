package FirstPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EditorTest {
    @Test
    public void TestCleanOutput(){
        Editor editor = new Editor();
        Assert.assertEquals(editor.CleanOutput("Password: enter password"), "enter password");
        Assert.assertEquals(editor.CleanOutput("enter password.Password: "), "enter password.");
        Assert.assertEquals(editor.CleanOutput("Password:enter password"), "Password:enter password");
        Assert.assertNotEquals(editor.CleanOutput("Password: enter password"), "");
    }
    @Test
    public void TestIsStringContainsSpaces(){
        Editor editor = new Editor();
        Assert.assertTrue(editor.IsStringContainsSpaces("Hello World"));
        Assert.assertTrue(editor.IsStringContainsSpaces(" HelloWorld"));
        Assert.assertTrue(editor.IsStringContainsSpaces("HelloWorld "));
        Assert.assertTrue(editor.IsStringContainsSpaces("Hello World "));
        Assert.assertFalse(editor.IsStringContainsSpaces("HelloWorld"));
    }
}
