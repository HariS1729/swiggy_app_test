package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.content.res.k;
import androidx.preference.Preference;

public class ListPreference extends DialogPreference {
    private CharSequence[] N;
    private CharSequence[] O;
    private String P;
    private String Q;
    private boolean R;

    public static final class a implements Preference.e<ListPreference> {

        /* renamed from: a  reason: collision with root package name */
        private static a f11014a;

        private a() {
        }

        public static a b() {
            if (f11014a == null) {
                f11014a = new a();
            }
            return f11014a;
        }

        /* renamed from: c */
        public CharSequence a(ListPreference listPreference) {
            if (TextUtils.isEmpty(listPreference.Q())) {
                return listPreference.h().getString(R.string.not_set);
            }
            return listPreference.Q();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListPreference, i11, i12);
        this.N = k.q(obtainStyledAttributes, R.styleable.ListPreference_entries, R.styleable.ListPreference_android_entries);
        this.O = k.q(obtainStyledAttributes, R.styleable.ListPreference_entryValues, R.styleable.ListPreference_android_entryValues);
        int i13 = R.styleable.ListPreference_useSimpleSummaryProvider;
        if (k.b(obtainStyledAttributes, i13, i13, false)) {
            J(a.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.Preference, i11, i12);
        this.Q = k.o(obtainStyledAttributes2, R.styleable.Preference_summary, R.styleable.Preference_android_summary);
        obtainStyledAttributes2.recycle();
    }

    private int T() {
        return N(this.P);
    }

    /* access modifiers changed from: protected */
    public Object A(TypedArray typedArray, int i11) {
        return typedArray.getString(i11);
    }

    public int N(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.O) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.O[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] O() {
        return this.N;
    }

    public CharSequence Q() {
        CharSequence[] charSequenceArr;
        int T = T();
        if (T < 0 || (charSequenceArr = this.N) == null) {
            return null;
        }
        return charSequenceArr[T];
    }

    public CharSequence[] R() {
        return this.O;
    }

    public String S() {
        return this.P;
    }

    public void U(String str) {
        boolean z11 = !TextUtils.equals(this.P, str);
        if (z11 || !this.R) {
            this.P = str;
            this.R = true;
            I(str);
            if (z11) {
                w();
            }
        }
    }

    public CharSequence q() {
        if (r() != null) {
            return r().a(this);
        }
        Object Q2 = Q();
        CharSequence q = super.q();
        String str = this.Q;
        if (str == null) {
            return q;
        }
        Object[] objArr = new Object[1];
        if (Q2 == null) {
            Q2 = "";
        }
        objArr[0] = Q2;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, q)) {
            return q;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
