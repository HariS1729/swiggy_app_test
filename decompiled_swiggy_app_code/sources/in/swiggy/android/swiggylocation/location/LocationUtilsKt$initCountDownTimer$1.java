package in.swiggy.android.swiggylocation.location;

import android.os.CountDownTimer;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;
import os.u;

/* compiled from: LocationUtils.kt */
final class LocationUtilsKt$initCountDownTimer$1 extends Lambda implements lp0.a<a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f18818a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f18819b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Integer f18820c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<Long, k> f18821d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ p<Long, Integer, k> f18822e;

    /* compiled from: LocationUtils.kt */
    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        private long f18823a;

        /* renamed from: b  reason: collision with root package name */
        private int f18824b;

        /* renamed from: c  reason: collision with root package name */
        private int f18825c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f18826d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Integer f18827e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f18828f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ l<Long, k> f18829g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<Long, Integer, k> f18830h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(long j, Integer num, long j11, l<? super Long, k> lVar, p<? super Long, ? super Integer, k> pVar) {
            super(j, j11);
            this.f18826d = j;
            this.f18827e = num;
            this.f18828f = j11;
            this.f18829g = lVar;
            this.f18830h = pVar;
            int i11 = (int) (j / ((long) 1000));
            this.f18824b = i11;
            this.f18825c = num == null ? 100 / i11 : num.intValue();
        }

        public void onFinish() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("LocationTimer onFinish ");
            long j = (long) 1000;
            sb2.append(this.f18823a / j);
            sb2.append(" total ");
            sb2.append(this.f18826d / j);
            u.b("LOCCD", sb2.toString());
            l<Long, k> lVar = this.f18829g;
            if (lVar != null) {
                lVar.invoke(Long.valueOf(this.f18823a));
            }
        }

        public void onTick(long j) {
            this.f18823a = j;
            int i11 = (int) (j / ((long) 1000));
            int i12 = (this.f18824b - i11) * this.f18825c;
            u.b("LOCCD", "LocationTimer secondsRemaining " + i11 + " total " + this.f18824b + " progressPercentage " + i12);
            this.f18830h.invoke(Long.valueOf(j), Integer.valueOf(i12));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LocationUtilsKt$initCountDownTimer$1(long j, long j11, Integer num, l<? super Long, k> lVar, p<? super Long, ? super Integer, k> pVar) {
        super(0);
        this.f18818a = j;
        this.f18819b = j11;
        this.f18820c = num;
        this.f18821d = lVar;
        this.f18822e = pVar;
    }

    /* renamed from: a */
    public final a invoke() {
        return new a(this.f18818a, this.f18820c, this.f18819b, this.f18821d, this.f18822e);
    }
}
