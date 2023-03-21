package x6;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import b7.c;
import coil.request.CachePolicy;
import coil.size.Precision;
import coil.size.Scale;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import y6.h;

/* compiled from: DefinedRequestOptions.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Lifecycle f17757a;

    /* renamed from: b  reason: collision with root package name */
    private final h f17758b;

    /* renamed from: c  reason: collision with root package name */
    private final Scale f17759c;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineDispatcher f17760d;

    /* renamed from: e  reason: collision with root package name */
    private final CoroutineDispatcher f17761e;

    /* renamed from: f  reason: collision with root package name */
    private final CoroutineDispatcher f17762f;

    /* renamed from: g  reason: collision with root package name */
    private final CoroutineDispatcher f17763g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a f17764h;

    /* renamed from: i  reason: collision with root package name */
    private final Precision f17765i;
    private final Bitmap.Config j;
    private final Boolean k;

    /* renamed from: l  reason: collision with root package name */
    private final Boolean f17766l;

    /* renamed from: m  reason: collision with root package name */
    private final CachePolicy f17767m;
    private final CachePolicy n;

    /* renamed from: o  reason: collision with root package name */
    private final CachePolicy f17768o;

    public b(Lifecycle lifecycle, h hVar, Scale scale, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, c.a aVar, Precision precision, Bitmap.Config config, Boolean bool, Boolean bool2, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.f17757a = lifecycle;
        this.f17758b = hVar;
        this.f17759c = scale;
        this.f17760d = coroutineDispatcher;
        this.f17761e = coroutineDispatcher2;
        this.f17762f = coroutineDispatcher3;
        this.f17763g = coroutineDispatcher4;
        this.f17764h = aVar;
        this.f17765i = precision;
        this.j = config;
        this.k = bool;
        this.f17766l = bool2;
        this.f17767m = cachePolicy;
        this.n = cachePolicy2;
        this.f17768o = cachePolicy3;
    }

    public final Boolean a() {
        return this.k;
    }

    public final Boolean b() {
        return this.f17766l;
    }

    public final Bitmap.Config c() {
        return this.j;
    }

    public final CoroutineDispatcher d() {
        return this.f17762f;
    }

    public final CachePolicy e() {
        return this.n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (!p.e(this.f17757a, bVar.f17757a) || !p.e(this.f17758b, bVar.f17758b) || this.f17759c != bVar.f17759c || !p.e(this.f17760d, bVar.f17760d) || !p.e(this.f17761e, bVar.f17761e) || !p.e(this.f17762f, bVar.f17762f) || !p.e(this.f17763g, bVar.f17763g) || !p.e(this.f17764h, bVar.f17764h) || this.f17765i != bVar.f17765i || this.j != bVar.j || !p.e(this.k, bVar.k) || !p.e(this.f17766l, bVar.f17766l) || this.f17767m != bVar.f17767m || this.n != bVar.n || this.f17768o != bVar.f17768o) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final CoroutineDispatcher f() {
        return this.f17761e;
    }

    public final CoroutineDispatcher g() {
        return this.f17760d;
    }

    public final Lifecycle h() {
        return this.f17757a;
    }

    public int hashCode() {
        Lifecycle lifecycle = this.f17757a;
        int i11 = 0;
        int hashCode = (lifecycle == null ? 0 : lifecycle.hashCode()) * 31;
        h hVar = this.f17758b;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Scale scale = this.f17759c;
        int hashCode3 = (hashCode2 + (scale == null ? 0 : scale.hashCode())) * 31;
        CoroutineDispatcher coroutineDispatcher = this.f17760d;
        int hashCode4 = (hashCode3 + (coroutineDispatcher == null ? 0 : coroutineDispatcher.hashCode())) * 31;
        CoroutineDispatcher coroutineDispatcher2 = this.f17761e;
        int hashCode5 = (hashCode4 + (coroutineDispatcher2 == null ? 0 : coroutineDispatcher2.hashCode())) * 31;
        CoroutineDispatcher coroutineDispatcher3 = this.f17762f;
        int hashCode6 = (hashCode5 + (coroutineDispatcher3 == null ? 0 : coroutineDispatcher3.hashCode())) * 31;
        CoroutineDispatcher coroutineDispatcher4 = this.f17763g;
        int hashCode7 = (hashCode6 + (coroutineDispatcher4 == null ? 0 : coroutineDispatcher4.hashCode())) * 31;
        c.a aVar = this.f17764h;
        int hashCode8 = (hashCode7 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Precision precision = this.f17765i;
        int hashCode9 = (hashCode8 + (precision == null ? 0 : precision.hashCode())) * 31;
        Bitmap.Config config = this.j;
        int hashCode10 = (hashCode9 + (config == null ? 0 : config.hashCode())) * 31;
        Boolean bool = this.k;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f17766l;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CachePolicy cachePolicy = this.f17767m;
        int hashCode13 = (hashCode12 + (cachePolicy == null ? 0 : cachePolicy.hashCode())) * 31;
        CachePolicy cachePolicy2 = this.n;
        int hashCode14 = (hashCode13 + (cachePolicy2 == null ? 0 : cachePolicy2.hashCode())) * 31;
        CachePolicy cachePolicy3 = this.f17768o;
        if (cachePolicy3 != null) {
            i11 = cachePolicy3.hashCode();
        }
        return hashCode14 + i11;
    }

    public final CachePolicy i() {
        return this.f17767m;
    }

    public final CachePolicy j() {
        return this.f17768o;
    }

    public final Precision k() {
        return this.f17765i;
    }

    public final Scale l() {
        return this.f17759c;
    }

    public final h m() {
        return this.f17758b;
    }

    public final CoroutineDispatcher n() {
        return this.f17763g;
    }

    public final c.a o() {
        return this.f17764h;
    }
}
