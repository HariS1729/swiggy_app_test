package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.collection.h;
import androidx.navigation.common.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: NavDestination */
public class m {

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap<String, Class<?>> f10943i = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final String f10944a;

    /* renamed from: b  reason: collision with root package name */
    private o f10945b;

    /* renamed from: c  reason: collision with root package name */
    private int f10946c;

    /* renamed from: d  reason: collision with root package name */
    private String f10947d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f10948e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<j> f10949f;

    /* renamed from: g  reason: collision with root package name */
    private h<c> f10950g;

    /* renamed from: h  reason: collision with root package name */
    private HashMap<String, g> f10951h;

    /* compiled from: NavDestination */
    static class a implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        private final m f10952a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f10953b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f10954c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f10955d;

        /* renamed from: e  reason: collision with root package name */
        private final int f10956e;

        a(m mVar, Bundle bundle, boolean z11, boolean z12, int i11) {
            this.f10952a = mVar;
            this.f10953b = bundle;
            this.f10954c = z11;
            this.f10955d = z12;
            this.f10956e = i11;
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            boolean z11 = this.f10954c;
            if (z11 && !aVar.f10954c) {
                return 1;
            }
            if (!z11 && aVar.f10954c) {
                return -1;
            }
            Bundle bundle = this.f10953b;
            if (bundle != null && aVar.f10953b == null) {
                return 1;
            }
            if (bundle == null && aVar.f10953b != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size() - aVar.f10953b.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z12 = this.f10955d;
            if (z12 && !aVar.f10955d) {
                return 1;
            }
            if (z12 || !aVar.f10955d) {
                return this.f10956e - aVar.f10956e;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public m h() {
            return this.f10952a;
        }

        /* access modifiers changed from: package-private */
        public Bundle i() {
            return this.f10953b;
        }
    }

    public m(w<? extends m> wVar) {
        this(x.c(wVar.getClass()));
    }

    static String k(Context context, int i11) {
        if (i11 <= 16777215) {
            return Integer.toString(i11);
        }
        try {
            return context.getResources().getResourceName(i11);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i11);
        }
    }

    public final void a(String str, g gVar) {
        if (this.f10951h == null) {
            this.f10951h = new HashMap<>();
        }
        this.f10951h.put(str, gVar);
    }

    public final void b(j jVar) {
        if (this.f10949f == null) {
            this.f10949f = new ArrayList<>();
        }
        this.f10949f.add(jVar);
    }

    /* access modifiers changed from: package-private */
    public Bundle c(Bundle bundle) {
        HashMap<String, g> hashMap;
        if (bundle == null && ((hashMap = this.f10951h) == null || hashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, g> hashMap2 = this.f10951h;
        if (hashMap2 != null) {
            for (Map.Entry next : hashMap2.entrySet()) {
                ((g) next.getValue()).e((String) next.getKey(), bundle2);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, g> hashMap3 = this.f10951h;
            if (hashMap3 != null) {
                for (Map.Entry next2 : hashMap3.entrySet()) {
                    if (!((g) next2.getValue()).f((String) next2.getKey(), bundle)) {
                        throw new IllegalArgumentException("Wrong argument type for '" + ((String) next2.getKey()) + "' in argument bundle. " + ((g) next2.getValue()).b().c() + " expected.");
                    }
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public int[] f() {
        ArrayDeque arrayDeque = new ArrayDeque();
        o oVar = this;
        while (true) {
            o o11 = oVar.o();
            if (o11 == null || o11.G() != oVar.l()) {
                arrayDeque.addFirst(oVar);
            }
            if (o11 == null) {
                break;
            }
            oVar = o11;
        }
        int[] iArr = new int[arrayDeque.size()];
        int i11 = 0;
        Iterator it2 = arrayDeque.iterator();
        while (it2.hasNext()) {
            iArr[i11] = ((m) it2.next()).l();
            i11++;
        }
        return iArr;
    }

    public final c g(int i11) {
        h<c> hVar = this.f10950g;
        c i12 = hVar == null ? null : hVar.i(i11);
        if (i12 != null) {
            return i12;
        }
        if (o() != null) {
            return o().g(i11);
        }
        return null;
    }

    public final Map<String, g> h() {
        HashMap<String, g> hashMap = this.f10951h;
        if (hashMap == null) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public String i() {
        if (this.f10947d == null) {
            this.f10947d = Integer.toString(this.f10946c);
        }
        return this.f10947d;
    }

    public final int l() {
        return this.f10946c;
    }

    public final CharSequence m() {
        return this.f10948e;
    }

    public final String n() {
        return this.f10944a;
    }

    public final o o() {
        return this.f10945b;
    }

    /* access modifiers changed from: package-private */
    public a p(l lVar) {
        ArrayList<j> arrayList = this.f10949f;
        if (arrayList == null) {
            return null;
        }
        Iterator<j> it2 = arrayList.iterator();
        a aVar = null;
        while (it2.hasNext()) {
            j next = it2.next();
            Uri c11 = lVar.c();
            Bundle c12 = c11 != null ? next.c(c11, h()) : null;
            String a11 = lVar.a();
            boolean z11 = a11 != null && a11.equals(next.b());
            String b11 = lVar.b();
            int d11 = b11 != null ? next.d(b11) : -1;
            if (c12 != null || z11 || d11 > -1) {
                a aVar2 = new a(this, c12, next.e(), z11, d11);
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }

    public void q(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.Navigator);
        s(obtainAttributes.getResourceId(R.styleable.Navigator_android_id, 0));
        this.f10947d = k(context, this.f10946c);
        t(obtainAttributes.getText(R.styleable.Navigator_android_label));
        obtainAttributes.recycle();
    }

    public final void r(int i11, c cVar) {
        if (!v()) {
            throw new UnsupportedOperationException("Cannot add action " + i11 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        } else if (i11 != 0) {
            if (this.f10950g == null) {
                this.f10950g = new h<>();
            }
            this.f10950g.n(i11, cVar);
        } else {
            throw new IllegalArgumentException("Cannot have an action with actionId 0");
        }
    }

    public final void s(int i11) {
        this.f10946c = i11;
        this.f10947d = null;
    }

    public final void t(CharSequence charSequence) {
        this.f10948e = charSequence;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f10947d;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f10946c));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        if (this.f10948e != null) {
            sb2.append(" label=");
            sb2.append(this.f10948e);
        }
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final void u(o oVar) {
        this.f10945b = oVar;
    }

    /* access modifiers changed from: package-private */
    public boolean v() {
        return true;
    }

    public m(String str) {
        this.f10944a = str;
    }
}
