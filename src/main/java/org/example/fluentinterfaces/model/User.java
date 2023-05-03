package org.example.fluentinterfaces.model;

public class User {

    private String name;

    private String forename;

    private String username;

    public User() {
    }

    public User(String name, String forename, String username) {
        this.name = name;
        this.forename = forename;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private User(Builder builder) {
        setName(builder.name);
        setForename(builder.forename);
        setUsername(builder.username);
    }

    public static final class Builder {
        private String name;
        private String forename;
        private String username;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder forename(String forename) {
            this.forename = forename;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
