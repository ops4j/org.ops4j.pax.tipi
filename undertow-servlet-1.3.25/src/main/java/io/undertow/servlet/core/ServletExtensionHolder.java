package io.undertow.servlet.core;

import java.util.ArrayList;
import java.util.List;

import io.undertow.servlet.ServletExtension;

public class ServletExtensionHolder {
    
    private static List<ServletExtension> extensions = new ArrayList<>(); 

    public void addExtension(ServletExtension servletExtension) {
        extensions.add(servletExtension);
    }
    
    public void removeExtension(ServletExtension servletExtension) {
        extensions.remove(servletExtension);
    }
    
    public static List<ServletExtension> getServletExtensions() {
        return extensions;
    }
}
