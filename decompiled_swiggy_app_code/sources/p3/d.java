package p3;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import s3.a;

/* compiled from: SliceAction */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private a f16229a;

    public d(PendingIntent pendingIntent, IconCompat iconCompat, int i11, CharSequence charSequence) {
        this.f16229a = new a(pendingIntent, iconCompat, i11, charSequence);
    }

    public static d b(PendingIntent pendingIntent, IconCompat iconCompat, int i11, CharSequence charSequence) {
        return new d(pendingIntent, iconCompat, i11, charSequence);
    }

    public Slice a(Slice.a aVar) {
        return this.f16229a.b(aVar);
    }

    public IconCompat c() {
        return this.f16229a.e();
    }

    public CharSequence d() {
        return this.f16229a.g();
    }

    public void e(Slice.a aVar) {
        aVar.a(this.f16229a.d(), this.f16229a.a(aVar), this.f16229a.f());
    }
}
