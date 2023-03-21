package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.userinfo;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: UserInfoResponsePayload.kt */
public final class UserInfoResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19498a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19499b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19500c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19501d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f19502e;

    /* compiled from: UserInfoResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<UserInfoResponsePayload> serializer() {
            return UserInfoResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserInfoResponsePayload(int i11, String str, String str2, String str3, String str4, boolean z11, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19498a = str;
            if ((i11 & 2) != 0) {
                this.f19499b = str2;
                if ((i11 & 4) != 0) {
                    this.f19500c = str3;
                    if ((i11 & 8) != 0) {
                        this.f19501d = str4;
                        if ((i11 & 16) != 0) {
                            this.f19502e = z11;
                            return;
                        }
                        throw new MissingFieldException("isSuperUser");
                    }
                    throw new MissingFieldException("email");
                }
                throw new MissingFieldException("mobile");
            }
            throw new MissingFieldException("name");
        }
        throw new MissingFieldException("customerId");
    }

    public static final void a(UserInfoResponsePayload userInfoResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(userInfoResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, userInfoResponsePayload.f19498a);
        dVar.n(serialDescriptor, 1, userInfoResponsePayload.f19499b);
        dVar.n(serialDescriptor, 2, userInfoResponsePayload.f19500c);
        dVar.n(serialDescriptor, 3, userInfoResponsePayload.f19501d);
        dVar.m(serialDescriptor, 4, userInfoResponsePayload.f19502e);
    }

    public UserInfoResponsePayload(String str, String str2, String str3, String str4, boolean z11) {
        p.j(str, "customerId");
        p.j(str2, "name");
        p.j(str3, "mobile");
        p.j(str4, "email");
        this.f19498a = str;
        this.f19499b = str2;
        this.f19500c = str3;
        this.f19501d = str4;
        this.f19502e = z11;
    }
}
