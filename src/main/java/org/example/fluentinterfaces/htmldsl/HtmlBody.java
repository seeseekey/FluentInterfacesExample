package org.example.fluentinterfaces.htmldsl;

public class HtmlBody {

    private final Html html;

    private final StringBuilder stringBuilder;

    public HtmlBody(Html html, StringBuilder stringBuilder) {
        this.html = html;
        this.stringBuilder = stringBuilder;
        stringBuilder.append("<body>");
    }

    public HtmlBody br() {
        stringBuilder.append("<br>");
        return this;
    }

    public HtmlBody text(String text) {
        stringBuilder.append(text);
        return this;
    }

    public Html finalise() {
        stringBuilder.append("</body>");
        return html;
    }
}
