package androidx.emoji.widget;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.core.util.g;

/* compiled from: EmojiTextViewHelper */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final b f10192a;

    /* compiled from: EmojiTextViewHelper */
    private static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f10193a;

        /* renamed from: b  reason: collision with root package name */
        private final d f10194b;

        a(TextView textView) {
            this.f10193a = textView;
            this.f10194b = new d(textView);
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter instanceof d) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f10194b;
            return inputFilterArr2;
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z11) {
            if (z11) {
                c();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            TransformationMethod transformationMethod = this.f10193a.getTransformationMethod();
            if (transformationMethod != null && !(transformationMethod instanceof PasswordTransformationMethod)) {
                this.f10193a.setTransformationMethod(d(transformationMethod));
            }
        }

        /* access modifiers changed from: package-private */
        public TransformationMethod d(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof h) {
                return transformationMethod;
            }
            return new h(transformationMethod);
        }
    }

    /* compiled from: EmojiTextViewHelper */
    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z11) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            throw null;
        }
    }

    public f(TextView textView) {
        g.h(textView, "textView cannot be null");
        this.f10192a = new a(textView);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f10192a.a(inputFilterArr);
    }

    public void b(boolean z11) {
        this.f10192a.b(z11);
    }

    public void c() {
        this.f10192a.c();
    }
}
