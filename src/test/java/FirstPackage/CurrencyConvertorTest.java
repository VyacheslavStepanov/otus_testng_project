package FirstPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CurrencyConvertorTest {
    @Test
    public void TestConvert(){
        Assert.assertEquals(CurrencyConvertor.Convert(0, Currency.RUB, Currency.USD), 0);
        Assert.assertEquals(CurrencyConvertor.Convert(10, Currency.RUB, Currency.USD), 600);
        Assert.assertEquals(CurrencyConvertor.Convert(-10, Currency.RUB, Currency.USD), -600);
        Assert.assertEquals(CurrencyConvertor.Convert(0, Currency.USD, Currency.RUB), 0);
        Assert.assertEquals(CurrencyConvertor.Convert(10, Currency.USD, Currency.RUB), 0.17);
        Assert.assertEquals(CurrencyConvertor.Convert(-10, Currency.USD, Currency.RUB), -0.17);
        Assert.assertNotEquals(CurrencyConvertor.Convert(20, Currency.USD, Currency.RUB), 0);
    }
}
