package androidx.emoji.widget;

import android.annotation.SuppressLint;
import android.text.Editable;

/* compiled from: EmojiEditableFactory */
final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f10184a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile Editable.Factory f10185b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f10186c;

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f10186c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f10185b == null) {
            synchronized (f10184a) {
                if (f10185b == null) {
                    f10185b = new b();
                }
            }
        }
        return f10185b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f10186c;
        if (cls != null) {
            return i.c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
