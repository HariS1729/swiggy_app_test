package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.j;
import androidx.core.content.b;
import androidx.core.graphics.drawable.IconCompat;
import com.truecaller.android.sdk.TruecallerSdkScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationCompatBuilder */
class k implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9096a;

    /* renamed from: b  reason: collision with root package name */
    private final Notification.Builder f9097b;

    /* renamed from: c  reason: collision with root package name */
    private final j.f f9098c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f9099d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f9100e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Bundle> f9101f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f9102g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f9103h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f9104i;

    k(j.f fVar) {
        List<String> list;
        int i11;
        Icon icon;
        this.f9098c = fVar;
        this.f9096a = fVar.f9060a;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9097b = new Notification.Builder(fVar.f9060a, fVar.L);
        } else {
            this.f9097b = new Notification.Builder(fVar.f9060a);
        }
        Notification notification = fVar.U;
        this.f9097b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, fVar.f9068i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(fVar.f9064e).setContentText(fVar.f9065f).setContentInfo(fVar.k).setContentIntent(fVar.f9066g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(fVar.f9067h, (notification.flags & 128) != 0).setLargeIcon(fVar.j).setNumber(fVar.f9069l).setProgress(fVar.f9075u, fVar.v, fVar.f9076w);
        this.f9097b.setSubText(fVar.f9073r).setUsesChronometer(fVar.f9071o).setPriority(fVar.f9070m);
        Iterator<j.b> it2 = fVar.f9061b.iterator();
        while (it2.hasNext()) {
            b(it2.next());
        }
        Bundle bundle = fVar.E;
        if (bundle != null) {
            this.f9102g.putAll(bundle);
        }
        int i12 = Build.VERSION.SDK_INT;
        this.f9099d = fVar.I;
        this.f9100e = fVar.J;
        this.f9097b.setShowWhen(fVar.n);
        this.f9097b.setLocalOnly(fVar.A).setGroup(fVar.f9077x).setGroupSummary(fVar.f9078y).setSortKey(fVar.f9079z);
        this.f9103h = fVar.Q;
        this.f9097b.setCategory(fVar.D).setColor(fVar.F).setVisibility(fVar.G).setPublicVersion(fVar.H).setSound(notification.sound, notification.audioAttributes);
        if (i12 < 28) {
            list = e(g(fVar.f9062c), fVar.X);
        } else {
            list = fVar.X;
        }
        if (list != null && !list.isEmpty()) {
            for (String addPerson : list) {
                this.f9097b.addPerson(addPerson);
            }
        }
        this.f9104i = fVar.K;
        if (fVar.f9063d.size() > 0) {
            Bundle bundle2 = fVar.k().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i13 = 0; i13 < fVar.f9063d.size(); i13++) {
                bundle4.putBundle(Integer.toString(i13), l.e(fVar.f9063d.get(i13)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            fVar.k().putBundle("android.car.EXTENSIONS", bundle2);
            this.f9102g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 23 && (icon = fVar.W) != null) {
            this.f9097b.setSmallIcon(icon);
        }
        if (i14 >= 24) {
            this.f9097b.setExtras(fVar.E).setRemoteInputHistory(fVar.t);
            RemoteViews remoteViews = fVar.I;
            if (remoteViews != null) {
                this.f9097b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = fVar.J;
            if (remoteViews2 != null) {
                this.f9097b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = fVar.K;
            if (remoteViews3 != null) {
                this.f9097b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i14 >= 26) {
            this.f9097b.setBadgeIconType(fVar.M).setSettingsText(fVar.f9074s).setShortcutId(fVar.N).setTimeoutAfter(fVar.P).setGroupAlertBehavior(fVar.Q);
            if (fVar.C) {
                this.f9097b.setColorized(fVar.B);
            }
            if (!TextUtils.isEmpty(fVar.L)) {
                this.f9097b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i14 >= 28) {
            Iterator<n> it3 = fVar.f9062c.iterator();
            while (it3.hasNext()) {
                this.f9097b.addPerson(it3.next().j());
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            this.f9097b.setAllowSystemGeneratedContextualActions(fVar.S);
            this.f9097b.setBubbleMetadata(j.e.k(fVar.T));
            b bVar = fVar.O;
            if (bVar != null) {
                this.f9097b.setLocusId(bVar.b());
            }
        }
        if (i15 >= 31 && (i11 = fVar.R) != 0) {
            this.f9097b.setForegroundServiceBehavior(i11);
        }
        if (fVar.V) {
            if (this.f9098c.f9078y) {
                this.f9103h = 2;
            } else {
                this.f9103h = 1;
            }
            this.f9097b.setVibrate((long[]) null);
            this.f9097b.setSound((Uri) null);
            int i16 = notification.defaults & -2 & -3;
            notification.defaults = i16;
            this.f9097b.setDefaults(i16);
            if (i15 >= 26) {
                if (TextUtils.isEmpty(this.f9098c.f9077x)) {
                    this.f9097b.setGroup("silent");
                }
                this.f9097b.setGroupAlertBehavior(this.f9103h);
            }
        }
    }

    private void b(j.b bVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i11 = Build.VERSION.SDK_INT;
        IconCompat d11 = bVar.d();
        if (i11 >= 23) {
            builder = new Notification.Action.Builder(d11 != null ? d11.x() : null, bVar.h(), bVar.a());
        } else {
            builder = new Notification.Action.Builder(d11 != null ? d11.m() : 0, bVar.h(), bVar.a());
        }
        if (bVar.e() != null) {
            for (RemoteInput addRemoteInput : p.b(bVar.e())) {
                builder.addRemoteInput(addRemoteInput);
            }
        }
        if (bVar.c() != null) {
            bundle = new Bundle(bVar.c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 24) {
            builder.setAllowGeneratedReplies(bVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", bVar.f());
        if (i12 >= 28) {
            builder.setSemanticAction(bVar.f());
        }
        if (i12 >= 29) {
            builder.setContextual(bVar.j());
        }
        if (i12 >= 31) {
            builder.setAuthenticationRequired(bVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", bVar.g());
        builder.addExtras(bundle);
        this.f9097b.addAction(builder.build());
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.b bVar = new androidx.collection.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<n> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (n i11 : list) {
            arrayList.add(i11.i());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & -2 & -3;
    }

    public Notification.Builder a() {
        return this.f9097b;
    }

    public Notification c() {
        Bundle k;
        RemoteViews u11;
        RemoteViews s11;
        j.C0035j jVar = this.f9098c.q;
        if (jVar != null) {
            jVar.b(this);
        }
        RemoteViews t = jVar != null ? jVar.t(this) : null;
        Notification d11 = d();
        if (t != null) {
            d11.contentView = t;
        } else {
            RemoteViews remoteViews = this.f9098c.I;
            if (remoteViews != null) {
                d11.contentView = remoteViews;
            }
        }
        if (!(jVar == null || (s11 = jVar.s(this)) == null)) {
            d11.bigContentView = s11;
        }
        if (!(jVar == null || (u11 = this.f9098c.q.u(this)) == null)) {
            d11.headsUpContentView = u11;
        }
        if (!(jVar == null || (k = j.k(d11)) == null)) {
            jVar.a(k);
        }
        return d11;
    }

    /* access modifiers changed from: protected */
    public Notification d() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            return this.f9097b.build();
        }
        if (i11 >= 24) {
            Notification build = this.f9097b.build();
            if (this.f9103h != 0) {
                if (!(build.getGroup() == null || (build.flags & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) == 0 || this.f9103h != 2)) {
                    h(build);
                }
                if (build.getGroup() != null && (build.flags & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) == 0 && this.f9103h == 1) {
                    h(build);
                }
            }
            return build;
        }
        this.f9097b.setExtras(this.f9102g);
        Notification build2 = this.f9097b.build();
        RemoteViews remoteViews = this.f9099d;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f9100e;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f9104i;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.f9103h != 0) {
            if (!(build2.getGroup() == null || (build2.flags & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) == 0 || this.f9103h != 2)) {
                h(build2);
            }
            if (build2.getGroup() != null && (build2.flags & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) == 0 && this.f9103h == 1) {
                h(build2);
            }
        }
        return build2;
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.f9096a;
    }
}
