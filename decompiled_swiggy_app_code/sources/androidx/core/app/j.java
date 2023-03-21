package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.core.R;
import androidx.core.app.n;
import androidx.core.graphics.drawable.IconCompat;
import com.brentvatne.react.ReactVideoViewManager;
import com.truecaller.android.sdk.TruecallerSdkScope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: NotificationCompat */
public class j {

    /* compiled from: NotificationCompat */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f9021a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f9022b;

        /* renamed from: c  reason: collision with root package name */
        private final p[] f9023c;

        /* renamed from: d  reason: collision with root package name */
        private final p[] f9024d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f9025e;

        /* renamed from: f  reason: collision with root package name */
        boolean f9026f;

        /* renamed from: g  reason: collision with root package name */
        private final int f9027g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f9028h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f9029i;
        public CharSequence j;
        public PendingIntent k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f9030l;

        /* compiled from: NotificationCompat */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private final IconCompat f9031a;

            /* renamed from: b  reason: collision with root package name */
            private final CharSequence f9032b;

            /* renamed from: c  reason: collision with root package name */
            private final PendingIntent f9033c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f9034d;

            /* renamed from: e  reason: collision with root package name */
            private final Bundle f9035e;

            /* renamed from: f  reason: collision with root package name */
            private ArrayList<p> f9036f;

            /* renamed from: g  reason: collision with root package name */
            private int f9037g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f9038h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f9039i;
            private boolean j;

            public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), (p[]) null, true, 0, true, false, false);
            }

            private void c() {
                if (this.f9039i) {
                    Objects.requireNonNull(this.f9033c, "Contextual Actions must contain a valid PendingIntent");
                }
            }

            public static a d(Notification.Action action) {
                a aVar;
                if (Build.VERSION.SDK_INT < 23 || action.getIcon() == null) {
                    aVar = new a(action.icon, action.title, action.actionIntent);
                } else {
                    aVar = new a(IconCompat.c(action.getIcon()), action.title, action.actionIntent);
                }
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (!(remoteInputs == null || remoteInputs.length == 0)) {
                    for (RemoteInput c11 : remoteInputs) {
                        aVar.a(p.c(c11));
                    }
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 24) {
                    aVar.f9034d = action.getAllowGeneratedReplies();
                }
                if (i11 >= 28) {
                    aVar.h(action.getSemanticAction());
                }
                if (i11 >= 29) {
                    aVar.g(action.isContextual());
                }
                if (i11 >= 31) {
                    aVar.f(action.isAuthenticationRequired());
                }
                return aVar;
            }

            public a a(p pVar) {
                if (this.f9036f == null) {
                    this.f9036f = new ArrayList<>();
                }
                if (pVar != null) {
                    this.f9036f.add(pVar);
                }
                return this;
            }

            /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public androidx.core.app.j.b b() {
                /*
                    r17 = this;
                    r0 = r17
                    r17.c()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.ArrayList<androidx.core.app.p> r3 = r0.f9036f
                    if (r3 == 0) goto L_0x0031
                    java.util.Iterator r3 = r3.iterator()
                L_0x0017:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L_0x0031
                    java.lang.Object r4 = r3.next()
                    androidx.core.app.p r4 = (androidx.core.app.p) r4
                    boolean r5 = r4.l()
                    if (r5 == 0) goto L_0x002d
                    r1.add(r4)
                    goto L_0x0017
                L_0x002d:
                    r2.add(r4)
                    goto L_0x0017
                L_0x0031:
                    boolean r3 = r1.isEmpty()
                    r4 = 0
                    if (r3 == 0) goto L_0x003a
                    r11 = r4
                    goto L_0x0047
                L_0x003a:
                    int r3 = r1.size()
                    androidx.core.app.p[] r3 = new androidx.core.app.p[r3]
                    java.lang.Object[] r1 = r1.toArray(r3)
                    androidx.core.app.p[] r1 = (androidx.core.app.p[]) r1
                    r11 = r1
                L_0x0047:
                    boolean r1 = r2.isEmpty()
                    if (r1 == 0) goto L_0x004e
                    goto L_0x005b
                L_0x004e:
                    int r1 = r2.size()
                    androidx.core.app.p[] r1 = new androidx.core.app.p[r1]
                    java.lang.Object[] r1 = r2.toArray(r1)
                    r4 = r1
                    androidx.core.app.p[] r4 = (androidx.core.app.p[]) r4
                L_0x005b:
                    r10 = r4
                    androidx.core.app.j$b r1 = new androidx.core.app.j$b
                    androidx.core.graphics.drawable.IconCompat r6 = r0.f9031a
                    java.lang.CharSequence r7 = r0.f9032b
                    android.app.PendingIntent r8 = r0.f9033c
                    android.os.Bundle r9 = r0.f9035e
                    boolean r12 = r0.f9034d
                    int r13 = r0.f9037g
                    boolean r14 = r0.f9038h
                    boolean r15 = r0.f9039i
                    boolean r2 = r0.j
                    r5 = r1
                    r16 = r2
                    r5.<init>((androidx.core.graphics.drawable.IconCompat) r6, (java.lang.CharSequence) r7, (android.app.PendingIntent) r8, (android.os.Bundle) r9, (androidx.core.app.p[]) r10, (androidx.core.app.p[]) r11, (boolean) r12, (int) r13, (boolean) r14, (boolean) r15, (boolean) r16)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.j.b.a.b():androidx.core.app.j$b");
            }

            public a e(boolean z11) {
                this.f9034d = z11;
                return this;
            }

            public a f(boolean z11) {
                this.j = z11;
                return this;
            }

            public a g(boolean z11) {
                this.f9039i = z11;
                return this;
            }

            public a h(int i11) {
                this.f9037g = i11;
                return this;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public a(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i11 != 0 ? IconCompat.k((Resources) null, "", i11) : null, charSequence, pendingIntent, new Bundle(), (p[]) null, true, 0, true, false, false);
            }

            private a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, p[] pVarArr, boolean z11, int i11, boolean z12, boolean z13, boolean z14) {
                ArrayList<p> arrayList;
                this.f9034d = true;
                this.f9038h = true;
                this.f9031a = iconCompat;
                this.f9032b = f.p(charSequence);
                this.f9033c = pendingIntent;
                this.f9035e = bundle;
                if (pVarArr == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(Arrays.asList(pVarArr));
                }
                this.f9036f = arrayList;
                this.f9034d = z11;
                this.f9037g = i11;
                this.f9038h = z12;
                this.f9039i = z13;
                this.j = z14;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public b(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i11 != 0 ? IconCompat.k((Resources) null, "", i11) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.f9025e;
        }

        public Bundle c() {
            return this.f9021a;
        }

        public IconCompat d() {
            int i11;
            if (this.f9022b == null && (i11 = this.f9029i) != 0) {
                this.f9022b = IconCompat.k((Resources) null, "", i11);
            }
            return this.f9022b;
        }

        public p[] e() {
            return this.f9023c;
        }

        public int f() {
            return this.f9027g;
        }

        public boolean g() {
            return this.f9026f;
        }

        public CharSequence h() {
            return this.j;
        }

        public boolean i() {
            return this.f9030l;
        }

        public boolean j() {
            return this.f9028h;
        }

        public b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (p[]) null, (p[]) null, true, 0, true, false, false);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        b(int i11, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, p[] pVarArr, p[] pVarArr2, boolean z11, int i12, boolean z12, boolean z13, boolean z14) {
            this(i11 != 0 ? IconCompat.k((Resources) null, "", i11) : null, charSequence, pendingIntent, bundle, pVarArr, pVarArr2, z11, i12, z12, z13, z14);
        }

        b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, p[] pVarArr, p[] pVarArr2, boolean z11, int i11, boolean z12, boolean z13, boolean z14) {
            this.f9026f = true;
            this.f9022b = iconCompat;
            if (iconCompat != null && iconCompat.p() == 2) {
                this.f9029i = iconCompat.m();
            }
            this.j = f.p(charSequence);
            this.k = pendingIntent;
            this.f9021a = bundle == null ? new Bundle() : bundle;
            this.f9023c = pVarArr;
            this.f9024d = pVarArr2;
            this.f9025e = z11;
            this.f9027g = i11;
            this.f9026f = z12;
            this.f9028h = z13;
            this.f9030l = z14;
        }
    }

    /* compiled from: NotificationCompat */
    public static class c extends C0035j {

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f9040e;

        /* renamed from: f  reason: collision with root package name */
        private IconCompat f9041f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f9042g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f9043h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f9044i;

        /* compiled from: NotificationCompat */
        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* compiled from: NotificationCompat */
        private static class b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.j$c$c  reason: collision with other inner class name */
        /* compiled from: NotificationCompat */
        private static class C0034c {
            static void a(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, boolean z11) {
                bigPictureStyle.showBigPictureWhenCollapsed(z11);
            }
        }

        private static IconCompat x(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 23 && (parcelable instanceof Icon)) {
                return IconCompat.c((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.g((Bitmap) parcelable);
            }
            return null;
        }

        public c A(CharSequence charSequence) {
            this.f9093b = f.p(charSequence);
            return this;
        }

        public c B(CharSequence charSequence) {
            this.f9094c = f.p(charSequence);
            this.f9095d = true;
            return this;
        }

        public void b(i iVar) {
            int i11 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(iVar.a()).setBigContentTitle(this.f9093b).bigPicture(this.f9040e);
            if (this.f9042g) {
                IconCompat iconCompat = this.f9041f;
                Context context = null;
                if (iconCompat == null) {
                    a.a(bigPicture, (Bitmap) null);
                } else if (i11 >= 23) {
                    if (iVar instanceof k) {
                        context = ((k) iVar).f();
                    }
                    b.a(bigPicture, this.f9041f.y(context));
                } else if (iconCompat.p() == 1) {
                    a.a(bigPicture, this.f9041f.l());
                } else {
                    a.a(bigPicture, (Bitmap) null);
                }
            }
            if (this.f9095d) {
                a.b(bigPicture, this.f9094c);
            }
            if (i11 >= 31) {
                C0034c.b(bigPicture, this.f9044i);
                C0034c.a(bigPicture, this.f9043h);
            }
        }

        /* access modifiers changed from: protected */
        public void f(Bundle bundle) {
            super.f(bundle);
            bundle.remove("android.largeIcon.big");
            bundle.remove("android.picture");
            bundle.remove("android.showBigPictureWhenCollapsed");
        }

        /* access modifiers changed from: protected */
        public String q() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* access modifiers changed from: protected */
        public void v(Bundle bundle) {
            super.v(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f9041f = x(bundle.getParcelable("android.largeIcon.big"));
                this.f9042g = true;
            }
            this.f9040e = (Bitmap) bundle.getParcelable("android.picture");
            this.f9044i = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }

        public c y(Bitmap bitmap) {
            this.f9041f = bitmap == null ? null : IconCompat.g(bitmap);
            this.f9042g = true;
            return this;
        }

        public c z(Bitmap bitmap) {
            this.f9040e = bitmap;
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    public static class d extends C0035j {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f9045e;

        public void a(Bundle bundle) {
            super.a(bundle);
        }

        public void b(i iVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(iVar.a()).setBigContentTitle(this.f9093b).bigText(this.f9045e);
            if (this.f9095d) {
                bigText.setSummaryText(this.f9094c);
            }
        }

        /* access modifiers changed from: protected */
        public void f(Bundle bundle) {
            super.f(bundle);
            bundle.remove("android.bigText");
        }

        /* access modifiers changed from: protected */
        public String q() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* access modifiers changed from: protected */
        public void v(Bundle bundle) {
            super.v(bundle);
            this.f9045e = bundle.getCharSequence("android.bigText");
        }

        public d x(CharSequence charSequence) {
            this.f9045e = f.p(charSequence);
            return this;
        }

        public d y(CharSequence charSequence) {
            this.f9093b = f.p(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private PendingIntent f9046a;

        /* renamed from: b  reason: collision with root package name */
        private PendingIntent f9047b;

        /* renamed from: c  reason: collision with root package name */
        private IconCompat f9048c;

        /* renamed from: d  reason: collision with root package name */
        private int f9049d;

        /* renamed from: e  reason: collision with root package name */
        private int f9050e;

        /* renamed from: f  reason: collision with root package name */
        private int f9051f;

        /* renamed from: g  reason: collision with root package name */
        private String f9052g;

        /* compiled from: NotificationCompat */
        private static class a {
            static e a(Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                c g11 = new c(bubbleMetadata.getIntent(), IconCompat.c(bubbleMetadata.getIcon())).b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).g(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    g11.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    g11.e(bubbleMetadata.getDesiredHeightResId());
                }
                return g11.a();
            }

            static Notification.BubbleMetadata b(e eVar) {
                if (eVar == null || eVar.g() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(eVar.f().x()).setIntent(eVar.g()).setDeleteIntent(eVar.c()).setAutoExpandBubble(eVar.b()).setSuppressNotification(eVar.i());
                if (eVar.d() != 0) {
                    suppressNotification.setDesiredHeight(eVar.d());
                }
                if (eVar.e() != 0) {
                    suppressNotification.setDesiredHeightResId(eVar.e());
                }
                return suppressNotification.build();
            }
        }

        /* compiled from: NotificationCompat */
        private static class b {
            static e a(Notification.BubbleMetadata bubbleMetadata) {
                c cVar;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    cVar = new c(bubbleMetadata.getShortcutId());
                } else {
                    cVar = new c(bubbleMetadata.getIntent(), IconCompat.c(bubbleMetadata.getIcon()));
                }
                cVar.b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).g(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVar.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVar.e(bubbleMetadata.getDesiredHeightResId());
                }
                return cVar.a();
            }

            static Notification.BubbleMetadata b(e eVar) {
                Notification.BubbleMetadata.Builder builder;
                if (eVar == null) {
                    return null;
                }
                if (eVar.h() != null) {
                    builder = new Notification.BubbleMetadata.Builder(eVar.h());
                } else {
                    builder = new Notification.BubbleMetadata.Builder(eVar.g(), eVar.f().x());
                }
                builder.setDeleteIntent(eVar.c()).setAutoExpandBubble(eVar.b()).setSuppressNotification(eVar.i());
                if (eVar.d() != 0) {
                    builder.setDesiredHeight(eVar.d());
                }
                if (eVar.e() != 0) {
                    builder.setDesiredHeightResId(eVar.e());
                }
                return builder.build();
            }
        }

        public static e a(Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                return b.a(bubbleMetadata);
            }
            if (i11 == 29) {
                return a.a(bubbleMetadata);
            }
            return null;
        }

        public static Notification.BubbleMetadata k(e eVar) {
            if (eVar == null) {
                return null;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                return b.b(eVar);
            }
            if (i11 == 29) {
                return a.b(eVar);
            }
            return null;
        }

        public boolean b() {
            return (this.f9051f & 1) != 0;
        }

        public PendingIntent c() {
            return this.f9047b;
        }

        public int d() {
            return this.f9049d;
        }

        public int e() {
            return this.f9050e;
        }

        @SuppressLint({"InvalidNullConversion"})
        public IconCompat f() {
            return this.f9048c;
        }

        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent g() {
            return this.f9046a;
        }

        public String h() {
            return this.f9052g;
        }

        public boolean i() {
            return (this.f9051f & 2) != 0;
        }

        public void j(int i11) {
            this.f9051f = i11;
        }

        private e(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i11, int i12, int i13, String str) {
            this.f9046a = pendingIntent;
            this.f9048c = iconCompat;
            this.f9049d = i11;
            this.f9050e = i12;
            this.f9047b = pendingIntent2;
            this.f9051f = i13;
            this.f9052g = str;
        }

        /* compiled from: NotificationCompat */
        public static final class c {

            /* renamed from: a  reason: collision with root package name */
            private PendingIntent f9053a;

            /* renamed from: b  reason: collision with root package name */
            private IconCompat f9054b;

            /* renamed from: c  reason: collision with root package name */
            private int f9055c;

            /* renamed from: d  reason: collision with root package name */
            private int f9056d;

            /* renamed from: e  reason: collision with root package name */
            private int f9057e;

            /* renamed from: f  reason: collision with root package name */
            private PendingIntent f9058f;

            /* renamed from: g  reason: collision with root package name */
            private String f9059g;

            public c(String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f9059g = str;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            private c f(int i11, boolean z11) {
                if (z11) {
                    this.f9057e = i11 | this.f9057e;
                } else {
                    this.f9057e = (~i11) & this.f9057e;
                }
                return this;
            }

            @SuppressLint({"SyntheticAccessor"})
            public e a() {
                String str = this.f9059g;
                if (str == null) {
                    Objects.requireNonNull(this.f9053a, "Must supply pending intent or shortcut to bubble");
                }
                if (str == null) {
                    Objects.requireNonNull(this.f9054b, "Must supply an icon or shortcut for the bubble");
                }
                e eVar = new e(this.f9053a, this.f9058f, this.f9054b, this.f9055c, this.f9056d, this.f9057e, str);
                eVar.j(this.f9057e);
                return eVar;
            }

            public c b(boolean z11) {
                f(1, z11);
                return this;
            }

            public c c(PendingIntent pendingIntent) {
                this.f9058f = pendingIntent;
                return this;
            }

            public c d(int i11) {
                this.f9055c = Math.max(i11, 0);
                this.f9056d = 0;
                return this;
            }

            public c e(int i11) {
                this.f9056d = i11;
                this.f9055c = 0;
                return this;
            }

            public c g(boolean z11) {
                f(2, z11);
                return this;
            }

            public c(PendingIntent pendingIntent, IconCompat iconCompat) {
                Objects.requireNonNull(pendingIntent, "Bubble requires non-null pending intent");
                Objects.requireNonNull(iconCompat, "Bubbles require non-null icon");
                this.f9053a = pendingIntent;
                this.f9054b = iconCompat;
            }
        }
    }

    /* compiled from: NotificationCompat */
    public static class g extends C0035j {
        private RemoteViews x(RemoteViews remoteViews, boolean z11) {
            int min;
            boolean z12 = true;
            int i11 = 0;
            RemoteViews c11 = c(true, R.layout.notification_template_custom_big, false);
            c11.removeAllViews(R.id.actions);
            List<b> z13 = z(this.f9092a.f9061b);
            if (!z11 || z13 == null || (min = Math.min(z13.size(), 3)) <= 0) {
                z12 = false;
            } else {
                for (int i12 = 0; i12 < min; i12++) {
                    c11.addView(R.id.actions, y(z13.get(i12)));
                }
            }
            if (!z12) {
                i11 = 8;
            }
            c11.setViewVisibility(R.id.actions, i11);
            c11.setViewVisibility(R.id.action_divider, i11);
            d(c11, remoteViews);
            return c11;
        }

        private RemoteViews y(b bVar) {
            int i11;
            boolean z11 = bVar.k == null;
            String packageName = this.f9092a.f9060a.getPackageName();
            if (z11) {
                i11 = R.layout.notification_action_tombstone;
            } else {
                i11 = R.layout.notification_action;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i11);
            IconCompat d11 = bVar.d();
            if (d11 != null) {
                remoteViews.setImageViewBitmap(R.id.action_image, m(d11, this.f9092a.f9060a.getResources().getColor(R.color.notification_action_color_filter)));
            }
            remoteViews.setTextViewText(R.id.action_text, bVar.j);
            if (!z11) {
                remoteViews.setOnClickPendingIntent(R.id.action_container, bVar.k);
            }
            remoteViews.setContentDescription(R.id.action_container, bVar.j);
            return remoteViews;
        }

        private static List<b> z(List<b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (b next : list) {
                if (!next.j()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public void b(i iVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                iVar.a().setStyle(new Notification.DecoratedCustomViewStyle());
            }
        }

        /* access modifiers changed from: protected */
        public String q() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        public RemoteViews s(i iVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews h11 = this.f9092a.h();
            if (h11 == null) {
                h11 = this.f9092a.j();
            }
            if (h11 == null) {
                return null;
            }
            return x(h11, true);
        }

        public RemoteViews t(i iVar) {
            if (Build.VERSION.SDK_INT < 24 && this.f9092a.j() != null) {
                return x(this.f9092a.j(), false);
            }
            return null;
        }

        public RemoteViews u(i iVar) {
            RemoteViews remoteViews;
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews m11 = this.f9092a.m();
            if (m11 != null) {
                remoteViews = m11;
            } else {
                remoteViews = this.f9092a.j();
            }
            if (m11 == null) {
                return null;
            }
            return x(remoteViews, true);
        }
    }

    /* compiled from: NotificationCompat */
    public static class h extends C0035j {

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<CharSequence> f9080e = new ArrayList<>();

        public void b(i iVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(iVar.a()).setBigContentTitle(this.f9093b);
            if (this.f9095d) {
                bigContentTitle.setSummaryText(this.f9094c);
            }
            Iterator<CharSequence> it2 = this.f9080e.iterator();
            while (it2.hasNext()) {
                bigContentTitle.addLine(it2.next());
            }
        }

        /* access modifiers changed from: protected */
        public void f(Bundle bundle) {
            super.f(bundle);
            bundle.remove("android.textLines");
        }

        /* access modifiers changed from: protected */
        public String q() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        /* access modifiers changed from: protected */
        public void v(Bundle bundle) {
            super.v(bundle);
            this.f9080e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f9080e, bundle.getCharSequenceArray("android.textLines"));
            }
        }
    }

    /* renamed from: androidx.core.app.j$j  reason: collision with other inner class name */
    /* compiled from: NotificationCompat */
    public static abstract class C0035j {

        /* renamed from: a  reason: collision with root package name */
        protected f f9092a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f9093b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f9094c;

        /* renamed from: d  reason: collision with root package name */
        boolean f9095d = false;

        private int e() {
            Resources resources = this.f9092a.f9060a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
            float g11 = (g(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - g11) * ((float) dimensionPixelSize)) + (g11 * ((float) dimensionPixelSize2)));
        }

        private static float g(float f11, float f12, float f13) {
            return f11 < f12 ? f12 : f11 > f13 ? f13 : f11;
        }

        static C0035j h(String str) {
            if (str == null) {
                return null;
            }
            char c11 = 65535;
            switch (str.hashCode()) {
                case -716705180:
                    if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -171946061:
                    if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 912942987:
                    if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 919595044:
                    if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 2090799565:
                    if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                        c11 = 4;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    return new g();
                case 1:
                    return new c();
                case 2:
                    return new h();
                case 3:
                    return new d();
                case 4:
                    return new i();
                default:
                    return null;
            }
        }

        private static C0035j i(String str) {
            if (str == null) {
                return null;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new c();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new d();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new h();
            }
            if (i11 >= 24) {
                if (str.equals(Notification.MessagingStyle.class.getName())) {
                    return new i();
                }
                if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                    return new g();
                }
            }
            return null;
        }

        static C0035j j(Bundle bundle) {
            C0035j h11 = h(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            if (h11 != null) {
                return h11;
            }
            if (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) {
                return new i();
            }
            if (bundle.containsKey("android.picture")) {
                return new c();
            }
            if (bundle.containsKey("android.bigText")) {
                return new d();
            }
            if (bundle.containsKey("android.textLines")) {
                return new h();
            }
            return i(bundle.getString("android.template"));
        }

        static C0035j k(Bundle bundle) {
            C0035j j = j(bundle);
            if (j == null) {
                return null;
            }
            try {
                j.v(bundle);
                return j;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap l(int i11, int i12, int i13) {
            return n(IconCompat.j(this.f9092a.f9060a, i11), i12, i13);
        }

        private Bitmap n(IconCompat iconCompat, int i11, int i12) {
            Drawable s11 = iconCompat.s(this.f9092a.f9060a);
            int intrinsicWidth = i12 == 0 ? s11.getIntrinsicWidth() : i12;
            if (i12 == 0) {
                i12 = s11.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i12, Bitmap.Config.ARGB_8888);
            s11.setBounds(0, 0, intrinsicWidth, i12);
            if (i11 != 0) {
                s11.mutate().setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
            }
            s11.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap o(int i11, int i12, int i13, int i14) {
            int i15 = R.drawable.notification_icon_background;
            if (i14 == 0) {
                i14 = 0;
            }
            Bitmap l11 = l(i15, i14, i12);
            Canvas canvas = new Canvas(l11);
            Drawable mutate = this.f9092a.f9060a.getResources().getDrawable(i11).mutate();
            mutate.setFilterBitmap(true);
            int i16 = (i12 - i13) / 2;
            int i17 = i13 + i16;
            mutate.setBounds(i16, i16, i17, i17);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return l11;
        }

        public static C0035j p(Notification notification) {
            Bundle k = j.k(notification);
            if (k == null) {
                return null;
            }
            return k(k);
        }

        private void r(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(R.id.title, 8);
            remoteViews.setViewVisibility(R.id.text2, 8);
            remoteViews.setViewVisibility(R.id.text, 8);
        }

        public void a(Bundle bundle) {
            if (this.f9095d) {
                bundle.putCharSequence("android.summaryText", this.f9094c);
            }
            CharSequence charSequence = this.f9093b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String q = q();
            if (q != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", q);
            }
        }

        public abstract void b(i iVar);

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x011b  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x013f  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0183  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0188  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x018a  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0194  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews c(boolean r13, int r14, boolean r15) {
            /*
                r12 = this;
                androidx.core.app.j$f r0 = r12.f9092a
                android.content.Context r0 = r0.f9060a
                android.content.res.Resources r0 = r0.getResources()
                android.widget.RemoteViews r7 = new android.widget.RemoteViews
                androidx.core.app.j$f r1 = r12.f9092a
                android.content.Context r1 = r1.f9060a
                java.lang.String r1 = r1.getPackageName()
                r7.<init>(r1, r14)
                androidx.core.app.j$f r14 = r12.f9092a
                r14.n()
                int r14 = android.os.Build.VERSION.SDK_INT
                androidx.core.app.j$f r1 = r12.f9092a
                android.graphics.Bitmap r2 = r1.j
                r8 = 0
                if (r2 == 0) goto L_0x0060
                int r1 = androidx.core.R.id.icon
                r7.setViewVisibility(r1, r8)
                androidx.core.app.j$f r2 = r12.f9092a
                android.graphics.Bitmap r2 = r2.j
                r7.setImageViewBitmap(r1, r2)
                if (r13 == 0) goto L_0x0091
                androidx.core.app.j$f r13 = r12.f9092a
                android.app.Notification r13 = r13.U
                int r13 = r13.icon
                if (r13 == 0) goto L_0x0091
                int r13 = androidx.core.R.dimen.notification_right_icon_size
                int r13 = r0.getDimensionPixelSize(r13)
                int r1 = androidx.core.R.dimen.notification_small_icon_background_padding
                int r1 = r0.getDimensionPixelSize(r1)
                int r1 = r1 * 2
                int r1 = r13 - r1
                androidx.core.app.j$f r2 = r12.f9092a
                android.app.Notification r3 = r2.U
                int r3 = r3.icon
                int r2 = r2.i()
                android.graphics.Bitmap r13 = r12.o(r3, r13, r1, r2)
                int r1 = androidx.core.R.id.right_icon
                r7.setImageViewBitmap(r1, r13)
                r7.setViewVisibility(r1, r8)
                goto L_0x0091
            L_0x0060:
                if (r13 == 0) goto L_0x0091
                android.app.Notification r13 = r1.U
                int r13 = r13.icon
                if (r13 == 0) goto L_0x0091
                int r13 = androidx.core.R.id.icon
                r7.setViewVisibility(r13, r8)
                int r1 = androidx.core.R.dimen.notification_large_icon_width
                int r1 = r0.getDimensionPixelSize(r1)
                int r2 = androidx.core.R.dimen.notification_big_circle_margin
                int r2 = r0.getDimensionPixelSize(r2)
                int r1 = r1 - r2
                int r2 = androidx.core.R.dimen.notification_small_icon_size_as_large
                int r2 = r0.getDimensionPixelSize(r2)
                androidx.core.app.j$f r3 = r12.f9092a
                android.app.Notification r4 = r3.U
                int r4 = r4.icon
                int r3 = r3.i()
                android.graphics.Bitmap r1 = r12.o(r4, r1, r2, r3)
                r7.setImageViewBitmap(r13, r1)
            L_0x0091:
                androidx.core.app.j$f r13 = r12.f9092a
                java.lang.CharSequence r13 = r13.f9064e
                if (r13 == 0) goto L_0x009c
                int r1 = androidx.core.R.id.title
                r7.setTextViewText(r1, r13)
            L_0x009c:
                androidx.core.app.j$f r13 = r12.f9092a
                java.lang.CharSequence r13 = r13.f9065f
                r9 = 1
                if (r13 == 0) goto L_0x00aa
                int r1 = androidx.core.R.id.text
                r7.setTextViewText(r1, r13)
                r13 = 1
                goto L_0x00ab
            L_0x00aa:
                r13 = 0
            L_0x00ab:
                androidx.core.app.j$f r1 = r12.f9092a
                java.lang.CharSequence r2 = r1.k
                r10 = 8
                if (r2 == 0) goto L_0x00be
                int r13 = androidx.core.R.id.info
                r7.setTextViewText(r13, r2)
                r7.setViewVisibility(r13, r8)
            L_0x00bb:
                r13 = 1
                r11 = 1
                goto L_0x00f8
            L_0x00be:
                int r1 = r1.f9069l
                if (r1 <= 0) goto L_0x00f2
                int r13 = androidx.core.R.integer.status_bar_notification_info_maxnum
                int r13 = r0.getInteger(r13)
                androidx.core.app.j$f r1 = r12.f9092a
                int r1 = r1.f9069l
                if (r1 <= r13) goto L_0x00da
                int r13 = androidx.core.R.id.info
                int r1 = androidx.core.R.string.status_bar_notification_info_overflow
                java.lang.String r1 = r0.getString(r1)
                r7.setTextViewText(r13, r1)
                goto L_0x00ec
            L_0x00da:
                java.text.NumberFormat r13 = java.text.NumberFormat.getIntegerInstance()
                int r1 = androidx.core.R.id.info
                androidx.core.app.j$f r2 = r12.f9092a
                int r2 = r2.f9069l
                long r2 = (long) r2
                java.lang.String r13 = r13.format(r2)
                r7.setTextViewText(r1, r13)
            L_0x00ec:
                int r13 = androidx.core.R.id.info
                r7.setViewVisibility(r13, r8)
                goto L_0x00bb
            L_0x00f2:
                int r1 = androidx.core.R.id.info
                r7.setViewVisibility(r1, r10)
                r11 = 0
            L_0x00f8:
                androidx.core.app.j$f r1 = r12.f9092a
                java.lang.CharSequence r1 = r1.f9073r
                if (r1 == 0) goto L_0x0118
                int r2 = androidx.core.R.id.text
                r7.setTextViewText(r2, r1)
                androidx.core.app.j$f r1 = r12.f9092a
                java.lang.CharSequence r1 = r1.f9065f
                if (r1 == 0) goto L_0x0113
                int r2 = androidx.core.R.id.text2
                r7.setTextViewText(r2, r1)
                r7.setViewVisibility(r2, r8)
                r1 = 1
                goto L_0x0119
            L_0x0113:
                int r1 = androidx.core.R.id.text2
                r7.setViewVisibility(r1, r10)
            L_0x0118:
                r1 = 0
            L_0x0119:
                if (r1 == 0) goto L_0x0133
                if (r15 == 0) goto L_0x0129
                int r15 = androidx.core.R.dimen.notification_subtext_size
                int r15 = r0.getDimensionPixelSize(r15)
                float r15 = (float) r15
                int r0 = androidx.core.R.id.text
                r7.setTextViewTextSize(r0, r8, r15)
            L_0x0129:
                int r2 = androidx.core.R.id.line1
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r1 = r7
                r1.setViewPadding(r2, r3, r4, r5, r6)
            L_0x0133:
                androidx.core.app.j$f r15 = r12.f9092a
                long r0 = r15.o()
                r2 = 0
                int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r15 == 0) goto L_0x0183
                androidx.core.app.j$f r15 = r12.f9092a
                boolean r15 = r15.f9071o
                if (r15 == 0) goto L_0x0172
                int r15 = androidx.core.R.id.chronometer
                r7.setViewVisibility(r15, r8)
                androidx.core.app.j$f r0 = r12.f9092a
                long r0 = r0.o()
                long r2 = android.os.SystemClock.elapsedRealtime()
                long r4 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r4
                long r0 = r0 + r2
                java.lang.String r2 = "setBase"
                r7.setLong(r15, r2, r0)
                java.lang.String r0 = "setStarted"
                r7.setBoolean(r15, r0, r9)
                androidx.core.app.j$f r0 = r12.f9092a
                boolean r0 = r0.f9072p
                if (r0 == 0) goto L_0x0184
                r1 = 24
                if (r14 < r1) goto L_0x0184
                r7.setChronometerCountDown(r15, r0)
                goto L_0x0184
            L_0x0172:
                int r14 = androidx.core.R.id.time
                r7.setViewVisibility(r14, r8)
                androidx.core.app.j$f r15 = r12.f9092a
                long r0 = r15.o()
                java.lang.String r15 = "setTime"
                r7.setLong(r14, r15, r0)
                goto L_0x0184
            L_0x0183:
                r9 = r11
            L_0x0184:
                int r14 = androidx.core.R.id.right_side
                if (r9 == 0) goto L_0x018a
                r15 = 0
                goto L_0x018c
            L_0x018a:
                r15 = 8
            L_0x018c:
                r7.setViewVisibility(r14, r15)
                int r14 = androidx.core.R.id.line3
                if (r13 == 0) goto L_0x0194
                goto L_0x0196
            L_0x0194:
                r8 = 8
            L_0x0196:
                r7.setViewVisibility(r14, r8)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.j.C0035j.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        public void d(RemoteViews remoteViews, RemoteViews remoteViews2) {
            r(remoteViews);
            int i11 = R.id.notification_main_column;
            remoteViews.removeAllViews(i11);
            remoteViews.addView(i11, remoteViews2.clone());
            remoteViews.setViewVisibility(i11, 0);
            remoteViews.setViewPadding(R.id.notification_main_column_container, 0, e(), 0, 0);
        }

        /* access modifiers changed from: protected */
        public void f(Bundle bundle) {
            bundle.remove("android.summaryText");
            bundle.remove("android.title.big");
            bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
        }

        /* access modifiers changed from: package-private */
        public Bitmap m(IconCompat iconCompat, int i11) {
            return n(iconCompat, i11, 0);
        }

        /* access modifiers changed from: protected */
        public abstract String q();

        public RemoteViews s(i iVar) {
            return null;
        }

        public RemoteViews t(i iVar) {
            return null;
        }

        public RemoteViews u(i iVar) {
            return null;
        }

        /* access modifiers changed from: protected */
        public void v(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.f9094c = bundle.getCharSequence("android.summaryText");
                this.f9095d = true;
            }
            this.f9093b = bundle.getCharSequence("android.title.big");
        }

        public void w(f fVar) {
            if (this.f9092a != fVar) {
                this.f9092a = fVar;
                if (fVar != null) {
                    fVar.f0(this);
                }
            }
        }
    }

    public static int A(Notification notification) {
        return notification.visibility;
    }

    public static boolean B(Notification notification) {
        return (notification.flags & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0;
    }

    public static boolean a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return notification.getAllowSystemGeneratedContextualActions();
        }
        return false;
    }

    public static boolean b(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int c(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getBadgeIconType();
        }
        return 0;
    }

    public static e d(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return e.a(notification.getBubbleMetadata());
        }
        return null;
    }

    public static String e(Notification notification) {
        return notification.category;
    }

    public static String f(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    public static int g(Notification notification) {
        return notification.color;
    }

    public static CharSequence h(Notification notification) {
        return notification.extras.getCharSequence("android.infoText");
    }

    public static CharSequence i(Notification notification) {
        return notification.extras.getCharSequence("android.text");
    }

    public static CharSequence j(Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }

    public static Bundle k(Notification notification) {
        return notification.extras;
    }

    public static String l(Notification notification) {
        return notification.getGroup();
    }

    static boolean m(Notification notification) {
        return (notification.flags & 128) != 0;
    }

    public static List<b> n(Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (!(bundle2 == null || (bundle = bundle2.getBundle("invisible_actions")) == null)) {
            for (int i11 = 0; i11 < bundle.size(); i11++) {
                arrayList.add(l.c(bundle.getBundle(Integer.toString(i11))));
            }
        }
        return arrayList;
    }

    public static boolean o(Notification notification) {
        return (notification.flags & 256) != 0;
    }

    public static androidx.core.content.b p(Notification notification) {
        LocusId locusId;
        if (Build.VERSION.SDK_INT < 29 || (locusId = notification.getLocusId()) == null) {
            return null;
        }
        return androidx.core.content.b.c(locusId);
    }

    public static boolean q(Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean r(Notification notification) {
        return (notification.flags & 8) != 0;
    }

    public static Notification s(Notification notification) {
        return notification.publicVersion;
    }

    public static CharSequence t(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getSettingsText();
        }
        return null;
    }

    public static String u(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getShortcutId();
        }
        return null;
    }

    public static boolean v(Notification notification) {
        return notification.extras.getBoolean("android.showWhen");
    }

    public static String w(Notification notification) {
        return notification.getSortKey();
    }

    public static CharSequence x(Notification notification) {
        return notification.extras.getCharSequence("android.subText");
    }

    public static long y(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getTimeoutAfter();
        }
        return 0;
    }

    public static boolean z(Notification notification) {
        return notification.extras.getBoolean("android.showChronometer");
    }

    /* compiled from: NotificationCompat */
    public static class i extends C0035j {

        /* renamed from: e  reason: collision with root package name */
        private final List<a> f9081e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        private final List<a> f9082f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        private n f9083g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f9084h;

        /* renamed from: i  reason: collision with root package name */
        private Boolean f9085i;

        /* compiled from: NotificationCompat */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private final CharSequence f9086a;

            /* renamed from: b  reason: collision with root package name */
            private final long f9087b;

            /* renamed from: c  reason: collision with root package name */
            private final n f9088c;

            /* renamed from: d  reason: collision with root package name */
            private Bundle f9089d = new Bundle();

            /* renamed from: e  reason: collision with root package name */
            private String f9090e;

            /* renamed from: f  reason: collision with root package name */
            private Uri f9091f;

            public a(CharSequence charSequence, long j, n nVar) {
                this.f9086a = charSequence;
                this.f9087b = j;
                this.f9088c = nVar;
            }

            static Bundle[] a(List<a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    bundleArr[i11] = list.get(i11).l();
                }
                return bundleArr;
            }

            static a e(Bundle bundle) {
                n nVar;
                try {
                    if (bundle.containsKey("text")) {
                        if (bundle.containsKey("time")) {
                            if (bundle.containsKey("person")) {
                                nVar = n.b(bundle.getBundle("person"));
                            } else if (!bundle.containsKey("sender_person") || Build.VERSION.SDK_INT < 28) {
                                nVar = bundle.containsKey("sender") ? new n.b().f(bundle.getCharSequence("sender")).a() : null;
                            } else {
                                nVar = n.a((Person) bundle.getParcelable("sender_person"));
                            }
                            a aVar = new a(bundle.getCharSequence("text"), bundle.getLong("time"), nVar);
                            if (bundle.containsKey("type") && bundle.containsKey(ReactVideoViewManager.PROP_SRC_URI)) {
                                aVar.j(bundle.getString("type"), (Uri) bundle.getParcelable(ReactVideoViewManager.PROP_SRC_URI));
                            }
                            if (bundle.containsKey("extras")) {
                                aVar.d().putAll(bundle.getBundle("extras"));
                            }
                            return aVar;
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            static List<a> f(Parcelable[] parcelableArr) {
                a e11;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (int i11 = 0; i11 < parcelableArr.length; i11++) {
                    if ((parcelableArr[i11] instanceof Bundle) && (e11 = e(parcelableArr[i11])) != null) {
                        arrayList.add(e11);
                    }
                }
                return arrayList;
            }

            private Bundle l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f9086a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f9087b);
                n nVar = this.f9088c;
                if (nVar != null) {
                    bundle.putCharSequence("sender", nVar.e());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f9088c.j());
                    } else {
                        bundle.putBundle("person", this.f9088c.k());
                    }
                }
                String str = this.f9090e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f9091f;
                if (uri != null) {
                    bundle.putParcelable(ReactVideoViewManager.PROP_SRC_URI, uri);
                }
                Bundle bundle2 = this.f9089d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.f9090e;
            }

            public Uri c() {
                return this.f9091f;
            }

            public Bundle d() {
                return this.f9089d;
            }

            public n g() {
                return this.f9088c;
            }

            public CharSequence h() {
                return this.f9086a;
            }

            public long i() {
                return this.f9087b;
            }

            public a j(String str, Uri uri) {
                this.f9090e = str;
                this.f9091f = uri;
                return this;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.app.Person} */
            /* JADX WARNING: type inference failed for: r2v0 */
            /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.CharSequence] */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* access modifiers changed from: package-private */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.app.Notification.MessagingStyle.Message k() {
                /*
                    r6 = this;
                    androidx.core.app.n r0 = r6.g()
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 0
                    r3 = 28
                    if (r1 < r3) goto L_0x0020
                    android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                    java.lang.CharSequence r3 = r6.h()
                    long r4 = r6.i()
                    if (r0 != 0) goto L_0x0018
                    goto L_0x001c
                L_0x0018:
                    android.app.Person r2 = r0.j()
                L_0x001c:
                    r1.<init>(r3, r4, r2)
                    goto L_0x0034
                L_0x0020:
                    android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                    java.lang.CharSequence r3 = r6.h()
                    long r4 = r6.i()
                    if (r0 != 0) goto L_0x002d
                    goto L_0x0031
                L_0x002d:
                    java.lang.CharSequence r2 = r0.e()
                L_0x0031:
                    r1.<init>(r3, r4, r2)
                L_0x0034:
                    java.lang.String r0 = r6.b()
                    if (r0 == 0) goto L_0x0045
                    java.lang.String r0 = r6.b()
                    android.net.Uri r2 = r6.c()
                    r1.setData(r0, r2)
                L_0x0045:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.j.i.a.k():android.app.Notification$MessagingStyle$Message");
            }
        }

        i() {
        }

        private a A() {
            for (int size = this.f9081e.size() - 1; size >= 0; size--) {
                a aVar = this.f9081e.get(size);
                if (aVar.g() != null && !TextUtils.isEmpty(aVar.g().e())) {
                    return aVar;
                }
            }
            if (this.f9081e.isEmpty()) {
                return null;
            }
            List<a> list = this.f9081e;
            return list.get(list.size() - 1);
        }

        private boolean B() {
            for (int size = this.f9081e.size() - 1; size >= 0; size--) {
                a aVar = this.f9081e.get(size);
                if (aVar.g() != null && aVar.g().e() == null) {
                    return true;
                }
            }
            return false;
        }

        private TextAppearanceSpan D(int i11) {
            return new TextAppearanceSpan((String) null, 0, 0, ColorStateList.valueOf(i11), (ColorStateList) null);
        }

        private CharSequence E(a aVar) {
            androidx.core.text.a c11 = androidx.core.text.a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i11 = -16777216;
            CharSequence charSequence = "";
            CharSequence e11 = aVar.g() == null ? charSequence : aVar.g().e();
            if (TextUtils.isEmpty(e11)) {
                e11 = this.f9083g.e();
                if (this.f9092a.i() != 0) {
                    i11 = this.f9092a.i();
                }
            }
            CharSequence h11 = c11.h(e11);
            spannableStringBuilder.append(h11);
            spannableStringBuilder.setSpan(D(i11), spannableStringBuilder.length() - h11.length(), spannableStringBuilder.length(), 33);
            if (aVar.h() != null) {
                charSequence = aVar.h();
            }
            spannableStringBuilder.append("  ").append(c11.h(charSequence));
            return spannableStringBuilder;
        }

        public static i z(Notification notification) {
            C0035j p11 = C0035j.p(notification);
            if (p11 instanceof i) {
                return (i) p11;
            }
            return null;
        }

        public boolean C() {
            f fVar = this.f9092a;
            if (fVar == null || fVar.f9060a.getApplicationInfo().targetSdkVersion >= 28 || this.f9085i != null) {
                Boolean bool = this.f9085i;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } else if (this.f9084h != null) {
                return true;
            } else {
                return false;
            }
        }

        public i F(boolean z11) {
            this.f9085i = Boolean.valueOf(z11);
            return this;
        }

        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f9083g.e());
            bundle.putBundle("android.messagingStyleUser", this.f9083g.k());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f9084h);
            if (this.f9084h != null && this.f9085i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f9084h);
            }
            if (!this.f9081e.isEmpty()) {
                bundle.putParcelableArray("android.messages", a.a(this.f9081e));
            }
            if (!this.f9082f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", a.a(this.f9082f));
            }
            Boolean bool = this.f9085i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        public void b(i iVar) {
            CharSequence charSequence;
            Notification.MessagingStyle messagingStyle;
            F(C());
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                if (i11 >= 28) {
                    messagingStyle = new Notification.MessagingStyle(this.f9083g.j());
                } else {
                    messagingStyle = new Notification.MessagingStyle(this.f9083g.e());
                }
                for (a k : this.f9081e) {
                    messagingStyle.addMessage(k.k());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    for (a k11 : this.f9082f) {
                        messagingStyle.addHistoricMessage(k11.k());
                    }
                }
                if (this.f9085i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setConversationTitle(this.f9084h);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    messagingStyle.setGroupConversation(this.f9085i.booleanValue());
                }
                messagingStyle.setBuilder(iVar.a());
                return;
            }
            a A = A();
            if (this.f9084h != null && this.f9085i.booleanValue()) {
                iVar.a().setContentTitle(this.f9084h);
            } else if (A != null) {
                iVar.a().setContentTitle("");
                if (A.g() != null) {
                    iVar.a().setContentTitle(A.g().e());
                }
            }
            if (A != null) {
                Notification.Builder a11 = iVar.a();
                if (this.f9084h != null) {
                    charSequence = E(A);
                } else {
                    charSequence = A.h();
                }
                a11.setContentText(charSequence);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z11 = this.f9084h != null || B();
            for (int size = this.f9081e.size() - 1; size >= 0; size--) {
                a aVar = this.f9081e.get(size);
                CharSequence E = z11 ? E(aVar) : aVar.h();
                if (size != this.f9081e.size() - 1) {
                    spannableStringBuilder.insert(0, "\n");
                }
                spannableStringBuilder.insert(0, E);
            }
            new Notification.BigTextStyle(iVar.a()).setBigContentTitle((CharSequence) null).bigText(spannableStringBuilder);
        }

        /* access modifiers changed from: protected */
        public void f(Bundle bundle) {
            super.f(bundle);
            bundle.remove("android.messagingStyleUser");
            bundle.remove("android.selfDisplayName");
            bundle.remove("android.conversationTitle");
            bundle.remove("android.hiddenConversationTitle");
            bundle.remove("android.messages");
            bundle.remove("android.messages.historic");
            bundle.remove("android.isGroupConversation");
        }

        /* access modifiers changed from: protected */
        public String q() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        /* access modifiers changed from: protected */
        public void v(Bundle bundle) {
            super.v(bundle);
            this.f9081e.clear();
            if (bundle.containsKey("android.messagingStyleUser")) {
                this.f9083g = n.b(bundle.getBundle("android.messagingStyleUser"));
            } else {
                this.f9083g = new n.b().f(bundle.getString("android.selfDisplayName")).a();
            }
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f9084h = charSequence;
            if (charSequence == null) {
                this.f9084h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f9081e.addAll(a.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f9082f.addAll(a.f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f9085i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        public i x(a aVar) {
            if (aVar != null) {
                this.f9081e.add(aVar);
                if (this.f9081e.size() > 25) {
                    this.f9081e.remove(0);
                }
            }
            return this;
        }

        public i y(CharSequence charSequence, long j, n nVar) {
            x(new a(charSequence, j, nVar));
            return this;
        }

        public i(n nVar) {
            if (!TextUtils.isEmpty(nVar.e())) {
                this.f9083g = nVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* compiled from: NotificationCompat */
    public static class f {
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        androidx.core.content.b O;
        long P;
        int Q;
        int R;
        boolean S;
        e T;
        Notification U;
        boolean V;
        Icon W;
        @Deprecated
        public ArrayList<String> X;

        /* renamed from: a  reason: collision with root package name */
        public Context f9060a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f9061b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<n> f9062c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<b> f9063d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f9064e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f9065f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f9066g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f9067h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f9068i;
        Bitmap j;
        CharSequence k;

        /* renamed from: l  reason: collision with root package name */
        int f9069l;

        /* renamed from: m  reason: collision with root package name */
        int f9070m;
        boolean n;

        /* renamed from: o  reason: collision with root package name */
        boolean f9071o;

        /* renamed from: p  reason: collision with root package name */
        boolean f9072p;
        C0035j q;

        /* renamed from: r  reason: collision with root package name */
        CharSequence f9073r;

        /* renamed from: s  reason: collision with root package name */
        CharSequence f9074s;
        CharSequence[] t;

        /* renamed from: u  reason: collision with root package name */
        int f9075u;
        int v;

        /* renamed from: w  reason: collision with root package name */
        boolean f9076w;

        /* renamed from: x  reason: collision with root package name */
        String f9077x;

        /* renamed from: y  reason: collision with root package name */
        boolean f9078y;

        /* renamed from: z  reason: collision with root package name */
        String f9079z;

        public f(Context context, Notification notification) {
            this(context, j.f(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            C0035j p11 = C0035j.p(notification);
            D(j.j(notification)).C(j.i(notification)).A(j.h(notification)).g0(j.x(notification)).X(j.t(notification)).f0(p11).B(notification.contentIntent).L(j.l(notification)).M(j.B(notification)).Q(j.p(notification)).m0(notification.when).Z(j.v(notification)).j0(j.z(notification)).s(j.b(notification)).T(j.r(notification)).S(j.q(notification)).P(j.o(notification)).N(notification.largeIcon).t(j.c(notification)).v(j.e(notification)).u(j.d(notification)).R(notification.number).h0(notification.tickerText).B(notification.contentIntent).H(notification.deleteIntent).K(notification.fullScreenIntent, j.m(notification)).e0(notification.sound, notification.audioStreamType).k0(notification.vibrate).O(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).G(notification.defaults).U(notification.priority).y(j.g(notification)).l0(j.A(notification)).W(j.s(notification)).c0(j.w(notification)).i0(j.y(notification)).Y(j.u(notification)).V(bundle.getInt("android.progressMax"), bundle.getInt("android.progress"), bundle.getBoolean("android.progressIndeterminate")).r(j.a(notification)).b0(notification.icon, notification.iconLevel).c(l(notification, p11));
            if (Build.VERSION.SDK_INT >= 23) {
                this.W = notification.getSmallIcon();
            }
            Notification.Action[] actionArr = notification.actions;
            if (!(actionArr == null || actionArr.length == 0)) {
                for (Notification.Action d11 : actionArr) {
                    b(b.a.d(d11).b());
                }
            }
            List<b> n11 = j.n(notification);
            if (!n11.isEmpty()) {
                for (b d12 : n11) {
                    d(d12);
                }
            }
            String[] stringArray = notification.extras.getStringArray("android.people");
            if (!(stringArray == null || stringArray.length == 0)) {
                for (String f11 : stringArray) {
                    f(f11);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList("android.people.list")) != null && !parcelableArrayList.isEmpty()) {
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    e(n.a((Person) it2.next()));
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24 && bundle.containsKey("android.chronometerCountDown")) {
                x(bundle.getBoolean("android.chronometerCountDown"));
            }
            if (i11 >= 26 && bundle.containsKey("android.colorized")) {
                z(bundle.getBoolean("android.colorized"));
            }
        }

        private void J(int i11, boolean z11) {
            if (z11) {
                Notification notification = this.U;
                notification.flags = i11 | notification.flags;
                return;
            }
            Notification notification2 = this.U;
            notification2.flags = (~i11) & notification2.flags;
        }

        private static Bundle l(Notification notification, C0035j jVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove("android.title");
            bundle.remove("android.text");
            bundle.remove("android.infoText");
            bundle.remove("android.subText");
            bundle.remove("android.intent.extra.CHANNEL_ID");
            bundle.remove("android.intent.extra.CHANNEL_GROUP_ID");
            bundle.remove("android.showWhen");
            bundle.remove("android.progress");
            bundle.remove("android.progressMax");
            bundle.remove("android.progressIndeterminate");
            bundle.remove("android.chronometerCountDown");
            bundle.remove("android.colorized");
            bundle.remove("android.people.list");
            bundle.remove("android.people");
            bundle.remove("android.support.sortKey");
            bundle.remove("android.support.groupKey");
            bundle.remove("android.support.isGroupSummary");
            bundle.remove("android.support.localOnly");
            bundle.remove("android.support.actionExtras");
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (jVar != null) {
                jVar.f(bundle);
            }
            return bundle;
        }

        protected static CharSequence p(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap q(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f9060a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        public f A(CharSequence charSequence) {
            this.k = p(charSequence);
            return this;
        }

        public f B(PendingIntent pendingIntent) {
            this.f9066g = pendingIntent;
            return this;
        }

        public f C(CharSequence charSequence) {
            this.f9065f = p(charSequence);
            return this;
        }

        public f D(CharSequence charSequence) {
            this.f9064e = p(charSequence);
            return this;
        }

        public f E(RemoteViews remoteViews) {
            this.J = remoteViews;
            return this;
        }

        public f F(RemoteViews remoteViews) {
            this.I = remoteViews;
            return this;
        }

        public f G(int i11) {
            Notification notification = this.U;
            notification.defaults = i11;
            if ((i11 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public f H(PendingIntent pendingIntent) {
            this.U.deleteIntent = pendingIntent;
            return this;
        }

        public f I(Bundle bundle) {
            this.E = bundle;
            return this;
        }

        public f K(PendingIntent pendingIntent, boolean z11) {
            this.f9067h = pendingIntent;
            J(128, z11);
            return this;
        }

        public f L(String str) {
            this.f9077x = str;
            return this;
        }

        public f M(boolean z11) {
            this.f9078y = z11;
            return this;
        }

        public f N(Bitmap bitmap) {
            this.j = q(bitmap);
            return this;
        }

        public f O(int i11, int i12, int i13) {
            Notification notification = this.U;
            notification.ledARGB = i11;
            notification.ledOnMS = i12;
            notification.ledOffMS = i13;
            notification.flags = ((i12 == 0 || i13 == 0) ? 0 : 1) | (notification.flags & -2);
            return this;
        }

        public f P(boolean z11) {
            this.A = z11;
            return this;
        }

        public f Q(androidx.core.content.b bVar) {
            this.O = bVar;
            return this;
        }

        public f R(int i11) {
            this.f9069l = i11;
            return this;
        }

        public f S(boolean z11) {
            J(2, z11);
            return this;
        }

        public f T(boolean z11) {
            J(8, z11);
            return this;
        }

        public f U(int i11) {
            this.f9070m = i11;
            return this;
        }

        public f V(int i11, int i12, boolean z11) {
            this.f9075u = i11;
            this.v = i12;
            this.f9076w = z11;
            return this;
        }

        public f W(Notification notification) {
            this.H = notification;
            return this;
        }

        public f X(CharSequence charSequence) {
            this.f9074s = p(charSequence);
            return this;
        }

        public f Y(String str) {
            this.N = str;
            return this;
        }

        public f Z(boolean z11) {
            this.n = z11;
            return this;
        }

        public f a(int i11, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f9061b.add(new b(i11, charSequence, pendingIntent));
            return this;
        }

        public f a0(int i11) {
            this.U.icon = i11;
            return this;
        }

        public f b(b bVar) {
            if (bVar != null) {
                this.f9061b.add(bVar);
            }
            return this;
        }

        public f b0(int i11, int i12) {
            Notification notification = this.U;
            notification.icon = i11;
            notification.iconLevel = i12;
            return this;
        }

        public f c(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.E;
                if (bundle2 == null) {
                    this.E = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        public f c0(String str) {
            this.f9079z = str;
            return this;
        }

        public f d(b bVar) {
            if (bVar != null) {
                this.f9063d.add(bVar);
            }
            return this;
        }

        public f d0(Uri uri) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        public f e(n nVar) {
            if (nVar != null) {
                this.f9062c.add(nVar);
            }
            return this;
        }

        public f e0(Uri uri, int i11) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = i11;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i11).build();
            return this;
        }

        @Deprecated
        public f f(String str) {
            if (str != null && !str.isEmpty()) {
                this.X.add(str);
            }
            return this;
        }

        public f f0(C0035j jVar) {
            if (this.q != jVar) {
                this.q = jVar;
                if (jVar != null) {
                    jVar.w(this);
                }
            }
            return this;
        }

        public Notification g() {
            return new k(this).c();
        }

        public f g0(CharSequence charSequence) {
            this.f9073r = p(charSequence);
            return this;
        }

        public RemoteViews h() {
            return this.J;
        }

        public f h0(CharSequence charSequence) {
            this.U.tickerText = p(charSequence);
            return this;
        }

        public int i() {
            return this.F;
        }

        public f i0(long j11) {
            this.P = j11;
            return this;
        }

        public RemoteViews j() {
            return this.I;
        }

        public f j0(boolean z11) {
            this.f9071o = z11;
            return this;
        }

        public Bundle k() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public f k0(long[] jArr) {
            this.U.vibrate = jArr;
            return this;
        }

        public f l0(int i11) {
            this.G = i11;
            return this;
        }

        public RemoteViews m() {
            return this.K;
        }

        public f m0(long j11) {
            this.U.when = j11;
            return this;
        }

        public int n() {
            return this.f9070m;
        }

        public long o() {
            if (this.n) {
                return this.U.when;
            }
            return 0;
        }

        public f r(boolean z11) {
            this.S = z11;
            return this;
        }

        public f s(boolean z11) {
            J(16, z11);
            return this;
        }

        public f t(int i11) {
            this.M = i11;
            return this;
        }

        public f u(e eVar) {
            this.T = eVar;
            return this;
        }

        public f v(String str) {
            this.D = str;
            return this;
        }

        public f w(String str) {
            this.L = str;
            return this;
        }

        public f x(boolean z11) {
            this.f9072p = z11;
            k().putBoolean("android.chronometerCountDown", z11);
            return this;
        }

        public f y(int i11) {
            this.F = i11;
            return this;
        }

        public f z(boolean z11) {
            this.B = z11;
            this.C = true;
            return this;
        }

        public f(Context context, String str) {
            this.f9061b = new ArrayList<>();
            this.f9062c = new ArrayList<>();
            this.f9063d = new ArrayList<>();
            this.n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            this.R = 0;
            Notification notification = new Notification();
            this.U = notification;
            this.f9060a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.U.audioStreamType = -1;
            this.f9070m = 0;
            this.X = new ArrayList<>();
            this.S = true;
        }

        @Deprecated
        public f(Context context) {
            this(context, (String) null);
        }
    }
}
