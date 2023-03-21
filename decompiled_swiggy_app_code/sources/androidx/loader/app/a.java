package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.p0;
import androidx.lifecycle.r;
import androidx.loader.content.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager */
public abstract class a {

    /* renamed from: androidx.loader.app.a$a  reason: collision with other inner class name */
    /* compiled from: LoaderManager */
    public interface C0068a<D> {
        b<D> a(int i11, Bundle bundle);

        void b(b<D> bVar, D d11);

        void c(b<D> bVar);
    }

    public static <T extends r & p0> a b(T t) {
        return new b(t, ((p0) t).getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> b<D> c(int i11, Bundle bundle, C0068a<D> aVar);

    public abstract void d();
}
