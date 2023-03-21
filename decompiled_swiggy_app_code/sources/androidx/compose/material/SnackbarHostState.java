package androidx.compose.material;

import c0.v;
import com.newrelic.agent.android.agentdata.HexAttribute;
import e0.a1;
import e0.h0;
import kotlin.Result;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.sync.c;
import kotlinx.coroutines.sync.d;
import wp0.n;

/* compiled from: SnackbarHost.kt */
public final class SnackbarHostState {

    /* renamed from: a  reason: collision with root package name */
    private final c f5338a = d.b(false, 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final h0 f5339b = j.e((Object) null, (a1) null, 2, (Object) null);

    /* compiled from: SnackbarHost.kt */
    private static final class a implements v {

        /* renamed from: a  reason: collision with root package name */
        private final String f5340a;

        /* renamed from: b  reason: collision with root package name */
        private final String f5341b;

        /* renamed from: c  reason: collision with root package name */
        private final SnackbarDuration f5342c;

        /* renamed from: d  reason: collision with root package name */
        private final n<SnackbarResult> f5343d;

        public a(String str, String str2, SnackbarDuration snackbarDuration, n<? super SnackbarResult> nVar) {
            p.j(str, HexAttribute.HEX_ATTR_MESSAGE);
            p.j(snackbarDuration, "duration");
            p.j(nVar, "continuation");
            this.f5340a = str;
            this.f5341b = str2;
            this.f5342c = snackbarDuration;
            this.f5343d = nVar;
        }

        public void a() {
            if (this.f5343d.b()) {
                n<SnackbarResult> nVar = this.f5343d;
                Result.a aVar = Result.f25582b;
                nVar.resumeWith(Result.b(SnackbarResult.ActionPerformed));
            }
        }

        public String b() {
            return this.f5341b;
        }

        public void dismiss() {
            if (this.f5343d.b()) {
                n<SnackbarResult> nVar = this.f5343d;
                Result.a aVar = Result.f25582b;
                nVar.resumeWith(Result.b(SnackbarResult.Dismissed));
            }
        }

        public SnackbarDuration getDuration() {
            return this.f5342c;
        }

        public String getMessage() {
            return this.f5340a;
        }
    }

    /* access modifiers changed from: private */
    public final void c(v vVar) {
        this.f5339b.setValue(vVar);
    }

    public static /* synthetic */ Object e(SnackbarHostState snackbarHostState, String str, String str2, SnackbarDuration snackbarDuration, fp0.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            snackbarDuration = SnackbarDuration.Short;
        }
        return snackbarHostState.d(str, str2, snackbarDuration, cVar);
    }

    public final v b() {
        return (v) this.f5339b.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: androidx.compose.material.SnackbarDuration} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b6 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00c8=Splitter:B:34:0x00c8, B:28:0x00bf=Splitter:B:28:0x00bf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.lang.String r9, java.lang.String r10, androidx.compose.material.SnackbarDuration r11, fp0.c<? super androidx.compose.material.SnackbarResult> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof androidx.compose.material.SnackbarHostState$showSnackbar$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r0 = (androidx.compose.material.SnackbarHostState$showSnackbar$1) r0
            int r1 = r0.f5352i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f5352i = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r0 = new androidx.compose.material.SnackbarHostState$showSnackbar$1
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f5350g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f5352i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x006f
            if (r2 == r4) goto L_0x0051
            if (r2 != r3) goto L_0x0049
            java.lang.Object r9 = r0.f5349f
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r9 = (androidx.compose.material.SnackbarHostState$showSnackbar$1) r9
            java.lang.Object r9 = r0.f5348e
            kotlinx.coroutines.sync.c r9 = (kotlinx.coroutines.sync.c) r9
            java.lang.Object r10 = r0.f5347d
            androidx.compose.material.SnackbarDuration r10 = (androidx.compose.material.SnackbarDuration) r10
            java.lang.Object r10 = r0.f5346c
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f5345b
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f5344a
            androidx.compose.material.SnackbarHostState r10 = (androidx.compose.material.SnackbarHostState) r10
            bp0.g.b(r12)     // Catch:{ all -> 0x0046 }
            goto L_0x00bf
        L_0x0046:
            r11 = move-exception
            goto L_0x00c8
        L_0x0049:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0051:
            java.lang.Object r9 = r0.f5348e
            kotlinx.coroutines.sync.c r9 = (kotlinx.coroutines.sync.c) r9
            java.lang.Object r10 = r0.f5347d
            r11 = r10
            androidx.compose.material.SnackbarDuration r11 = (androidx.compose.material.SnackbarDuration) r11
            java.lang.Object r10 = r0.f5346c
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.f5345b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r0.f5344a
            androidx.compose.material.SnackbarHostState r6 = (androidx.compose.material.SnackbarHostState) r6
            bp0.g.b(r12)
            r12 = r9
            r9 = r2
            r2 = r11
            r11 = r10
            r10 = r6
            goto L_0x008a
        L_0x006f:
            bp0.g.b(r12)
            kotlinx.coroutines.sync.c r12 = r8.f5338a
            r0.f5344a = r8
            r0.f5345b = r9
            r0.f5346c = r10
            r0.f5347d = r11
            r0.f5348e = r12
            r0.f5352i = r4
            java.lang.Object r2 = r12.a(r5, r0)
            if (r2 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r2 = r11
            r11 = r10
            r10 = r8
        L_0x008a:
            r0.f5344a = r10     // Catch:{ all -> 0x00c6 }
            r0.f5345b = r9     // Catch:{ all -> 0x00c6 }
            r0.f5346c = r11     // Catch:{ all -> 0x00c6 }
            r0.f5347d = r2     // Catch:{ all -> 0x00c6 }
            r0.f5348e = r12     // Catch:{ all -> 0x00c6 }
            r0.f5349f = r0     // Catch:{ all -> 0x00c6 }
            r0.f5352i = r3     // Catch:{ all -> 0x00c6 }
            wp0.o r3 = new wp0.o     // Catch:{ all -> 0x00c6 }
            fp0.c r6 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.c(r0)     // Catch:{ all -> 0x00c6 }
            r3.<init>(r6, r4)     // Catch:{ all -> 0x00c6 }
            r3.w()     // Catch:{ all -> 0x00c6 }
            androidx.compose.material.SnackbarHostState$a r4 = new androidx.compose.material.SnackbarHostState$a     // Catch:{ all -> 0x00c6 }
            r4.<init>(r9, r11, r2, r3)     // Catch:{ all -> 0x00c6 }
            r10.c(r4)     // Catch:{ all -> 0x00c6 }
            java.lang.Object r9 = r3.t()     // Catch:{ all -> 0x00c6 }
            java.lang.Object r11 = kotlin.coroutines.intrinsics.b.d()     // Catch:{ all -> 0x00c6 }
            if (r9 != r11) goto L_0x00b9
            kotlin.coroutines.jvm.internal.f.c(r0)     // Catch:{ all -> 0x00c6 }
        L_0x00b9:
            if (r9 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            r7 = r12
            r12 = r9
            r9 = r7
        L_0x00bf:
            r10.c(r5)     // Catch:{ all -> 0x00cc }
            r9.c(r5)
            return r12
        L_0x00c6:
            r11 = move-exception
            r9 = r12
        L_0x00c8:
            r10.c(r5)     // Catch:{ all -> 0x00cc }
            throw r11     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r10 = move-exception
            r9.c(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostState.d(java.lang.String, java.lang.String, androidx.compose.material.SnackbarDuration, fp0.c):java.lang.Object");
    }
}
