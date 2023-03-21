package e;

import android.content.Context;
import android.content.Intent;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;

/* compiled from: ActivityResultContract.kt */
public abstract class a<I, O> {

    /* renamed from: e.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityResultContract.kt */
    public static final class C0118a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f14154a;

        public C0118a(T t) {
            this.f14154a = t;
        }

        public final T a() {
            return this.f14154a;
        }
    }

    public abstract Intent a(Context context, I i11);

    public C0118a<O> b(Context context, I i11) {
        p.j(context, LogCategory.CONTEXT);
        return null;
    }

    public abstract O c(int i11, Intent intent);
}
