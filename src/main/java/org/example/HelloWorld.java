package org.example;

import de.inetsoftware.jwebassembly.api.annotation.Export;
import de.inetsoftware.jwebassembly.web.dom.Document;
import de.inetsoftware.jwebassembly.web.dom.HTMLElement;
import de.inetsoftware.jwebassembly.web.dom.Text;
import de.inetsoftware.jwebassembly.web.dom.Window;

public class HelloWorld {
    @Export
    public static void main() {
        Document document = Window.document();
        HTMLElement div = document.createElement("div");
        int val = (int)(Math.random() * 100);
        Text text = document.createTextNode("Hello World, this text come from WebAssembly. wtf, r u ok? sound good"
        + (100 + 200) + 100 + "random value: " + val);
        div.appendChild( text );

        document.body().appendChild( div );
    }

    @Export
    public static int add( int a, int b ) {
        return a + b;
    }
}
