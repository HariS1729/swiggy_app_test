package co.hyperverge.crashguard.data.models;

import a5.a;
import com.truecaller.android.sdk.TruecallerSdkScope;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.f0;
import gq0.h;
import gq0.n;
import gq0.s;
import gq0.w;
import gq0.x0;
import i20.t;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* compiled from: CrashEvent.kt */
public final class CrashEvent {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f13061a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13062b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f13063c;

    /* renamed from: d  reason: collision with root package name */
    private final String f13064d;

    /* renamed from: e  reason: collision with root package name */
    private final Contexts f13065e;

    /* renamed from: f  reason: collision with root package name */
    private final Exception f13066f;

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f13067g;

    /* renamed from: h  reason: collision with root package name */
    private User f13068h;

    /* compiled from: CrashEvent.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<CrashEvent> serializer() {
            return CrashEvent$$serializer.INSTANCE;
        }
    }

    /* compiled from: CrashEvent.kt */
    public static final class Exception {
        public static final Companion Companion = new Companion((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final List<Value> f13104a;

        /* compiled from: CrashEvent.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final Exception a(Throwable th2) {
                String str;
                p.j(th2, t.V);
                ArrayList arrayList = new ArrayList();
                for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
                    Package packageR = th2.getClass().getPackage();
                    String name = th2.getClass().getName();
                    if (packageR != null) {
                        p.i(name, "fullClassName");
                        name = o.H(name, p.s(packageR.getName(), "."), "", false, 4, (Object) null);
                    }
                    if (packageR == null) {
                        str = null;
                    } else {
                        str = packageR.getName();
                    }
                    String message = th2.getMessage();
                    Value.StackTrace.Companion companion = Value.StackTrace.Companion;
                    StackTraceElement[] stackTrace = th2.getStackTrace();
                    p.i(stackTrace, "t.stackTrace");
                    arrayList.add(new Value(name, message, str, companion.a(stackTrace)));
                }
                return new Exception(arrayList);
            }

            public final KSerializer<Exception> serializer() {
                return CrashEvent$Exception$$serializer.INSTANCE;
            }
        }

        /* compiled from: CrashEvent.kt */
        public static final class Value {
            public static final Companion Companion = new Companion((i) null);

            /* renamed from: a  reason: collision with root package name */
            private String f13105a;

            /* renamed from: b  reason: collision with root package name */
            private String f13106b;

            /* renamed from: c  reason: collision with root package name */
            private String f13107c;

            /* renamed from: d  reason: collision with root package name */
            private StackTrace f13108d;

            /* compiled from: CrashEvent.kt */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(i iVar) {
                    this();
                }

                public final KSerializer<Value> serializer() {
                    return CrashEvent$Exception$Value$$serializer.INSTANCE;
                }
            }

            /* compiled from: CrashEvent.kt */
            public static final class StackTrace {
                public static final Companion Companion = new Companion((i) null);

                /* renamed from: a  reason: collision with root package name */
                private final List<Frame> f13109a;

                /* compiled from: CrashEvent.kt */
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(i iVar) {
                        this();
                    }

                    public final StackTrace a(StackTraceElement[] stackTraceElementArr) {
                        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
                        p.j(stackTraceElementArr2, "elements");
                        ArrayList arrayList = new ArrayList();
                        for (StackTraceElement stackTraceElement : stackTraceElementArr2) {
                            if (stackTraceElement.getLineNumber() > 0) {
                                String methodName = stackTraceElement.getMethodName();
                                p.i(methodName, "it.methodName");
                                arrayList.add(0, new Frame(methodName, stackTraceElement.getClassName(), Integer.valueOf(stackTraceElement.getLineNumber()), stackTraceElement.getFileName(), (String) null, (Boolean) null, 48, (i) null));
                            }
                        }
                        return new StackTrace(arrayList);
                    }

                    public final KSerializer<StackTrace> serializer() {
                        return CrashEvent$Exception$Value$StackTrace$$serializer.INSTANCE;
                    }
                }

                /* compiled from: CrashEvent.kt */
                public static final class Frame {
                    public static final Companion Companion = new Companion((i) null);

                    /* renamed from: a  reason: collision with root package name */
                    private final String f13110a;

                    /* renamed from: b  reason: collision with root package name */
                    private final String f13111b;

                    /* renamed from: c  reason: collision with root package name */
                    private final Integer f13112c;

                    /* renamed from: d  reason: collision with root package name */
                    private final String f13113d;

                    /* renamed from: e  reason: collision with root package name */
                    private final String f13114e;

                    /* renamed from: f  reason: collision with root package name */
                    private final Boolean f13115f;

                    /* compiled from: CrashEvent.kt */
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(i iVar) {
                            this();
                        }

                        public final KSerializer<Frame> serializer() {
                            return CrashEvent$Exception$Value$StackTrace$Frame$$serializer.INSTANCE;
                        }
                    }

                    public /* synthetic */ Frame(int i11, String str, String str2, Integer num, String str3, String str4, Boolean bool, x0 x0Var) {
                        if (1 != (i11 & 1)) {
                            PluginExceptionsKt.throwMissingFieldException(i11, 1, CrashEvent$Exception$Value$StackTrace$Frame$$serializer.INSTANCE.getDescriptor());
                        }
                        this.f13110a = str;
                        if ((i11 & 2) == 0) {
                            this.f13111b = null;
                        } else {
                            this.f13111b = str2;
                        }
                        if ((i11 & 4) == 0) {
                            this.f13112c = null;
                        } else {
                            this.f13112c = num;
                        }
                        if ((i11 & 8) == 0) {
                            this.f13113d = null;
                        } else {
                            this.f13113d = str3;
                        }
                        if ((i11 & 16) == 0) {
                            this.f13114e = null;
                        } else {
                            this.f13114e = str4;
                        }
                        if ((i11 & 32) == 0) {
                            this.f13115f = null;
                        } else {
                            this.f13115f = bool;
                        }
                    }

                    public static final void a(Frame frame, d dVar, SerialDescriptor serialDescriptor) {
                        p.j(frame, "self");
                        p.j(dVar, "output");
                        p.j(serialDescriptor, "serialDesc");
                        boolean z11 = false;
                        dVar.n(serialDescriptor, 0, frame.f13110a);
                        if (dVar.o(serialDescriptor, 1) || frame.f13111b != null) {
                            dVar.E(serialDescriptor, 1, a1.f23069b, frame.f13111b);
                        }
                        if (dVar.o(serialDescriptor, 2) || frame.f13112c != null) {
                            dVar.E(serialDescriptor, 2, w.f23130b, frame.f13112c);
                        }
                        if (dVar.o(serialDescriptor, 3) || frame.f13113d != null) {
                            dVar.E(serialDescriptor, 3, a1.f23069b, frame.f13113d);
                        }
                        if (dVar.o(serialDescriptor, 4) || frame.f13114e != null) {
                            dVar.E(serialDescriptor, 4, a1.f23069b, frame.f13114e);
                        }
                        if (dVar.o(serialDescriptor, 5) || frame.f13115f != null) {
                            z11 = true;
                        }
                        if (z11) {
                            dVar.E(serialDescriptor, 5, h.f23089b, frame.f13115f);
                        }
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Frame)) {
                            return false;
                        }
                        Frame frame = (Frame) obj;
                        return p.e(this.f13110a, frame.f13110a) && p.e(this.f13111b, frame.f13111b) && p.e(this.f13112c, frame.f13112c) && p.e(this.f13113d, frame.f13113d) && p.e(this.f13114e, frame.f13114e) && p.e(this.f13115f, frame.f13115f);
                    }

                    public int hashCode() {
                        int hashCode = this.f13110a.hashCode() * 31;
                        String str = this.f13111b;
                        int i11 = 0;
                        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                        Integer num = this.f13112c;
                        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                        String str2 = this.f13113d;
                        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.f13114e;
                        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        Boolean bool = this.f13115f;
                        if (bool != null) {
                            i11 = bool.hashCode();
                        }
                        return hashCode5 + i11;
                    }

                    public String toString() {
                        return "Frame(function=" + this.f13110a + ", module=" + this.f13111b + ", lineNo=" + this.f13112c + ", filename=" + this.f13113d + ", absPath=" + this.f13114e + ", inApp=" + this.f13115f + ')';
                    }

                    public Frame(String str, String str2, Integer num, String str3, String str4, Boolean bool) {
                        p.j(str, "function");
                        this.f13110a = str;
                        this.f13111b = str2;
                        this.f13112c = num;
                        this.f13113d = str3;
                        this.f13114e = str4;
                        this.f13115f = bool;
                    }

                    /* JADX WARNING: Illegal instructions before constructor call */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public /* synthetic */ Frame(java.lang.String r7, java.lang.String r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.lang.Boolean r12, int r13, kotlin.jvm.internal.i r14) {
                        /*
                            r6 = this;
                            r0 = r13 & 2
                            r1 = 0
                            if (r0 == 0) goto L_0x0007
                            r0 = r1
                            goto L_0x0008
                        L_0x0007:
                            r0 = r8
                        L_0x0008:
                            r2 = r13 & 4
                            if (r2 == 0) goto L_0x000e
                            r2 = r1
                            goto L_0x000f
                        L_0x000e:
                            r2 = r9
                        L_0x000f:
                            r3 = r13 & 8
                            if (r3 == 0) goto L_0x0015
                            r3 = r1
                            goto L_0x0016
                        L_0x0015:
                            r3 = r10
                        L_0x0016:
                            r4 = r13 & 16
                            if (r4 == 0) goto L_0x001c
                            r4 = r1
                            goto L_0x001d
                        L_0x001c:
                            r4 = r11
                        L_0x001d:
                            r5 = r13 & 32
                            if (r5 == 0) goto L_0x0022
                            goto L_0x0023
                        L_0x0022:
                            r1 = r12
                        L_0x0023:
                            r8 = r6
                            r9 = r7
                            r10 = r0
                            r11 = r2
                            r12 = r3
                            r13 = r4
                            r14 = r1
                            r8.<init>(r9, r10, r11, r12, r13, r14)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: co.hyperverge.crashguard.data.models.CrashEvent.Exception.Value.StackTrace.Frame.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.i):void");
                    }
                }

                public StackTrace() {
                    this((List) null, 1, (i) null);
                }

                public /* synthetic */ StackTrace(int i11, List list, x0 x0Var) {
                    if ((i11 & 0) != 0) {
                        PluginExceptionsKt.throwMissingFieldException(i11, 0, CrashEvent$Exception$Value$StackTrace$$serializer.INSTANCE.getDescriptor());
                    }
                    if ((i11 & 1) == 0) {
                        this.f13109a = null;
                    } else {
                        this.f13109a = list;
                    }
                }

                public static final void a(StackTrace stackTrace, d dVar, SerialDescriptor serialDescriptor) {
                    p.j(stackTrace, "self");
                    p.j(dVar, "output");
                    p.j(serialDescriptor, "serialDesc");
                    boolean z11 = true;
                    if (!dVar.o(serialDescriptor, 0) && stackTrace.f13109a == null) {
                        z11 = false;
                    }
                    if (z11) {
                        dVar.E(serialDescriptor, 0, new f(CrashEvent$Exception$Value$StackTrace$Frame$$serializer.INSTANCE), stackTrace.f13109a);
                    }
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof StackTrace) && p.e(this.f13109a, ((StackTrace) obj).f13109a);
                }

                public int hashCode() {
                    List<Frame> list = this.f13109a;
                    if (list == null) {
                        return 0;
                    }
                    return list.hashCode();
                }

                public String toString() {
                    return "StackTrace(frames=" + this.f13109a + ')';
                }

                public StackTrace(List<Frame> list) {
                    this.f13109a = list;
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ StackTrace(List list, int i11, i iVar) {
                    this((i11 & 1) != 0 ? null : list);
                }
            }

            public Value() {
                this((String) null, (String) null, (String) null, (StackTrace) null, 15, (i) null);
            }

            public /* synthetic */ Value(int i11, String str, String str2, String str3, StackTrace stackTrace, x0 x0Var) {
                if ((i11 & 0) != 0) {
                    PluginExceptionsKt.throwMissingFieldException(i11, 0, CrashEvent$Exception$Value$$serializer.INSTANCE.getDescriptor());
                }
                if ((i11 & 1) == 0) {
                    this.f13105a = null;
                } else {
                    this.f13105a = str;
                }
                if ((i11 & 2) == 0) {
                    this.f13106b = null;
                } else {
                    this.f13106b = str2;
                }
                if ((i11 & 4) == 0) {
                    this.f13107c = null;
                } else {
                    this.f13107c = str3;
                }
                if ((i11 & 8) == 0) {
                    this.f13108d = null;
                } else {
                    this.f13108d = stackTrace;
                }
            }

            public static final void a(Value value, d dVar, SerialDescriptor serialDescriptor) {
                p.j(value, "self");
                p.j(dVar, "output");
                p.j(serialDescriptor, "serialDesc");
                boolean z11 = false;
                if (dVar.o(serialDescriptor, 0) || value.f13105a != null) {
                    dVar.E(serialDescriptor, 0, a1.f23069b, value.f13105a);
                }
                if (dVar.o(serialDescriptor, 1) || value.f13106b != null) {
                    dVar.E(serialDescriptor, 1, a1.f23069b, value.f13106b);
                }
                if (dVar.o(serialDescriptor, 2) || value.f13107c != null) {
                    dVar.E(serialDescriptor, 2, a1.f23069b, value.f13107c);
                }
                if (dVar.o(serialDescriptor, 3) || value.f13108d != null) {
                    z11 = true;
                }
                if (z11) {
                    dVar.E(serialDescriptor, 3, CrashEvent$Exception$Value$StackTrace$$serializer.INSTANCE, value.f13108d);
                }
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Value)) {
                    return false;
                }
                Value value = (Value) obj;
                return p.e(this.f13105a, value.f13105a) && p.e(this.f13106b, value.f13106b) && p.e(this.f13107c, value.f13107c) && p.e(this.f13108d, value.f13108d);
            }

            public int hashCode() {
                String str = this.f13105a;
                int i11 = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f13106b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f13107c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                StackTrace stackTrace = this.f13108d;
                if (stackTrace != null) {
                    i11 = stackTrace.hashCode();
                }
                return hashCode3 + i11;
            }

            public String toString() {
                return "Value(type=" + this.f13105a + ", value=" + this.f13106b + ", module=" + this.f13107c + ", stacktrace=" + this.f13108d + ')';
            }

            public Value(String str, String str2, String str3, StackTrace stackTrace) {
                this.f13105a = str;
                this.f13106b = str2;
                this.f13107c = str3;
                this.f13108d = stackTrace;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Value(String str, String str2, String str3, StackTrace stackTrace, int i11, i iVar) {
                this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : stackTrace);
            }
        }

        public Exception() {
            this((List) null, 1, (i) null);
        }

        public /* synthetic */ Exception(int i11, List list, x0 x0Var) {
            if ((i11 & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i11, 0, CrashEvent$Exception$$serializer.INSTANCE.getDescriptor());
            }
            if ((i11 & 1) == 0) {
                this.f13104a = null;
            } else {
                this.f13104a = list;
            }
        }

        public static final void a(Exception exception, d dVar, SerialDescriptor serialDescriptor) {
            p.j(exception, "self");
            p.j(dVar, "output");
            p.j(serialDescriptor, "serialDesc");
            boolean z11 = true;
            if (!dVar.o(serialDescriptor, 0) && exception.f13104a == null) {
                z11 = false;
            }
            if (z11) {
                dVar.E(serialDescriptor, 0, new f(CrashEvent$Exception$Value$$serializer.INSTANCE), exception.f13104a);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Exception) && p.e(this.f13104a, ((Exception) obj).f13104a);
        }

        public int hashCode() {
            List<Value> list = this.f13104a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "Exception(values=" + this.f13104a + ')';
        }

        public Exception(List<Value> list) {
            this.f13104a = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Exception(List list, int i11, i iVar) {
            this((i11 & 1) != 0 ? null : list);
        }
    }

    /* compiled from: CrashEvent.kt */
    public static final class User {
        public static final Companion Companion = new Companion((i) null);

        /* renamed from: a  reason: collision with root package name */
        private String f13116a;

        /* compiled from: CrashEvent.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final KSerializer<User> serializer() {
                return CrashEvent$User$$serializer.INSTANCE;
            }
        }

        public User() {
            this((String) null, 1, (i) null);
        }

        public /* synthetic */ User(int i11, String str, x0 x0Var) {
            if ((i11 & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i11, 0, CrashEvent$User$$serializer.INSTANCE.getDescriptor());
            }
            if ((i11 & 1) == 0) {
                this.f13116a = null;
            } else {
                this.f13116a = str;
            }
        }

        public static final void b(User user, d dVar, SerialDescriptor serialDescriptor) {
            p.j(user, "self");
            p.j(dVar, "output");
            p.j(serialDescriptor, "serialDesc");
            boolean z11 = true;
            if (!dVar.o(serialDescriptor, 0) && user.f13116a == null) {
                z11 = false;
            }
            if (z11) {
                dVar.E(serialDescriptor, 0, a1.f23069b, user.f13116a);
            }
        }

        public final void a(String str) {
            this.f13116a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof User) && p.e(this.f13116a, ((User) obj).f13116a);
        }

        public int hashCode() {
            String str = this.f13116a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "User(id=" + this.f13116a + ')';
        }

        public User(String str) {
            this.f13116a = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ User(String str, int i11, i iVar) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    public CrashEvent() {
        this((String) null, (String) null, (Double) null, (String) null, (Contexts) null, (Exception) null, (HashMap) null, (User) null, 255, (i) null);
    }

    public /* synthetic */ CrashEvent(int i11, String str, String str2, Double d11, String str3, Contexts contexts, Exception exception, HashMap hashMap, User user, x0 x0Var) {
        int i12 = i11;
        if ((i12 & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i11, 0, CrashEvent$$serializer.INSTANCE.getDescriptor());
        }
        if ((i12 & 1) == 0) {
            this.f13061a = null;
        } else {
            this.f13061a = str;
        }
        this.f13062b = (i12 & 2) == 0 ? "java" : str2;
        if ((i12 & 4) == 0) {
            this.f13063c = null;
        } else {
            this.f13063c = d11;
        }
        if ((i12 & 8) == 0) {
            this.f13064d = null;
        } else {
            this.f13064d = str3;
        }
        this.f13065e = (i12 & 16) == 0 ? new Contexts((Contexts.App) null, (Contexts.Device) null, (Contexts.OS) null, 7, (i) null) : contexts;
        if ((i12 & 32) == 0) {
            this.f13066f = null;
        } else {
            this.f13066f = exception;
        }
        this.f13067g = (i12 & 64) == 0 ? new HashMap() : hashMap;
        this.f13068h = (i12 & 128) == 0 ? new User((String) null, 1, (i) null) : user;
    }

    public static final void e(CrashEvent crashEvent, d dVar, SerialDescriptor serialDescriptor) {
        boolean z11;
        boolean z12;
        boolean z13;
        p.j(crashEvent, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z14 = false;
        if (dVar.o(serialDescriptor, 0) || crashEvent.f13061a != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, crashEvent.f13061a);
        }
        if (!dVar.o(serialDescriptor, 1) && p.e(crashEvent.f13062b, "java")) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 1, a1.f23069b, crashEvent.f13062b);
        }
        if (dVar.o(serialDescriptor, 2) || crashEvent.f13063c != null) {
            dVar.E(serialDescriptor, 2, n.f23109b, crashEvent.f13063c);
        }
        if (dVar.o(serialDescriptor, 3) || crashEvent.f13064d != null) {
            dVar.E(serialDescriptor, 3, a1.f23069b, crashEvent.f13064d);
        }
        if (!dVar.o(serialDescriptor, 4) && p.e(crashEvent.f13065e, new Contexts((Contexts.App) null, (Contexts.Device) null, (Contexts.OS) null, 7, (i) null))) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            dVar.v(serialDescriptor, 4, CrashEvent$Contexts$$serializer.INSTANCE, crashEvent.f13065e);
        }
        if (dVar.o(serialDescriptor, 5) || crashEvent.f13066f != null) {
            dVar.E(serialDescriptor, 5, CrashEvent$Exception$$serializer.INSTANCE, crashEvent.f13066f);
        }
        if (!dVar.o(serialDescriptor, 6) && p.e(crashEvent.f13067g, new HashMap())) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            a1 a1Var = a1.f23069b;
            dVar.v(serialDescriptor, 6, new s(a1Var, a1Var), crashEvent.f13067g);
        }
        if (dVar.o(serialDescriptor, 7) || !p.e(crashEvent.f13068h, new User((String) null, 1, (i) null))) {
            z14 = true;
        }
        if (z14) {
            dVar.v(serialDescriptor, 7, CrashEvent$User$$serializer.INSTANCE, crashEvent.f13068h);
        }
    }

    public final Contexts a() {
        return this.f13065e;
    }

    public final HashMap<String, String> b() {
        return this.f13067g;
    }

    public final Double c() {
        return this.f13063c;
    }

    public final User d() {
        return this.f13068h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrashEvent)) {
            return false;
        }
        CrashEvent crashEvent = (CrashEvent) obj;
        return p.e(this.f13061a, crashEvent.f13061a) && p.e(this.f13062b, crashEvent.f13062b) && p.e(this.f13063c, crashEvent.f13063c) && p.e(this.f13064d, crashEvent.f13064d) && p.e(this.f13065e, crashEvent.f13065e) && p.e(this.f13066f, crashEvent.f13066f) && p.e(this.f13067g, crashEvent.f13067g) && p.e(this.f13068h, crashEvent.f13068h);
    }

    public int hashCode() {
        String str = this.f13061a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f13062b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d11 = this.f13063c;
        int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str3 = this.f13064d;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f13065e.hashCode()) * 31;
        Exception exception = this.f13066f;
        if (exception != null) {
            i11 = exception.hashCode();
        }
        return ((((hashCode4 + i11) * 31) + this.f13067g.hashCode()) * 31) + this.f13068h.hashCode();
    }

    public String toString() {
        return "CrashEvent(culprit=" + this.f13061a + ", platform=" + this.f13062b + ", timestamp=" + this.f13063c + ", message=" + this.f13064d + ", contexts=" + this.f13065e + ", exception=" + this.f13066f + ", tags=" + this.f13067g + ", user=" + this.f13068h + ')';
    }

    /* compiled from: CrashEvent.kt */
    public static final class Contexts {
        public static final Companion Companion = new Companion((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final App f13069a;

        /* renamed from: b  reason: collision with root package name */
        private final Device f13070b;

        /* renamed from: c  reason: collision with root package name */
        private final OS f13071c;

        /* compiled from: CrashEvent.kt */
        public static final class App {
            public static final Companion Companion = new Companion((i) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f13072a;

            /* renamed from: b  reason: collision with root package name */
            private final Date f13073b;

            /* renamed from: c  reason: collision with root package name */
            private String f13074c;

            /* renamed from: d  reason: collision with root package name */
            private String f13075d;

            /* renamed from: e  reason: collision with root package name */
            private String f13076e;

            /* renamed from: f  reason: collision with root package name */
            private String f13077f;

            /* compiled from: CrashEvent.kt */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(i iVar) {
                    this();
                }

                public final KSerializer<App> serializer() {
                    return CrashEvent$Contexts$App$$serializer.INSTANCE;
                }
            }

            public App() {
                this((String) null, (Date) null, (String) null, (String) null, (String) null, (String) null, 63, (i) null);
            }

            public /* synthetic */ App(int i11, String str, Date date, String str2, String str3, String str4, String str5, x0 x0Var) {
                if ((i11 & 0) != 0) {
                    PluginExceptionsKt.throwMissingFieldException(i11, 0, CrashEvent$Contexts$App$$serializer.INSTANCE.getDescriptor());
                }
                this.f13072a = (i11 & 1) == 0 ? "app" : str;
                if ((i11 & 2) == 0) {
                    this.f13073b = null;
                } else {
                    this.f13073b = date;
                }
                if ((i11 & 4) == 0) {
                    this.f13074c = null;
                } else {
                    this.f13074c = str2;
                }
                if ((i11 & 8) == 0) {
                    this.f13075d = null;
                } else {
                    this.f13075d = str3;
                }
                if ((i11 & 16) == 0) {
                    this.f13076e = null;
                } else {
                    this.f13076e = str4;
                }
                if ((i11 & 32) == 0) {
                    this.f13077f = null;
                } else {
                    this.f13077f = str5;
                }
            }

            public static final void e(App app, d dVar, SerialDescriptor serialDescriptor) {
                boolean z11;
                p.j(app, "self");
                p.j(dVar, "output");
                p.j(serialDescriptor, "serialDesc");
                boolean z12 = false;
                if (!dVar.o(serialDescriptor, 0) && p.e(app.f13072a, "app")) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    dVar.n(serialDescriptor, 0, app.f13072a);
                }
                if (dVar.o(serialDescriptor, 1) || app.f13073b != null) {
                    dVar.E(serialDescriptor, 1, new a(), app.f13073b);
                }
                if (dVar.o(serialDescriptor, 2) || app.f13074c != null) {
                    dVar.E(serialDescriptor, 2, a1.f23069b, app.f13074c);
                }
                if (dVar.o(serialDescriptor, 3) || app.f13075d != null) {
                    dVar.E(serialDescriptor, 3, a1.f23069b, app.f13075d);
                }
                if (dVar.o(serialDescriptor, 4) || app.f13076e != null) {
                    dVar.E(serialDescriptor, 4, a1.f23069b, app.f13076e);
                }
                if (dVar.o(serialDescriptor, 5) || app.f13077f != null) {
                    z12 = true;
                }
                if (z12) {
                    dVar.E(serialDescriptor, 5, a1.f23069b, app.f13077f);
                }
            }

            public final void a(String str) {
                this.f13077f = str;
            }

            public final void b(String str) {
                this.f13075d = str;
            }

            public final void c(String str) {
                this.f13074c = str;
            }

            public final void d(String str) {
                this.f13076e = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof App)) {
                    return false;
                }
                App app = (App) obj;
                return p.e(this.f13072a, app.f13072a) && p.e(this.f13073b, app.f13073b) && p.e(this.f13074c, app.f13074c) && p.e(this.f13075d, app.f13075d) && p.e(this.f13076e, app.f13076e) && p.e(this.f13077f, app.f13077f);
            }

            public int hashCode() {
                int hashCode = this.f13072a.hashCode() * 31;
                Date date = this.f13073b;
                int i11 = 0;
                int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
                String str = this.f13074c;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f13075d;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f13076e;
                int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f13077f;
                if (str4 != null) {
                    i11 = str4.hashCode();
                }
                return hashCode5 + i11;
            }

            public String toString() {
                return "App(type=" + this.f13072a + ", startTime=" + this.f13073b + ", packageName=" + this.f13074c + ", name=" + this.f13075d + ", version=" + this.f13076e + ", build=" + this.f13077f + ')';
            }

            public App(String str, Date date, String str2, String str3, String str4, String str5) {
                p.j(str, "type");
                this.f13072a = str;
                this.f13073b = date;
                this.f13074c = str2;
                this.f13075d = str3;
                this.f13076e = str4;
                this.f13077f = str5;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ App(java.lang.String r5, java.util.Date r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, kotlin.jvm.internal.i r12) {
                /*
                    r4 = this;
                    r12 = r11 & 1
                    if (r12 == 0) goto L_0x0006
                    java.lang.String r5 = "app"
                L_0x0006:
                    r12 = r11 & 2
                    r0 = 0
                    if (r12 == 0) goto L_0x000d
                    r12 = r0
                    goto L_0x000e
                L_0x000d:
                    r12 = r6
                L_0x000e:
                    r6 = r11 & 4
                    if (r6 == 0) goto L_0x0014
                    r1 = r0
                    goto L_0x0015
                L_0x0014:
                    r1 = r7
                L_0x0015:
                    r6 = r11 & 8
                    if (r6 == 0) goto L_0x001b
                    r2 = r0
                    goto L_0x001c
                L_0x001b:
                    r2 = r8
                L_0x001c:
                    r6 = r11 & 16
                    if (r6 == 0) goto L_0x0022
                    r3 = r0
                    goto L_0x0023
                L_0x0022:
                    r3 = r9
                L_0x0023:
                    r6 = r11 & 32
                    if (r6 == 0) goto L_0x0028
                    goto L_0x0029
                L_0x0028:
                    r0 = r10
                L_0x0029:
                    r6 = r4
                    r7 = r5
                    r8 = r12
                    r9 = r1
                    r10 = r2
                    r11 = r3
                    r12 = r0
                    r6.<init>(r7, r8, r9, r10, r11, r12)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: co.hyperverge.crashguard.data.models.CrashEvent.Contexts.App.<init>(java.lang.String, java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
            }
        }

        /* compiled from: CrashEvent.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final KSerializer<Contexts> serializer() {
                return CrashEvent$Contexts$$serializer.INSTANCE;
            }
        }

        /* compiled from: CrashEvent.kt */
        public static final class Device {
            public static final Companion Companion = new Companion((i) null);
            private Float A;
            private String B;
            private Integer C;
            private Integer D;

            /* renamed from: a  reason: collision with root package name */
            private final String f13078a;

            /* renamed from: b  reason: collision with root package name */
            private String f13079b;

            /* renamed from: c  reason: collision with root package name */
            private String f13080c;

            /* renamed from: d  reason: collision with root package name */
            private String f13081d;

            /* renamed from: e  reason: collision with root package name */
            private String f13082e;

            /* renamed from: f  reason: collision with root package name */
            private String f13083f;

            /* renamed from: g  reason: collision with root package name */
            private String f13084g;

            /* renamed from: h  reason: collision with root package name */
            private String f13085h;

            /* renamed from: i  reason: collision with root package name */
            private Boolean f13086i;
            private Boolean j;
            private Boolean k;

            /* renamed from: l  reason: collision with root package name */
            private String f13087l;

            /* renamed from: m  reason: collision with root package name */
            private String f13088m;
            private String n;

            /* renamed from: o  reason: collision with root package name */
            private List<String> f13089o;

            /* renamed from: p  reason: collision with root package name */
            private String f13090p;
            private Float q;

            /* renamed from: r  reason: collision with root package name */
            private String f13091r;

            /* renamed from: s  reason: collision with root package name */
            private Float f13092s;
            private Integer t;

            /* renamed from: u  reason: collision with root package name */
            private Boolean f13093u;
            private Long v;

            /* renamed from: w  reason: collision with root package name */
            private Long f13094w;

            /* renamed from: x  reason: collision with root package name */
            private Long f13095x;

            /* renamed from: y  reason: collision with root package name */
            private Long f13096y;

            /* renamed from: z  reason: collision with root package name */
            private Date f13097z;

            /* compiled from: CrashEvent.kt */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(i iVar) {
                    this();
                }

                public final KSerializer<Device> serializer() {
                    return CrashEvent$Contexts$Device$$serializer.INSTANCE;
                }
            }

            public Device() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, (String) null, (Float) null, (String) null, (Float) null, (Integer) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Date) null, (Float) null, (String) null, (Integer) null, (Integer) null, 1073741823, (i) null);
            }

            public /* synthetic */ Device(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, Boolean bool3, String str9, String str10, String str11, List list, String str12, Float f11, String str13, Float f12, Integer num, Boolean bool4, Long l11, Long l12, Long l13, Long l14, Date date, Float f13, String str14, Integer num2, Integer num3, x0 x0Var) {
                int i12 = i11;
                if ((i12 & 0) != 0) {
                    PluginExceptionsKt.throwMissingFieldException(i11, 0, CrashEvent$Contexts$Device$$serializer.INSTANCE.getDescriptor());
                }
                this.f13078a = (i12 & 1) == 0 ? "device" : str;
                if ((i12 & 2) == 0) {
                    this.f13079b = null;
                } else {
                    this.f13079b = str2;
                }
                if ((i12 & 4) == 0) {
                    this.f13080c = null;
                } else {
                    this.f13080c = str3;
                }
                if ((i12 & 8) == 0) {
                    this.f13081d = null;
                } else {
                    this.f13081d = str4;
                }
                if ((i12 & 16) == 0) {
                    this.f13082e = null;
                } else {
                    this.f13082e = str5;
                }
                if ((i12 & 32) == 0) {
                    this.f13083f = null;
                } else {
                    this.f13083f = str6;
                }
                if ((i12 & 64) == 0) {
                    this.f13084g = null;
                } else {
                    this.f13084g = str7;
                }
                if ((i12 & 128) == 0) {
                    this.f13085h = null;
                } else {
                    this.f13085h = str8;
                }
                if ((i12 & 256) == 0) {
                    this.f13086i = null;
                } else {
                    this.f13086i = bool;
                }
                if ((i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) == 0) {
                    this.j = null;
                } else {
                    this.j = bool2;
                }
                if ((i12 & 1024) == 0) {
                    this.k = null;
                } else {
                    this.k = bool3;
                }
                if ((i12 & 2048) == 0) {
                    this.f13087l = null;
                } else {
                    this.f13087l = str9;
                }
                if ((i12 & 4096) == 0) {
                    this.f13088m = null;
                } else {
                    this.f13088m = str10;
                }
                if ((i12 & 8192) == 0) {
                    this.n = null;
                } else {
                    this.n = str11;
                }
                if ((i12 & 16384) == 0) {
                    this.f13089o = null;
                } else {
                    this.f13089o = list;
                }
                if ((32768 & i12) == 0) {
                    this.f13090p = null;
                } else {
                    this.f13090p = str12;
                }
                if ((65536 & i12) == 0) {
                    this.q = null;
                } else {
                    this.q = f11;
                }
                if ((131072 & i12) == 0) {
                    this.f13091r = null;
                } else {
                    this.f13091r = str13;
                }
                if ((262144 & i12) == 0) {
                    this.f13092s = null;
                } else {
                    this.f13092s = f12;
                }
                if ((524288 & i12) == 0) {
                    this.t = null;
                } else {
                    this.t = num;
                }
                if ((1048576 & i12) == 0) {
                    this.f13093u = null;
                } else {
                    this.f13093u = bool4;
                }
                if ((2097152 & i12) == 0) {
                    this.v = null;
                } else {
                    this.v = l11;
                }
                if ((4194304 & i12) == 0) {
                    this.f13094w = null;
                } else {
                    this.f13094w = l12;
                }
                if ((8388608 & i12) == 0) {
                    this.f13095x = null;
                } else {
                    this.f13095x = l13;
                }
                if ((16777216 & i12) == 0) {
                    this.f13096y = null;
                } else {
                    this.f13096y = l14;
                }
                if ((33554432 & i12) == 0) {
                    this.f13097z = null;
                } else {
                    this.f13097z = date;
                }
                if ((67108864 & i12) == 0) {
                    this.A = null;
                } else {
                    this.A = f13;
                }
                if ((134217728 & i12) == 0) {
                    this.B = null;
                } else {
                    this.B = str14;
                }
                if ((268435456 & i12) == 0) {
                    this.C = null;
                } else {
                    this.C = num2;
                }
                if ((i12 & 536870912) == 0) {
                    this.D = null;
                } else {
                    this.D = num3;
                }
            }

            public static final void I(Device device, d dVar, SerialDescriptor serialDescriptor) {
                boolean z11;
                p.j(device, "self");
                p.j(dVar, "output");
                p.j(serialDescriptor, "serialDesc");
                boolean z12 = false;
                if (!dVar.o(serialDescriptor, 0) && p.e(device.f13078a, "device")) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    dVar.n(serialDescriptor, 0, device.f13078a);
                }
                if (dVar.o(serialDescriptor, 1) || device.f13079b != null) {
                    dVar.E(serialDescriptor, 1, a1.f23069b, device.f13079b);
                }
                if (dVar.o(serialDescriptor, 2) || device.f13080c != null) {
                    dVar.E(serialDescriptor, 2, a1.f23069b, device.f13080c);
                }
                if (dVar.o(serialDescriptor, 3) || device.f13081d != null) {
                    dVar.E(serialDescriptor, 3, a1.f23069b, device.f13081d);
                }
                if (dVar.o(serialDescriptor, 4) || device.f13082e != null) {
                    dVar.E(serialDescriptor, 4, a1.f23069b, device.f13082e);
                }
                if (dVar.o(serialDescriptor, 5) || device.f13083f != null) {
                    dVar.E(serialDescriptor, 5, a1.f23069b, device.f13083f);
                }
                if (dVar.o(serialDescriptor, 6) || device.f13084g != null) {
                    dVar.E(serialDescriptor, 6, a1.f23069b, device.f13084g);
                }
                if (dVar.o(serialDescriptor, 7) || device.f13085h != null) {
                    dVar.E(serialDescriptor, 7, a1.f23069b, device.f13085h);
                }
                if (dVar.o(serialDescriptor, 8) || device.f13086i != null) {
                    dVar.E(serialDescriptor, 8, h.f23089b, device.f13086i);
                }
                if (dVar.o(serialDescriptor, 9) || device.j != null) {
                    dVar.E(serialDescriptor, 9, h.f23089b, device.j);
                }
                if (dVar.o(serialDescriptor, 10) || device.k != null) {
                    dVar.E(serialDescriptor, 10, h.f23089b, device.k);
                }
                if (dVar.o(serialDescriptor, 11) || device.f13087l != null) {
                    dVar.E(serialDescriptor, 11, a1.f23069b, device.f13087l);
                }
                if (dVar.o(serialDescriptor, 12) || device.f13088m != null) {
                    dVar.E(serialDescriptor, 12, a1.f23069b, device.f13088m);
                }
                if (dVar.o(serialDescriptor, 13) || device.n != null) {
                    dVar.E(serialDescriptor, 13, a1.f23069b, device.n);
                }
                if (dVar.o(serialDescriptor, 14) || device.f13089o != null) {
                    dVar.E(serialDescriptor, 14, new f(a1.f23069b), device.f13089o);
                }
                if (dVar.o(serialDescriptor, 15) || device.f13090p != null) {
                    dVar.E(serialDescriptor, 15, a1.f23069b, device.f13090p);
                }
                if (dVar.o(serialDescriptor, 16) || device.q != null) {
                    dVar.E(serialDescriptor, 16, gq0.p.f23116b, device.q);
                }
                if (dVar.o(serialDescriptor, 17) || device.f13091r != null) {
                    dVar.E(serialDescriptor, 17, a1.f23069b, device.f13091r);
                }
                if (dVar.o(serialDescriptor, 18) || device.f13092s != null) {
                    dVar.E(serialDescriptor, 18, gq0.p.f23116b, device.f13092s);
                }
                if (dVar.o(serialDescriptor, 19) || device.t != null) {
                    dVar.E(serialDescriptor, 19, w.f23130b, device.t);
                }
                if (dVar.o(serialDescriptor, 20) || device.f13093u != null) {
                    dVar.E(serialDescriptor, 20, h.f23089b, device.f13093u);
                }
                if (dVar.o(serialDescriptor, 21) || device.v != null) {
                    dVar.E(serialDescriptor, 21, f0.f23081b, device.v);
                }
                if (dVar.o(serialDescriptor, 22) || device.f13094w != null) {
                    dVar.E(serialDescriptor, 22, f0.f23081b, device.f13094w);
                }
                if (dVar.o(serialDescriptor, 23) || device.f13095x != null) {
                    dVar.E(serialDescriptor, 23, f0.f23081b, device.f13095x);
                }
                if (dVar.o(serialDescriptor, 24) || device.f13096y != null) {
                    dVar.E(serialDescriptor, 24, f0.f23081b, device.f13096y);
                }
                if (dVar.o(serialDescriptor, 25) || device.f13097z != null) {
                    dVar.E(serialDescriptor, 25, new a(), device.f13097z);
                }
                if (dVar.o(serialDescriptor, 26) || device.A != null) {
                    dVar.E(serialDescriptor, 26, gq0.p.f23116b, device.A);
                }
                if (dVar.o(serialDescriptor, 27) || device.B != null) {
                    dVar.E(serialDescriptor, 27, a1.f23069b, device.B);
                }
                if (dVar.o(serialDescriptor, 28) || device.C != null) {
                    dVar.E(serialDescriptor, 28, w.f23130b, device.C);
                }
                if (dVar.o(serialDescriptor, 29) || device.D != null) {
                    z12 = true;
                }
                if (z12) {
                    dVar.E(serialDescriptor, 29, w.f23130b, device.D);
                }
            }

            public final void A(Float f11) {
                this.f13092s = f11;
            }

            public final void B(Integer num) {
                this.t = num;
            }

            public final void C(Integer num) {
                this.C = num;
            }

            public final void D(String str) {
                this.f13091r = str;
            }

            public final void E(Integer num) {
                this.D = num;
            }

            public final void F(Boolean bool) {
                this.k = bool;
            }

            public final void G(Long l11) {
                this.f13095x = l11;
            }

            public final void H(String str) {
                this.f13087l = str;
            }

            public final List<String> a() {
                return this.f13089o;
            }

            public final String b() {
                return this.f13088m;
            }

            public final String c() {
                return this.f13081d;
            }

            public final Integer d() {
                return this.C;
            }

            public final Integer e() {
                return this.D;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Device)) {
                    return false;
                }
                Device device = (Device) obj;
                return p.e(this.f13078a, device.f13078a) && p.e(this.f13079b, device.f13079b) && p.e(this.f13080c, device.f13080c) && p.e(this.f13081d, device.f13081d) && p.e(this.f13082e, device.f13082e) && p.e(this.f13083f, device.f13083f) && p.e(this.f13084g, device.f13084g) && p.e(this.f13085h, device.f13085h) && p.e(this.f13086i, device.f13086i) && p.e(this.j, device.j) && p.e(this.k, device.k) && p.e(this.f13087l, device.f13087l) && p.e(this.f13088m, device.f13088m) && p.e(this.n, device.n) && p.e(this.f13089o, device.f13089o) && p.e(this.f13090p, device.f13090p) && p.e(this.q, device.q) && p.e(this.f13091r, device.f13091r) && p.e(this.f13092s, device.f13092s) && p.e(this.t, device.t) && p.e(this.f13093u, device.f13093u) && p.e(this.v, device.v) && p.e(this.f13094w, device.f13094w) && p.e(this.f13095x, device.f13095x) && p.e(this.f13096y, device.f13096y) && p.e(this.f13097z, device.f13097z) && p.e(this.A, device.A) && p.e(this.B, device.B) && p.e(this.C, device.C) && p.e(this.D, device.D);
            }

            public final void f(String str) {
                this.f13082e = str;
            }

            public final void g(List<String> list) {
                this.f13089o = list;
            }

            public final void h(Float f11) {
                this.q = f11;
            }

            public int hashCode() {
                int hashCode = this.f13078a.hashCode() * 31;
                String str = this.f13079b;
                int i11 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f13080c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f13081d;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f13082e;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.f13083f;
                int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.f13084g;
                int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.f13085h;
                int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
                Boolean bool = this.f13086i;
                int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.j;
                int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.k;
                int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                String str8 = this.f13087l;
                int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.f13088m;
                int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.n;
                int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
                List<String> list = this.f13089o;
                int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
                String str11 = this.f13090p;
                int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
                Float f11 = this.q;
                int hashCode17 = (hashCode16 + (f11 == null ? 0 : f11.hashCode())) * 31;
                String str12 = this.f13091r;
                int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
                Float f12 = this.f13092s;
                int hashCode19 = (hashCode18 + (f12 == null ? 0 : f12.hashCode())) * 31;
                Integer num = this.t;
                int hashCode20 = (hashCode19 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool4 = this.f13093u;
                int hashCode21 = (hashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
                Long l11 = this.v;
                int hashCode22 = (hashCode21 + (l11 == null ? 0 : l11.hashCode())) * 31;
                Long l12 = this.f13094w;
                int hashCode23 = (hashCode22 + (l12 == null ? 0 : l12.hashCode())) * 31;
                Long l13 = this.f13095x;
                int hashCode24 = (hashCode23 + (l13 == null ? 0 : l13.hashCode())) * 31;
                Long l14 = this.f13096y;
                int hashCode25 = (hashCode24 + (l14 == null ? 0 : l14.hashCode())) * 31;
                Date date = this.f13097z;
                int hashCode26 = (hashCode25 + (date == null ? 0 : date.hashCode())) * 31;
                Float f13 = this.A;
                int hashCode27 = (hashCode26 + (f13 == null ? 0 : f13.hashCode())) * 31;
                String str13 = this.B;
                int hashCode28 = (hashCode27 + (str13 == null ? 0 : str13.hashCode())) * 31;
                Integer num2 = this.C;
                int hashCode29 = (hashCode28 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.D;
                if (num3 != null) {
                    i11 = num3.hashCode();
                }
                return hashCode29 + i11;
            }

            public final void i(Float f11) {
                this.A = f11;
            }

            public final void j(Date date) {
                this.f13097z = date;
            }

            public final void k(String str) {
                this.f13085h = str;
            }

            public final void l(Boolean bool) {
                this.j = bool;
            }

            public final void m(String str) {
                this.B = str;
            }

            public final void n(String str) {
                this.f13080c = str;
            }

            public final void o(Long l11) {
                this.f13094w = l11;
            }

            public final void p(Long l11) {
                this.f13096y = l11;
            }

            public final void q(String str) {
                this.f13088m = str;
            }

            public final void r(String str) {
                this.n = str;
            }

            public final void s(Boolean bool) {
                this.f13093u = bool;
            }

            public final void t(String str) {
                this.f13084g = str;
            }

            public String toString() {
                return "Device(type=" + this.f13078a + ", name=" + this.f13079b + ", family=" + this.f13080c + ", model=" + this.f13081d + ", arch=" + this.f13082e + ", orientation=" + this.f13083f + ", manufacturer=" + this.f13084g + ", brand=" + this.f13085h + ", online=" + this.f13086i + ", charging=" + this.j + ", simulator=" + this.k + ", timezone=" + this.f13087l + ", id=" + this.f13088m + ", language=" + this.n + ", archs=" + this.f13089o + ", modelId=" + this.f13090p + ", batteryLevel=" + this.q + ", screenResolution=" + this.f13091r + ", screenDensity=" + this.f13092s + ", screenDpi=" + this.t + ", lowMemory=" + this.f13093u + ", memorySizeBytes=" + this.v + ", freeMemoryBytes=" + this.f13094w + ", storageSizeBytes=" + this.f13095x + ", freeStorageBytes=" + this.f13096y + ", bootTime=" + this.f13097z + ", batteryTemperature=" + this.A + ", connectionType=" + this.B + ", screenHeightPx=" + this.C + ", screenWidthPx=" + this.D + ')';
            }

            public final void u(Long l11) {
                this.v = l11;
            }

            public final void v(String str) {
                this.f13081d = str;
            }

            public final void w(String str) {
                this.f13090p = str;
            }

            public final void x(String str) {
                this.f13079b = str;
            }

            public final void y(Boolean bool) {
                this.f13086i = bool;
            }

            public final void z(String str) {
                this.f13083f = str;
            }

            public Device(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, Boolean bool3, String str9, String str10, String str11, List<String> list, String str12, Float f11, String str13, Float f12, Integer num, Boolean bool4, Long l11, Long l12, Long l13, Long l14, Date date, Float f13, String str14, Integer num2, Integer num3) {
                p.j(str, "type");
                this.f13078a = str;
                this.f13079b = str2;
                this.f13080c = str3;
                this.f13081d = str4;
                this.f13082e = str5;
                this.f13083f = str6;
                this.f13084g = str7;
                this.f13085h = str8;
                this.f13086i = bool;
                this.j = bool2;
                this.k = bool3;
                this.f13087l = str9;
                this.f13088m = str10;
                this.n = str11;
                this.f13089o = list;
                this.f13090p = str12;
                this.q = f11;
                this.f13091r = str13;
                this.f13092s = f12;
                this.t = num;
                this.f13093u = bool4;
                this.v = l11;
                this.f13094w = l12;
                this.f13095x = l13;
                this.f13096y = l14;
                this.f13097z = date;
                this.A = f13;
                this.B = str14;
                this.C = num2;
                this.D = num3;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ Device(java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.Boolean r40, java.lang.Boolean r41, java.lang.Boolean r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.util.List r46, java.lang.String r47, java.lang.Float r48, java.lang.String r49, java.lang.Float r50, java.lang.Integer r51, java.lang.Boolean r52, java.lang.Long r53, java.lang.Long r54, java.lang.Long r55, java.lang.Long r56, java.util.Date r57, java.lang.Float r58, java.lang.String r59, java.lang.Integer r60, java.lang.Integer r61, int r62, kotlin.jvm.internal.i r63) {
                /*
                    r31 = this;
                    r0 = r62
                    r1 = r0 & 1
                    if (r1 == 0) goto L_0x0009
                    java.lang.String r1 = "device"
                    goto L_0x000b
                L_0x0009:
                    r1 = r32
                L_0x000b:
                    r2 = r0 & 2
                    if (r2 == 0) goto L_0x0011
                    r2 = 0
                    goto L_0x0013
                L_0x0011:
                    r2 = r33
                L_0x0013:
                    r4 = r0 & 4
                    if (r4 == 0) goto L_0x0019
                    r4 = 0
                    goto L_0x001b
                L_0x0019:
                    r4 = r34
                L_0x001b:
                    r5 = r0 & 8
                    if (r5 == 0) goto L_0x0021
                    r5 = 0
                    goto L_0x0023
                L_0x0021:
                    r5 = r35
                L_0x0023:
                    r6 = r0 & 16
                    if (r6 == 0) goto L_0x0029
                    r6 = 0
                    goto L_0x002b
                L_0x0029:
                    r6 = r36
                L_0x002b:
                    r7 = r0 & 32
                    if (r7 == 0) goto L_0x0031
                    r7 = 0
                    goto L_0x0033
                L_0x0031:
                    r7 = r37
                L_0x0033:
                    r8 = r0 & 64
                    if (r8 == 0) goto L_0x0039
                    r8 = 0
                    goto L_0x003b
                L_0x0039:
                    r8 = r38
                L_0x003b:
                    r9 = r0 & 128(0x80, float:1.794E-43)
                    if (r9 == 0) goto L_0x0041
                    r9 = 0
                    goto L_0x0043
                L_0x0041:
                    r9 = r39
                L_0x0043:
                    r10 = r0 & 256(0x100, float:3.59E-43)
                    if (r10 == 0) goto L_0x0049
                    r10 = 0
                    goto L_0x004b
                L_0x0049:
                    r10 = r40
                L_0x004b:
                    r11 = r0 & 512(0x200, float:7.175E-43)
                    if (r11 == 0) goto L_0x0051
                    r11 = 0
                    goto L_0x0053
                L_0x0051:
                    r11 = r41
                L_0x0053:
                    r12 = r0 & 1024(0x400, float:1.435E-42)
                    if (r12 == 0) goto L_0x0059
                    r12 = 0
                    goto L_0x005b
                L_0x0059:
                    r12 = r42
                L_0x005b:
                    r13 = r0 & 2048(0x800, float:2.87E-42)
                    if (r13 == 0) goto L_0x0061
                    r13 = 0
                    goto L_0x0063
                L_0x0061:
                    r13 = r43
                L_0x0063:
                    r14 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r14 == 0) goto L_0x0069
                    r14 = 0
                    goto L_0x006b
                L_0x0069:
                    r14 = r44
                L_0x006b:
                    r15 = r0 & 8192(0x2000, float:1.14794E-41)
                    if (r15 == 0) goto L_0x0071
                    r15 = 0
                    goto L_0x0073
                L_0x0071:
                    r15 = r45
                L_0x0073:
                    r3 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r3 == 0) goto L_0x0079
                    r3 = 0
                    goto L_0x007b
                L_0x0079:
                    r3 = r46
                L_0x007b:
                    r16 = 32768(0x8000, float:4.5918E-41)
                    r16 = r0 & r16
                    if (r16 == 0) goto L_0x0085
                    r16 = 0
                    goto L_0x0087
                L_0x0085:
                    r16 = r47
                L_0x0087:
                    r17 = 65536(0x10000, float:9.18355E-41)
                    r17 = r0 & r17
                    if (r17 == 0) goto L_0x0090
                    r17 = 0
                    goto L_0x0092
                L_0x0090:
                    r17 = r48
                L_0x0092:
                    r18 = 131072(0x20000, float:1.83671E-40)
                    r18 = r0 & r18
                    if (r18 == 0) goto L_0x009b
                    r18 = 0
                    goto L_0x009d
                L_0x009b:
                    r18 = r49
                L_0x009d:
                    r19 = 262144(0x40000, float:3.67342E-40)
                    r19 = r0 & r19
                    if (r19 == 0) goto L_0x00a6
                    r19 = 0
                    goto L_0x00a8
                L_0x00a6:
                    r19 = r50
                L_0x00a8:
                    r20 = 524288(0x80000, float:7.34684E-40)
                    r20 = r0 & r20
                    if (r20 == 0) goto L_0x00b1
                    r20 = 0
                    goto L_0x00b3
                L_0x00b1:
                    r20 = r51
                L_0x00b3:
                    r21 = 1048576(0x100000, float:1.469368E-39)
                    r21 = r0 & r21
                    if (r21 == 0) goto L_0x00bc
                    r21 = 0
                    goto L_0x00be
                L_0x00bc:
                    r21 = r52
                L_0x00be:
                    r22 = 2097152(0x200000, float:2.938736E-39)
                    r22 = r0 & r22
                    if (r22 == 0) goto L_0x00c7
                    r22 = 0
                    goto L_0x00c9
                L_0x00c7:
                    r22 = r53
                L_0x00c9:
                    r23 = 4194304(0x400000, float:5.877472E-39)
                    r23 = r0 & r23
                    if (r23 == 0) goto L_0x00d2
                    r23 = 0
                    goto L_0x00d4
                L_0x00d2:
                    r23 = r54
                L_0x00d4:
                    r24 = 8388608(0x800000, float:1.17549435E-38)
                    r24 = r0 & r24
                    if (r24 == 0) goto L_0x00dd
                    r24 = 0
                    goto L_0x00df
                L_0x00dd:
                    r24 = r55
                L_0x00df:
                    r25 = 16777216(0x1000000, float:2.3509887E-38)
                    r25 = r0 & r25
                    if (r25 == 0) goto L_0x00e8
                    r25 = 0
                    goto L_0x00ea
                L_0x00e8:
                    r25 = r56
                L_0x00ea:
                    r26 = 33554432(0x2000000, float:9.403955E-38)
                    r26 = r0 & r26
                    if (r26 == 0) goto L_0x00f3
                    r26 = 0
                    goto L_0x00f5
                L_0x00f3:
                    r26 = r57
                L_0x00f5:
                    r27 = 67108864(0x4000000, float:1.5046328E-36)
                    r27 = r0 & r27
                    if (r27 == 0) goto L_0x00fe
                    r27 = 0
                    goto L_0x0100
                L_0x00fe:
                    r27 = r58
                L_0x0100:
                    r28 = 134217728(0x8000000, float:3.85186E-34)
                    r28 = r0 & r28
                    if (r28 == 0) goto L_0x0109
                    r28 = 0
                    goto L_0x010b
                L_0x0109:
                    r28 = r59
                L_0x010b:
                    r29 = 268435456(0x10000000, float:2.5243549E-29)
                    r29 = r0 & r29
                    if (r29 == 0) goto L_0x0114
                    r29 = 0
                    goto L_0x0116
                L_0x0114:
                    r29 = r60
                L_0x0116:
                    r30 = 536870912(0x20000000, float:1.0842022E-19)
                    r0 = r0 & r30
                    if (r0 == 0) goto L_0x011e
                    r0 = 0
                    goto L_0x0120
                L_0x011e:
                    r0 = r61
                L_0x0120:
                    r32 = r31
                    r33 = r1
                    r34 = r2
                    r35 = r4
                    r36 = r5
                    r37 = r6
                    r38 = r7
                    r39 = r8
                    r40 = r9
                    r41 = r10
                    r42 = r11
                    r43 = r12
                    r44 = r13
                    r45 = r14
                    r46 = r15
                    r47 = r3
                    r48 = r16
                    r49 = r17
                    r50 = r18
                    r51 = r19
                    r52 = r20
                    r53 = r21
                    r54 = r22
                    r55 = r23
                    r56 = r24
                    r57 = r25
                    r58 = r26
                    r59 = r27
                    r60 = r28
                    r61 = r29
                    r62 = r0
                    r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: co.hyperverge.crashguard.data.models.CrashEvent.Contexts.Device.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.Float, java.lang.String, java.lang.Float, java.lang.Integer, java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.Date, java.lang.Float, java.lang.String, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.i):void");
            }
        }

        /* compiled from: CrashEvent.kt */
        public static final class OS {
            public static final Companion Companion = new Companion((i) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f13098a;

            /* renamed from: b  reason: collision with root package name */
            private String f13099b;

            /* renamed from: c  reason: collision with root package name */
            private String f13100c;

            /* renamed from: d  reason: collision with root package name */
            private String f13101d;

            /* renamed from: e  reason: collision with root package name */
            private String f13102e;

            /* renamed from: f  reason: collision with root package name */
            private Boolean f13103f;

            /* compiled from: CrashEvent.kt */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(i iVar) {
                    this();
                }

                public final KSerializer<OS> serializer() {
                    return CrashEvent$Contexts$OS$$serializer.INSTANCE;
                }
            }

            public OS() {
                this((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 63, (i) null);
            }

            public /* synthetic */ OS(int i11, String str, String str2, String str3, String str4, String str5, Boolean bool, x0 x0Var) {
                if ((i11 & 0) != 0) {
                    PluginExceptionsKt.throwMissingFieldException(i11, 0, CrashEvent$Contexts$OS$$serializer.INSTANCE.getDescriptor());
                }
                this.f13098a = (i11 & 1) == 0 ? "os" : str;
                if ((i11 & 2) == 0) {
                    this.f13099b = null;
                } else {
                    this.f13099b = str2;
                }
                if ((i11 & 4) == 0) {
                    this.f13100c = null;
                } else {
                    this.f13100c = str3;
                }
                if ((i11 & 8) == 0) {
                    this.f13101d = null;
                } else {
                    this.f13101d = str4;
                }
                if ((i11 & 16) == 0) {
                    this.f13102e = null;
                } else {
                    this.f13102e = str5;
                }
                if ((i11 & 32) == 0) {
                    this.f13103f = null;
                } else {
                    this.f13103f = bool;
                }
            }

            public static final void f(OS os2, d dVar, SerialDescriptor serialDescriptor) {
                boolean z11;
                p.j(os2, "self");
                p.j(dVar, "output");
                p.j(serialDescriptor, "serialDesc");
                boolean z12 = false;
                if (!dVar.o(serialDescriptor, 0) && p.e(os2.f13098a, "os")) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    dVar.n(serialDescriptor, 0, os2.f13098a);
                }
                if (dVar.o(serialDescriptor, 1) || os2.f13099b != null) {
                    dVar.E(serialDescriptor, 1, a1.f23069b, os2.f13099b);
                }
                if (dVar.o(serialDescriptor, 2) || os2.f13100c != null) {
                    dVar.E(serialDescriptor, 2, a1.f23069b, os2.f13100c);
                }
                if (dVar.o(serialDescriptor, 3) || os2.f13101d != null) {
                    dVar.E(serialDescriptor, 3, a1.f23069b, os2.f13101d);
                }
                if (dVar.o(serialDescriptor, 4) || os2.f13102e != null) {
                    dVar.E(serialDescriptor, 4, a1.f23069b, os2.f13102e);
                }
                if (dVar.o(serialDescriptor, 5) || os2.f13103f != null) {
                    z12 = true;
                }
                if (z12) {
                    dVar.E(serialDescriptor, 5, h.f23089b, os2.f13103f);
                }
            }

            public final void a(String str) {
                this.f13101d = str;
            }

            public final void b(String str) {
                this.f13102e = str;
            }

            public final void c(String str) {
                this.f13099b = str;
            }

            public final void d(Boolean bool) {
                this.f13103f = bool;
            }

            public final void e(String str) {
                this.f13100c = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OS)) {
                    return false;
                }
                OS os2 = (OS) obj;
                return p.e(this.f13098a, os2.f13098a) && p.e(this.f13099b, os2.f13099b) && p.e(this.f13100c, os2.f13100c) && p.e(this.f13101d, os2.f13101d) && p.e(this.f13102e, os2.f13102e) && p.e(this.f13103f, os2.f13103f);
            }

            public int hashCode() {
                int hashCode = this.f13098a.hashCode() * 31;
                String str = this.f13099b;
                int i11 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f13100c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f13101d;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f13102e;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Boolean bool = this.f13103f;
                if (bool != null) {
                    i11 = bool.hashCode();
                }
                return hashCode5 + i11;
            }

            public String toString() {
                return "OS(type=" + this.f13098a + ", name=" + this.f13099b + ", version=" + this.f13100c + ", build=" + this.f13101d + ", kernelVersion=" + this.f13102e + ", rooted=" + this.f13103f + ')';
            }

            public OS(String str, String str2, String str3, String str4, String str5, Boolean bool) {
                p.j(str, "type");
                this.f13098a = str;
                this.f13099b = str2;
                this.f13100c = str3;
                this.f13101d = str4;
                this.f13102e = str5;
                this.f13103f = bool;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ OS(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.Boolean r10, int r11, kotlin.jvm.internal.i r12) {
                /*
                    r4 = this;
                    r12 = r11 & 1
                    if (r12 == 0) goto L_0x0006
                    java.lang.String r5 = "os"
                L_0x0006:
                    r12 = r11 & 2
                    r0 = 0
                    if (r12 == 0) goto L_0x000d
                    r12 = r0
                    goto L_0x000e
                L_0x000d:
                    r12 = r6
                L_0x000e:
                    r6 = r11 & 4
                    if (r6 == 0) goto L_0x0014
                    r1 = r0
                    goto L_0x0015
                L_0x0014:
                    r1 = r7
                L_0x0015:
                    r6 = r11 & 8
                    if (r6 == 0) goto L_0x001b
                    r2 = r0
                    goto L_0x001c
                L_0x001b:
                    r2 = r8
                L_0x001c:
                    r6 = r11 & 16
                    if (r6 == 0) goto L_0x0022
                    r3 = r0
                    goto L_0x0023
                L_0x0022:
                    r3 = r9
                L_0x0023:
                    r6 = r11 & 32
                    if (r6 == 0) goto L_0x0028
                    goto L_0x0029
                L_0x0028:
                    r0 = r10
                L_0x0029:
                    r6 = r4
                    r7 = r5
                    r8 = r12
                    r9 = r1
                    r10 = r2
                    r11 = r3
                    r12 = r0
                    r6.<init>(r7, r8, r9, r10, r11, r12)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: co.hyperverge.crashguard.data.models.CrashEvent.Contexts.OS.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.i):void");
            }
        }

        public Contexts() {
            this((App) null, (Device) null, (OS) null, 7, (i) null);
        }

        public /* synthetic */ Contexts(int i11, App app, Device device, OS os2, x0 x0Var) {
            int i12 = i11;
            if ((i12 & 0) != 0) {
                PluginExceptionsKt.throwMissingFieldException(i12, 0, CrashEvent$Contexts$$serializer.INSTANCE.getDescriptor());
            }
            this.f13069a = (i12 & 1) == 0 ? new App((String) null, (Date) null, (String) null, (String) null, (String) null, (String) null, 63, (i) null) : app;
            this.f13070b = (i12 & 2) == 0 ? new Device((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, (String) null, (Float) null, (String) null, (Float) null, (Integer) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Date) null, (Float) null, (String) null, (Integer) null, (Integer) null, 1073741823, (i) null) : device;
            this.f13071c = (i12 & 4) == 0 ? new OS((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 63, (i) null) : os2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0095  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void d(co.hyperverge.crashguard.data.models.CrashEvent.Contexts r39, fq0.d r40, kotlinx.serialization.descriptors.SerialDescriptor r41) {
            /*
                r0 = r39
                r1 = r40
                r2 = r41
                java.lang.String r3 = "self"
                kotlin.jvm.internal.p.j(r0, r3)
                java.lang.String r3 = "output"
                kotlin.jvm.internal.p.j(r1, r3)
                java.lang.String r3 = "serialDesc"
                kotlin.jvm.internal.p.j(r2, r3)
                r3 = 0
                boolean r4 = r1.o(r2, r3)
                r5 = 1
                if (r4 == 0) goto L_0x001f
            L_0x001d:
                r4 = 1
                goto L_0x0038
            L_0x001f:
                co.hyperverge.crashguard.data.models.CrashEvent$Contexts$App r4 = r0.f13069a
                co.hyperverge.crashguard.data.models.CrashEvent$Contexts$App r15 = new co.hyperverge.crashguard.data.models.CrashEvent$Contexts$App
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 63
                r14 = 0
                r6 = r15
                r6.<init>((java.lang.String) r7, (java.util.Date) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (int) r13, (kotlin.jvm.internal.i) r14)
                boolean r4 = kotlin.jvm.internal.p.e(r4, r15)
                if (r4 != 0) goto L_0x0037
                goto L_0x001d
            L_0x0037:
                r4 = 0
            L_0x0038:
                if (r4 == 0) goto L_0x0041
                co.hyperverge.crashguard.data.models.CrashEvent$Contexts$App$$serializer r4 = co.hyperverge.crashguard.data.models.CrashEvent$Contexts$App$$serializer.INSTANCE
                co.hyperverge.crashguard.data.models.CrashEvent$Contexts$App r6 = r0.f13069a
                r1.v(r2, r3, r4, r6)
            L_0x0041:
                boolean r4 = r1.o(r2, r5)
                if (r4 == 0) goto L_0x0049
            L_0x0047:
                r3 = 1
                goto L_0x0093
            L_0x0049:
                co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device r4 = r0.f13070b
                co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device r15 = new co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device
                r6 = r15
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r3 = r15
                r15 = r16
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                r35 = 0
                r36 = 0
                r37 = 1073741823(0x3fffffff, float:1.9999999)
                r38 = 0
                r6.<init>((java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.Boolean) r15, (java.lang.Boolean) r16, (java.lang.Boolean) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (java.util.List) r21, (java.lang.String) r22, (java.lang.Float) r23, (java.lang.String) r24, (java.lang.Float) r25, (java.lang.Integer) r26, (java.lang.Boolean) r27, (java.lang.Long) r28, (java.lang.Long) r29, (java.lang.Long) r30, (java.lang.Long) r31, (java.util.Date) r32, (java.lang.Float) r33, (java.lang.String) r34, (java.lang.Integer) r35, (java.lang.Integer) r36, (int) r37, (kotlin.jvm.internal.i) r38)
                boolean r3 = kotlin.jvm.internal.p.e(r4, r3)
                if (r3 != 0) goto L_0x0092
                goto L_0x0047
            L_0x0092:
                r3 = 0
            L_0x0093:
                if (r3 == 0) goto L_0x009c
                co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device$$serializer r3 = co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device$$serializer.INSTANCE
                co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device r4 = r0.f13070b
                r1.v(r2, r5, r3, r4)
            L_0x009c:
                r3 = 2
                boolean r4 = r1.o(r2, r3)
                if (r4 == 0) goto L_0x00a4
                goto L_0x00bd
            L_0x00a4:
                co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS r4 = r0.f13071c
                co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS r15 = new co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 63
                r14 = 0
                r6 = r15
                r6.<init>((java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.Boolean) r12, (int) r13, (kotlin.jvm.internal.i) r14)
                boolean r4 = kotlin.jvm.internal.p.e(r4, r15)
                if (r4 != 0) goto L_0x00bc
                goto L_0x00bd
            L_0x00bc:
                r5 = 0
            L_0x00bd:
                if (r5 == 0) goto L_0x00c6
                co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS$$serializer r4 = co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS$$serializer.INSTANCE
                co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS r0 = r0.f13071c
                r1.v(r2, r3, r4, r0)
            L_0x00c6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: co.hyperverge.crashguard.data.models.CrashEvent.Contexts.d(co.hyperverge.crashguard.data.models.CrashEvent$Contexts, fq0.d, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public final App a() {
            return this.f13069a;
        }

        public final Device b() {
            return this.f13070b;
        }

        public final OS c() {
            return this.f13071c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Contexts)) {
                return false;
            }
            Contexts contexts = (Contexts) obj;
            return p.e(this.f13069a, contexts.f13069a) && p.e(this.f13070b, contexts.f13070b) && p.e(this.f13071c, contexts.f13071c);
        }

        public int hashCode() {
            return (((this.f13069a.hashCode() * 31) + this.f13070b.hashCode()) * 31) + this.f13071c.hashCode();
        }

        public String toString() {
            return "Contexts(app=" + this.f13069a + ", device=" + this.f13070b + ", os=" + this.f13071c + ')';
        }

        public Contexts(App app, Device device, OS os2) {
            p.j(app, "app");
            p.j(device, "device");
            p.j(os2, "os");
            this.f13069a = app;
            this.f13070b = device;
            this.f13071c = os2;
        }

        public /* synthetic */ Contexts(App app, Device device, OS os2, int i11, i iVar) {
            Contexts contexts;
            OS os3;
            App app2 = (i11 & 1) != 0 ? new App((String) null, (Date) null, (String) null, (String) null, (String) null, (String) null, 63, (i) null) : app;
            Device device2 = (i11 & 2) != 0 ? new Device((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, (String) null, (Float) null, (String) null, (Float) null, (Integer) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Date) null, (Float) null, (String) null, (Integer) null, (Integer) null, 1073741823, (i) null) : device;
            if ((i11 & 4) != 0) {
                os3 = new OS((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 63, (i) null);
                contexts = this;
            } else {
                contexts = this;
                os3 = os2;
            }
            new Contexts(app2, device2, os3);
        }
    }

    public CrashEvent(String str, String str2, Double d11, String str3, Contexts contexts, Exception exception, HashMap<String, String> hashMap, User user) {
        p.j(contexts, "contexts");
        p.j(hashMap, "tags");
        p.j(user, LogSubCategory.Action.USER);
        this.f13061a = str;
        this.f13062b = str2;
        this.f13063c = d11;
        this.f13064d = str3;
        this.f13065e = contexts;
        this.f13066f = exception;
        this.f13067g = hashMap;
        this.f13068h = user;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CrashEvent(java.lang.String r14, java.lang.String r15, java.lang.Double r16, java.lang.String r17, co.hyperverge.crashguard.data.models.CrashEvent.Contexts r18, co.hyperverge.crashguard.data.models.CrashEvent.Exception r19, java.util.HashMap r20, co.hyperverge.crashguard.data.models.CrashEvent.User r21, int r22, kotlin.jvm.internal.i r23) {
        /*
            r13 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r14
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            java.lang.String r3 = "java"
            goto L_0x0012
        L_0x0011:
            r3 = r15
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x001a
        L_0x0018:
            r4 = r16
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r17
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0032
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts r6 = new co.hyperverge.crashguard.data.models.CrashEvent$Contexts
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 7
            r12 = 0
            r7 = r6
            r7.<init>((co.hyperverge.crashguard.data.models.CrashEvent.Contexts.App) r8, (co.hyperverge.crashguard.data.models.CrashEvent.Contexts.Device) r9, (co.hyperverge.crashguard.data.models.CrashEvent.Contexts.OS) r10, (int) r11, (kotlin.jvm.internal.i) r12)
            goto L_0x0034
        L_0x0032:
            r6 = r18
        L_0x0034:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x003a
            r7 = r2
            goto L_0x003c
        L_0x003a:
            r7 = r19
        L_0x003c:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0046
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            goto L_0x0048
        L_0x0046:
            r8 = r20
        L_0x0048:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0053
            co.hyperverge.crashguard.data.models.CrashEvent$User r0 = new co.hyperverge.crashguard.data.models.CrashEvent$User
            r9 = 1
            r0.<init>((java.lang.String) r2, (int) r9, (kotlin.jvm.internal.i) r2)
            goto L_0x0055
        L_0x0053:
            r0 = r21
        L_0x0055:
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co.hyperverge.crashguard.data.models.CrashEvent.<init>(java.lang.String, java.lang.String, java.lang.Double, java.lang.String, co.hyperverge.crashguard.data.models.CrashEvent$Contexts, co.hyperverge.crashguard.data.models.CrashEvent$Exception, java.util.HashMap, co.hyperverge.crashguard.data.models.CrashEvent$User, int, kotlin.jvm.internal.i):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CrashEvent(java.lang.Throwable r13) {
        /*
            r12 = this;
            java.lang.String r0 = "t"
            kotlin.jvm.internal.p.j(r13, r0)
            java.lang.StackTraceElement[] r0 = r13.getStackTrace()
            java.lang.String r1 = "t.stackTrace"
            kotlin.jvm.internal.p.i(r0, r1)
            r1 = 0
            java.lang.Object r0 = kotlin.collections.ArraysKt___ArraysKt.P(r0, r1)
            java.lang.StackTraceElement r0 = (java.lang.StackTraceElement) r0
            if (r0 != 0) goto L_0x0019
            r0 = 0
            goto L_0x003f
        L_0x0019:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.getFileName()
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            java.lang.String r3 = r0.getClassName()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r0 = r0.getMethodName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x003f:
            r2 = r0
            r3 = 0
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            double r0 = (double) r0
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r4
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            java.lang.String r5 = r13.getMessage()
            r6 = 0
            co.hyperverge.crashguard.data.models.CrashEvent$Exception$Companion r0 = co.hyperverge.crashguard.data.models.CrashEvent.Exception.Companion
            co.hyperverge.crashguard.data.models.CrashEvent$Exception r7 = r0.a(r13)
            r8 = 0
            r9 = 0
            r10 = 210(0xd2, float:2.94E-43)
            r11 = 0
            r1 = r12
            r1.<init>((java.lang.String) r2, (java.lang.String) r3, (java.lang.Double) r4, (java.lang.String) r5, (co.hyperverge.crashguard.data.models.CrashEvent.Contexts) r6, (co.hyperverge.crashguard.data.models.CrashEvent.Exception) r7, (java.util.HashMap) r8, (co.hyperverge.crashguard.data.models.CrashEvent.User) r9, (int) r10, (kotlin.jvm.internal.i) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co.hyperverge.crashguard.data.models.CrashEvent.<init>(java.lang.Throwable):void");
    }
}
