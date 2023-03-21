package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.k;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.n;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.u;
import androidx.collection.g;
import androidx.core.view.a0;
import defpackage.p1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: AppCompatViewInflater */
public class i {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?>[] f1585b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f1586c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f1587d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e  reason: collision with root package name */
    private static final g<String, Constructor<? extends View>> f1588e = new g<>();

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f1589a = new Object[2];

    /* compiled from: AppCompatViewInflater */
    private static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final View f1590a;

        /* renamed from: b  reason: collision with root package name */
        private final String f1591b;

        /* renamed from: c  reason: collision with root package name */
        private Method f1592c;

        /* renamed from: d  reason: collision with root package name */
        private Context f1593d;

        public a(View view, String str) {
            this.f1590a = view;
            this.f1591b = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1591b, new Class[]{View.class})) != null) {
                        this.f1592c = method;
                        this.f1593d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f1590a.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f1590a.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f1591b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1590a.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f1592c == null) {
                a(this.f1590a.getContext());
            }
            try {
                this.f1592c.invoke(this.f1593d, new Object[]{view});
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException("Could not execute method for android:onClick", e12);
            }
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && a0.V(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1586c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View r(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        g<String, Constructor<? extends View>> gVar = f1588e;
        Constructor<? extends U> constructor = gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1585b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1589a);
    }

    private View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.f1589a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i11 = 0;
                while (true) {
                    String[] strArr = f1587d;
                    if (i11 < strArr.length) {
                        View r11 = r(context, str, strArr[i11]);
                        if (r11 != null) {
                            return r11;
                        }
                        i11++;
                    } else {
                        Object[] objArr2 = this.f1589a;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View r12 = r(context, str, (String) null);
                Object[] objArr3 = this.f1589a;
                objArr3[0] = null;
                objArr3[1] = null;
                return r12;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f1589a;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    private static Context t(Context context, AttributeSet attributeSet, boolean z11, boolean z12) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.View, 0, 0);
        int resourceId = z11 ? obtainStyledAttributes.getResourceId(R.styleable.View_android_theme, 0) : 0;
        if (z12 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(R.styleable.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof p1.e) || ((p1.e) context).c() != resourceId) ? new p1.e(context, resourceId) : context;
        }
        return context;
    }

    private void u(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    public c b(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatButton c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatCheckBox d(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public e e(Context context, AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public h f(Context context, AttributeSet attributeSet) {
        return new h(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatImageButton g(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatImageView h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public k i(Context context, AttributeSet attributeSet) {
        return new k(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatRadioButton j(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public n k(Context context, AttributeSet attributeSet) {
        return new n(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public p l(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatSpinner m(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatTextView n(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public u o(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final View q(View view, String str, Context context, AttributeSet attributeSet, boolean z11, boolean z12, boolean z13, boolean z14) {
        View view2;
        Context context2 = (!z11 || view == null) ? context : view.getContext();
        if (z12 || z13) {
            context2 = t(context2, attributeSet, z12, z13);
        }
        if (z14) {
            context2 = l0.b(context2);
        }
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c11 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c11 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c11 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c11 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c11 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c11 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c11 = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c11 = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c11 = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c11 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c11 = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c11 = 13;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                view2 = k(context2, attributeSet);
                u(view2, str);
                break;
            case 1:
                view2 = e(context2, attributeSet);
                u(view2, str);
                break;
            case 2:
                view2 = i(context2, attributeSet);
                u(view2, str);
                break;
            case 3:
                view2 = n(context2, attributeSet);
                u(view2, str);
                break;
            case 4:
                view2 = g(context2, attributeSet);
                u(view2, str);
                break;
            case 5:
                view2 = l(context2, attributeSet);
                u(view2, str);
                break;
            case 6:
                view2 = m(context2, attributeSet);
                u(view2, str);
                break;
            case 7:
                view2 = j(context2, attributeSet);
                u(view2, str);
                break;
            case 8:
                view2 = o(context2, attributeSet);
                u(view2, str);
                break;
            case 9:
                view2 = h(context2, attributeSet);
                u(view2, str);
                break;
            case 10:
                view2 = b(context2, attributeSet);
                u(view2, str);
                break;
            case 11:
                view2 = d(context2, attributeSet);
                u(view2, str);
                break;
            case 12:
                view2 = f(context2, attributeSet);
                u(view2, str);
                break;
            case 13:
                view2 = c(context2, attributeSet);
                u(view2, str);
                break;
            default:
                view2 = p(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = s(context2, str, attributeSet);
        }
        if (view2 != null) {
            a(view2, attributeSet);
        }
        return view2;
    }
}
