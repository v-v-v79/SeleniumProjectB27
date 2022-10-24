package com.cydeo.tests.day9_faker;
import com.github.javafaker.Faker;

public class JavaFaker_Practice {
    public static void main(String[] args) {

        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.address().city() = " + faker.address().city());
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

        System.out.println("faker.numerify(\"773-###-####\") = " + faker.numerify("773-###-####"));

        System.out.println("faker.numerify(\"#####\") = " + faker.numerify("#####"));

        System.out.println("faker.letterify(\"???????\") = " + faker.letterify("???????"));

        System.out.println("faker.bothify(\"##???#??\") = " + faker.bothify("##???#??"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());

        System.out.println("faker.finance().creditCard().replaceAll(\"-\",\"\") = " + faker.finance().creditCard().replaceAll("-", ""));

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());

        System.out.println("faker.chuckNorris().fact().replaceAll(\"Chuck Norris\",\"Saim\") = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Saim"));

    }

}
