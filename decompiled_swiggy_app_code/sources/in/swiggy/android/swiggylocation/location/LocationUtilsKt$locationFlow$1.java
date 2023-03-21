package in.swiggy.android.swiggylocation.location;

import android.location.LocationManager;
import bp0.g;
import bp0.k;
import cg0.n;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import fp0.c;
import in.swiggy.android.tejas.feature.address.v2.LocationGps;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.s;
import lp0.p;
import lp0.r;
import os.u;
import wp0.q0;

@d(c = "in.swiggy.android.swiggylocation.location.LocationUtilsKt$locationFlow$1", f = "LocationUtils.kt", l = {227}, m = "invokeSuspend")
/* compiled from: LocationUtils.kt */
final class LocationUtilsKt$locationFlow$1 extends SuspendLambda implements p<e<? super LocationEvent>, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f18831a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f18832b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LocationGps f18833c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.location.d f18834d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ n f18835e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ LocationManager f18836f;

    @d(c = "in.swiggy.android.swiggylocation.location.LocationUtilsKt$locationFlow$1$1", f = "LocationUtils.kt", l = {220, 224, 224}, m = "invokeSuspend")
    /* renamed from: in.swiggy.android.swiggylocation.location.LocationUtilsKt$locationFlow$1$1  reason: invalid class name */
    /* compiled from: LocationUtils.kt */
    static final class AnonymousClass1 extends SuspendLambda implements r<e<? super LocationEvent>, Throwable, Long, c<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f18837a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f18838b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f18839c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ long f18840d;

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((e<? super LocationEvent>) (e) obj, (Throwable) obj2, ((Number) obj3).longValue(), (c<? super Boolean>) (c) obj4);
        }

        public final Object invoke(e<? super LocationEvent> eVar, Throwable th2, long j, c<? super Boolean> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(iVar, locAttempts, locInterval, cVar);
            r02.f18838b = eVar;
            r02.f18839c = th2;
            r02.f18840d = j;
            return r02.invokeSuspend(k.f22762a);
        }

        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            long j;
            Object d11 = b.d();
            int i11 = this.f18837a;
            if (i11 == 0) {
                g.b(obj);
                e eVar = (e) this.f18838b;
                Throwable th3 = (Throwable) this.f18839c;
                long j11 = this.f18840d;
                iVar.setValue(kotlin.coroutines.jvm.internal.a.d(((int) j11) + 1));
                if (j11 < ((long) locAttempts)) {
                    long j12 = locInterval;
                    this.f18838b = th3;
                    this.f18840d = j11;
                    this.f18837a = 1;
                    if (q0.a(j12, this) == d11) {
                        return d11;
                    }
                    th2 = th3;
                    j = j11;
                } else {
                    if (th3 instanceof InvalidLocation) {
                        this.f18838b = null;
                        this.f18837a = 2;
                        if (eVar.emit(th3, this) == d11) {
                            return d11;
                        }
                    } else {
                        InvalidLocation invalidLocation = new InvalidLocation((LocationData) null, th3, 1, (kotlin.jvm.internal.i) null);
                        this.f18838b = null;
                        this.f18837a = 3;
                        if (eVar.emit(invalidLocation, this) == d11) {
                            return d11;
                        }
                    }
                    return kotlin.coroutines.jvm.internal.a.a(false);
                }
            } else if (i11 == 1) {
                j = this.f18840d;
                th2 = (Throwable) this.f18838b;
                g.b(obj);
            } else if (i11 == 2 || i11 == 3) {
                g.b(obj);
                return kotlin.coroutines.jvm.internal.a.a(false);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b("LOCRES", "interval " + locInterval + " attempt " + j + " currentAttempt " + iVar.getValue().intValue() + " totalAttempts " + locAttempts + " cause " + th2 + SafeJsonPrimitive.NULL_CHAR);
            return kotlin.coroutines.jvm.internal.a.a(true);
        }
    }

    /* compiled from: LocationUtils.kt */
    static final class a<T> implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e<LocationEvent> f18844a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i<Integer> f18845b;

        a(e<? super LocationEvent> eVar, i<Integer> iVar) {
            this.f18844a = eVar;
            this.f18845b = iVar;
        }

        /* renamed from: a */
        public final Object emit(LocationEvent locationEvent, c<? super k> cVar) {
            if (locationEvent instanceof LocationData) {
                e<LocationEvent> eVar = this.f18844a;
                ((LocationData) locationEvent).b().a().d(this.f18845b.getValue().intValue());
                Object emit = eVar.emit(locationEvent, cVar);
                return emit == b.d() ? emit : k.f22762a;
            } else if (!(locationEvent instanceof InvalidLocation)) {
                return k.f22762a;
            } else {
                e<LocationEvent> eVar2 = this.f18844a;
                ((InvalidLocation) locationEvent).a().b().a().d(this.f18845b.getValue().intValue());
                Object emit2 = eVar2.emit(locationEvent, cVar);
                return emit2 == b.d() ? emit2 : k.f22762a;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LocationUtilsKt$locationFlow$1(LocationGps locationGps, com.google.android.gms.location.d dVar, n nVar, LocationManager locationManager, c<? super LocationUtilsKt$locationFlow$1> cVar) {
        super(2, cVar);
        this.f18833c = locationGps;
        this.f18834d = dVar;
        this.f18835e = nVar;
        this.f18836f = locationManager;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        LocationUtilsKt$locationFlow$1 locationUtilsKt$locationFlow$1 = new LocationUtilsKt$locationFlow$1(this.f18833c, this.f18834d, this.f18835e, this.f18836f, cVar);
        locationUtilsKt$locationFlow$1.f18832b = obj;
        return locationUtilsKt$locationFlow$1;
    }

    public final Object invoke(e<? super LocationEvent> eVar, c<? super k> cVar) {
        return ((LocationUtilsKt$locationFlow$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f18831a;
        if (i11 == 0) {
            g.b(obj);
            final int locAttempts = this.f18833c.getLocAttempts() - 1;
            final long locInterval = this.f18833c.getLocInterval();
            i a11 = s.a(kotlin.coroutines.jvm.internal.a.d(1));
            final i iVar = a11;
            kotlinx.coroutines.flow.d<LocationEvent> H = f.H(LocationUtilsKt.h(this.f18834d, this.f18835e, this.f18836f, this.f18833c), new AnonymousClass1((c<? super AnonymousClass1>) null));
            a aVar = new a((e) this.f18832b, a11);
            this.f18831a = 1;
            if (H.collect(aVar, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
