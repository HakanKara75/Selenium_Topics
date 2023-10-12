package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static utilities.ManagementOnSchoolAuthorization.generateToken;

public class Faker_Class_$_API_BaseUrl {

    public static RequestSpecification spec;


        public static void setUp() {
            spec = new RequestSpecBuilder()
                    .addHeader("Authorization", generateToken())
                    .setBaseUri("https://managementonschools.com/app").build();
        }
}



