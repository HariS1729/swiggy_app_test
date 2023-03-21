package defpackage;

import android.content.Context;
import android.net.Uri;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.interactive.InteractiveRequestRecord;
import h8.c;
import java.util.UUID;

/* renamed from: b  reason: default package */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    protected final c<?, ?, ?, ?> f12538a;

    /* renamed from: b  reason: collision with root package name */
    protected final String f12539b = UUID.randomUUID().toString();

    /* renamed from: c  reason: collision with root package name */
    private int f12540c = 0;

    public b(c<?, ?, ?, ?> cVar) {
        this.f12538a = cVar;
    }

    public int a() {
        return 1;
    }

    public InteractiveRequestRecord b() {
        return new InteractiveRequestRecord(this.f12539b, this.f12538a.l());
    }

    public c<?, ?, ?, ?> c() {
        return this.f12538a;
    }

    public String d() {
        return this.f12539b;
    }

    public abstract String e(Context context) throws AuthError;

    public void f() {
        this.f12540c++;
    }

    public boolean g() {
        return this.f12540c < a();
    }

    public abstract boolean h(Uri uri, Context context);

    public void i() {
        c<?, ?, ?, ?> cVar = this.f12538a;
        if (cVar != null) {
            cVar.k().m(b());
        }
    }
}
