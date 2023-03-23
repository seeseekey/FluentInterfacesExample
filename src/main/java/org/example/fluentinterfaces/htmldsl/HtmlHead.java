package org.example.fluentinterfaces.htmldsl;

public class HtmlHead {

    private final Html html;

    private final StringBuilder stringBuilder;

    public HtmlHead(Html html, StringBuilder stringBuilder) {
        this.html = html;
        this.stringBuilder = stringBuilder;
        stringBuilder.append("<head>");
    }

    public HtmlHead title(String title) {
        stringBuilder.append("<title>");
        stringBuilder.append(title);
        stringBuilder.append("</title>");
        return this;
    }

    public HtmlHead meta(String charset) {
        stringBuilder.append("<meta charset=\"");
        stringBuilder.append(charset);
        stringBuilder.append("\">");
        return this;
    }

    public HtmlHead meta(String name, String content) {
        stringBuilder.append("<meta name=\"");
        stringBuilder.append(name);
        stringBuilder.append("\" content=\"");
        stringBuilder.append(content);
        stringBuilder.append("\">");
        return this;
    }

    public Html finalise() {
        stringBuilder.append("</head>");
        return html;
    }
}
