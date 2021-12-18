package Class1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UseTestNG {
    // Test Methods  ( all test method can be executable
    @Test
    public void twoPlusTwo() {
        int result =2+2;

        Assert.assertEquals(result,4 ,"3 + 3 verification failed");

    }

    @Test
    public void threePlusThree(){
        int result =3+3;

        Assert.assertEquals(result,6 ,"3 + 3 verification failed");
    }

    @Test
    public void fivePlusFive() {
        int result =5+5;

        Assert.assertEquals(result,10,"5+5 is failed");

    }


}
