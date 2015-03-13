package za.ac.cput.chapter5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.chapter5.builderPattern.Bmw;
import za.ac.cput.chapter5.factoryPattern.Burger;
import za.ac.cput.chapter5.factoryPattern.Chips;
import za.ac.cput.chapter5.factoryPattern.Cookies;
import za.ac.cput.chapter5.factoryPattern.Food;
import za.ac.cput.chapter5.protoType.Car;
import za.ac.cput.chapter5.singleton.Person;

/**
 * Created by student on 2015/03/05.
 */
@Configuration
public class AppConfig {

    @Bean(name = "Singleton")
    public Person getConfig()
    {
        return new Person();
    }

    @Bean(name ="FactoryBurger")
    public Food getBurger(){return new Burger();}

    @Bean(name ="FactoryCookies")
    public Food getCookies() {return new Cookies();}

    @Bean(name = "FactoryChips")
    public Chips getChips(){return new Chips();}

    @Bean(name = "Bmw")
    public Bmw getBmw() {return new Bmw();}



}
