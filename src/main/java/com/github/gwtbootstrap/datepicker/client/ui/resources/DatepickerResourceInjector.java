/*
 *  Copyright 2012 GWT-Bootstrap
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.gwtbootstrap.datepicker.client.ui.resources;

import com.github.gwtbootstrap.client.ui.resources.JavaScriptInjector;
import com.github.gwtbootstrap.datepicker.client.ui.util.LocaleUtil;
import com.google.gwt.resources.client.TextResource;

/**
 * Utility class to inject our resources into modules page. Use it to inject
 * JavaScript and CSS files.
 *
 * @author Carlos Alexandro Becker
 * @since 2.0.3.0
 */
public class DatepickerResourceInjector {


    /**
     * Injects the required CSS styles and JavaScript files into the document
     * header.
     */
    public static void configure() {
        Resources r = Resources.RESOURCES;
        injectJs(r.datepickerJs());

        TextResource locale = LocaleUtil.getLocaleJsResource();
        if (locale != null) {
            JavaScriptInjector.inject(locale.getText());
        }
    }

    private static void injectJs(TextResource r) {
        JavaScriptInjector.inject(r.getText());
    }
}
