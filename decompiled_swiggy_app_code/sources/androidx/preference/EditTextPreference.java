package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import androidx.preference.Preference;

public class EditTextPreference extends DialogPreference {
    private String N;

    public static final class a implements Preference.e<EditTextPreference> {

        /* renamed from: a  reason: collision with root package name */
        private static a f11013a;

        private a() {
        }

        public static a b() {
            if (f11013a == null) {
                f11013a = new a();
            }
            return f11013a;
        }

        /* renamed from: c */
        public CharSequence a(EditTextPreference editTextPreference) {
            if (TextUtils.isEmpty(editTextPreference.N())) {
                return editTextPreference.h().getString(R.string.not_set);
            }
            return editTextPreference.N();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.EditTextPreference, i11, i12);
        int i13 = R.styleable.EditTextPreference_useSimpleSummaryProvider;
        if (k.b(obtainStyledAttributes, i13, i13, false)) {
            J(a.b());
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public Object A(TypedArray typedArray, int i11) {
        return typedArray.getString(i11);
    }

    public boolean K() {
        return TextUtils.isEmpty(this.N) || super.K();
    }

    public String N() {
        return this.N;
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, R.attr.editTextPreferenceStyle, 16842898));
    }
}
