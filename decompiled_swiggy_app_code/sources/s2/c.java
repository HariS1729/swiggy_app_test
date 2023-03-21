package s2;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputContentInfoCompat */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final C0184c f16632a;

    /* compiled from: InputContentInfoCompat */
    private static final class b implements C0184c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f16634a;

        /* renamed from: b  reason: collision with root package name */
        private final ClipDescription f16635b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f16636c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f16634a = uri;
            this.f16635b = clipDescription;
            this.f16636c = uri2;
        }

        public Object a() {
            return null;
        }

        public Uri b() {
            return this.f16634a;
        }

        public void c() {
        }

        public Uri d() {
            return this.f16636c;
        }

        public ClipDescription getDescription() {
            return this.f16635b;
        }
    }

    /* renamed from: s2.c$c  reason: collision with other inner class name */
    /* compiled from: InputContentInfoCompat */
    private interface C0184c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f16632a = new a(uri, clipDescription, uri2);
        } else {
            this.f16632a = new b(uri, clipDescription, uri2);
        }
    }

    public static c f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new c(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f16632a.b();
    }

    public ClipDescription b() {
        return this.f16632a.getDescription();
    }

    public Uri c() {
        return this.f16632a.d();
    }

    public void d() {
        this.f16632a.c();
    }

    public Object e() {
        return this.f16632a.a();
    }

    /* compiled from: InputContentInfoCompat */
    private static final class a implements C0184c {

        /* renamed from: a  reason: collision with root package name */
        final InputContentInfo f16633a;

        a(Object obj) {
            this.f16633a = (InputContentInfo) obj;
        }

        public Object a() {
            return this.f16633a;
        }

        public Uri b() {
            return this.f16633a.getContentUri();
        }

        public void c() {
            this.f16633a.requestPermission();
        }

        public Uri d() {
            return this.f16633a.getLinkUri();
        }

        public ClipDescription getDescription() {
            return this.f16633a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f16633a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private c(C0184c cVar) {
        this.f16632a = cVar;
    }
}
