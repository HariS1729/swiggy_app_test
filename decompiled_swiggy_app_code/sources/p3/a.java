package p3;

import android.content.Context;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.d;
import androidx.slice.Slice;
import androidx.slice.SliceSpec;
import java.util.ArrayList;
import java.util.List;
import o3.f;
import q3.b;
import q3.c;

/* compiled from: ListBuilder */
public class a extends e {

    /* renamed from: e  reason: collision with root package name */
    private q3.a f16213e;

    /* renamed from: p3.a$a  reason: collision with other inner class name */
    /* compiled from: ListBuilder */
    public static class C0164a {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f16214a = null;

        /* renamed from: b  reason: collision with root package name */
        private boolean f16215b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f16216c;

        /* renamed from: d  reason: collision with root package name */
        private long f16217d = -1;

        /* renamed from: e  reason: collision with root package name */
        private boolean f16218e;

        /* renamed from: f  reason: collision with root package name */
        private int f16219f;

        /* renamed from: g  reason: collision with root package name */
        private IconCompat f16220g;

        /* renamed from: h  reason: collision with root package name */
        private d f16221h;

        /* renamed from: i  reason: collision with root package name */
        private d f16222i;
        private CharSequence j;
        private boolean k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f16223l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f16224m;
        private CharSequence n;

        /* renamed from: o  reason: collision with root package name */
        private int f16225o = -1;

        /* renamed from: p  reason: collision with root package name */
        private List<Object> f16226p = new ArrayList();
        private List<Integer> q = new ArrayList();

        /* renamed from: r  reason: collision with root package name */
        private List<Boolean> f16227r = new ArrayList();

        /* renamed from: s  reason: collision with root package name */
        private boolean f16228s;

        public C0164a a(IconCompat iconCompat, int i11, boolean z11) {
            if (!this.f16215b) {
                this.f16226p.add(new d(iconCompat, Integer.valueOf(i11)));
                this.q.add(1);
                this.f16227r.add(Boolean.valueOf(z11));
                this.f16216c = true;
                return this;
            }
            throw new IllegalArgumentException("Trying to add an icon to end items when anaction has already been added. End items cannot have a mixture of actions and icons.");
        }

        public CharSequence b() {
            return this.n;
        }

        public List<Object> c() {
            return this.f16226p;
        }

        public List<Boolean> d() {
            return this.f16227r;
        }

        public List<Integer> e() {
            return this.q;
        }

        public int f() {
            return this.f16225o;
        }

        public d g() {
            return this.f16222i;
        }

        public CharSequence h() {
            return this.f16223l;
        }

        public long i() {
            return this.f16217d;
        }

        public CharSequence j() {
            return this.j;
        }

        public d k() {
            return this.f16221h;
        }

        public IconCompat l() {
            return this.f16220g;
        }

        public int m() {
            return this.f16219f;
        }

        public Uri n() {
            return this.f16214a;
        }

        public boolean o() {
            return this.f16224m;
        }

        public boolean p() {
            return this.f16228s;
        }

        public boolean q() {
            return this.f16218e;
        }

        public boolean r() {
            return this.k;
        }

        public C0164a s(d dVar) {
            this.f16222i = dVar;
            return this;
        }

        public C0164a t(CharSequence charSequence, boolean z11) {
            this.f16223l = charSequence;
            this.f16224m = z11;
            return this;
        }

        public C0164a u(CharSequence charSequence, boolean z11) {
            this.j = charSequence;
            this.k = z11;
            return this;
        }
    }

    public a(Context context, Uri uri, long j) {
        super(context, uri);
        this.f16213e.a(j);
    }

    /* access modifiers changed from: protected */
    public q3.d e() {
        SliceSpec sliceSpec = f.f15929c;
        if (a(sliceSpec)) {
            return new c(b(), sliceSpec, c());
        }
        SliceSpec sliceSpec2 = f.f15928b;
        if (a(sliceSpec2)) {
            return new c(b(), sliceSpec2, c());
        }
        SliceSpec sliceSpec3 = f.f15927a;
        if (a(sliceSpec3)) {
            return new b(b(), sliceSpec3);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void f(q3.d dVar) {
        this.f16213e = (q3.a) dVar;
    }

    public a g(C0164a aVar) {
        this.f16213e.b(aVar);
        return this;
    }

    public Slice h() {
        return ((q3.d) this.f16213e).d();
    }
}
