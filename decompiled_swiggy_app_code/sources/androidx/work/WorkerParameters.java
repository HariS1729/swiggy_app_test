package androidx.work;

import android.net.Network;
import android.net.Uri;
import d4.d;
import d4.k;
import d4.o;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    private UUID f12304a;

    /* renamed from: b  reason: collision with root package name */
    private b f12305b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f12306c;

    /* renamed from: d  reason: collision with root package name */
    private a f12307d;

    /* renamed from: e  reason: collision with root package name */
    private int f12308e;

    /* renamed from: f  reason: collision with root package name */
    private Executor f12309f;

    /* renamed from: g  reason: collision with root package name */
    private n4.a f12310g;

    /* renamed from: h  reason: collision with root package name */
    private o f12311h;

    /* renamed from: i  reason: collision with root package name */
    private k f12312i;
    private d j;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f12313a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f12314b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f12315c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i11, Executor executor, n4.a aVar2, o oVar, k kVar, d dVar) {
        this.f12304a = uuid;
        this.f12305b = bVar;
        this.f12306c = new HashSet(collection);
        this.f12307d = aVar;
        this.f12308e = i11;
        this.f12309f = executor;
        this.f12310g = aVar2;
        this.f12311h = oVar;
        this.f12312i = kVar;
        this.j = dVar;
    }

    public Executor a() {
        return this.f12309f;
    }

    public d b() {
        return this.j;
    }

    public UUID c() {
        return this.f12304a;
    }

    public b d() {
        return this.f12305b;
    }

    public int e() {
        return this.f12308e;
    }

    public n4.a f() {
        return this.f12310g;
    }

    public o g() {
        return this.f12311h;
    }
}
