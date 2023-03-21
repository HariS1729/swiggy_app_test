package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import bp0.h;
import in.swiggy.android.tejas.network.HttpRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import n3.b;

/* compiled from: SavedStateHandle.kt */
public final class d0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f10719f = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Class<? extends Object>[] f10720g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f10721a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, b.c> f10722b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f10723c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, kotlinx.coroutines.flow.i<Object>> f10724d;

    /* renamed from: e  reason: collision with root package name */
    private final b.c f10725e;

    /* compiled from: SavedStateHandle.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final d0 a(Bundle bundle, Bundle bundle2) {
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = parcelableArrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        Object obj = parcelableArrayList.get(i11);
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i11));
                    }
                    return new d0(linkedHashMap);
                }
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            } else if (bundle2 == null) {
                return new d0();
            } else {
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    p.i(str, HttpRequest.HEADER_KEY);
                    hashMap.put(str, bundle2.get(str));
                }
                return new d0(hashMap);
            }
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : d0.f10720g) {
                p.g(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public d0(Map<String, ? extends Object> map) {
        p.j(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f10721a = linkedHashMap;
        this.f10722b = new LinkedHashMap();
        this.f10723c = new LinkedHashMap();
        this.f10724d = new LinkedHashMap();
        this.f10725e = new c0(this);
        linkedHashMap.putAll(map);
    }

    public static final d0 c(Bundle bundle, Bundle bundle2) {
        return f10719f.a(bundle, bundle2);
    }

    /* access modifiers changed from: private */
    public static final Bundle e(d0 d0Var) {
        p.j(d0Var, "this$0");
        for (Map.Entry entry : x.r(d0Var.f10722b).entrySet()) {
            d0Var.f((String) entry.getKey(), ((b.c) entry.getValue()).c());
        }
        Set<String> keySet = d0Var.f10721a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String next : keySet) {
            arrayList.add(next);
            arrayList2.add(d0Var.f10721a.get(next));
        }
        return androidx.core.os.b.a(h.a("keys", arrayList), h.a("values", arrayList2));
    }

    public final b.c d() {
        return this.f10725e;
    }

    public final <T> void f(String str, T t) {
        p.j(str, HttpRequest.HEADER_KEY);
        if (f10719f.b(t)) {
            Object obj = this.f10723c.get(str);
            y yVar = obj instanceof y ? (y) obj : null;
            if (yVar != null) {
                yVar.q(t);
            } else {
                this.f10721a.put(str, t);
            }
            kotlinx.coroutines.flow.i iVar = this.f10724d.get(str);
            if (iVar != null) {
                iVar.setValue(t);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't put value with type ");
        p.g(t);
        sb2.append(t.getClass());
        sb2.append(" into saved state");
        throw new IllegalArgumentException(sb2.toString());
    }

    public d0() {
        this.f10721a = new LinkedHashMap();
        this.f10722b = new LinkedHashMap();
        this.f10723c = new LinkedHashMap();
        this.f10724d = new LinkedHashMap();
        this.f10725e = new c0(this);
    }
}
