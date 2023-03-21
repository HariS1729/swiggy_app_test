package p0;

import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Modifier.kt */
public interface d {

    /* renamed from: h0  reason: collision with root package name */
    public static final a f16037h0 = a.f16038a;

    /* compiled from: Modifier.kt */
    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f16038a = new a();

        private a() {
        }

        public d N(d dVar) {
            p.j(dVar, "other");
            return dVar;
        }

        public <R> R W(R r11, lp0.p<? super b, ? super R, ? extends R> pVar) {
            p.j(pVar, "operation");
            return r11;
        }

        public <R> R s(R r11, lp0.p<? super R, ? super b, ? extends R> pVar) {
            p.j(pVar, "operation");
            return r11;
        }

        public String toString() {
            return "Modifier";
        }

        public boolean x(l<? super b, Boolean> lVar) {
            p.j(lVar, "predicate");
            return true;
        }
    }

    /* compiled from: Modifier.kt */
    public interface b extends d {
    }

    d N(d dVar);

    <R> R W(R r11, lp0.p<? super b, ? super R, ? extends R> pVar);

    <R> R s(R r11, lp0.p<? super R, ? super b, ? extends R> pVar);

    boolean x(l<? super b, Boolean> lVar);
}
