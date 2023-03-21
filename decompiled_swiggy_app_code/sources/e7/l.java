package e7;

import com.adobe.xmp.XMPException;
import d7.c;
import g7.d;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f14431a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static DocumentBuilderFactory f14432b = a();

    private static DocumentBuilderFactory a() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.setIgnoringComments(true);
        try {
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            newInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xerces.apache.org/xerces2-j/features.html#disallow-doctype-decl", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            newInstance.setFeature("http://xerces.apache.org/xerces2-j/features.html#external-parameter-entities", false);
            newInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            newInstance.setXIncludeAware(false);
            newInstance.setExpandEntityReferences(false);
        } catch (Exception unused) {
        }
        return newInstance;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object[] b(org.w3c.dom.Node r7, boolean r8, java.lang.Object[] r9) {
        /*
            org.w3c.dom.NodeList r7 = r7.getChildNodes()
            r0 = 0
            r1 = 0
        L_0x0006:
            int r2 = r7.getLength()
            if (r1 >= r2) goto L_0x0089
            org.w3c.dom.Node r2 = r7.item(r1)
            short r3 = r2.getNodeType()
            r4 = 7
            if (r4 != r3) goto L_0x0030
            r3 = r2
            org.w3c.dom.ProcessingInstruction r3 = (org.w3c.dom.ProcessingInstruction) r3
            java.lang.String r5 = r3.getTarget()
            java.lang.String r6 = "xpacket"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0030
            if (r9 == 0) goto L_0x0085
            r2 = 2
            java.lang.String r3 = r3.getData()
            r9[r2] = r3
            goto L_0x0085
        L_0x0030:
            r3 = 3
            short r5 = r2.getNodeType()
            if (r3 == r5) goto L_0x0085
            short r3 = r2.getNodeType()
            if (r4 == r3) goto L_0x0085
            java.lang.String r3 = r2.getNamespaceURI()
            java.lang.String r4 = r2.getLocalName()
            java.lang.String r5 = "xmpmeta"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = "xapmeta"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0062
        L_0x0055:
            java.lang.String r5 = "adobe:ns:meta/"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0062
            java.lang.Object[] r7 = b(r2, r0, r9)
            return r7
        L_0x0062:
            if (r8 != 0) goto L_0x007e
            java.lang.String r5 = "RDF"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x007e
            java.lang.String r4 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x007e
            if (r9 == 0) goto L_0x007d
            r9[r0] = r2
            java.lang.Object r7 = f14431a
            r8 = 1
            r9[r8] = r7
        L_0x007d:
            return r9
        L_0x007e:
            java.lang.Object[] r2 = b(r2, r8, r9)
            if (r2 == 0) goto L_0x0085
            return r2
        L_0x0085:
            int r1 = r1 + 1
            goto L_0x0006
        L_0x0089:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.l.b(org.w3c.dom.Node, boolean, java.lang.Object[]):java.lang.Object[]");
    }

    public static c c(Object obj, d dVar) throws XMPException {
        e.b(obj);
        if (dVar == null) {
            dVar = new d();
        }
        Object[] b11 = b(e(obj, dVar), dVar.l(), new Object[3]);
        if (b11 == null || b11[1] != f14431a) {
            return new k();
        }
        k i11 = f.i((Node) b11[0]);
        i11.c((String) b11[2]);
        return !dVar.k() ? o.h(i11, dVar) : i11;
    }

    private static Document d(InputSource inputSource) throws XMPException {
        try {
            DocumentBuilder newDocumentBuilder = f14432b.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler((ErrorHandler) null);
            return newDocumentBuilder.parse(inputSource);
        } catch (SAXException e11) {
            throw new XMPException("XML parsing failure", 201, e11);
        } catch (ParserConfigurationException e12) {
            throw new XMPException("XML Parser not correctly configured", 0, e12);
        } catch (IOException e13) {
            throw new XMPException("Error reading the XML-file", 204, e13);
        }
    }

    private static Document e(Object obj, d dVar) throws XMPException {
        return obj instanceof InputStream ? g((InputStream) obj, dVar) : obj instanceof byte[] ? f(new a((byte[]) obj), dVar) : h((String) obj, dVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(2:4|5)|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.w3c.dom.Document f(e7.a r4, g7.d r5) throws com.adobe.xmp.XMPException {
        /*
            org.xml.sax.InputSource r0 = new org.xml.sax.InputSource
            java.io.InputStream r1 = r4.f()
            r0.<init>(r1)
            boolean r1 = r5.i()     // Catch:{ XMPException -> 0x001c }
            if (r1 == 0) goto L_0x0017
            javax.xml.parsers.DocumentBuilderFactory r1 = f14432b     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = "http://apache.org/xml/features/disallow-doctype-decl"
            r3 = 1
            r1.setFeature(r2, r3)     // Catch:{ all -> 0x0017 }
        L_0x0017:
            org.w3c.dom.Document r4 = d(r0)     // Catch:{ XMPException -> 0x001c }
            return r4
        L_0x001c:
            r0 = move-exception
            int r1 = r0.a()
            r2 = 201(0xc9, float:2.82E-43)
            if (r1 == r2) goto L_0x002f
            int r1 = r0.a()
            r2 = 204(0xcc, float:2.86E-43)
            if (r1 != r2) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            throw r0
        L_0x002f:
            boolean r1 = r5.h()
            if (r1 == 0) goto L_0x0039
            e7.a r4 = e7.d.a(r4)
        L_0x0039:
            boolean r5 = r5.j()
            if (r5 == 0) goto L_0x0065
            java.lang.String r5 = r4.g()     // Catch:{ UnsupportedEncodingException -> 0x005b }
            e7.b r1 = new e7.b     // Catch:{ UnsupportedEncodingException -> 0x005b }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ UnsupportedEncodingException -> 0x005b }
            java.io.InputStream r4 = r4.f()     // Catch:{ UnsupportedEncodingException -> 0x005b }
            r2.<init>(r4, r5)     // Catch:{ UnsupportedEncodingException -> 0x005b }
            r1.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x005b }
            org.xml.sax.InputSource r4 = new org.xml.sax.InputSource     // Catch:{ UnsupportedEncodingException -> 0x005b }
            r4.<init>(r1)     // Catch:{ UnsupportedEncodingException -> 0x005b }
            org.w3c.dom.Document r4 = d(r4)     // Catch:{ UnsupportedEncodingException -> 0x005b }
            return r4
        L_0x005b:
            com.adobe.xmp.XMPException r4 = new com.adobe.xmp.XMPException
            r5 = 9
            java.lang.String r1 = "Unsupported Encoding"
            r4.<init>(r1, r5, r0)
            throw r4
        L_0x0065:
            org.xml.sax.InputSource r5 = new org.xml.sax.InputSource
            java.io.InputStream r4 = r4.f()
            r5.<init>(r4)
            org.w3c.dom.Document r4 = d(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.l.f(e7.a, g7.d):org.w3c.dom.Document");
    }

    private static Document g(InputStream inputStream, d dVar) throws XMPException {
        if (!dVar.h() && !dVar.j()) {
            return d(new InputSource(inputStream));
        }
        try {
            return f(new a(inputStream), dVar);
        } catch (IOException e11) {
            throw new XMPException("Error reading the XML-file", 204, e11);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|(2:4|5)|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.w3c.dom.Document h(java.lang.String r3, g7.d r4) throws com.adobe.xmp.XMPException {
        /*
            org.xml.sax.InputSource r0 = new org.xml.sax.InputSource
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r3)
            r0.<init>(r1)
            boolean r0 = r4.i()     // Catch:{ XMPException -> 0x0027 }
            if (r0 == 0) goto L_0x0018
            javax.xml.parsers.DocumentBuilderFactory r0 = f14432b     // Catch:{ all -> 0x0018 }
            java.lang.String r1 = "http://apache.org/xml/features/disallow-doctype-decl"
            r2 = 1
            r0.setFeature(r1, r2)     // Catch:{ all -> 0x0018 }
        L_0x0018:
            org.xml.sax.InputSource r0 = new org.xml.sax.InputSource     // Catch:{ XMPException -> 0x0027 }
            java.io.StringReader r1 = new java.io.StringReader     // Catch:{ XMPException -> 0x0027 }
            r1.<init>(r3)     // Catch:{ XMPException -> 0x0027 }
            r0.<init>(r1)     // Catch:{ XMPException -> 0x0027 }
            org.w3c.dom.Document r3 = d(r0)     // Catch:{ XMPException -> 0x0027 }
            return r3
        L_0x0027:
            r0 = move-exception
            int r1 = r0.a()
            r2 = 201(0xc9, float:2.82E-43)
            if (r1 != r2) goto L_0x004a
            boolean r4 = r4.j()
            if (r4 == 0) goto L_0x004a
            org.xml.sax.InputSource r4 = new org.xml.sax.InputSource
            e7.b r0 = new e7.b
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r3)
            r0.<init>(r1)
            r4.<init>(r0)
            org.w3c.dom.Document r3 = d(r4)
            return r3
        L_0x004a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.l.h(java.lang.String, g7.d):org.w3c.dom.Document");
    }
}
