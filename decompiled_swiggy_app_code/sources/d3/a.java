package d3;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EmojiCompat */
public class a {

    /* renamed from: m  reason: collision with root package name */
    private static final Object f14034m = new Object();
    private static volatile a n;

    /* renamed from: a  reason: collision with root package name */
    private final ReadWriteLock f14035a = new ReentrantReadWriteLock();

    /* renamed from: b  reason: collision with root package name */
    private final Set<d> f14036b;

    /* renamed from: c  reason: collision with root package name */
    private int f14037c = 3;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f14038d;

    /* renamed from: e  reason: collision with root package name */
    private final b f14039e;

    /* renamed from: f  reason: collision with root package name */
    final f f14040f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f14041g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f14042h;

    /* renamed from: i  reason: collision with root package name */
    final int[] f14043i;
    private final boolean j;
    private final int k;

    /* renamed from: l  reason: collision with root package name */
    private final int f14044l;

    /* renamed from: d3.a$a  reason: collision with other inner class name */
    /* compiled from: EmojiCompat */
    private static final class C0113a extends b {

        /* renamed from: b  reason: collision with root package name */
        private volatile c f14045b;

        /* renamed from: c  reason: collision with root package name */
        private volatile g f14046c;

        /* renamed from: d3.a$a$a  reason: collision with other inner class name */
        /* compiled from: EmojiCompat */
        class C0114a extends g {
            C0114a() {
            }

            public void a(Throwable th2) {
                C0113a.this.f14048a.j(th2);
            }

            public void b(g gVar) {
                C0113a.this.d(gVar);
            }
        }

        C0113a(a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            try {
                this.f14048a.f14040f.a(new C0114a());
            } catch (Throwable th2) {
                this.f14048a.j(th2);
            }
        }

        /* access modifiers changed from: package-private */
        public CharSequence b(CharSequence charSequence, int i11, int i12, int i13, boolean z11) {
            return this.f14045b.h(charSequence, i11, i12, i13, z11);
        }

        /* access modifiers changed from: package-private */
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f14046c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f14048a.f14041g);
        }

        /* access modifiers changed from: package-private */
        public void d(g gVar) {
            if (gVar == null) {
                this.f14048a.j(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f14046c = gVar;
            g gVar2 = this.f14046c;
            h hVar = new h();
            a aVar = this.f14048a;
            this.f14045b = new c(gVar2, hVar, aVar.f14042h, aVar.f14043i);
            this.f14048a.k();
        }
    }

    /* compiled from: EmojiCompat */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final a f14048a;

        b(a aVar) {
            this.f14048a = aVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public CharSequence b(CharSequence charSequence, int i11, int i12, int i13, boolean z11) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* compiled from: EmojiCompat */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final f f14049a;

        /* renamed from: b  reason: collision with root package name */
        boolean f14050b;

        /* renamed from: c  reason: collision with root package name */
        boolean f14051c;

        /* renamed from: d  reason: collision with root package name */
        int[] f14052d;

        /* renamed from: e  reason: collision with root package name */
        Set<d> f14053e;

        /* renamed from: f  reason: collision with root package name */
        boolean f14054f;

        /* renamed from: g  reason: collision with root package name */
        int f14055g = -16711936;

        /* renamed from: h  reason: collision with root package name */
        int f14056h = 0;

        protected c(f fVar) {
            androidx.core.util.g.h(fVar, "metadataLoader cannot be null.");
            this.f14049a = fVar;
        }

        public c a(d dVar) {
            androidx.core.util.g.h(dVar, "initCallback cannot be null");
            if (this.f14053e == null) {
                this.f14053e = new androidx.collection.b();
            }
            this.f14053e.add(dVar);
            return this;
        }

        public c b(boolean z11) {
            this.f14050b = z11;
            return this;
        }
    }

    /* compiled from: EmojiCompat */
    public static abstract class d {
        public void a(Throwable th2) {
        }

        public void b() {
        }
    }

    /* compiled from: EmojiCompat */
    private static class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f14057a;

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f14058b;

        /* renamed from: c  reason: collision with root package name */
        private final int f14059c;

        e(d dVar, int i11) {
            this(Arrays.asList(new d[]{(d) androidx.core.util.g.h(dVar, "initCallback cannot be null")}), i11, (Throwable) null);
        }

        public void run() {
            int size = this.f14057a.size();
            int i11 = 0;
            if (this.f14059c != 1) {
                while (i11 < size) {
                    this.f14057a.get(i11).a(this.f14058b);
                    i11++;
                }
                return;
            }
            while (i11 < size) {
                this.f14057a.get(i11).b();
                i11++;
            }
        }

        e(Collection<d> collection, int i11) {
            this(collection, i11, (Throwable) null);
        }

        e(Collection<d> collection, int i11, Throwable th2) {
            androidx.core.util.g.h(collection, "initCallbacks cannot be null");
            this.f14057a = new ArrayList(collection);
            this.f14059c = i11;
            this.f14058b = th2;
        }
    }

    /* compiled from: EmojiCompat */
    public interface f {
        void a(g gVar);
    }

    /* compiled from: EmojiCompat */
    public static abstract class g {
        public abstract void a(Throwable th2);

        public abstract void b(g gVar);
    }

    /* compiled from: EmojiCompat */
    static class h {
        h() {
        }

        /* access modifiers changed from: package-private */
        public d a(b bVar) {
            return new h(bVar);
        }
    }

    private a(c cVar) {
        this.f14041g = cVar.f14050b;
        this.f14042h = cVar.f14051c;
        this.f14043i = cVar.f14052d;
        this.j = cVar.f14054f;
        this.k = cVar.f14055g;
        this.f14040f = cVar.f14049a;
        this.f14044l = cVar.f14056h;
        this.f14038d = new Handler(Looper.getMainLooper());
        androidx.collection.b bVar = new androidx.collection.b();
        this.f14036b = bVar;
        Set<d> set = cVar.f14053e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f14053e);
        }
        this.f14039e = new C0113a(this);
        i();
    }

    public static a a() {
        a aVar;
        synchronized (f14034m) {
            androidx.core.util.g.i(n != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            aVar = n;
        }
        return aVar;
    }

    public static boolean d(InputConnection inputConnection, Editable editable, int i11, int i12, boolean z11) {
        return c.c(inputConnection, editable, i11, i12, z11);
    }

    public static boolean e(Editable editable, int i11, KeyEvent keyEvent) {
        return c.d(editable, i11, keyEvent);
    }

    public static a f(c cVar) {
        if (n == null) {
            synchronized (f14034m) {
                if (n == null) {
                    n = new a(cVar);
                }
            }
        }
        return n;
    }

    private boolean h() {
        return c() == 1;
    }

    /* JADX INFO: finally extract failed */
    private void i() {
        this.f14035a.writeLock().lock();
        try {
            if (this.f14044l == 0) {
                this.f14037c = 0;
            }
            this.f14035a.writeLock().unlock();
            if (c() == 0) {
                this.f14039e.a();
            }
        } catch (Throwable th2) {
            this.f14035a.writeLock().unlock();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.k;
    }

    public int c() {
        this.f14035a.readLock().lock();
        try {
            return this.f14037c;
        } finally {
            this.f14035a.readLock().unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.j;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void j(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f14035a.writeLock().lock();
        try {
            this.f14037c = 2;
            arrayList.addAll(this.f14036b);
            this.f14036b.clear();
            this.f14035a.writeLock().unlock();
            this.f14038d.post(new e(arrayList, this.f14037c, th2));
        } catch (Throwable th3) {
            this.f14035a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void k() {
        ArrayList arrayList = new ArrayList();
        this.f14035a.writeLock().lock();
        try {
            this.f14037c = 1;
            arrayList.addAll(this.f14036b);
            this.f14036b.clear();
            this.f14035a.writeLock().unlock();
            this.f14038d.post(new e((Collection<d>) arrayList, this.f14037c));
        } catch (Throwable th2) {
            this.f14035a.writeLock().unlock();
            throw th2;
        }
    }

    public CharSequence l(CharSequence charSequence) {
        return m(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence m(CharSequence charSequence, int i11, int i12) {
        return n(charSequence, i11, i12, Integer.MAX_VALUE);
    }

    public CharSequence n(CharSequence charSequence, int i11, int i12, int i13) {
        return o(charSequence, i11, i12, i13, 0);
    }

    public CharSequence o(CharSequence charSequence, int i11, int i12, int i13, int i14) {
        androidx.core.util.g.i(h(), "Not initialized yet");
        androidx.core.util.g.e(i11, "start cannot be negative");
        androidx.core.util.g.e(i12, "end cannot be negative");
        androidx.core.util.g.e(i13, "maxEmojiCount cannot be negative");
        androidx.core.util.g.b(i11 <= i12, "start should be <= than end");
        if (charSequence == null) {
            return charSequence;
        }
        androidx.core.util.g.b(i11 <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.g.b(i12 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i11 == i12) {
            return charSequence;
        }
        return this.f14039e.b(charSequence, i11, i12, i13, i14 != 1 ? i14 != 2 ? this.f14041g : false : true);
    }

    public void p(d dVar) {
        androidx.core.util.g.h(dVar, "initCallback cannot be null");
        this.f14035a.writeLock().lock();
        try {
            int i11 = this.f14037c;
            if (i11 != 1) {
                if (i11 != 2) {
                    this.f14036b.add(dVar);
                }
            }
            this.f14038d.post(new e(dVar, i11));
        } finally {
            this.f14035a.writeLock().unlock();
        }
    }

    public void q(EditorInfo editorInfo) {
        if (h() && editorInfo != null && editorInfo.extras != null) {
            this.f14039e.c(editorInfo);
        }
    }
}
