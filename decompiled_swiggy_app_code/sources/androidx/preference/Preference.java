package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.k;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import java.util.List;

public class Preference implements Comparable<Preference> {
    private int A;
    private int B;
    private b C;
    private List<Preference> D;
    private e E;
    private final View.OnClickListener F;

    /* renamed from: a  reason: collision with root package name */
    private Context f11015a;

    /* renamed from: b  reason: collision with root package name */
    private c f11016b;

    /* renamed from: c  reason: collision with root package name */
    private d f11017c;

    /* renamed from: d  reason: collision with root package name */
    private int f11018d;

    /* renamed from: e  reason: collision with root package name */
    private int f11019e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f11020f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f11021g;

    /* renamed from: h  reason: collision with root package name */
    private int f11022h;

    /* renamed from: i  reason: collision with root package name */
    private String f11023i;
    private Intent j;
    private String k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f11024l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11025m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private String f11026o;

    /* renamed from: p  reason: collision with root package name */
    private Object f11027p;
    private boolean q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f11028r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11029s;
    private boolean t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f11030u;
    private boolean v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f11031w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f11032x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f11033y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f11034z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            Preference.this.E(view);
        }
    }

    interface b {
        void a(Preference preference);
    }

    public interface c {
        boolean a(Preference preference, Object obj);
    }

    public interface d {
        boolean a(Preference preference);
    }

    public interface e<T extends Preference> {
        CharSequence a(T t);
    }

    public Preference(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f11018d = Integer.MAX_VALUE;
        this.f11019e = 0;
        this.f11024l = true;
        this.f11025m = true;
        this.n = true;
        this.q = true;
        this.f11028r = true;
        this.f11029s = true;
        this.t = true;
        this.f11030u = true;
        this.f11031w = true;
        this.f11034z = true;
        int i13 = R.layout.preference;
        this.A = i13;
        this.F = new a();
        this.f11015a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Preference, i11, i12);
        this.f11022h = k.n(obtainStyledAttributes, R.styleable.Preference_icon, R.styleable.Preference_android_icon, 0);
        this.f11023i = k.o(obtainStyledAttributes, R.styleable.Preference_key, R.styleable.Preference_android_key);
        this.f11020f = k.p(obtainStyledAttributes, R.styleable.Preference_title, R.styleable.Preference_android_title);
        this.f11021g = k.p(obtainStyledAttributes, R.styleable.Preference_summary, R.styleable.Preference_android_summary);
        this.f11018d = k.d(obtainStyledAttributes, R.styleable.Preference_order, R.styleable.Preference_android_order, Integer.MAX_VALUE);
        this.k = k.o(obtainStyledAttributes, R.styleable.Preference_fragment, R.styleable.Preference_android_fragment);
        this.A = k.n(obtainStyledAttributes, R.styleable.Preference_layout, R.styleable.Preference_android_layout, i13);
        this.B = k.n(obtainStyledAttributes, R.styleable.Preference_widgetLayout, R.styleable.Preference_android_widgetLayout, 0);
        this.f11024l = k.b(obtainStyledAttributes, R.styleable.Preference_enabled, R.styleable.Preference_android_enabled, true);
        this.f11025m = k.b(obtainStyledAttributes, R.styleable.Preference_selectable, R.styleable.Preference_android_selectable, true);
        this.n = k.b(obtainStyledAttributes, R.styleable.Preference_persistent, R.styleable.Preference_android_persistent, true);
        this.f11026o = k.o(obtainStyledAttributes, R.styleable.Preference_dependency, R.styleable.Preference_android_dependency);
        int i14 = R.styleable.Preference_allowDividerAbove;
        this.t = k.b(obtainStyledAttributes, i14, i14, this.f11025m);
        int i15 = R.styleable.Preference_allowDividerBelow;
        this.f11030u = k.b(obtainStyledAttributes, i15, i15, this.f11025m);
        int i16 = R.styleable.Preference_defaultValue;
        if (obtainStyledAttributes.hasValue(i16)) {
            this.f11027p = A(obtainStyledAttributes, i16);
        } else {
            int i17 = R.styleable.Preference_android_defaultValue;
            if (obtainStyledAttributes.hasValue(i17)) {
                this.f11027p = A(obtainStyledAttributes, i17);
            }
        }
        this.f11034z = k.b(obtainStyledAttributes, R.styleable.Preference_shouldDisableView, R.styleable.Preference_android_shouldDisableView, true);
        int i18 = R.styleable.Preference_singleLineTitle;
        boolean hasValue = obtainStyledAttributes.hasValue(i18);
        this.v = hasValue;
        if (hasValue) {
            this.f11031w = k.b(obtainStyledAttributes, i18, R.styleable.Preference_android_singleLineTitle, true);
        }
        this.f11032x = k.b(obtainStyledAttributes, R.styleable.Preference_iconSpaceReserved, R.styleable.Preference_android_iconSpaceReserved, false);
        int i19 = R.styleable.Preference_isPreferenceVisible;
        this.f11029s = k.b(obtainStyledAttributes, i19, i19, true);
        int i21 = R.styleable.Preference_enableCopying;
        this.f11033y = k.b(obtainStyledAttributes, i21, i21, false);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public Object A(TypedArray typedArray, int i11) {
        return null;
    }

    public void B(Preference preference, boolean z11) {
        if (this.f11028r == z11) {
            this.f11028r = !z11;
            x(K());
            w();
        }
    }

    public void C() {
        if (u() && v()) {
            y();
            d dVar = this.f11017c;
            if (dVar == null || !dVar.a(this)) {
                p();
                if (this.j != null) {
                    h().startActivity(this.j);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void E(View view) {
        C();
    }

    /* access modifiers changed from: protected */
    public boolean F(boolean z11) {
        if (!L()) {
            return false;
        }
        if (z11 == l(!z11)) {
            return true;
        }
        o();
        throw null;
    }

    /* access modifiers changed from: protected */
    public boolean G(int i11) {
        if (!L()) {
            return false;
        }
        if (i11 == m(~i11)) {
            return true;
        }
        o();
        throw null;
    }

    /* access modifiers changed from: protected */
    public boolean I(String str) {
        if (!L()) {
            return false;
        }
        if (TextUtils.equals(str, n((String) null))) {
            return true;
        }
        o();
        throw null;
    }

    public final void J(e eVar) {
        this.E = eVar;
        w();
    }

    public boolean K() {
        return !u();
    }

    /* access modifiers changed from: protected */
    public boolean L() {
        return false;
    }

    public boolean a(Object obj) {
        c cVar = this.f11016b;
        return cVar == null || cVar.a(this, obj);
    }

    /* renamed from: c */
    public int compareTo(Preference preference) {
        int i11 = this.f11018d;
        int i12 = preference.f11018d;
        if (i11 != i12) {
            return i11 - i12;
        }
        CharSequence charSequence = this.f11020f;
        CharSequence charSequence2 = preference.f11020f;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f11020f.toString());
    }

    public Context h() {
        return this.f11015a;
    }

    /* access modifiers changed from: package-private */
    public StringBuilder i() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence s11 = s();
        if (!TextUtils.isEmpty(s11)) {
            sb2.append(s11);
            sb2.append(SafeJsonPrimitive.NULL_CHAR);
        }
        CharSequence q11 = q();
        if (!TextUtils.isEmpty(q11)) {
            sb2.append(q11);
            sb2.append(SafeJsonPrimitive.NULL_CHAR);
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2;
    }

    public String j() {
        return this.k;
    }

    public Intent k() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public boolean l(boolean z11) {
        if (!L()) {
            return z11;
        }
        o();
        throw null;
    }

    /* access modifiers changed from: protected */
    public int m(int i11) {
        if (!L()) {
            return i11;
        }
        o();
        throw null;
    }

    /* access modifiers changed from: protected */
    public String n(String str) {
        if (!L()) {
            return str;
        }
        o();
        throw null;
    }

    public j3.a o() {
        return null;
    }

    public j3.b p() {
        return null;
    }

    public CharSequence q() {
        if (r() != null) {
            return r().a(this);
        }
        return this.f11021g;
    }

    public final e r() {
        return this.E;
    }

    public CharSequence s() {
        return this.f11020f;
    }

    public boolean t() {
        return !TextUtils.isEmpty(this.f11023i);
    }

    public String toString() {
        return i().toString();
    }

    public boolean u() {
        return this.f11024l && this.q && this.f11028r;
    }

    public boolean v() {
        return this.f11025m;
    }

    /* access modifiers changed from: protected */
    public void w() {
        b bVar = this.C;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void x(boolean z11) {
        List<Preference> list = this.D;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).z(this, z11);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void y() {
    }

    public void z(Preference preference, boolean z11) {
        if (this.q == z11) {
            this.q = !z11;
            x(K());
            w();
        }
    }

    public Preference(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, R.attr.preferenceStyle, 16842894));
    }
}
