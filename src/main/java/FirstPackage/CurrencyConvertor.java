package FirstPackage;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConvertor {
    public static double Convert(double value, Currency currentCurrency, Currency targetCurrency){
        if (currentCurrency == targetCurrency) {
            return value;
        };
        if (currentCurrency == Currency.RUB & targetCurrency == Currency.USD){
            double result = value * 60;
            return result;
        }
        if (currentCurrency == Currency.USD & targetCurrency == Currency.RUB){

            double result = new BigDecimal(value / 60).setScale(2, RoundingMode.HALF_UP).doubleValue();
            return result;
        };
        return -1.;
    }
}