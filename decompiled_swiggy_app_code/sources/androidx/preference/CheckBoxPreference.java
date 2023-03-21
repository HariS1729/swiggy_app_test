package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.core.content.res.k;

public class CheckBoxPreference extends TwoStatePreference {
    private final a M;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            if (!CheckBoxPreference.this.a(Boolean.valueOf(z11))) {
                compoundButton.setChecked(!z11);
            } else {
                CheckBoxPreference.this.O(z11);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    private void U(View view) {
        boolean z11 = view instanceof CompoundButton;
        if (z11) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.G);
        }
        if (z11) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.M);
        }
    }

    private void V(View view) {
        if (((AccessibilityManager) h().getSystemService("accessibility")).isEnabled()) {
            U(view.findViewById(16908289));
            T(view.findViewById(16908304));
        }
    }

    /* access modifiers changed from: protected */
    public void E(View view) {
        super.E(view);
        V(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.M = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CheckBoxPreference, i11, i12);
        S(k.o(obtainStyledAttributes, R.styleable.CheckBoxPreference_summaryOn, R.styleable.CheckBoxPreference_android_summaryOn));
        R(k.o(obtainStyledAttributes, R.styleable.CheckBoxPreference_summaryOff, R.styleable.CheckBoxPreference_android_summaryOff));
        Q(k.b(obtainStyledAttributes, R.styleable.CheckBoxPreference_disableDependentsState, R.styleable.CheckBoxPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, R.attr.checkBoxPreferenceStyle, 16842895));
    }
}
