package p6;

import java.io.IOException;
import lp0.l;
import okio.c;
import okio.f0;
import okio.k;

/* compiled from: FaultHidingSink.kt */
public final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    private final l<IOException, bp0.k> f16256a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16257b;

    public b(f0 f0Var, l<? super IOException, bp0.k> lVar) {
        super(f0Var);
        this.f16256a = lVar;
    }

    public void close() {
        try {
            super.close();
        } catch (IOException e11) {
            this.f16257b = true;
            this.f16256a.invoke(e11);
        }
    }

    public void flush() {
        try {
            super.flush();
        } catch (IOException e11) {
            this.f16257b = true;
            this.f16256a.invoke(e11);
        }
    }

    public void write(c cVar, long j) {
        if (this.f16257b) {
            cVar.skip(j);
            return;
        }
        try {
            super.write(cVar, j);
        } catch (IOException e11) {
            this.f16257b = true;
            this.f16256a.invoke(e11);
        }
    }
}
