package m1;

import android.content.res.Configuration;
import android.content.res.Resources;
import in.swiggy.android.tejas.network.HttpRequest;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.p;
import y0.c;

/* compiled from: VectorResources.android.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<b, WeakReference<a>> f15593a = new HashMap<>();

    /* compiled from: VectorResources.android.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final c f15594a;

        /* renamed from: b  reason: collision with root package name */
        private final int f15595b;

        public a(c cVar, int i11) {
            p.j(cVar, "imageVector");
            this.f15594a = cVar;
            this.f15595b = i11;
        }

        public final int a() {
            return this.f15595b;
        }

        public final c b() {
            return this.f15594a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p.e(this.f15594a, aVar.f15594a) && this.f15595b == aVar.f15595b;
        }

        public int hashCode() {
            return (this.f15594a.hashCode() * 31) + this.f15595b;
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f15594a + ", configFlags=" + this.f15595b + ')';
        }
    }

    /* compiled from: VectorResources.android.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Resources.Theme f15596a;

        /* renamed from: b  reason: collision with root package name */
        private final int f15597b;

        public b(Resources.Theme theme, int i11) {
            p.j(theme, "theme");
            this.f15596a = theme;
            this.f15597b = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p.e(this.f15596a, bVar.f15596a) && this.f15597b == bVar.f15597b;
        }

        public int hashCode() {
            return (this.f15596a.hashCode() * 31) + this.f15597b;
        }

        public String toString() {
            return "Key(theme=" + this.f15596a + ", id=" + this.f15597b + ')';
        }
    }

    public final void a() {
        this.f15593a.clear();
    }

    public final a b(b bVar) {
        p.j(bVar, HttpRequest.HEADER_KEY);
        WeakReference weakReference = this.f15593a.get(bVar);
        if (weakReference != null) {
            return (a) weakReference.get();
        }
        return null;
    }

    public final void c(int i11) {
        Iterator<Map.Entry<b, WeakReference<a>>> it2 = this.f15593a.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<b, WeakReference<a>> next = it2.next();
            p.i(next, "it.next()");
            a aVar = (a) ((WeakReference) next.getValue()).get();
            if (aVar == null || Configuration.needNewResources(i11, aVar.a())) {
                it2.remove();
            }
        }
    }

    public final void d(b bVar, a aVar) {
        p.j(bVar, HttpRequest.HEADER_KEY);
        p.j(aVar, "imageVectorEntry");
        this.f15593a.put(bVar, new WeakReference(aVar));
    }
}
