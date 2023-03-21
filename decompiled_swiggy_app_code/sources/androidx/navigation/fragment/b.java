package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.m;
import androidx.navigation.w;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

@w.b("fragment")
/* compiled from: FragmentNavigator */
public class b extends w<a> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10894a;

    /* renamed from: b  reason: collision with root package name */
    private final FragmentManager f10895b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10896c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayDeque<Integer> f10897d = new ArrayDeque<>();

    /* compiled from: FragmentNavigator */
    public static class a extends m {
        private String j;

        public a(w<? extends a> wVar) {
            super((w<? extends m>) wVar);
        }

        public final String B() {
            String str = this.j;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Fragment class was not set");
        }

        public final a D(String str) {
            this.j = str;
            return this;
        }

        public void q(Context context, AttributeSet attributeSet) {
            super.q(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.FragmentNavigator);
            String string = obtainAttributes.getString(R.styleable.FragmentNavigator_android_name);
            if (string != null) {
                D(string);
            }
            obtainAttributes.recycle();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.j;
            if (str == null) {
                sb2.append(SafeJsonPrimitive.NULL_STRING);
            } else {
                sb2.append(str);
            }
            return sb2.toString();
        }
    }

    /* renamed from: androidx.navigation.fragment.b$b  reason: collision with other inner class name */
    /* compiled from: FragmentNavigator */
    public static final class C0074b implements w.a {

        /* renamed from: a  reason: collision with root package name */
        private final LinkedHashMap<View, String> f10898a;

        public Map<View, String> a() {
            return Collections.unmodifiableMap(this.f10898a);
        }
    }

    public b(Context context, FragmentManager fragmentManager, int i11) {
        this.f10894a = context;
        this.f10895b = fragmentManager;
        this.f10896c = i11;
    }

    private String g(int i11, int i12) {
        return i11 + "-" + i12;
    }

    public void c(Bundle bundle) {
        int[] intArray;
        if (bundle != null && (intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds")) != null) {
            this.f10897d.clear();
            for (int valueOf : intArray) {
                this.f10897d.add(Integer.valueOf(valueOf));
            }
        }
    }

    public Bundle d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f10897d.size()];
        Iterator<Integer> it2 = this.f10897d.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            iArr[i11] = it2.next().intValue();
            i11++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    public boolean e() {
        if (this.f10897d.isEmpty()) {
            return false;
        }
        if (this.f10895b.O0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        this.f10895b.c1(g(this.f10897d.size(), this.f10897d.peekLast().intValue()), 1);
        this.f10897d.removeLast();
        return true;
    }

    /* renamed from: f */
    public a a() {
        return new a(this);
    }

    @Deprecated
    public Fragment h(Context context, FragmentManager fragmentManager, String str, Bundle bundle) {
        return fragmentManager.u0().a(context.getClassLoader(), str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0134 A[RETURN] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.navigation.m b(androidx.navigation.fragment.b.a r9, android.os.Bundle r10, androidx.navigation.t r11, androidx.navigation.w.a r12) {
        /*
            r8 = this;
            androidx.fragment.app.FragmentManager r0 = r8.f10895b
            boolean r0 = r0.O0()
            r1 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r9 = "FragmentNavigator"
            java.lang.String r10 = "Ignoring navigate() call: FragmentManager has already saved its state"
            android.util.Log.i(r9, r10)
            return r1
        L_0x0011:
            java.lang.String r0 = r9.B()
            r2 = 0
            char r3 = r0.charAt(r2)
            r4 = 46
            if (r3 != r4) goto L_0x0033
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r4 = r8.f10894a
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x0033:
            android.content.Context r3 = r8.f10894a
            androidx.fragment.app.FragmentManager r4 = r8.f10895b
            androidx.fragment.app.Fragment r0 = r8.h(r3, r4, r0, r10)
            r0.setArguments(r10)
            androidx.fragment.app.FragmentManager r10 = r8.f10895b
            androidx.fragment.app.s r10 = r10.n()
            r3 = -1
            if (r11 == 0) goto L_0x004c
            int r4 = r11.a()
            goto L_0x004d
        L_0x004c:
            r4 = -1
        L_0x004d:
            if (r11 == 0) goto L_0x0054
            int r5 = r11.b()
            goto L_0x0055
        L_0x0054:
            r5 = -1
        L_0x0055:
            if (r11 == 0) goto L_0x005c
            int r6 = r11.c()
            goto L_0x005d
        L_0x005c:
            r6 = -1
        L_0x005d:
            if (r11 == 0) goto L_0x0064
            int r7 = r11.d()
            goto L_0x0065
        L_0x0064:
            r7 = -1
        L_0x0065:
            if (r4 != r3) goto L_0x006d
            if (r5 != r3) goto L_0x006d
            if (r6 != r3) goto L_0x006d
            if (r7 == r3) goto L_0x0080
        L_0x006d:
            if (r4 == r3) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r4 = 0
        L_0x0071:
            if (r5 == r3) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            if (r6 == r3) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r6 = 0
        L_0x0079:
            if (r7 == r3) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r7 = 0
        L_0x007d:
            r10.x(r4, r5, r6, r7)
        L_0x0080:
            int r3 = r8.f10896c
            r10.t(r3, r0)
            r10.z(r0)
            int r0 = r9.l()
            java.util.ArrayDeque<java.lang.Integer> r3 = r8.f10897d
            boolean r3 = r3.isEmpty()
            r4 = 1
            if (r11 == 0) goto L_0x00ad
            if (r3 != 0) goto L_0x00ad
            boolean r11 = r11.g()
            if (r11 == 0) goto L_0x00ad
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f10897d
            java.lang.Object r11 = r11.peekLast()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 != r0) goto L_0x00ad
            r11 = 1
            goto L_0x00ae
        L_0x00ad:
            r11 = 0
        L_0x00ae:
            if (r3 == 0) goto L_0x00b2
        L_0x00b0:
            r2 = 1
            goto L_0x00f4
        L_0x00b2:
            if (r11 == 0) goto L_0x00e5
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f10897d
            int r11 = r11.size()
            if (r11 <= r4) goto L_0x00f4
            androidx.fragment.app.FragmentManager r11 = r8.f10895b
            java.util.ArrayDeque<java.lang.Integer> r3 = r8.f10897d
            int r3 = r3.size()
            java.util.ArrayDeque<java.lang.Integer> r5 = r8.f10897d
            java.lang.Object r5 = r5.peekLast()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r3 = r8.g(r3, r5)
            r11.c1(r3, r4)
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f10897d
            int r11 = r11.size()
            java.lang.String r11 = r8.g(r11, r0)
            r10.h(r11)
            goto L_0x00f4
        L_0x00e5:
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.f10897d
            int r11 = r11.size()
            int r11 = r11 + r4
            java.lang.String r11 = r8.g(r11, r0)
            r10.h(r11)
            goto L_0x00b0
        L_0x00f4:
            boolean r11 = r12 instanceof androidx.navigation.fragment.b.C0074b
            if (r11 == 0) goto L_0x0122
            androidx.navigation.fragment.b$b r12 = (androidx.navigation.fragment.b.C0074b) r12
            java.util.Map r11 = r12.a()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0106:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0122
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r3 = r12.getKey()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r10.g(r3, r12)
            goto L_0x0106
        L_0x0122:
            r10.A(r4)
            r10.j()
            if (r2 == 0) goto L_0x0134
            java.util.ArrayDeque<java.lang.Integer> r10 = r8.f10897d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r10.add(r11)
            return r9
        L_0x0134:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.b.b(androidx.navigation.fragment.b$a, android.os.Bundle, androidx.navigation.t, androidx.navigation.w$a):androidx.navigation.m");
    }
}
