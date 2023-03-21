package e7;

import com.adobe.xmp.XMPException;
import com.xiaomi.mipush.sdk.Constants;
import d7.e;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import pc0.x;

public final class p implements e {

    /* renamed from: a  reason: collision with root package name */
    private Map f14445a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map f14446b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map f14447c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Pattern f14448d = Pattern.compile("[/*?\\[\\]]");

    class a implements h7.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f14449a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f14450b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f14451c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g7.a f14452d;

        a(String str, String str2, String str3, g7.a aVar) {
            this.f14449a = str;
            this.f14450b = str2;
            this.f14451c = str3;
            this.f14452d = aVar;
        }

        public String a() {
            return this.f14451c;
        }

        public g7.a b() {
            return this.f14452d;
        }

        public String c() {
            return this.f14450b;
        }

        public String getNamespace() {
            return this.f14449a;
        }

        public String toString() {
            return this.f14450b + this.f14451c + " NS(" + this.f14449a + "), FORM (" + b() + ")";
        }
    }

    public p() {
        try {
            g();
            f();
        } catch (XMPException unused) {
            throw new RuntimeException("The XMPSchemaRegistry cannot be initialized!");
        }
    }

    private void f() throws XMPException {
        g7.a l11 = new g7.a().l(true);
        g7.a k = new g7.a().k(true);
        e("http://ns.adobe.com/xap/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", l11);
        e("http://ns.adobe.com/xap/1.0/", "Authors", "http://purl.org/dc/elements/1.1/", "creator", (g7.a) null);
        e("http://ns.adobe.com/xap/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", (g7.a) null);
        e("http://ns.adobe.com/xap/1.0/", "Format", "http://purl.org/dc/elements/1.1/", "format", (g7.a) null);
        e("http://ns.adobe.com/xap/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", (g7.a) null);
        e("http://ns.adobe.com/xap/1.0/", "Locale", "http://purl.org/dc/elements/1.1/", "language", (g7.a) null);
        e("http://ns.adobe.com/xap/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", (g7.a) null);
        e("http://ns.adobe.com/xap/1.0/rights/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", (g7.a) null);
        e("http://ns.adobe.com/pdf/1.3/", "Author", "http://purl.org/dc/elements/1.1/", "creator", l11);
        e("http://ns.adobe.com/pdf/1.3/", "BaseURL", "http://ns.adobe.com/xap/1.0/", "BaseURL", (g7.a) null);
        e("http://ns.adobe.com/pdf/1.3/", "CreationDate", "http://ns.adobe.com/xap/1.0/", "CreateDate", (g7.a) null);
        e("http://ns.adobe.com/pdf/1.3/", "Creator", "http://ns.adobe.com/xap/1.0/", "CreatorTool", (g7.a) null);
        e("http://ns.adobe.com/pdf/1.3/", "ModDate", "http://ns.adobe.com/xap/1.0/", "ModifyDate", (g7.a) null);
        g7.a aVar = k;
        e("http://ns.adobe.com/pdf/1.3/", "Subject", "http://purl.org/dc/elements/1.1/", "description", aVar);
        e("http://ns.adobe.com/pdf/1.3/", "Title", "http://purl.org/dc/elements/1.1/", "title", aVar);
        e("http://ns.adobe.com/photoshop/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", l11);
        e("http://ns.adobe.com/photoshop/1.0/", StandardStructureTypes.CAPTION, "http://purl.org/dc/elements/1.1/", "description", aVar);
        e("http://ns.adobe.com/photoshop/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", aVar);
        e("http://ns.adobe.com/photoshop/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", (g7.a) null);
        e("http://ns.adobe.com/photoshop/1.0/", "Marked", "http://ns.adobe.com/xap/1.0/rights/", "Marked", (g7.a) null);
        e("http://ns.adobe.com/photoshop/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", k);
        e("http://ns.adobe.com/photoshop/1.0/", "WebStatement", "http://ns.adobe.com/xap/1.0/rights/", "WebStatement", (g7.a) null);
        e("http://ns.adobe.com/tiff/1.0/", "Artist", "http://purl.org/dc/elements/1.1/", "creator", l11);
        e("http://ns.adobe.com/tiff/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", (g7.a) null);
        e("http://ns.adobe.com/tiff/1.0/", "DateTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", (g7.a) null);
        e("http://ns.adobe.com/tiff/1.0/", "ImageDescription", "http://purl.org/dc/elements/1.1/", "description", (g7.a) null);
        e("http://ns.adobe.com/tiff/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", (g7.a) null);
        e("http://ns.adobe.com/png/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", l11);
        e("http://ns.adobe.com/png/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", k);
        e("http://ns.adobe.com/png/1.0/", "CreationTime", "http://ns.adobe.com/xap/1.0/", "CreateDate", (g7.a) null);
        e("http://ns.adobe.com/png/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", k);
        e("http://ns.adobe.com/png/1.0/", "ModificationTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", (g7.a) null);
        e("http://ns.adobe.com/png/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", (g7.a) null);
        e("http://ns.adobe.com/png/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", k);
    }

    private void g() throws XMPException {
        b("http://www.w3.org/XML/1998/namespace", "xml");
        b("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf");
        b("http://purl.org/dc/elements/1.1/", "dc");
        b("http://iptc.org/std/Iptc4xmpCore/1.0/xmlns/", "Iptc4xmpCore");
        b("http://iptc.org/std/Iptc4xmpExt/2008-02-29/", "Iptc4xmpExt");
        b("http://ns.adobe.com/DICOM/", "DICOM");
        b("http://ns.useplus.org/ldf/xmp/1.0/", "plus");
        b("adobe:ns:meta/", x.f81957i);
        b("http://ns.adobe.com/iX/1.0/", "iX");
        b("http://ns.adobe.com/xap/1.0/", "xmp");
        b("http://ns.adobe.com/xap/1.0/rights/", "xmpRights");
        b("http://ns.adobe.com/xap/1.0/mm/", "xmpMM");
        b("http://ns.adobe.com/xap/1.0/bj/", "xmpBJ");
        b("http://ns.adobe.com/xmp/note/", "xmpNote");
        b("http://ns.adobe.com/pdf/1.3/", "pdf");
        b("http://ns.adobe.com/pdfx/1.3/", "pdfx");
        b("http://www.npes.org/pdfx/ns/id/", "pdfxid");
        b("http://www.aiim.org/pdfa/ns/schema#", "pdfaSchema");
        b("http://www.aiim.org/pdfa/ns/property#", "pdfaProperty");
        b("http://www.aiim.org/pdfa/ns/type#", "pdfaType");
        b("http://www.aiim.org/pdfa/ns/field#", "pdfaField");
        b("http://www.aiim.org/pdfa/ns/id/", "pdfaid");
        b("http://www.aiim.org/pdfa/ns/extension/", "pdfaExtension");
        b("http://ns.adobe.com/photoshop/1.0/", "photoshop");
        b("http://ns.adobe.com/album/1.0/", "album");
        b("http://ns.adobe.com/exif/1.0/", "exif");
        b("http://cipa.jp/exif/1.0/", "exifEX");
        b("http://ns.adobe.com/exif/1.0/aux/", "aux");
        b("http://ns.adobe.com/tiff/1.0/", "tiff");
        b("http://ns.adobe.com/png/1.0/", "png");
        b("http://ns.adobe.com/jpeg/1.0/", "jpeg");
        b("http://ns.adobe.com/jp2k/1.0/", "jp2k");
        b("http://ns.adobe.com/camera-raw-settings/1.0/", "crs");
        b("http://ns.adobe.com/StockPhoto/1.0/", "bmsp");
        b("http://ns.adobe.com/creatorAtom/1.0/", "creatorAtom");
        b("http://ns.adobe.com/asf/1.0/", "asf");
        b("http://ns.adobe.com/xmp/wav/1.0/", "wav");
        b("http://ns.adobe.com/bwf/bext/1.0/", "bext");
        b("http://ns.adobe.com/riff/info/", "riffinfo");
        b("http://ns.adobe.com/xmp/1.0/Script/", "xmpScript");
        b("http://ns.adobe.com/TransformXMP/", "txmp");
        b("http://ns.adobe.com/swf/1.0/", "swf");
        b("http://ns.adobe.com/xmp/1.0/DynamicMedia/", "xmpDM");
        b("http://ns.adobe.com/xmp/transient/1.0/", "xmpx");
        b("http://ns.adobe.com/xap/1.0/t/", "xmpT");
        b("http://ns.adobe.com/xap/1.0/t/pg/", "xmpTPg");
        b("http://ns.adobe.com/xap/1.0/g/", "xmpG");
        b("http://ns.adobe.com/xap/1.0/g/img/", "xmpGImg");
        b("http://ns.adobe.com/xap/1.0/sType/Font#", "stFnt");
        b("http://ns.adobe.com/xap/1.0/sType/Dimensions#", "stDim");
        b("http://ns.adobe.com/xap/1.0/sType/ResourceEvent#", "stEvt");
        b("http://ns.adobe.com/xap/1.0/sType/ResourceRef#", "stRef");
        b("http://ns.adobe.com/xap/1.0/sType/Version#", "stVer");
        b("http://ns.adobe.com/xap/1.0/sType/Job#", "stJob");
        b("http://ns.adobe.com/xap/1.0/sType/ManifestItem#", "stMfs");
        b("http://ns.adobe.com/xmp/Identifier/qual/1.0/", "xmpidq");
    }

    public synchronized String a(String str) {
        return (String) this.f14445a.get(str);
    }

    public synchronized String b(String str, String str2) throws XMPException {
        e.e(str);
        e.c(str2);
        if (str2.charAt(str2.length() - 1) != ':') {
            str2 = str2 + ':';
        }
        if (h.g(str2.substring(0, str2.length() - 1))) {
            String str3 = (String) this.f14445a.get(str);
            String str4 = (String) this.f14446b.get(str2);
            if (str3 != null) {
                return str3;
            }
            if (str4 != null) {
                String str5 = str2;
                int i11 = 1;
                while (this.f14446b.containsKey(str5)) {
                    str5 = str2.substring(0, str2.length() - 1) + "_" + i11 + "_:";
                    i11++;
                }
                str2 = str5;
            }
            this.f14446b.put(str2, str);
            this.f14445a.put(str, str2);
            return str2;
        }
        throw new XMPException("The prefix is a bad XML name", 201);
    }

    public synchronized String c(String str) {
        if (str != null) {
            if (!str.endsWith(Constants.COLON_SEPARATOR)) {
                str = str + Constants.COLON_SEPARATOR;
            }
        }
        return (String) this.f14446b.get(str);
    }

    public synchronized h7.a d(String str) {
        return (h7.a) this.f14447c.get(str);
    }

    /* access modifiers changed from: package-private */
    public synchronized void e(String str, String str2, String str3, String str4, g7.a aVar) throws XMPException {
        e.e(str);
        e.d(str2);
        e.e(str3);
        e.d(str4);
        g7.a aVar2 = aVar != null ? new g7.a(n.p(aVar.m(), (Object) null).d()) : new g7.a();
        if (this.f14448d.matcher(str2).find() || this.f14448d.matcher(str4).find()) {
            throw new XMPException("Alias and actual property names must be simple", 102);
        }
        String a11 = a(str);
        String a12 = a(str3);
        if (a11 == null) {
            throw new XMPException("Alias namespace is not registered", 101);
        } else if (a12 != null) {
            String str5 = a11 + str2;
            if (!this.f14447c.containsKey(str5)) {
                if (!this.f14447c.containsKey(a12 + str4)) {
                    this.f14447c.put(str5, new a(str3, a12, str4, aVar2));
                } else {
                    throw new XMPException("Actual property is already an alias, use the base property", 4);
                }
            } else {
                throw new XMPException("Alias is already existing", 4);
            }
        } else {
            throw new XMPException("Actual namespace is not registered", 101);
        }
    }
}
