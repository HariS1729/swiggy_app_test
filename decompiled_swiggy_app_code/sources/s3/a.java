package s3;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import com.newrelic.agent.android.agentdata.HexAttribute;

/* compiled from: SliceActionImpl */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private PendingIntent f16637a;

    /* renamed from: b  reason: collision with root package name */
    private IconCompat f16638b;

    /* renamed from: c  reason: collision with root package name */
    private int f16639c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f16640d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f16641e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16642f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f16643g;

    /* renamed from: h  reason: collision with root package name */
    private int f16644h = -1;

    /* renamed from: i  reason: collision with root package name */
    private SliceItem f16645i;
    private boolean j;

    public a(PendingIntent pendingIntent, IconCompat iconCompat, int i11, CharSequence charSequence) {
        this.f16637a = pendingIntent;
        this.f16638b = iconCompat;
        this.f16640d = charSequence;
        this.f16639c = i11;
    }

    private Slice.a c(Slice.a aVar) {
        Slice.a aVar2 = new Slice.a(aVar);
        IconCompat iconCompat = this.f16638b;
        if (iconCompat != null) {
            aVar2.e(iconCompat, (String) null, this.f16639c == 0 ? new String[0] : new String[]{"no_tint"});
        }
        CharSequence charSequence = this.f16640d;
        if (charSequence != null) {
            aVar2.k(charSequence, (String) null, "title");
        }
        CharSequence charSequence2 = this.f16641e;
        if (charSequence2 != null) {
            aVar2.k(charSequence2, "content_description", new String[0]);
        }
        if (this.f16642f && this.f16643g) {
            aVar2.c("selected");
        }
        int i11 = this.f16644h;
        if (i11 != -1) {
            aVar2.f(i11, HexAttribute.HEX_ATTR_THREAD_PRI, new String[0]);
        }
        if (this.j) {
            aVar.c("activity");
        }
        return aVar2;
    }

    public Slice a(Slice.a aVar) {
        return c(aVar).c("shortcut", "title").m();
    }

    public Slice b(Slice.a aVar) {
        return aVar.c("shortcut").a(this.f16637a, c(aVar).m(), f()).m();
    }

    public PendingIntent d() {
        PendingIntent pendingIntent = this.f16637a;
        return pendingIntent != null ? pendingIntent : this.f16645i.b();
    }

    public IconCompat e() {
        return this.f16638b;
    }

    public String f() {
        if (this.f16642f) {
            return "toggle";
        }
        return null;
    }

    public CharSequence g() {
        return this.f16640d;
    }
}
