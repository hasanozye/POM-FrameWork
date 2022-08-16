package test.day25;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class C001_LoremTest {
    Faker faker = new Faker();

    @Test
    public void lorem() {
        faker = new Faker();
        System.out.println("faker.shakespeare().hamletQuote() = " + faker.shakespeare().hamletQuote());
    }

    @Test
    public void deneme() {
        faker = new Faker();
        System.out.println("faker.shakespeare() = " + faker.shakespeare());
    }

    @Test
    public void test01() {
        faker = new Faker();
        System.out.println("faker.shakespeare().asYouLikeItQuote() = " + faker.shakespeare().asYouLikeItQuote());

    }


}
