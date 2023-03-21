package d4;

import android.app.Notification;

/* compiled from: ForegroundInfo */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f14126a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14127b;

    /* renamed from: c  reason: collision with root package name */
    private final Notification f14128c;

    public c(int i11, Notification notification) {
        this(i11, notification, 0);
    }

    public int a() {
        return this.f14127b;
    }

    public Notification b() {
        return this.f14128c;
    }

    public int c() {
        return this.f14126a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f14126a == cVar.f14126a && this.f14127b == cVar.f14127b) {
            return this.f14128c.equals(cVar.f14128c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f14126a * 31) + this.f14127b) * 31) + this.f14128c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f14126a + ", mForegroundServiceType=" + this.f14127b + ", mNotification=" + this.f14128c + '}';
    }

    public c(int i11, Notification notification, int i12) {
        this.f14126a = i11;
        this.f14128c = notification;
        this.f14127b = i12;
    }
}
