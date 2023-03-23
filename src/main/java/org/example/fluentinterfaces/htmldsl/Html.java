package org.example.fluentinterfaces.htmldsl;

public class Html {

    private final StringBuilder stringBuilder;

    public Html() {
        stringBuilder = new StringBuilder();
        stringBuilder.append("<html>");
    }

    public HtmlHead head() {
        return new HtmlHead(this, stringBuilder);
    }

    public HtmlBody body() {
        return new HtmlBody(this, stringBuilder);
    }

    public String generate() {
        stringBuilder.append("</html>");
        return stringBuilder.toString();
    }
}
