package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public abstract class TwoStatePreference extends Preference {
    protected boolean G;
    private CharSequence H;
    private CharSequence I;
    private boolean K;
    private boolean L;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
    }

    /* access modifiers changed from: protected */
    public Object A(TypedArray typedArray, int i11) {
        return Boolean.valueOf(typedArray.getBoolean(i11, false));
    }

    public boolean K() {
        if ((this.L ? this.G : !this.G) || super.K()) {
            return true;
        }
        return false;
    }

    public boolean N() {
        return this.G;
    }

    public void O(boolean z11) {
        boolean z12 = this.G != z11;
        if (z12 || !this.K) {
            this.G = z11;
            this.K = true;
            F(z11);
            if (z12) {
                x(K());
                w();
            }
        }
    }

    public void Q(boolean z11) {
        this.L = z11;
    }

    public void R(CharSequence charSequence) {
        this.I = charSequence;
        if (!N()) {
            w();
        }
    }

    public void S(CharSequence charSequence) {
        this.H = charSequence;
        if (N()) {
            w();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void T(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.G
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.CharSequence r1 = r4.H
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x001c
            java.lang.CharSequence r0 = r4.H
            r5.setText(r0)
        L_0x001a:
            r0 = 0
            goto L_0x002e
        L_0x001c:
            boolean r1 = r4.G
            if (r1 != 0) goto L_0x002e
            java.lang.CharSequence r1 = r4.I
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x002e
            java.lang.CharSequence r0 = r4.I
            r5.setText(r0)
            goto L_0x001a
        L_0x002e:
            if (r0 == 0) goto L_0x003e
            java.lang.CharSequence r1 = r4.q()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x003e
            r5.setText(r1)
            r0 = 0
        L_0x003e:
            r1 = 8
            if (r0 != 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = 8
        L_0x0045:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L_0x004e
            r5.setVisibility(r2)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.T(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    public void y() {
        super.y();
        boolean z11 = !N();
        if (a(Boolean.valueOf(z11))) {
            O(z11);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
