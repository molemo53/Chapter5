package za.ac.cput.chapter5.proxyPattern;

/**
 * Created by student on 2015/03/10.
 */
public class ProxySlow extends ProxyAbstract {

    public ProxySlow()
    {
        try {
            Thread.sleep(5000);

        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
