package org.example.fluentinterfaces;

import org.example.fluentinterfaces.htmldsl.Html;
import org.example.fluentinterfaces.model.User;
import org.example.fluentinterfaces.utils.Logging;
import org.slf4j.Logger;

import java.util.Arrays;

public class Starter {

    private static final Logger LOG = Logging.getLogger();

    public static void main(String[] args) {

        LOG.info("Fluent Interfaces examples");

        // Array example
        User[] users = new User[]
                {User.Builder.newBuilder()
                        .name("Mustermann")
                        .forename("Max")
                        .username("maxmustermann")
                        .build(),
                        User.Builder.newBuilder()
                                .name("Mustermann")
                                .forename("Erika")
                                .username("erikamustermann")
                                .build(),
                        User.Builder.newBuilder()
                                .name("Mustermann")
                                .forename("Nathalie")
                                .username("nathaliemustermann")
                                .build()
                };


        User nathalie = Arrays.stream(users)
                .filter(user -> "Nathalie".equals(user.getForename()))
                .findFirst()
                .orElse(null);

        if (nathalie != null) {
            LOG.info("Username is: {}", nathalie.getUsername());
        }

        // HTML DSL example
        String html = new Html()
                .head()
                .meta("UTF-8")
                .meta("keywords", "fluent, interface")
                .title("Fluent interfaces")
                .finalise()
                .body()
                .text("Fluent interfaces")
                .br()
                .finalise()
                .generate();

        LOG.info("Generated HTML from HTML DSL is: {}", html);

        // User example
        User maxMustermannWithConstructor = createMaxMustermannWithConstructor();
        LOG.info("Username (with constructor) is: {}", maxMustermannWithConstructor.getUsername());

        User maxMustermannWithConstructorAndSetter = createMaxMustermannWithConstructorAndSetter();
        LOG.info("Username (with constructor and setter) is: {}", maxMustermannWithConstructorAndSetter.getUsername());

        User maxMustermannWithBuilder = createMaxMustermannWithBuilder();
        LOG.info("Username (with builder) is: {}", maxMustermannWithBuilder.getUsername());
    }

    private static User createMaxMustermannWithConstructor() {

        return new User("Mustermann", "Max", "maxmustermann");
    }

    private static User createMaxMustermannWithConstructorAndSetter() {

        User user = new User();

        user.setName("Mustermann");
        user.setForename("Max");
        user.setUsername("maxmustermann");

        return user;
    }

    private static User createMaxMustermannWithBuilder() {

        return User.Builder.newBuilder()
                .name("Mustermann")
                .forename("Max")
                .username("maxmustermann")
                .build();
    }
}
