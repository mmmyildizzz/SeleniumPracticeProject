package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test

    public void test1(){
        //creating Faker object to reach methods

        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName()); // compile randomly generate a
                                                                                        // name. Here: "Shalanda".
                                                                                        // Everytime I run the code
                                                                                        // it will be a different name
        System.out.println("faker.name().lastName() = " + faker.name().lastName()); // generated "Mante".

        System.out.println("faker.name().fullName() = " + faker.name().fullName()); // generated "Noel Schumm".

        // numerify() method will generate random numbers in the format we want to get:
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));
                                                                        //faker.numerify("###-###-####") = 221-577-7411

        // we can make some part of number certain as like:
        //faker.numerify("312-###-####").soutv
        System.out.println("faker.numerify(\"312-###-####\") = " + faker.numerify("312-###-####"));
                                                                        //faker.numerify("312-###-####") = 312-476-7241

        //letterify() method will return random letters where we pass "?":
        //faker.letterify("???-????").soutv
        System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???-????"));
                                                                        //faker.letterify("???-????") = saa-uhdc , exa.

        //bothify:
        //faker.bothify("##?#-##?#-#?#?-##??")
        System.out.println("faker.bothify(\"##?#-##?#-#?#?-##??\") = " + faker.bothify("##?#-##?#-#?#?-##??"));
                                                            //faker.bothify("##?#-##?#-#?#?-##??") = 21w3-25x0-4p0l-96wg

        //faker.finance().creditCard().soutv
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
                                                                    //faker.finance().creditCard() = 6759-4714-1902-1855
        //here if we do not want dashes (-) between numbers:
        //faker.finance().creditCard().replaceAll("-", "").soutv
        System.out.println("faker.finance().creditCard().replaceAll(\"-\", \"\") = " + faker.finance().creditCard().
           replaceAll("-", "")); //faker.finance().creditCard().replaceAll("-", "") = 3529826234687741

        //faker.chuckNorris().fact().soutv
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
                //faker.chuckNorris().fact() = Chuck Norris doesn't use web standards as the web will conform to him.

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muammer"));
        //faker.chuckNorris().fact() = Muammer doesn't get compiler errors, the language changes itself to accommodate Muammer.



    }
}
