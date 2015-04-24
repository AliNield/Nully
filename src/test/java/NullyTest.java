import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class NullyTest {

    @Test(expected = NullPointerException.class)
    public void checkNotNulls_givenNull_thenThrowsNullPointerException() {
        Nully.checkNotNulls(null);
    }

    @Test(expected = NullPointerException.class)
    public void checkNotNulls_givenNulls_thenThrowsNullPointerException() {
        Nully.checkNotNulls(null, null);
    }

    @Test(expected = NullPointerException.class)
    public void checkNotNulls_givenParametersContainNull_thenThrowsNullPointerException() {
        Nully.checkNotNulls(null, new String());
    }

    @Test
    public void checkNotNulls_givenParametersDoNotContainNull_thenReturnParameters() {
        Object parameter1 = new Object();
        Object parameter2 = new Object();
        Object[] parameters = {parameter1, parameter2};
        Nully.checkNotNulls(parameters);

        Assert.assertThat(parameters, CoreMatchers.equalTo(parameters));
    }


}
