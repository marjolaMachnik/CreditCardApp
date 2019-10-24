package pl.krakow.uek.pp5.creditcard;

        import org.junit.Assert;
        import org.junit.Test;
        import pl.krakow.uek.pp5.creditcard.exceptions.CreditBelowMinimumException;

        import java.math.BigDecimal;

public class CreditCardTest {

    public static final int NEW_CREDIT_LIMIT = 2000;

    @Test
    public void itAllowAssignLimitToCreditCard() {
        //Arrange // Given
        CreditCard card = new CreditCard("1234-5678");
        //Act // When
        card.assignLimit(BigDecimal.valueOf(NEW_CREDIT_LIMIT));
        //Assert // Then // Expect
        Assert.assertTrue(card.getLimit().equals(BigDecimal.valueOf(NEW_CREDIT_LIMIT)));
    }

    @Test
    public void itVerifyMinimumCreditValue()
    {
        try {
            card.assign(50);
            Assert.fail("Below minimum exception will be thrown");
        }catch (CreditBelowMinimumException e){
            Assert.assertTrue(condition true);
        }
    }
}