package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: DrawableCompat */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Method f9253a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f9254b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f9255c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f9256d;

    /* renamed from: androidx.core.graphics.drawable.a$a  reason: collision with other inner class name */
    /* compiled from: DrawableCompat */
    static class C0039a {
        static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i11) {
            return drawableContainerState.getChild(i11);
        }

        static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        static void e(Drawable drawable, boolean z11) {
            drawable.setAutoMirrored(z11);
        }
    }

    /* compiled from: DrawableCompat */
    static class b {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f11, float f12) {
            drawable.setHotspot(f11, f12);
        }

        static void f(Drawable drawable, int i11, int i12, int i13, int i14) {
            drawable.setHotspotBounds(i11, i12, i13, i14);
        }

        static void g(Drawable drawable, int i11) {
            drawable.setTint(i11);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* compiled from: DrawableCompat */
    static class c {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i11) {
            return drawable.setLayoutDirection(i11);
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        b.a(drawable, theme);
    }

    public static boolean b(Drawable drawable) {
        return b.b(drawable);
    }

    public static void c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            c(C0039a.c((InsetDrawable) drawable));
        } else if (drawable instanceof g) {
            c(((g) drawable).b());
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                Drawable b11 = C0039a.b(drawableContainerState, i11);
                if (b11 != null) {
                    c(b11);
                }
            }
        }
    }

    public static int d(Drawable drawable) {
        return C0039a.a(drawable);
    }

    public static ColorFilter e(Drawable drawable) {
        return b.c(drawable);
    }

    public static int f(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.a(drawable);
        }
        if (!f9256d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f9255c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e11) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e11);
            }
            f9256d = true;
        }
        Method method = f9255c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e12) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e12);
                f9255c = null;
            }
        }
        return 0;
    }

    public static void g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        b.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(Drawable drawable) {
        return C0039a.d(drawable);
    }

    @Deprecated
    public static void i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(Drawable drawable, boolean z11) {
        C0039a.e(drawable, z11);
    }

    public static void k(Drawable drawable, float f11, float f12) {
        b.e(drawable, f11, f12);
    }

    public static void l(Drawable drawable, int i11, int i12, int i13, int i14) {
        b.f(drawable, i11, i12, i13, i14);
    }

    public static boolean m(Drawable drawable, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.b(drawable, i11);
        }
        if (!f9254b) {
            Class<Drawable> cls = Drawable.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f9253a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e11) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e11);
            }
            f9254b = true;
        }
        Method method = f9253a;
        if (method != null) {
            try {
                method.invoke(drawable, new Object[]{Integer.valueOf(i11)});
                return true;
            } catch (Exception e12) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e12);
                f9253a = null;
            }
        }
        return false;
    }

    public static void n(Drawable drawable, int i11) {
        b.g(drawable, i11);
    }

    public static void o(Drawable drawable, ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void p(Drawable drawable, PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }

    public static <T extends Drawable> T q(Drawable drawable) {
        return drawable instanceof g ? ((g) drawable).b() : drawable;
    }

    public static Drawable r(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof f)) ? new i(drawable) : drawable;
    }
}
