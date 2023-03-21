package androidx.constraintlayout.core.parser;

import j2.b;

public class CLParser {

    /* renamed from: d  reason: collision with root package name */
    static boolean f8083d = false;

    /* renamed from: a  reason: collision with root package name */
    private String f8084a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f8085b = false;

    /* renamed from: c  reason: collision with root package name */
    private int f8086c;

    enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8087a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.parser.CLParser$TYPE[] r0 = androidx.constraintlayout.core.parser.CLParser.TYPE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8087a = r0
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.OBJECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8087a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8087a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8087a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8087a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.KEY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8087a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.parser.CLParser$TYPE r1 = androidx.constraintlayout.core.parser.CLParser.TYPE.TOKEN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.parser.CLParser.a.<clinit>():void");
        }
    }

    public CLParser(String str) {
        this.f8084a = str;
    }

    private c a(c cVar, int i11, TYPE type, boolean z11, char[] cArr) {
        c cVar2;
        if (f8083d) {
            System.out.println("CREATE " + type + " at " + cArr[i11]);
        }
        switch (a.f8087a[type.ordinal()]) {
            case 1:
                cVar2 = e.N(cArr);
                break;
            case 2:
                cVar2 = a.N(cArr);
                break;
            case 3:
                cVar2 = b.r(cArr);
                break;
            case 4:
                cVar2 = j2.a.r(cArr);
                break;
            case 5:
                cVar2 = d.N(cArr);
                break;
            case 6:
                cVar2 = CLToken.r(cArr);
                break;
            default:
                cVar2 = null;
                break;
        }
        i11++;
        if (cVar2 == null) {
            return null;
        }
        cVar2.o(this.f8086c);
        if (z11) {
            cVar2.p((long) i11);
        }
        if (cVar instanceof b) {
            cVar2.m((b) cVar);
        }
        return cVar2;
    }

    private c b(int i11, char c11, c cVar, char[] cArr) throws CLParsingException {
        if (c11 == 9 || c11 == 10 || c11 == 13 || c11 == ' ') {
            return cVar;
        }
        if (c11 == '\"' || c11 == '\'') {
            if (cVar instanceof e) {
                return a(cVar, i11, TYPE.KEY, true, cArr);
            }
            return a(cVar, i11, TYPE.STRING, true, cArr);
        } else if (c11 != '[') {
            if (c11 != ']') {
                if (c11 == '{') {
                    return a(cVar, i11, TYPE.OBJECT, true, cArr);
                } else if (c11 != '}') {
                    switch (c11) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            return a(cVar, i11, TYPE.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            return cVar;
                        case '/':
                            int i12 = i11 + 1;
                            if (i12 >= cArr.length || cArr[i12] != '/') {
                                return cVar;
                            }
                            this.f8085b = true;
                            return cVar;
                        default:
                            if (!(cVar instanceof b) || (cVar instanceof e)) {
                                return a(cVar, i11, TYPE.KEY, true, cArr);
                            }
                            c a11 = a(cVar, i11, TYPE.TOKEN, true, cArr);
                            CLToken cLToken = (CLToken) a11;
                            if (cLToken.s(c11, (long) i11)) {
                                return a11;
                            }
                            throw new CLParsingException("incorrect token <" + c11 + "> at line " + this.f8086c, cLToken);
                    }
                }
            }
            cVar.n((long) (i11 - 1));
            c f11 = cVar.f();
            f11.n((long) i11);
            return f11;
        } else {
            return a(cVar, i11, TYPE.ARRAY, true, cArr);
        }
    }

    public static e d(String str) throws CLParsingException {
        return new CLParser(str).c();
    }

    public e c() throws CLParsingException {
        char[] charArray = this.f8084a.toCharArray();
        int length = charArray.length;
        int i11 = 1;
        this.f8086c = 1;
        boolean z11 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            }
            char c11 = charArray[i12];
            if (c11 == '{') {
                break;
            }
            if (c11 == 10) {
                this.f8086c++;
            }
            i12++;
        }
        if (i12 != -1) {
            e N = e.N(charArray);
            N.o(this.f8086c);
            N.p((long) i12);
            int i13 = i12 + 1;
            c cVar = N;
            while (i13 < length) {
                char c12 = charArray[i13];
                if (c12 == 10) {
                    this.f8086c += i11;
                }
                if (this.f8085b) {
                    if (c12 == 10) {
                        this.f8085b = z11;
                    } else {
                        continue;
                        i13++;
                        i11 = 1;
                        z11 = false;
                    }
                }
                if (cVar == null) {
                    break;
                }
                if (cVar.l()) {
                    cVar = b(i13, c12, cVar, charArray);
                } else if (cVar instanceof e) {
                    if (c12 == '}') {
                        cVar.n((long) (i13 - 1));
                    } else {
                        cVar = b(i13, c12, cVar, charArray);
                    }
                } else if (!(cVar instanceof a)) {
                    boolean z12 = cVar instanceof b;
                    if (z12) {
                        long j = cVar.f8098b;
                        if (charArray[(int) j] == c12) {
                            cVar.p(j + 1);
                            cVar.n((long) (i13 - 1));
                        }
                    } else {
                        if (cVar instanceof CLToken) {
                            CLToken cLToken = (CLToken) cVar;
                            if (!cLToken.s(c12, (long) i13)) {
                                throw new CLParsingException("parsing incorrect token " + cLToken.c() + " at line " + this.f8086c, cLToken);
                            }
                        }
                        if ((cVar instanceof d) || z12) {
                            long j11 = cVar.f8098b;
                            char c13 = charArray[(int) j11];
                            if ((c13 == '\'' || c13 == '\"') && c13 == c12) {
                                cVar.p(j11 + 1);
                                cVar.n((long) (i13 - 1));
                            }
                        }
                        if (!cVar.l() && (c12 == '}' || c12 == ']' || c12 == ',' || c12 == ' ' || c12 == 9 || c12 == 13 || c12 == 10 || c12 == ':')) {
                            long j12 = (long) (i13 - 1);
                            cVar.n(j12);
                            if (c12 == '}' || c12 == ']') {
                                cVar = cVar.f();
                                cVar.n(j12);
                                if (cVar instanceof d) {
                                    cVar = cVar.f();
                                    cVar.n(j12);
                                }
                            }
                        }
                    }
                } else if (c12 == ']') {
                    cVar.n((long) (i13 - 1));
                } else {
                    cVar = b(i13, c12, cVar, charArray);
                }
                if (cVar.l() && (!(cVar instanceof d) || ((d) cVar).f8096f.size() > 0)) {
                    cVar = cVar.f();
                }
                i13++;
                i11 = 1;
                z11 = false;
            }
            while (cVar != null && !cVar.l()) {
                if (cVar instanceof b) {
                    cVar.p((long) (((int) cVar.f8098b) + 1));
                }
                cVar.n((long) (length - 1));
                cVar = cVar.f();
            }
            if (f8083d) {
                System.out.println("Root: " + N.q());
            }
            return N;
        }
        throw new CLParsingException("invalid json content", (c) null);
    }
}
