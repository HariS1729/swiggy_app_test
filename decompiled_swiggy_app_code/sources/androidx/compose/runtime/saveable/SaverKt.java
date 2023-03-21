package androidx.compose.runtime.saveable;

import lp0.l;
import lp0.p;
import m0.c;
import m0.d;

/* compiled from: Saver.kt */
public final class SaverKt {

    /* renamed from: a  reason: collision with root package name */
    private static final c<Object, Object> f6215a = a(SaverKt$AutoSaver$1.f6216a, SaverKt$AutoSaver$2.f6217a);

    /* compiled from: Saver.kt */
    public static final class a implements c<Original, Saveable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<d, Original, Saveable> f6218a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l<Saveable, Original> f6219b;

        a(p<? super d, ? super Original, ? extends Saveable> pVar, l<? super Saveable, ? extends Original> lVar) {
            this.f6218a = pVar;
            this.f6219b = lVar;
        }

        public Original a(Saveable saveable) {
            kotlin.jvm.internal.p.j(saveable, "value");
            return this.f6219b.invoke(saveable);
        }

        public Saveable b(d dVar, Original original) {
            kotlin.jvm.internal.p.j(dVar, "<this>");
            return this.f6218a.invoke(dVar, original);
        }
    }

    public static final <Original, Saveable> c<Original, Saveable> a(p<? super d, ? super Original, ? extends Saveable> pVar, l<? super Saveable, ? extends Original> lVar) {
        kotlin.jvm.internal.p.j(pVar, "save");
        kotlin.jvm.internal.p.j(lVar, "restore");
        return new a(pVar, lVar);
    }

    public static final <T> c<T, Object> b() {
        return f6215a;
    }
}
