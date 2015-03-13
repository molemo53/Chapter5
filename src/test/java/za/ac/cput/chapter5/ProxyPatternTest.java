package za.ac.cput.chapter5;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.chapter5.proxyPattern.FastProxy;
import za.ac.cput.chapter5.proxyPattern.Proxy;

/**
 * Created by student on 2015/03/10.
 */
public class ProxyPatternTest {

    Proxy proxy;
    FastProxy fastProxy;

    @Before
    public void setUpClass() throws  Exception
    {
        proxy = new Proxy();
        fastProxy = new FastProxy();
    }

    @Test
    public void runProxy() throws Exception
    {
        fastProxy.configProxy();

        proxy.readProxy();
    }
}
