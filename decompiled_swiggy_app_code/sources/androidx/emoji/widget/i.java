package androidx.emoji.widget;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.g;
import d3.d;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SpannableBuilder */
public final class i extends SpannableStringBuilder {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f10201a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f10202b = new ArrayList();

    /* compiled from: SpannableBuilder */
    private static class a implements TextWatcher, SpanWatcher {

        /* renamed from: a  reason: collision with root package name */
        final Object f10203a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f10204b = new AtomicInteger(0);

        a(Object obj) {
            this.f10203a = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof d;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f10204b.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f10203a).afterTextChanged(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            ((TextWatcher) this.f10203a).beforeTextChanged(charSequence, i11, i12, i13);
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            this.f10204b.decrementAndGet();
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i11, int i12) {
            if (this.f10204b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f10203a).onSpanAdded(spannable, obj, i11, i12);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i11, int i12, int i13, int i14) {
            if (this.f10204b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f10203a).onSpanChanged(spannable, obj, i11, i12, i13, i14);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i11, int i12) {
            if (this.f10204b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f10203a).onSpanRemoved(spannable, obj, i11, i12);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            ((TextWatcher) this.f10203a).onTextChanged(charSequence, i11, i12, i13);
        }
    }

    i(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        g.h(cls, "watcherClass cannot be null");
        this.f10201a = cls;
    }

    private void b() {
        for (int i11 = 0; i11 < this.f10202b.size(); i11++) {
            this.f10202b.get(i11).a();
        }
    }

    static i c(Class<?> cls, CharSequence charSequence) {
        return new i(cls, charSequence);
    }

    private void e() {
        for (int i11 = 0; i11 < this.f10202b.size(); i11++) {
            this.f10202b.get(i11).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i11 = 0; i11 < this.f10202b.size(); i11++) {
            a aVar = this.f10202b.get(i11);
            if (aVar.f10203a == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(Class<?> cls) {
        return this.f10201a == cls;
    }

    private boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    private void i() {
        for (int i11 = 0; i11 < this.f10202b.size(); i11++) {
            this.f10202b.get(i11).c();
        }
    }

    public void a() {
        b();
    }

    public void d() {
        i();
        e();
    }

    public int getSpanEnd(Object obj) {
        a f11;
        if (h(obj) && (f11 = f(obj)) != null) {
            obj = f11;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        a f11;
        if (h(obj) && (f11 = f(obj)) != null) {
            obj = f11;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        a f11;
        if (h(obj) && (f11 = f(obj)) != null) {
            obj = f11;
        }
        return super.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i11, int i12, Class<T> cls) {
        if (!g(cls)) {
            return super.getSpans(i11, i12, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i11, i12, a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            tArr[i13] = aVarArr[i13].f10203a;
        }
        return tArr;
    }

    public int nextSpanTransition(int i11, int i12, Class<a> cls) {
        if (g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i11, i12, cls);
    }

    public void removeSpan(Object obj) {
        a aVar;
        if (h(obj)) {
            aVar = f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f10202b.remove(aVar);
        }
    }

    public void setSpan(Object obj, int i11, int i12, int i13) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f10202b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i11, i12, i13);
    }

    public CharSequence subSequence(int i11, int i12) {
        return new i(this.f10201a, this, i11, i12);
    }

    public SpannableStringBuilder delete(int i11, int i12) {
        super.delete(i11, i12);
        return this;
    }

    public SpannableStringBuilder insert(int i11, CharSequence charSequence) {
        super.insert(i11, charSequence);
        return this;
    }

    public SpannableStringBuilder replace(int i11, int i12, CharSequence charSequence) {
        b();
        super.replace(i11, i12, charSequence);
        i();
        return this;
    }

    public SpannableStringBuilder insert(int i11, CharSequence charSequence, int i12, int i13) {
        super.insert(i11, charSequence, i12, i13);
        return this;
    }

    i(Class<?> cls, CharSequence charSequence, int i11, int i12) {
        super(charSequence, i11, i12);
        g.h(cls, "watcherClass cannot be null");
        this.f10201a = cls;
    }

    public SpannableStringBuilder replace(int i11, int i12, CharSequence charSequence, int i13, int i14) {
        b();
        super.replace(i11, i12, charSequence, i13, i14);
        i();
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(char c11) {
        super.append(c11);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, int i11, int i12) {
        super.append(charSequence, i11, i12);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i11) {
        super.append(charSequence, obj, i11);
        return this;
    }
}
