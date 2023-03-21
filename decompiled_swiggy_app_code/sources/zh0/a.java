package zh0;

import android.location.Location;
import bp0.k;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: LynxFragmentEvent.kt */
public abstract class a {

    /* renamed from: zh0.a$a  reason: collision with other inner class name */
    /* compiled from: LynxFragmentEvent.kt */
    public static final class C0253a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final lp0.a<k> f20065a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0253a(lp0.a<k> aVar) {
            super((i) null);
            p.j(aVar, "onCleared");
            this.f20065a = aVar;
        }

        public final lp0.a<k> a() {
            return this.f20065a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0253a) && p.e(this.f20065a, ((C0253a) obj).f20065a);
        }

        public int hashCode() {
            return this.f20065a.hashCode();
        }

        public String toString() {
            return "ClearWebViews(onCleared=" + this.f20065a + ')';
        }
    }

    /* compiled from: LynxFragmentEvent.kt */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final l<Integer, k> f20066a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(l<? super Integer, k> lVar) {
            super((i) null);
            p.j(lVar, "callback");
            this.f20066a = lVar;
        }

        public final l<Integer, k> a() {
            return this.f20066a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p.e(this.f20066a, ((b) obj).f20066a);
        }

        public int hashCode() {
            return this.f20066a.hashCode();
        }

        public String toString() {
            return "GetBottomBarHeight(callback=" + this.f20066a + ')';
        }
    }

    /* compiled from: LynxFragmentEvent.kt */
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private final l<Boolean, k> f20067a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(l<? super Boolean, k> lVar) {
            super((i) null);
            p.j(lVar, "callback");
            this.f20067a = lVar;
        }

        public final l<Boolean, k> a() {
            return this.f20067a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p.e(this.f20067a, ((c) obj).f20067a);
        }

        public int hashCode() {
            return this.f20067a.hashCode();
        }

        public String toString() {
            return "IsInstamartOrGenie(callback=" + this.f20067a + ')';
        }
    }

    /* compiled from: LynxFragmentEvent.kt */
    public static final class d extends a {

        /* renamed from: a  reason: collision with root package name */
        private final Location f20068a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Location location) {
            super((i) null);
            p.j(location, "location");
            this.f20068a = location;
        }

        public final Location a() {
            return this.f20068a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p.e(this.f20068a, ((d) obj).f20068a);
        }

        public int hashCode() {
            return this.f20068a.hashCode();
        }

        public String toString() {
            return "LocationChanged(location=" + this.f20068a + ')';
        }
    }

    /* compiled from: LynxFragmentEvent.kt */
    public static final class e extends a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f20069a;

        /* renamed from: b  reason: collision with root package name */
        private final lp0.a<k> f20070b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(boolean z11, lp0.a<k> aVar) {
            super((i) null);
            p.j(aVar, "callback");
            this.f20069a = z11;
            this.f20070b = aVar;
        }

        public final lp0.a<k> a() {
            return this.f20070b;
        }

        public final boolean b() {
            return this.f20069a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f20069a == eVar.f20069a && p.e(this.f20070b, eVar.f20070b);
        }

        public int hashCode() {
            boolean z11 = this.f20069a;
            if (z11) {
                z11 = true;
            }
            return ((z11 ? 1 : 0) * true) + this.f20070b.hashCode();
        }

        public String toString() {
            return "ShowGenericLoader(showGenericLoader=" + this.f20069a + ", callback=" + this.f20070b + ')';
        }
    }

    private a() {
    }

    public /* synthetic */ a(i iVar) {
        this();
    }
}
