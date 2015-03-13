package za.ac.cput.chapter5.proxyPattern;

import java.util.Date;

/**
 * Created by student on 2015/03/10.
 */
public abstract class ProxyAbstract {

    public void configProxy()
    {
        System.out.println(this.getClass().getSimpleName()+ "Proxy @ " + new Date());
    }
}
