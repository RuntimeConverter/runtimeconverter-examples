package com.project.convertedCode.globalNamespace.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.modules.standard.CRArrayF;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.RuntimeStandardClass;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 google-api-php-client/src/external/URITemplateParser.php

*/

public class URI_Template_Parser extends RuntimeClassBase implements RuntimeFileContextInterface {

    public URI_Template_Parser(RuntimeEnv env, Object... args) {
        super(env, args);
        this.__construct(env, args);
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        switch (method) {
            case "expand":
                return this.expand(env, args);
            case "val_from_var":
                if (URI_Template_Parser.class.equals(caller)) {

                    return this.val_from_var(env, args);
                }
                break;
            case "match":
                return this.match(env, args);
            case "__toString":
                return this.__toString(env, args);
        }
        return super.converterRuntimeCallExtended(env, method, caller, passByReferenceArgs, args);
    }

    @Override
    public Object __get(Object key, Class caller) {
        return super.__get(key, caller);
    }

    @Override
    public boolean __isset(Object key, Class caller) {
        return super.__isset(key, caller);
    }

    @Override
    public void __set(Object key, Object value, Class caller) {
        super.__set(key, value, caller);
    }

    public static class RequestStaticProperties {

        public RequestStaticProperties(RuntimeEnv env) {}

        public Object operators =
                ZVal.newArray(
                        new ZPair(0, "+"),
                        new ZPair(1, ";"),
                        new ZPair(2, "?"),
                        new ZPair(3, "/"),
                        new ZPair(4, "."));

        public Object reserved_operators =
                ZVal.newArray(new ZPair(0, "|"), new ZPair(1, "!"), new ZPair(2, "@"));

        public Object explode_modifiers = ZVal.newArray(new ZPair(0, "+"), new ZPair(1, "*"));

        public Object partial_modifiers = ZVal.newArray(new ZPair(0, ":"), new ZPair(1, "^"));

        public Object gen_delims =
                ZVal.newArray(
                        new ZPair(0, ":"),
                        new ZPair(1, "/"),
                        new ZPair(2, "?"),
                        new ZPair(3, "#"),
                        new ZPair(4, "["),
                        new ZPair(5, "]"),
                        new ZPair(6, "@"));

        public Object gen_delims_pct =
                ZVal.newArray(
                        new ZPair(0, "%3A"),
                        new ZPair(1, "%2F"),
                        new ZPair(2, "%3F"),
                        new ZPair(3, "%23"),
                        new ZPair(4, "%5B"),
                        new ZPair(5, "%5D"),
                        new ZPair(6, "%40"));

        public Object sub_delims =
                ZVal.newArray(
                        new ZPair(0, "!"),
                        new ZPair(1, "$"),
                        new ZPair(2, "&"),
                        new ZPair(3, "'"),
                        new ZPair(4, "("),
                        new ZPair(5, ")"),
                        new ZPair(6, "*"),
                        new ZPair(7, "+"),
                        new ZPair(8, ","),
                        new ZPair(9, ";"),
                        new ZPair(10, "="));

        public Object sub_delims_pct =
                ZVal.newArray(
                        new ZPair(0, "%21"),
                        new ZPair(1, "%24"),
                        new ZPair(2, "%26"),
                        new ZPair(3, "%27"),
                        new ZPair(4, "%28"),
                        new ZPair(5, "%29"),
                        new ZPair(6, "%2A"),
                        new ZPair(7, "%2B"),
                        new ZPair(8, "%2C"),
                        new ZPair(9, "%3B"),
                        new ZPair(10, "%3D"));

        public Object reserved = null;

        public Object reserved_pct = null;
    }

    public static RequestStaticProperties getRequestStaticProperties(RuntimeEnv env) {
        RequestStaticProperties a =
                (RequestStaticProperties)
                        env.getRequestStaticProperty(
                                "com.project.convertedCode.globalNamespace.classes.URI_Template_Parser");
        if (a == null) {
            a = new RequestStaticProperties(env);
            env.setRequestStaticProperty(
                    "com.project.convertedCode.globalNamespace.classes.URI_Template_Parser", a);
        }
        return a;
    };

    protected Object __construct(RuntimeEnv env, Object... args) {
        Object template = ZVal.assignParameter(args, 0, null);
        getRequestStaticProperties(env).reserved =
                CRArrayF.array_merge.call(
                        env,
                        getRequestStaticProperties(env).gen_delims,
                        getRequestStaticProperties(env).sub_delims);
        getRequestStaticProperties(env).reserved_pct =
                CRArrayF.array_merge.call(
                        env,
                        getRequestStaticProperties(env).gen_delims_pct,
                        getRequestStaticProperties(env).sub_delims_pct);
        ZVal.setProperty(this, URI_Template_Parser.class, "template", template);

        return null;
    }

    public Object expand(RuntimeEnv env, Object... args) {
        Object data = ZVal.assignParameter(args, 0, null);
        if (ZVal.isNull(data)) {
            data = ZVal.newArray();
        }
        Object val = null;
        ReferenceContainer lm = new BasicReferenceContainer();
        Object varspec = null;
        Object var = null;
        Object part = null;
        ReferenceContainer em = new BasicReferenceContainer();
        Object i = null;
        Object expressions = ZVal.newArray();
        Object bare_expression = null;
        ReferenceContainer vm = new BasicReferenceContainer();
        Object exp = null;
        if (!ZVal.isTrue(NamespaceGlobal.is_array.call(env, data))) {
            data = ZVal.assign(data);
        }

        NamespaceGlobal.preg_match_all.call(
                env,
                new RuntimeArgsWithReferences().add(2, em),
                "/\\{([^\\}]*)\\}/",
                ZVal.getProperty(this, URI_Template_Parser.class, "template"),
                em.getObject());
        for (ZPair zpairResult4 : ZVal.getIterable(ZVal.getElement(em.getObject(), 1))) {
            i = ZVal.assign(zpairResult4.getKey());
            bare_expression = ZVal.assign(zpairResult4.getValue());
            NamespaceGlobal.preg_match.call(
                    env,
                    new RuntimeArgsWithReferences().add(2, lm),
                    "/^([\\+\\;\\?\\/\\.]{1})?(.*)$/",
                    bare_expression,
                    lm.getObject());
            exp = new RuntimeStandardClass(env);
            ZVal.setProperty(
                    exp,
                    URI_Template_Parser.class,
                    "expression",
                    ZVal.getElementRecursive(em.getObject(), 0, i));
            ZVal.setProperty(
                    exp, URI_Template_Parser.class, "operator", ZVal.getElement(lm.getObject(), 1));
            ZVal.setProperty(
                    exp,
                    URI_Template_Parser.class,
                    "variable_list",
                    ZVal.getElement(lm.getObject(), 2));
            ZVal.setProperty(
                    exp,
                    URI_Template_Parser.class,
                    "varspecs",
                    NamespaceGlobal.explode.call(
                            env,
                            ",",
                            ZVal.getProperty(exp, URI_Template_Parser.class, "variable_list")));
            ZVal.setProperty(exp, URI_Template_Parser.class, "vars", ZVal.newArray());
            for (ZPair zpairResult5 :
                    ZVal.getIterable(
                            ZVal.getProperty(exp, URI_Template_Parser.class, "varspecs"))) {
                varspec = ZVal.assign(zpairResult5.getValue());
                NamespaceGlobal.preg_match.call(
                        env,
                        new RuntimeArgsWithReferences().add(2, vm),
                        "/^([a-zA-Z0-9_]+)([\\*\\+]{1})?([\\:\\^][0-9-]+)?(\\=[^,]+)?$/",
                        varspec,
                        vm.getObject());
                var = new RuntimeStandardClass(env);
                ZVal.setProperty(
                        var, URI_Template_Parser.class, "name", ZVal.getElement(vm.getObject(), 1));
                ZVal.setProperty(
                        var,
                        URI_Template_Parser.class,
                        "modifier",
                        ZVal.toBool(ZVal.isset(ZVal.getElement(vm.getObject(), 2)))
                                        && ZVal.toBool(ZVal.getElement(vm.getObject(), 2))
                                ? ZVal.getElement(vm.getObject(), 2)
                                : ZVal.getNull());
                ZVal.setProperty(
                        var,
                        URI_Template_Parser.class,
                        "modifier",
                        ZVal.toBool(ZVal.isset(ZVal.getElement(vm.getObject(), 3)))
                                        && ZVal.toBool(ZVal.getElement(vm.getObject(), 3))
                                ? ZVal.getElement(vm.getObject(), 3)
                                : ZVal.getProperty(var, URI_Template_Parser.class, "modifier"));
                ZVal.setProperty(
                        var,
                        URI_Template_Parser.class,
                        "default",
                        ZVal.isset(ZVal.getElement(vm.getObject(), 4))
                                ? NamespaceGlobal.substr.call(
                                        env, ZVal.getElement(vm.getObject(), 4), 1)
                                : ZVal.getNull());
                ZVal.addToArray(ZVal.getProperty(exp, URI_Template_Parser.class, "vars"), var);
            }

            ZVal.setProperty(exp, URI_Template_Parser.class, "reserved", false);
            ZVal.setProperty(exp, URI_Template_Parser.class, "prefix", "");
            ZVal.setProperty(exp, URI_Template_Parser.class, "delimiter", ",");
            switch (ZVal.toString(ZVal.getProperty(exp, URI_Template_Parser.class, "operator"))) {
                case "+":
                    ZVal.setProperty(exp, URI_Template_Parser.class, "reserved", "true");
                    break;
                case ";":
                    ZVal.setProperty(exp, URI_Template_Parser.class, "prefix", ";");
                    ZVal.setProperty(exp, URI_Template_Parser.class, "delimiter", ";");
                    break;
                case "?":
                    ZVal.setProperty(exp, URI_Template_Parser.class, "prefix", "?");
                    ZVal.setProperty(exp, URI_Template_Parser.class, "delimiter", "&");
                    break;
                case "/":
                    ZVal.setProperty(exp, URI_Template_Parser.class, "prefix", "/");
                    ZVal.setProperty(exp, URI_Template_Parser.class, "delimiter", "/");
                    break;
                case ".":
                    ZVal.setProperty(exp, URI_Template_Parser.class, "prefix", ".");
                    ZVal.setProperty(exp, URI_Template_Parser.class, "delimiter", ".");
                    break;
            }
            ;
            ZVal.addToArray(expressions, exp);
        }

        ZVal.setProperty(
                this,
                URI_Template_Parser.class,
                "expansion",
                ZVal.getProperty(this, URI_Template_Parser.class, "template"));
        for (ZPair zpairResult6 : ZVal.getIterable(expressions)) {
            exp = ZVal.assign(zpairResult6.getValue());
            part = ZVal.assign(ZVal.getProperty(exp, URI_Template_Parser.class, "prefix"));
            ZVal.setProperty(exp, URI_Template_Parser.class, "one_var_defined", false);
            for (ZPair zpairResult7 :
                    ZVal.getIterable(ZVal.getProperty(exp, URI_Template_Parser.class, "vars"))) {
                var = ZVal.assign(zpairResult7.getValue());
                val = "";
                if (ZVal.toBool(ZVal.getProperty(exp, URI_Template_Parser.class, "one_var_defined"))
                        && ZVal.toBool(
                                ZVal.isset(
                                        ZVal.getElement(
                                                data,
                                                ZVal.getProperty(
                                                        var,
                                                        URI_Template_Parser.class,
                                                        "name"))))) {
                    part =
                            ZVal.toString(part)
                                    + ZVal.toString(
                                            ZVal.getProperty(
                                                    exp, URI_Template_Parser.class, "delimiter"));
                }

                if (ZVal.isset(
                        ZVal.getElement(
                                data, ZVal.getProperty(var, URI_Template_Parser.class, "name")))) {
                    ZVal.setProperty(exp, URI_Template_Parser.class, "one_var_defined", true);
                    ZVal.setProperty(
                            var,
                            URI_Template_Parser.class,
                            "data",
                            ZVal.getElement(
                                    data,
                                    ZVal.getProperty(var, URI_Template_Parser.class, "name")));
                    val = val_from_var(env, var, exp);

                } else {
                    if (ZVal.isTrue(ZVal.getProperty(var, URI_Template_Parser.class, "default"))) {
                        ZVal.setProperty(exp, URI_Template_Parser.class, "one_var_defined", true);
                        val =
                                ZVal.assign(
                                        ZVal.getProperty(
                                                var, URI_Template_Parser.class, "default"));
                    }
                }

                part = ZVal.toString(part) + ZVal.toString(val);
            }

            if (!ZVal.isTrue(ZVal.getProperty(exp, URI_Template_Parser.class, "one_var_defined"))) {
                part = "";
            }

            ZVal.setProperty(
                    this,
                    URI_Template_Parser.class,
                    "expansion",
                    NamespaceGlobal.str_replace.call(
                            env,
                            new RuntimeArgsWithReferences(),
                            ZVal.getProperty(exp, URI_Template_Parser.class, "expression"),
                            part,
                            ZVal.getProperty(this, URI_Template_Parser.class, "expansion")));
        }

        return ZVal.assign(ZVal.getProperty(this, URI_Template_Parser.class, "expansion"));
    }

    private Object val_from_var(RuntimeEnv env, Object... args) {
        Object var = ZVal.assignParameter(args, 0, null);
        Object exp = ZVal.assignParameter(args, 1, null);
        Object val = null;
        Object ev = null;
        Object v = null;
        Object ek = null;
        Object i = null;
        Object del = null;
        Object k = null;
        val = "";
        if (ZVal.isTrue(
                NamespaceGlobal.is_array.call(
                        env, ZVal.getProperty(var, URI_Template_Parser.class, "data")))) {
            i = 0;
            if (ZVal.toBool(
                            ZVal.equalityCheck(
                                    ZVal.getProperty(exp, URI_Template_Parser.class, "operator"),
                                    "?"))
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.getProperty(
                                            var, URI_Template_Parser.class, "modifier")))) {
                val =
                        ZVal.toString(val)
                                + ZVal.toString(
                                        ZVal.toString(
                                                        ZVal.getProperty(
                                                                var,
                                                                URI_Template_Parser.class,
                                                                "name"))
                                                + "=");
            }

            for (ZPair zpairResult8 :
                    ZVal.getIterable(ZVal.getProperty(var, URI_Template_Parser.class, "data"))) {
                k = ZVal.assign(zpairResult8.getKey());
                v = ZVal.assign(zpairResult8.getValue());
                del =
                        ZVal.assign(
                                ZVal.isTrue(
                                                ZVal.getProperty(
                                                        var, URI_Template_Parser.class, "modifier"))
                                        ? ZVal.getProperty(
                                                exp, URI_Template_Parser.class, "delimiter")
                                        : ",");
                ek = NamespaceGlobal.rawurlencode.call(env, k);
                ev = NamespaceGlobal.rawurlencode.call(env, v);
                if (ZVal.strictNotEqualityCheck(k, "!==", i)) {
                    if (ZVal.equalityCheck(
                            ZVal.getProperty(var, URI_Template_Parser.class, "modifier"), "+")) {
                        val =
                                ZVal.toString(val)
                                        + ZVal.toString(
                                                ZVal.toString(
                                                                ZVal.getProperty(
                                                                        var,
                                                                        URI_Template_Parser.class,
                                                                        "name"))
                                                        + ".");
                    }

                    if (ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.toBool(
                                                                    ZVal.equalityCheck(
                                                                            ZVal.getProperty(
                                                                                    exp,
                                                                                    URI_Template_Parser
                                                                                            .class,
                                                                                    "operator"),
                                                                            "?"))
                                                            && ZVal.toBool(
                                                                    ZVal.getProperty(
                                                                            var,
                                                                            URI_Template_Parser
                                                                                    .class,
                                                                            "modifier")))
                                            || ZVal.toBool(
                                                    ZVal.toBool(
                                                                    ZVal.equalityCheck(
                                                                            ZVal.getProperty(
                                                                                    exp,
                                                                                    URI_Template_Parser
                                                                                            .class,
                                                                                    "operator"),
                                                                            ";"))
                                                            && ZVal.toBool(
                                                                    ZVal.equalityCheck(
                                                                            ZVal.getProperty(
                                                                                    var,
                                                                                    URI_Template_Parser
                                                                                            .class,
                                                                                    "modifier"),
                                                                            "*"))))
                            || ZVal.toBool(
                                    ZVal.toBool(
                                                    ZVal.equalityCheck(
                                                            ZVal.getProperty(
                                                                    exp,
                                                                    URI_Template_Parser.class,
                                                                    "operator"),
                                                            ";"))
                                            && ZVal.toBool(
                                                    ZVal.equalityCheck(
                                                            ZVal.getProperty(
                                                                    var,
                                                                    URI_Template_Parser.class,
                                                                    "modifier"),
                                                            "+")))) {
                        val = ZVal.toString(val) + ZVal.toString(ZVal.toString(ek) + "=");

                    } else {
                        val =
                                ZVal.toString(val)
                                        + ZVal.toString(ZVal.toString(ek) + ZVal.toString(del));
                    }

                } else {
                    if (ZVal.equalityCheck(
                            ZVal.getProperty(var, URI_Template_Parser.class, "modifier"), "+")) {
                        if (ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.toBool(
                                                                        ZVal.equalityCheck(
                                                                                ZVal.getProperty(
                                                                                        exp,
                                                                                        URI_Template_Parser
                                                                                                .class,
                                                                                        "operator"),
                                                                                ";"))
                                                                && ZVal.toBool(
                                                                        ZVal.equalityCheck(
                                                                                ZVal.getProperty(
                                                                                        var,
                                                                                        URI_Template_Parser
                                                                                                .class,
                                                                                        "modifier"),
                                                                                "*")))
                                                || ZVal.toBool(
                                                        ZVal.toBool(
                                                                        ZVal.equalityCheck(
                                                                                ZVal.getProperty(
                                                                                        exp,
                                                                                        URI_Template_Parser
                                                                                                .class,
                                                                                        "operator"),
                                                                                ";"))
                                                                && ZVal.toBool(
                                                                        ZVal.equalityCheck(
                                                                                ZVal.getProperty(
                                                                                        var,
                                                                                        URI_Template_Parser
                                                                                                .class,
                                                                                        "modifier"),
                                                                                "+"))))
                                || ZVal.toBool(
                                        ZVal.toBool(
                                                        ZVal.equalityCheck(
                                                                ZVal.getProperty(
                                                                        exp,
                                                                        URI_Template_Parser.class,
                                                                        "operator"),
                                                                "?"))
                                                && ZVal.toBool(
                                                        ZVal.equalityCheck(
                                                                ZVal.getProperty(
                                                                        var,
                                                                        URI_Template_Parser.class,
                                                                        "modifier"),
                                                                "+")))) {
                            val =
                                    ZVal.toString(val)
                                            + ZVal.toString(
                                                    ZVal.toString(
                                                                    ZVal.getProperty(
                                                                            var,
                                                                            URI_Template_Parser
                                                                                    .class,
                                                                            "name"))
                                                            + "=");

                        } else {
                            val =
                                    ZVal.toString(val)
                                            + ZVal.toString(
                                                    ZVal.toString(
                                                                    ZVal.getProperty(
                                                                            var,
                                                                            URI_Template_Parser
                                                                                    .class,
                                                                            "name"))
                                                            + ".");
                        }
                    }
                }

                val = ZVal.toString(val) + ZVal.toString(ZVal.toString(ev) + ZVal.toString(del));
                i = ZVal.increment(i);
            }

            val = NamespaceGlobal.trim.call(env, val, del);

        } else {
            if (ZVal.equalityCheck(
                    ZVal.getProperty(exp, URI_Template_Parser.class, "operator"), "?")) {
                val =
                        ZVal.toString(ZVal.getProperty(var, URI_Template_Parser.class, "name"))
                                + ZVal.toString(
                                        ZVal.isset(
                                                        ZVal.getProperty(
                                                                var,
                                                                URI_Template_Parser.class,
                                                                "data"))
                                                ? "="
                                                : "");

            } else {
                if (ZVal.equalityCheck(
                        ZVal.getProperty(exp, URI_Template_Parser.class, "operator"), ";")) {
                    val =
                            ZVal.toString(ZVal.getProperty(var, URI_Template_Parser.class, "name"))
                                    + ZVal.toString(
                                            ZVal.isTrue(
                                                            ZVal.getProperty(
                                                                    var,
                                                                    URI_Template_Parser.class,
                                                                    "data"))
                                                    ? "="
                                                    : "");
                }
            }

            val =
                    ZVal.toString(val)
                            + ZVal.toString(
                                    NamespaceGlobal.rawurlencode.call(
                                            env,
                                            ZVal.getProperty(
                                                    var, URI_Template_Parser.class, "data")));
            if (ZVal.equalityCheck(
                    ZVal.getProperty(exp, URI_Template_Parser.class, "operator"), "+")) {
                val =
                        NamespaceGlobal.str_replace.call(
                                env,
                                new RuntimeArgsWithReferences(),
                                getRequestStaticProperties(env).reserved_pct,
                                getRequestStaticProperties(env).reserved,
                                val);
            }
        }

        return ZVal.assign(val);
    }

    public Object match(RuntimeEnv env, Object... args) {
        Object uri = ZVal.assignParameter(args, 0, null);

        return null;
    }

    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.getProperty(this, URI_Template_Parser.class, "template"));
    }

    public String ___getRuntimeFilename() {
        return "";
    }

    public String ___getRuntimeDirname() {
        return "";
    }

    public String ___getRuntimeNamespace() {
        return "";
    }
}
