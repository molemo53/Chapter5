package za.ac.cput.chapter5.proxyPattern;

import java.util.Date;

/**
 * Created by student on 2015/03/10.
 */
public class Proxy {

    ProxySlow proxySlow;

    public Proxy()
    {
        System.out.println("Creating proxy @ " + new Date());
    }

    public void readProxy()
    {
        if(proxySlow ==null)
        {
            proxySlow = new ProxySlow();
        }

        proxySlow.configProxy();
    }
}
