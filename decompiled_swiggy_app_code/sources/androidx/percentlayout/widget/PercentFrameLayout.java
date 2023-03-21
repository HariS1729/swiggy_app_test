package androidx.percentlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.percentlayout.widget.a;

@Deprecated
public class PercentFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final a f10997a = new a(this);

    public PercentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-1, -1);
    }

    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f10997a.e();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        this.f10997a.a(i11, i12);
        super.onMeasure(i11, i12);
        if (this.f10997a.d()) {
            super.onMeasure(i11, i12);
        }
    }

    @Deprecated
    public static class a extends FrameLayout.LayoutParams implements a.b {

        /* renamed from: a  reason: collision with root package name */
        private a.C0075a f10998a;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10998a = a.c(context, attributeSet);
        }

        public a.C0075a a() {
            if (this.f10998a == null) {
                this.f10998a = new a.C0075a();
            }
            return this.f10998a;
        }

        /* access modifiers changed from: protected */
        public void setBaseAttributes(TypedArray typedArray, int i11, int i12) {
            a.b(this, typedArray, i11, i12);
        }

        public a(int i11, int i12) {
            super(i11, i12);
        }
    }
}
