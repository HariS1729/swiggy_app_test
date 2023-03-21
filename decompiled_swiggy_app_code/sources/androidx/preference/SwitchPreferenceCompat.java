package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.res.k;

public class SwitchPreferenceCompat extends TwoStatePreference {
    private final a M;
    private CharSequence N;
    private CharSequence O;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            if (!SwitchPreferenceCompat.this.a(Boolean.valueOf(z11))) {
                compoundButton.setChecked(!z11);
            } else {
                SwitchPreferenceCompat.this.O(z11);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.M = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SwitchPreferenceCompat, i11, i12);
        S(k.o(obtainStyledAttributes, R.styleable.SwitchPreferenceCompat_summaryOn, R.styleable.SwitchPreferenceCompat_android_summaryOn));
        R(k.o(obtainStyledAttributes, R.styleable.SwitchPreferenceCompat_summaryOff, R.styleable.SwitchPreferenceCompat_android_summaryOff));
        V(k.o(obtainStyledAttributes, R.styleable.SwitchPreferenceCompat_switchTextOn, R.styleable.SwitchPreferenceCompat_android_switchTextOn));
        U(k.o(obtainStyledAttributes, R.styleable.SwitchPreferenceCompat_switchTextOff, R.styleable.SwitchPreferenceCompat_android_switchTextOff));
        Q(k.b(obtainStyledAttributes, R.styleable.SwitchPreferenceCompat_disableDependentsState, R.styleable.SwitchPreferenceCompat_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    private void W(View view) {
        boolean z11 = view instanceof SwitchCompat;
        if (z11) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.G);
        }
        if (z11) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.N);
            switchCompat.setTextOff(this.O);
            switchCompat.setOnCheckedChangeListener(this.M);
        }
    }

    private void X(View view) {
        if (((AccessibilityManager) h().getSystemService("accessibility")).isEnabled()) {
            W(view.findViewById(R.id.switchWidget));
            T(view.findViewById(16908304));
        }
    }

    /* access modifiers changed from: protected */
    public void E(View view) {
        super.E(view);
        X(view);
    }

    public void U(CharSequence charSequence) {
        this.O = charSequence;
        w();
    }

    public void V(CharSequence charSequence) {
        this.N = charSequence;
        w();
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchPreferenceCompatStyle);
    }
}
