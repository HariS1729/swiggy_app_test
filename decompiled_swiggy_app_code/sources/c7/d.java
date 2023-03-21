package c7;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Xml;
import androidx.core.content.res.h;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import androidx.vectordrawable.graphics.drawable.c;
import f.a;
import kotlin.jvm.internal.p;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Contexts.kt */
public final class d {
    public static final Drawable a(Context context, int i11) {
        Drawable b11 = a.b(context, i11);
        if (b11 != null) {
            return b11;
        }
        throw new IllegalStateException(p.s("Invalid resource ID: ", Integer.valueOf(i11)).toString());
    }

    public static final Drawable b(Resources resources, int i11, Resources.Theme theme) {
        Drawable e11 = h.e(resources, i11, theme);
        if (e11 != null) {
            return e11;
        }
        throw new IllegalStateException(p.s("Invalid resource ID: ", Integer.valueOf(i11)).toString());
    }

    public static final Lifecycle c(Context context) {
        while (!(context instanceof r)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((r) context).getLifecycle();
    }

    public static final Drawable d(Context context, Resources resources, int i11) {
        XmlResourceParser xml = resources.getXml(i11);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            if (Build.VERSION.SDK_INT < 24) {
                String name = xml.getName();
                if (p.e(name, "vector")) {
                    return androidx.vectordrawable.graphics.drawable.h.c(resources, xml, Xml.asAttributeSet(xml), context.getTheme());
                }
                if (p.e(name, "animated-vector")) {
                    return c.a(context, resources, xml, Xml.asAttributeSet(xml), context.getTheme());
                }
            }
            return b(resources, i11, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final boolean e(Context context, String str) {
        return androidx.core.content.a.a(context, str) == 0;
    }
}
