package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.core.content.res.k;

public class SwitchPreference extends TwoStatePreference {
    private final a M;
    private CharSequence N;
    private CharSequence O;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            if (!SwitchPreference.this.a(Boolean.valueOf(z11))) {
                compoundButton.setChecked(!z11);
            } else {
                SwitchPreference.this.O(z11);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.M = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SwitchPreference, i11, i12);
        S(k.o(obtainStyledAttributes, R.styleable.SwitchPreference_summaryOn, R.styleable.SwitchPreference_android_summaryOn));
        R(k.o(obtainStyledAttributes, R.styleable.SwitchPreference_summaryOff, R.styleable.SwitchPreference_android_summaryOff));
        V(k.o(obtainStyledAttributes, R.styleable.SwitchPreference_switchTextOn, R.styleable.SwitchPreference_android_switchTextOn));
        U(k.o(obtainStyledAttributes, R.styleable.SwitchPreference_switchTextOff, R.styleable.SwitchPreference_android_switchTextOff));
        Q(k.b(obtainStyledAttributes, R.styleable.SwitchPreference_disableDependentsState, R.styleable.SwitchPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    private void W(View view) {
        boolean z11 = view instanceof Switch;
        if (z11) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.G);
        }
        if (z11) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.N);
            switchR.setTextOff(this.O);
            switchR.setOnCheckedChangeListener(this.M);
        }
    }

    private void X(View view) {
        if (((AccessibilityManager) h().getSystemService("accessibility")).isEnabled()) {
            W(view.findViewById(16908352));
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

    public SwitchPreference(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, R.attr.switchPreferenceStyle, 16843629));
    }
}
