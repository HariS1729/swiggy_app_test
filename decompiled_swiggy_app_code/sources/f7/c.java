package f7;

import com.adobe.xmp.XMPException;
import d7.d;
import e7.h;
import h7.a;

public final class c {
    public static b a(String str, String str2) throws XMPException {
        if (str == null || str2 == null) {
            throw new XMPException("Parameter must not be null", 4);
        }
        b bVar = new b();
        a aVar = new a();
        aVar.f14650a = str2;
        c(str, aVar, bVar);
        while (aVar.f14654e < str2.length()) {
            aVar.f14653d = aVar.f14654e;
            e(str2, aVar);
            int i11 = aVar.f14653d;
            aVar.f14654e = i11;
            d d11 = str2.charAt(i11) != '[' ? d(aVar) : b(aVar);
            if (d11.b() == 1) {
                if (d11.c().charAt(0) == '@') {
                    d11.h("?" + d11.c().substring(1));
                    if (!"?xml:lang".equals(d11.c())) {
                        throw new XMPException("Only xml:lang allowed with '@'", 102);
                    }
                }
                if (d11.c().charAt(0) == '?') {
                    aVar.f14651b++;
                    d11.g(2);
                }
            } else {
                if (d11.b() != 6) {
                    continue;
                } else {
                    if (d11.c().charAt(1) == '@') {
                        d11.h("[?" + d11.c().substring(2));
                        if (!d11.c().startsWith("[?xml:lang=")) {
                            throw new XMPException("Only xml:lang allowed with '@'", 102);
                        }
                    }
                    if (d11.c().charAt(1) == '?') {
                        aVar.f14651b++;
                        d11.g(5);
                    }
                }
                bVar.a(d11);
            }
            f(aVar.f14650a.substring(aVar.f14651b, aVar.f14652c));
            bVar.a(d11);
        }
        return bVar;
    }

    private static d b(a aVar) throws XMPException {
        d dVar;
        int i11 = aVar.f14654e + 1;
        aVar.f14654e = i11;
        if ('0' > aVar.f14650a.charAt(i11) || aVar.f14650a.charAt(aVar.f14654e) > '9') {
            while (aVar.f14654e < aVar.f14650a.length() && aVar.f14650a.charAt(aVar.f14654e) != ']' && aVar.f14650a.charAt(aVar.f14654e) != '=') {
                aVar.f14654e++;
            }
            if (aVar.f14654e >= aVar.f14650a.length()) {
                throw new XMPException("Missing ']' or '=' for array index", 102);
            } else if (aVar.f14650a.charAt(aVar.f14654e) != ']') {
                aVar.f14651b = aVar.f14653d + 1;
                int i12 = aVar.f14654e;
                aVar.f14652c = i12;
                int i13 = i12 + 1;
                aVar.f14654e = i13;
                char charAt = aVar.f14650a.charAt(i13);
                if (charAt == '\'' || charAt == '\"') {
                    while (true) {
                        aVar.f14654e++;
                        if (aVar.f14654e < aVar.f14650a.length()) {
                            if (aVar.f14650a.charAt(aVar.f14654e) == charAt) {
                                if (aVar.f14654e + 1 >= aVar.f14650a.length() || aVar.f14650a.charAt(aVar.f14654e + 1) != charAt) {
                                    break;
                                }
                                aVar.f14654e++;
                            }
                        } else {
                            break;
                        }
                    }
                    if (aVar.f14654e < aVar.f14650a.length()) {
                        aVar.f14654e++;
                        dVar = new d((String) null, 6);
                    } else {
                        throw new XMPException("No terminating quote for array selector", 102);
                    }
                } else {
                    throw new XMPException("Invalid quote in array selector", 102);
                }
            } else if ("[last()".equals(aVar.f14650a.substring(aVar.f14653d, aVar.f14654e))) {
                dVar = new d((String) null, 4);
            } else {
                throw new XMPException("Invalid non-numeric array index", 102);
            }
        } else {
            while (aVar.f14654e < aVar.f14650a.length() && '0' <= aVar.f14650a.charAt(aVar.f14654e) && aVar.f14650a.charAt(aVar.f14654e) <= '9') {
                aVar.f14654e++;
            }
            dVar = new d((String) null, 3);
        }
        if (aVar.f14654e >= aVar.f14650a.length() || aVar.f14650a.charAt(aVar.f14654e) != ']') {
            throw new XMPException("Missing ']' for array index", 102);
        }
        int i14 = aVar.f14654e + 1;
        aVar.f14654e = i14;
        dVar.h(aVar.f14650a.substring(aVar.f14653d, i14));
        return dVar;
    }

    private static void c(String str, a aVar, b bVar) throws XMPException {
        d dVar;
        while (aVar.f14654e < aVar.f14650a.length() && "/[*".indexOf(aVar.f14650a.charAt(aVar.f14654e)) < 0) {
            aVar.f14654e++;
        }
        int i11 = aVar.f14654e;
        int i12 = aVar.f14653d;
        if (i11 != i12) {
            String h11 = h(str, aVar.f14650a.substring(i12, i11));
            a d11 = d.a().d(h11);
            if (d11 == null) {
                bVar.a(new d(str, Integer.MIN_VALUE));
                dVar = new d(h11, 1);
            } else {
                bVar.a(new d(d11.getNamespace(), Integer.MIN_VALUE));
                d dVar2 = new d(h(d11.getNamespace(), d11.a()), 1);
                dVar2.e(true);
                dVar2.f(d11.b().d());
                bVar.a(dVar2);
                if (d11.b().i()) {
                    dVar = new d("[?xml:lang='x-default']", 5);
                } else if (d11.b().h()) {
                    dVar = new d("[1]", 3);
                } else {
                    return;
                }
                dVar.e(true);
                dVar.f(d11.b().d());
            }
            bVar.a(dVar);
            return;
        }
        throw new XMPException("Empty initial XMPPath step", 102);
    }

    private static d d(a aVar) throws XMPException {
        aVar.f14651b = aVar.f14653d;
        while (aVar.f14654e < aVar.f14650a.length() && "/[*".indexOf(aVar.f14650a.charAt(aVar.f14654e)) < 0) {
            aVar.f14654e++;
        }
        int i11 = aVar.f14654e;
        aVar.f14652c = i11;
        int i12 = aVar.f14653d;
        if (i11 != i12) {
            return new d(aVar.f14650a.substring(i12, i11), 1);
        }
        throw new XMPException("Empty XMPPath segment", 102);
    }

    private static void e(String str, a aVar) throws XMPException {
        if (str.charAt(aVar.f14653d) == '/') {
            int i11 = aVar.f14653d + 1;
            aVar.f14653d = i11;
            if (i11 >= str.length()) {
                throw new XMPException("Empty XMPPath segment", 102);
            }
        }
        if (str.charAt(aVar.f14653d) == '*') {
            int i12 = aVar.f14653d + 1;
            aVar.f14653d = i12;
            if (i12 >= str.length() || str.charAt(aVar.f14653d) != '[') {
                throw new XMPException("Missing '[' after '*'", 102);
            }
        }
    }

    private static void f(String str) throws XMPException {
        int indexOf = str.indexOf(58);
        if (indexOf > 0) {
            String substring = str.substring(0, indexOf);
            if (h.g(substring)) {
                if (d.a().c(substring) == null) {
                    throw new XMPException("Unknown namespace prefix for qualified name", 102);
                }
                return;
            }
        }
        throw new XMPException("Ill-formed qualified name", 102);
    }

    private static void g(String str) throws XMPException {
        if (!h.f(str)) {
            throw new XMPException("Bad XML name", 102);
        }
    }

    private static String h(String str, String str2) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Schema namespace URI is required", 101);
        } else if (str2.charAt(0) == '?' || str2.charAt(0) == '@') {
            throw new XMPException("Top level name must not be a qualifier", 102);
        } else if (str2.indexOf(47) >= 0 || str2.indexOf(91) >= 0) {
            throw new XMPException("Top level name must be simple", 102);
        } else {
            String a11 = d.a().a(str);
            if (a11 != null) {
                int indexOf = str2.indexOf(58);
                if (indexOf < 0) {
                    g(str2);
                    return a11 + str2;
                }
                g(str2.substring(0, indexOf));
                g(str2.substring(indexOf));
                String substring = str2.substring(0, indexOf + 1);
                String a12 = d.a().a(str);
                if (a12 == null) {
                    throw new XMPException("Unknown schema namespace prefix", 101);
                } else if (substring.equals(a12)) {
                    return str2;
                } else {
                    throw new XMPException("Schema namespace URI and prefix mismatch", 101);
                }
            } else {
                throw new XMPException("Unregistered schema namespace URI", 101);
            }
        }
    }
}
