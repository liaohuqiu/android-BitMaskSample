package in.srain.bitmasksample;

import in.srain.bitmasksample.people.Poet;
import org.junit.Assert;
import org.junit.Test;

public class ExampleUnitTest {

    @Test
    public void testWritingPoem() throws Exception {

        Poet liPo = new Poet();

        liPo.setBusyInWritingPoem(true);
        Assert.assertTrue(liPo.isBusyInWritingPoem());

        liPo.setBusyInWritingPoem(false);
        Assert.assertFalse(liPo.isBusyInWritingPoem());
    }

    @Test
    public void testDrinking() throws Exception {

        Poet liPo = new Poet();
        liPo.setBusyInDrinking(true);

        Assert.assertTrue(liPo.isBusyInDrinking());
        liPo.setBusyInDrinking(false);

        Assert.assertFalse(liPo.isBusyInDrinking());
    }

    @Test
    public void testBoth() throws Exception {

        Poet liPo = new Poet();

        liPo.setBusyInWritingPoem(true);
        liPo.setBusyInDrinking(true);
        Assert.assertTrue(liPo.isBusy());

        liPo.setBusyInWritingPoem(true);
        liPo.setBusyInDrinking(false);
        Assert.assertTrue(liPo.isBusy());

        liPo.setBusyInWritingPoem(false);
        liPo.setBusyInDrinking(true);
        Assert.assertTrue(liPo.isBusy());

        liPo.setBusyInWritingPoem(false);
        liPo.setBusyInDrinking(false);
        Assert.assertFalse(liPo.isBusy());
    }
}