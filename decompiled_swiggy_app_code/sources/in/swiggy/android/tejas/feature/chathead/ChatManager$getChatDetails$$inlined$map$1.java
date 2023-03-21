package in.swiggy.android.tejas.feature.chathead;

import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.chathead.models.ChatHeadResponse;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.e;
import retrofit2.Response;

/* compiled from: SafeCollector.common.kt */
public final class ChatManager$getChatDetails$$inlined$map$1 implements d<ChatResponse<? extends SwiggyApiResponse<ChatHeadResponse>>> {
    final /* synthetic */ d $this_unsafeTransform$inlined;

    public ChatManager$getChatDetails$$inlined$map$1(d dVar) {
        this.$this_unsafeTransform$inlined = dVar;
    }

    public Object collect(final e eVar, c cVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new e<Response<SwiggyApiResponse<ChatHeadResponse>>>() {
            /* JADX WARNING: type inference failed for: r2v5, types: [in.swiggy.android.tejas.feature.chathead.ChatResponse] */
            /* JADX WARNING: type inference failed for: r11v7, types: [in.swiggy.android.tejas.feature.chathead.ChatResponse] */
            /* JADX WARNING: type inference failed for: r11v8, types: [in.swiggy.android.tejas.feature.chathead.ChatResponse] */
            /* JADX WARNING: type inference failed for: r11v9 */
            /* JADX WARNING: type inference failed for: r11v10, types: [in.swiggy.android.tejas.feature.chathead.ChatResponse] */
            /* JADX WARNING: Failed to insert additional move for type inference */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r11, fp0.c r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof in.swiggy.android.tejas.feature.chathead.ChatManager$getChatDetails$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r12
                    in.swiggy.android.tejas.feature.chathead.ChatManager$getChatDetails$$inlined$map$1$2$1 r0 = (in.swiggy.android.tejas.feature.chathead.ChatManager$getChatDetails$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    in.swiggy.android.tejas.feature.chathead.ChatManager$getChatDetails$$inlined$map$1$2$1 r0 = new in.swiggy.android.tejas.feature.chathead.ChatManager$getChatDetails$$inlined$map$1$2$1
                    r0.<init>(r10, r12)
                L_0x0018:
                    java.lang.Object r12 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    bp0.g.b(r12)
                    goto L_0x0099
                L_0x002a:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L_0x0032:
                    bp0.g.b(r12)
                    kotlinx.coroutines.flow.e r12 = r3
                    retrofit2.Response r11 = (retrofit2.Response) r11
                    java.lang.Object r11 = r11.body()
                    in.swiggy.android.tejas.api.models.SwiggyApiResponse r11 = (in.swiggy.android.tejas.api.models.SwiggyApiResponse) r11
                    r2 = 0
                    if (r11 != 0) goto L_0x0043
                    goto L_0x007c
                L_0x0043:
                    java.lang.Integer r4 = r11.getStatusCode()
                    if (r4 != 0) goto L_0x004a
                    goto L_0x0052
                L_0x004a:
                    int r2 = r4.intValue()
                    java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
                L_0x0052:
                    if (r2 != 0) goto L_0x0055
                    goto L_0x0063
                L_0x0055:
                    int r4 = r2.intValue()
                    if (r4 != 0) goto L_0x0063
                    in.swiggy.android.tejas.feature.chathead.ChatResponse$Companion r2 = in.swiggy.android.tejas.feature.chathead.ChatResponse.Companion
                    in.swiggy.android.tejas.feature.chathead.ChatResponse r11 = r2.success(r11)
                L_0x0061:
                    r2 = r11
                    goto L_0x007c
                L_0x0063:
                    r4 = 999(0x3e7, float:1.4E-42)
                    if (r2 != 0) goto L_0x0068
                    goto L_0x0075
                L_0x0068:
                    int r2 = r2.intValue()
                    if (r2 != r4) goto L_0x0075
                    in.swiggy.android.tejas.feature.chathead.ChatResponse$Companion r2 = in.swiggy.android.tejas.feature.chathead.ChatResponse.Companion
                    in.swiggy.android.tejas.feature.chathead.ChatResponse r11 = r2.sessionInvalid(r11)
                    goto L_0x0061
                L_0x0075:
                    in.swiggy.android.tejas.feature.chathead.ChatResponse$Companion r2 = in.swiggy.android.tejas.feature.chathead.ChatResponse.Companion
                    in.swiggy.android.tejas.feature.chathead.ChatResponse r11 = r2.otherErrors(r11)
                    goto L_0x0061
                L_0x007c:
                    if (r2 != 0) goto L_0x0090
                    in.swiggy.android.tejas.feature.chathead.ChatResponse$Companion r11 = in.swiggy.android.tejas.feature.chathead.ChatResponse.Companion
                    in.swiggy.android.tejas.error.Error$InternalError r2 = new in.swiggy.android.tejas.error.Error$InternalError
                    r6 = 0
                    r7 = 0
                    r8 = 6
                    r9 = 0
                    java.lang.String r5 = ""
                    r4 = r2
                    r4.<init>(r5, r6, r7, r8, r9)
                    in.swiggy.android.tejas.feature.chathead.ChatResponse r2 = r11.failure(r2)
                L_0x0090:
                    r0.label = r3
                    java.lang.Object r11 = r12.emit(r2, r0)
                    if (r11 != r1) goto L_0x0099
                    return r1
                L_0x0099:
                    bp0.k r11 = bp0.k.f22762a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.chathead.ChatManager$getChatDetails$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, fp0.c):java.lang.Object");
            }
        }, cVar);
        if (collect == b.d()) {
            return collect;
        }
        return k.f22762a;
    }
}
