package in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup;

import kotlin.jvm.internal.p;

/* compiled from: TextLine.kt */
public final class TextLine {
    private final String text;
    private final TextStyle textStyle;

    public TextLine(String str, TextStyle textStyle2) {
        p.j(str, "text");
        p.j(textStyle2, "textStyle");
        this.text = str;
        this.textStyle = textStyle2;
    }

    public static /* synthetic */ TextLine copy$default(TextLine textLine, String str, TextStyle textStyle2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = textLine.text;
        }
        if ((i11 & 2) != 0) {
            textStyle2 = textLine.textStyle;
        }
        return textLine.copy(str, textStyle2);
    }

    public final String component1() {
        return this.text;
    }

    public final TextStyle component2() {
        return this.textStyle;
    }

    public final TextLine copy(String str, TextStyle textStyle2) {
        p.j(str, "text");
        p.j(textStyle2, "textStyle");
        return new TextLine(str, textStyle2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLine)) {
            return false;
        }
        TextLine textLine = (TextLine) obj;
        return p.e(this.text, textLine.text) && p.e(this.textStyle, textLine.textStyle);
    }

    public final String getText() {
        return this.text;
    }

    public final TextStyle getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.textStyle.hashCode();
    }

    public String toString() {
        return "TextLine(text=" + this.text + ", textStyle=" + this.textStyle + ')';
    }
}
