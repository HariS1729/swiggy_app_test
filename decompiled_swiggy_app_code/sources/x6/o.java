package x6;

import c7.c;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Tags.kt */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final a f17844b = new a((i) null);

    /* renamed from: c  reason: collision with root package name */
    public static final o f17845c = new o(x.f());

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, Object> f17846a;

    /* compiled from: Tags.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final o a(Map<Class<?>, ? extends Object> map) {
            return new o(c.b(map), (i) null);
        }
    }

    private o(Map<Class<?>, ? extends Object> map) {
        this.f17846a = map;
    }

    public /* synthetic */ o(Map map, i iVar) {
        this(map);
    }

    public final Map<Class<?>, Object> a() {
        return this.f17846a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && p.e(this.f17846a, ((o) obj).f17846a);
    }

    public int hashCode() {
        return this.f17846a.hashCode();
    }

    public String toString() {
        return "Tags(tags=" + this.f17846a + ')';
    }
}
