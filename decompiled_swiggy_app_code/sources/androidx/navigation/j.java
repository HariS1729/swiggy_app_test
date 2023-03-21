package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import in.swiggy.android.tejas.utils.HighlightTextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: NavDeepLink */
public final class j {
    private static final Pattern j = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<String> f10919a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, c> f10920b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Pattern f10921c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10922d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10923e = false;

    /* renamed from: f  reason: collision with root package name */
    private final String f10924f;

    /* renamed from: g  reason: collision with root package name */
    private final String f10925g;

    /* renamed from: h  reason: collision with root package name */
    private Pattern f10926h = null;

    /* renamed from: i  reason: collision with root package name */
    private final String f10927i;

    /* compiled from: NavDeepLink */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f10928a;

        /* renamed from: b  reason: collision with root package name */
        private String f10929b;

        /* renamed from: c  reason: collision with root package name */
        private String f10930c;

        a() {
        }

        public j a() {
            return new j(this.f10928a, this.f10929b, this.f10930c);
        }

        public a b(String str) {
            if (!str.isEmpty()) {
                this.f10929b = str;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }

        public a c(String str) {
            this.f10930c = str;
            return this;
        }

        public a d(String str) {
            this.f10928a = str;
            return this;
        }
    }

    /* compiled from: NavDeepLink */
    private static class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        String f10931a;

        /* renamed from: b  reason: collision with root package name */
        String f10932b;

        b(String str) {
            String[] split = str.split("/", -1);
            this.f10931a = split[0];
            this.f10932b = split[1];
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            int i11 = this.f10931a.equals(bVar.f10931a) ? 2 : 0;
            return this.f10932b.equals(bVar.f10932b) ? i11 + 1 : i11;
        }
    }

    /* compiled from: NavDeepLink */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private String f10933a;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<String> f10934b = new ArrayList<>();

        c() {
        }

        /* access modifiers changed from: package-private */
        public void a(String str) {
            this.f10934b.add(str);
        }

        /* access modifiers changed from: package-private */
        public String b(int i11) {
            return this.f10934b.get(i11);
        }

        /* access modifiers changed from: package-private */
        public String c() {
            return this.f10933a;
        }

        /* access modifiers changed from: package-private */
        public void d(String str) {
            this.f10933a = str;
        }

        public int e() {
            return this.f10934b.size();
        }
    }

    j(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str3;
        this.f10924f = str4;
        this.f10925g = str2;
        this.f10927i = str5;
        if (str4 != null) {
            Uri parse = Uri.parse(str);
            this.f10923e = parse.getQuery() != null;
            StringBuilder sb2 = new StringBuilder("^");
            if (!j.matcher(str4).find()) {
                sb2.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f10923e) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str4);
                if (matcher.find()) {
                    a(str4.substring(0, matcher.start()), sb2, compile);
                }
                this.f10922d = false;
                for (String next : parse.getQueryParameterNames()) {
                    StringBuilder sb3 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(next);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    c cVar = new c();
                    int i11 = 0;
                    while (matcher2.find()) {
                        cVar.a(matcher2.group(1));
                        sb3.append(Pattern.quote(queryParameter.substring(i11, matcher2.start())));
                        sb3.append("(.+?)?");
                        i11 = matcher2.end();
                    }
                    if (i11 < queryParameter.length()) {
                        sb3.append(Pattern.quote(queryParameter.substring(i11)));
                    }
                    cVar.d(sb3.toString().replace(HighlightTextUtils.patternWildcard, "\\E.*\\Q"));
                    this.f10920b.put(next, cVar);
                }
            } else {
                this.f10922d = a(str4, sb2, compile);
            }
            this.f10921c = Pattern.compile(sb2.toString().replace(HighlightTextUtils.patternWildcard, "\\E.*\\Q"));
        }
        if (str5 == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str5).matches()) {
            b bVar = new b(str5);
            this.f10926h = Pattern.compile(("^(" + bVar.f10931a + "|[*]+)/(" + bVar.f10932b + "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
            return;
        }
        throw new IllegalArgumentException("The given mimeType " + str5 + " does not match to required \"type/subtype\" format");
    }

    private boolean a(String str, StringBuilder sb2, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z11 = !str.contains(HighlightTextUtils.patternWildcard);
        int i11 = 0;
        while (matcher.find()) {
            this.f10919a.add(matcher.group(1));
            sb2.append(Pattern.quote(str.substring(i11, matcher.start())));
            sb2.append("(.+?)");
            i11 = matcher.end();
            z11 = false;
        }
        if (i11 < str.length()) {
            sb2.append(Pattern.quote(str.substring(i11)));
        }
        sb2.append("($|(\\?(.)*))");
        return z11;
    }

    private boolean f(Bundle bundle, String str, String str2, g gVar) {
        if (gVar != null) {
            try {
                gVar.b().g(bundle, str, str2);
                return false;
            } catch (IllegalArgumentException unused) {
                return true;
            }
        } else {
            bundle.putString(str, str2);
            return false;
        }
    }

    public String b() {
        return this.f10925g;
    }

    /* access modifiers changed from: package-private */
    public Bundle c(Uri uri, Map<String, g> map) {
        Matcher matcher;
        Matcher matcher2 = this.f10921c.matcher(uri.toString());
        if (!matcher2.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.f10919a.size();
        int i11 = 0;
        while (i11 < size) {
            String str = this.f10919a.get(i11);
            i11++;
            if (f(bundle, str, Uri.decode(matcher2.group(i11)), map.get(str))) {
                return null;
            }
        }
        if (this.f10923e) {
            for (String next : this.f10920b.keySet()) {
                c cVar = this.f10920b.get(next);
                String queryParameter = uri.getQueryParameter(next);
                if (queryParameter != null) {
                    matcher = Pattern.compile(cVar.c()).matcher(queryParameter);
                    if (!matcher.matches()) {
                        return null;
                    }
                } else {
                    matcher = null;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < cVar.e()) {
                        String decode = matcher != null ? Uri.decode(matcher.group(i12 + 1)) : null;
                        String b11 = cVar.b(i12);
                        g gVar = map.get(b11);
                        if (gVar != null && (decode == null || decode.replaceAll("[{}]", "").equals(b11))) {
                            if (gVar.a() != null) {
                                decode = gVar.a().toString();
                            } else if (gVar.d()) {
                                decode = null;
                            }
                        }
                        if (f(bundle, b11, decode, gVar)) {
                            return null;
                        }
                        i12++;
                    }
                }
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public int d(String str) {
        if (this.f10927i == null || !this.f10926h.matcher(str).matches()) {
            return -1;
        }
        return new b(this.f10927i).compareTo(new b(str));
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f10922d;
    }
}
