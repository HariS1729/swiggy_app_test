package m1;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import m1.d;
import org.xmlpull.v1.XmlPullParserException;
import y0.c;
import z0.a;

/* compiled from: VectorResources.android.kt */
public final class g {
    public static final d.a a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser) throws XmlPullParserException {
        p.j(resources, "res");
        p.j(xmlResourceParser, "parser");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        a aVar = new a(xmlResourceParser, 0, 2, (i) null);
        p.i(asAttributeSet, "attrs");
        c.a a11 = z0.c.a(aVar, resources, theme, asAttributeSet);
        int i11 = 0;
        while (!z0.c.d(xmlResourceParser)) {
            i11 = z0.c.g(aVar, resources, asAttributeSet, theme, a11, i11);
            xmlResourceParser.next();
        }
        return new d.a(a11.e(), aVar.a());
    }
}
