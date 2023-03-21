package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.collection.a;
import androidx.core.content.res.k;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y3.c;

/* compiled from: TransitionInflater */
public class c0 {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?>[] f11864b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    private static final a<String, Constructor<?>> f11865c = new a<>();

    /* renamed from: a  reason: collision with root package name */
    private final Context f11866a;

    private c0(Context context) {
        this.f11866a = context;
    }

    private Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        if (attributeValue != null) {
            try {
                a<String, Constructor<?>> aVar = f11865c;
                synchronized (aVar) {
                    Constructor<? extends U> constructor = aVar.get(attributeValue);
                    if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.f11866a.getClassLoader()).asSubclass(cls)) != null) {
                        constructor = asSubclass.getConstructor(f11864b);
                        constructor.setAccessible(true);
                        aVar.put(attributeValue, constructor);
                    }
                    newInstance = constructor.newInstance(new Object[]{this.f11866a, attributeSet});
                }
                return newInstance;
            } catch (Exception e11) {
                throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e11);
            }
        } else {
            throw new InflateException(str + " tag must have a 'class' attribute");
        }
    }

    private b0 b(XmlPullParser xmlPullParser, AttributeSet attributeSet, b0 b0Var) throws XmlPullParserException, IOException {
        b0 b0Var2;
        int depth = xmlPullParser.getDepth();
        f0 f0Var = b0Var instanceof f0 ? (f0) b0Var : null;
        loop0:
        while (true) {
            b0Var2 = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                    if (next == 2) {
                        String name = xmlPullParser.getName();
                        if ("fade".equals(name)) {
                            b0Var2 = new j(this.f11866a, attributeSet);
                        } else if ("changeBounds".equals(name)) {
                            b0Var2 = new d(this.f11866a, attributeSet);
                        } else if ("slide".equals(name)) {
                            b0Var2 = new z(this.f11866a, attributeSet);
                        } else if ("explode".equals(name)) {
                            b0Var2 = new i(this.f11866a, attributeSet);
                        } else if ("changeImageTransform".equals(name)) {
                            b0Var2 = new f(this.f11866a, attributeSet);
                        } else if ("changeTransform".equals(name)) {
                            b0Var2 = new h(this.f11866a, attributeSet);
                        } else if ("changeClipBounds".equals(name)) {
                            b0Var2 = new e(this.f11866a, attributeSet);
                        } else if ("autoTransition".equals(name)) {
                            b0Var2 = new y3.a(this.f11866a, attributeSet);
                        } else if ("changeScroll".equals(name)) {
                            b0Var2 = new g(this.f11866a, attributeSet);
                        } else if ("transitionSet".equals(name)) {
                            b0Var2 = new f0(this.f11866a, attributeSet);
                        } else if ("transition".equals(name)) {
                            b0Var2 = (b0) a(attributeSet, b0.class, "transition");
                        } else if ("targets".equals(name)) {
                            d(xmlPullParser, attributeSet, b0Var);
                        } else if ("arcMotion".equals(name)) {
                            if (b0Var != null) {
                                b0Var.n0(new b(this.f11866a, attributeSet));
                            } else {
                                throw new RuntimeException("Invalid use of arcMotion element");
                            }
                        } else if ("pathMotion".equals(name)) {
                            if (b0Var != null) {
                                b0Var.n0((c) a(attributeSet, c.class, "pathMotion"));
                            } else {
                                throw new RuntimeException("Invalid use of pathMotion element");
                            }
                        } else if (!"patternPathMotion".equals(name)) {
                            throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                        } else if (b0Var != null) {
                            b0Var.n0(new v(this.f11866a, attributeSet));
                        } else {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        if (b0Var2 == null) {
                            continue;
                        } else {
                            if (!xmlPullParser.isEmptyElementTag()) {
                                b(xmlPullParser, attributeSet, b0Var2);
                            }
                            if (f0Var != null) {
                                break;
                            } else if (b0Var != null) {
                                throw new InflateException("Could not add transition to another transition.");
                            }
                        }
                    }
                }
            }
            f0Var.y0(b0Var2);
        }
        return b0Var2;
    }

    public static c0 c(Context context) {
        return new c0(context);
    }

    @SuppressLint({"RestrictedApi"})
    private void d(XmlPullParser xmlPullParser, AttributeSet attributeSet, b0 b0Var) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (xmlPullParser.getName().equals("target")) {
                    TypedArray obtainStyledAttributes = this.f11866a.obtainStyledAttributes(attributeSet, a0.f11817a);
                    int l11 = k.l(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                    if (l11 != 0) {
                        b0Var.c(l11);
                    } else {
                        int l12 = k.l(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                        if (l12 != 0) {
                            b0Var.x(l12, true);
                        } else {
                            String m11 = k.m(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                            if (m11 != null) {
                                b0Var.f(m11);
                            } else {
                                String m12 = k.m(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                                if (m12 != null) {
                                    b0Var.z(m12, true);
                                } else {
                                    String m13 = k.m(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                    if (m13 != null) {
                                        try {
                                            b0Var.y(Class.forName(m13), true);
                                        } catch (ClassNotFoundException e11) {
                                            obtainStyledAttributes.recycle();
                                            throw new RuntimeException("Could not create " + m13, e11);
                                        }
                                    } else {
                                        String m14 = k.m(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                        if (m14 != null) {
                                            b0Var.e(Class.forName(m14));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obtainStyledAttributes.recycle();
                } else {
                    throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                }
            }
        }
    }

    public b0 e(int i11) {
        XmlResourceParser xml = this.f11866a.getResources().getXml(i11);
        try {
            b0 b11 = b(xml, Xml.asAttributeSet(xml), (b0) null);
            xml.close();
            return b11;
        } catch (XmlPullParserException e11) {
            throw new InflateException(e11.getMessage(), e11);
        } catch (IOException e12) {
            throw new InflateException(xml.getPositionDescription() + ": " + e12.getMessage(), e12);
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }
}
