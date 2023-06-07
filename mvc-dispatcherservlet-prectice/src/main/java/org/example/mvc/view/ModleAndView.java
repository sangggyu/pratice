package org.example.mvc.view;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ModleAndView {
    private Object view;
    private Map<String, Object> model = new HashMap<>();
    public ModleAndView(String viewName) {
        view = viewName;
    }

    public Map<String, Object> getModel() {
        return Collections.unmodifiableMap(model);
    }

    public String getViewName() {
        return (this.view instanceof String ? (String) this.view : null);
    }
}
