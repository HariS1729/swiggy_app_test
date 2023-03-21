package m3;

import android.database.Cursor;
import androidx.room.Index$Order;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TableInfo */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f15604a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f15605b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f15606c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f15607d;

    /* compiled from: TableInfo */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f15608a;

        /* renamed from: b  reason: collision with root package name */
        public final String f15609b;

        /* renamed from: c  reason: collision with root package name */
        public final int f15610c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f15611d;

        /* renamed from: e  reason: collision with root package name */
        public final int f15612e;

        /* renamed from: f  reason: collision with root package name */
        public final String f15613f;

        /* renamed from: g  reason: collision with root package name */
        private final int f15614g;

        public a(String str, String str2, boolean z11, int i11, String str3, int i12) {
            this.f15608a = str;
            this.f15609b = str2;
            this.f15611d = z11;
            this.f15612e = i11;
            this.f15610c = c(str2);
            this.f15613f = str3;
            this.f15614g = i12;
        }

        private static boolean a(String str) {
            if (str.length() == 0) {
                return false;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < str.length(); i12++) {
                char charAt = str.charAt(i12);
                if (i12 == 0 && charAt != '(') {
                    return false;
                }
                if (charAt == '(') {
                    i11++;
                } else if (charAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                    return false;
                }
            }
            if (i11 == 0) {
                return true;
            }
            return false;
        }

        public static boolean b(String str, String str2) {
            if (str2 == null) {
                return false;
            }
            if (str.equals(str2)) {
                return true;
            }
            if (a(str)) {
                return str.substring(1, str.length() - 1).trim().equals(str2);
            }
            return false;
        }

        private static int c(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f15612e != aVar.f15612e || !this.f15608a.equals(aVar.f15608a) || this.f15611d != aVar.f15611d) {
                return false;
            }
            if (this.f15614g == 1 && aVar.f15614g == 2 && (str3 = this.f15613f) != null && !b(str3, aVar.f15613f)) {
                return false;
            }
            if (this.f15614g == 2 && aVar.f15614g == 1 && (str2 = aVar.f15613f) != null && !b(str2, this.f15613f)) {
                return false;
            }
            int i11 = this.f15614g;
            if ((i11 == 0 || i11 != aVar.f15614g || ((str = this.f15613f) == null ? aVar.f15613f == null : b(str, aVar.f15613f))) && this.f15610c == aVar.f15610c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f15608a.hashCode() * 31) + this.f15610c) * 31) + (this.f15611d ? 1231 : 1237)) * 31) + this.f15612e;
        }

        public String toString() {
            return "Column{name='" + this.f15608a + '\'' + ", type='" + this.f15609b + '\'' + ", affinity='" + this.f15610c + '\'' + ", notNull=" + this.f15611d + ", primaryKeyPosition=" + this.f15612e + ", defaultValue='" + this.f15613f + '\'' + '}';
        }
    }

    /* compiled from: TableInfo */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f15615a;

        /* renamed from: b  reason: collision with root package name */
        public final String f15616b;

        /* renamed from: c  reason: collision with root package name */
        public final String f15617c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f15618d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f15619e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f15615a = str;
            this.f15616b = str2;
            this.f15617c = str3;
            this.f15618d = Collections.unmodifiableList(list);
            this.f15619e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f15615a.equals(bVar.f15615a) && this.f15616b.equals(bVar.f15616b) && this.f15617c.equals(bVar.f15617c) && this.f15618d.equals(bVar.f15618d)) {
                return this.f15619e.equals(bVar.f15619e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f15615a.hashCode() * 31) + this.f15616b.hashCode()) * 31) + this.f15617c.hashCode()) * 31) + this.f15618d.hashCode()) * 31) + this.f15619e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f15615a + '\'' + ", onDelete='" + this.f15616b + '\'' + ", onUpdate='" + this.f15617c + '\'' + ", columnNames=" + this.f15618d + ", referenceColumnNames=" + this.f15619e + '}';
        }
    }

    /* compiled from: TableInfo */
    static class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        final int f15620a;

        /* renamed from: b  reason: collision with root package name */
        final int f15621b;

        /* renamed from: c  reason: collision with root package name */
        final String f15622c;

        /* renamed from: d  reason: collision with root package name */
        final String f15623d;

        c(int i11, int i12, String str, String str2) {
            this.f15620a = i11;
            this.f15621b = i12;
            this.f15622c = str;
            this.f15623d = str2;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            int i11 = this.f15620a - cVar.f15620a;
            return i11 == 0 ? this.f15621b - cVar.f15621b : i11;
        }
    }

    /* compiled from: TableInfo */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f15624a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f15625b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f15626c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f15627d;

        public d(String str, boolean z11, List<String> list) {
            this(str, z11, list, (List<String>) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f15625b != dVar.f15625b || !this.f15626c.equals(dVar.f15626c) || !this.f15627d.equals(dVar.f15627d)) {
                return false;
            }
            if (this.f15624a.startsWith("index_")) {
                return dVar.f15624a.startsWith("index_");
            }
            return this.f15624a.equals(dVar.f15624a);
        }

        public int hashCode() {
            int i11;
            if (this.f15624a.startsWith("index_")) {
                i11 = -1184239155;
            } else {
                i11 = this.f15624a.hashCode();
            }
            return (((((i11 * 31) + (this.f15625b ? 1 : 0)) * 31) + this.f15626c.hashCode()) * 31) + this.f15627d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f15624a + '\'' + ", unique=" + this.f15625b + ", columns=" + this.f15626c + ", orders=" + this.f15627d + '}';
        }

        public d(String str, boolean z11, List<String> list, List<String> list2) {
            this.f15624a = str;
            this.f15625b = z11;
            this.f15626c = list;
            this.f15627d = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), Index$Order.ASC.name()) : list2;
        }
    }

    public g(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        Set<d> set3;
        this.f15604a = str;
        this.f15605b = Collections.unmodifiableMap(map);
        this.f15606c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f15607d = set3;
    }

    public static g a(t3.g gVar, String str) {
        return new g(str, b(gVar, str), d(gVar, str), f(gVar, str));
    }

    private static Map<String, a> b(t3.g gVar, String str) {
        Cursor b12 = gVar.b1("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (b12.getColumnCount() > 0) {
                int columnIndex = b12.getColumnIndex("name");
                int columnIndex2 = b12.getColumnIndex("type");
                int columnIndex3 = b12.getColumnIndex("notnull");
                int columnIndex4 = b12.getColumnIndex("pk");
                int columnIndex5 = b12.getColumnIndex("dflt_value");
                while (b12.moveToNext()) {
                    String string = b12.getString(columnIndex);
                    hashMap.put(string, new a(string, b12.getString(columnIndex2), b12.getInt(columnIndex3) != 0, b12.getInt(columnIndex4), b12.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            b12.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(DistributedTracing.NR_ID_ATTRIBUTE);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < count; i11++) {
            cursor.moveToPosition(i11);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(t3.g gVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor b12 = gVar.b1("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = b12.getColumnIndex(DistributedTracing.NR_ID_ATTRIBUTE);
            int columnIndex2 = b12.getColumnIndex("seq");
            int columnIndex3 = b12.getColumnIndex("table");
            int columnIndex4 = b12.getColumnIndex("on_delete");
            int columnIndex5 = b12.getColumnIndex("on_update");
            List<c> c11 = c(b12);
            int count = b12.getCount();
            for (int i11 = 0; i11 < count; i11++) {
                b12.moveToPosition(i11);
                if (b12.getInt(columnIndex2) == 0) {
                    int i12 = b12.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c next : c11) {
                        if (next.f15620a == i12) {
                            arrayList.add(next.f15622c);
                            arrayList2.add(next.f15623d);
                        }
                    }
                    hashSet.add(new b(b12.getString(columnIndex3), b12.getString(columnIndex4), b12.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            b12.close();
        }
    }

    private static d e(t3.g gVar, String str, boolean z11) {
        Cursor b12 = gVar.b1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = b12.getColumnIndex("seqno");
            int columnIndex2 = b12.getColumnIndex("cid");
            int columnIndex3 = b12.getColumnIndex("name");
            int columnIndex4 = b12.getColumnIndex("desc");
            if (!(columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1)) {
                if (columnIndex4 != -1) {
                    TreeMap treeMap = new TreeMap();
                    TreeMap treeMap2 = new TreeMap();
                    while (b12.moveToNext()) {
                        if (b12.getInt(columnIndex2) >= 0) {
                            int i11 = b12.getInt(columnIndex);
                            String string = b12.getString(columnIndex3);
                            String str2 = b12.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                            treeMap.put(Integer.valueOf(i11), string);
                            treeMap2.put(Integer.valueOf(i11), str2);
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    ArrayList arrayList2 = new ArrayList(treeMap2.size());
                    arrayList2.addAll(treeMap2.values());
                    d dVar = new d(str, z11, arrayList, arrayList2);
                    b12.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            b12.close();
        }
    }

    private static Set<d> f(t3.g gVar, String str) {
        Cursor b12 = gVar.b1("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = b12.getColumnIndex("name");
            int columnIndex2 = b12.getColumnIndex("origin");
            int columnIndex3 = b12.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (b12.moveToNext()) {
                        if ("c".equals(b12.getString(columnIndex2))) {
                            String string = b12.getString(columnIndex);
                            boolean z11 = true;
                            if (b12.getInt(columnIndex3) != 1) {
                                z11 = false;
                            }
                            d e11 = e(gVar, string, z11);
                            if (e11 == null) {
                                b12.close();
                                return null;
                            }
                            hashSet.add(e11);
                        }
                    }
                    b12.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            b12.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = this.f15604a;
        if (str == null ? gVar.f15604a != null : !str.equals(gVar.f15604a)) {
            return false;
        }
        Map<String, a> map = this.f15605b;
        if (map == null ? gVar.f15605b != null : !map.equals(gVar.f15605b)) {
            return false;
        }
        Set<b> set2 = this.f15606c;
        if (set2 == null ? gVar.f15606c != null : !set2.equals(gVar.f15606c)) {
            return false;
        }
        Set<d> set3 = this.f15607d;
        if (set3 == null || (set = gVar.f15607d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f15604a;
        int i11 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f15605b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f15606c;
        if (set != null) {
            i11 = set.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "TableInfo{name='" + this.f15604a + '\'' + ", columns=" + this.f15605b + ", foreignKeys=" + this.f15606c + ", indices=" + this.f15607d + '}';
    }
}
