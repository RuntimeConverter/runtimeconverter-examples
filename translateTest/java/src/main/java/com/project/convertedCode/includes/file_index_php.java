package com.project.convertedCode.includes;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeFileContextInterface;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 index.php

*/

public class file_index_php implements RuntimeIncludable, RuntimeFileContextInterface {

    public static final file_index_php instance = new file_index_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope58 scope = new Scope58();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope58 scope)
            throws IncludeEventException {
        env.echo("<html>\n<head>\n<title>");
        env.echo(NamespaceGlobal.htmlspecialchars.call(env, "Russian <--> English"));
        env.echo(
                "</title>\n<link rel=\"shortcut icon\" href=\"1415865048_36643.ico\" />\n<script src=\"//code.jquery.com/jquery-1.11.0.min.js\"></script>\n<script type=\"text/JavaScript\">\n\n\n//setup before functions\nvar typingTimer;                //timer identifier\nvar doneTypingInterval = 1000;  //time in ms, 5 second for example\nvar lastText = '';\n\n$(document).ready(function(){\n\t//on keyup, start the countdown\n\t$('#myInput').keyup(function(){\n\t    clearTimeout(typingTimer);\n\t    var interval = doneTypingInterval;\n\t\tvar text = $('#myInput').val();\n\t    if (text.indexOf(' ') == -1)\n\t    {\n\t\t\tinterval += 0;\n\t    }\n\t    typingTimer = setTimeout(doneTyping, interval);\n\t});\n\t\n\t//on keydown, clear the countdown \n\t$('#myInput').keydown(function(){\n\t    clearTimeout(typingTimer);\n\t});\n\n\t$('#myInput').on('change',function(){\n\t    clearTimeout(typingTimer);\n\t\tvar text = $('#myInput').val();\n\t\tif (text == lastText)\n\t\t{\n\t\t\treturn true;\n\t\t}\n\t    doneTyping();\n\t});\n});\n\n//user is \"finished typing,\" do something\nfunction doneTyping () {\n    var data = {};\n    data.text = $('#myInput').val();\n    lastText = data.text;\n    $.post('translate.php',data,function(json){\n\t\tvar en = json.en; var ru = json.ru;\n\t\tvar text = en + '<br /><br />' + ru;\n\t\t$('#result').html(text);\n\t    if (ru && ru.indexOf(' ') == -1)\n\t    {\n\t    \t$('#dictionary').show();\n\t    \tif (en != data.text)\n\t    \t{\n\t\t    \t//$('.english').show();\n\t\t\t\t//$('.english-translation').html(en);\n\t    \t} else {\n\t\t    \t$('.english').hide();\n\t    \t}\n\t    \tvar url = 'http://en.wiktionary.org/wiki/'+encodeURI(ru.trim())+'#Declension';\n\t    \t$('iframe.en').attr('src',url);\n\t    \tvar url = 'http://ru.wiktionary.org/wiki/'+encodeURI(ru.trim())+'#.D0.9C.D0.BE.D1.80.D1.84.D0.BE.D0.BB.D0.BE.D0.B3.D0.B8.D1.87.D0.B5.D1.81.D0.BA.D0.B8.D0.B5_.D0.B8_.D1.81.D0.B8.D0.BD.D1.82.D0.B0.D0.BA.D1.81.D0.B8.D1.87.D0.B5.D1.81.D0.BA.D0.B8.D0.B5_.D1.81.D0.B2.D0.BE.D0.B9.D1.81.D1.82.D0.B2.D0.B0';\n\t    \t$('iframe.ru').attr('src',url);\n\t    \tsetTimeout(function(){\n\t\t    \t//var scrollHeight = $(\"iframe.en\").offset().top;\n\t    \t\t//$('body').animate({scrollTop:scrollHeight},1500);\n\t    \t},50);\n    \t\tvar interval = setInterval(function(){\n        \t\t$('body').scrollTop();\n    \t\t},10);\n    \t\tsetTimeout(function(){\n\t\t\t\tclearInterval(interval);\n    \t\t});\n\t    } else {\n\t\t\t$('#dictionary').hide();\n\t    }\n    },'json');\n}\n\nfunction refocus()\n{\n\t$('body').animate({scrollTop:0},1500,function(){\n\t\t$('#myInput').focus();\n\t});\n\t\n}\n\n</script>\n</head>\n<body>\n<h3>Translate</h3>\n<textarea id=\"myInput\" style=\"width:75%;height:100px;\"></textarea>\n<h3>Translation</h3>\n<div id=\"result\">n/a</div>\n\n<div id=\"dictionary\" style=\"display:none;width:100%\" onclick=\"refocus()\">\n\t<h3 style=\"display:none\">Wiki Dictionary</h3>\n\t<iframe class=\"en\" style=\"width:75%;height:300px;display:none\"></iframe>\n\t<div class=\"english\" style=\"display:none\">\n\t<h3 style=\"display:none\">English Translation</h3>\n\t<p class=\"english-translation\"></p>\n\t</div>\n\t<h3>Russian Wiki Dictionary</h3>\n\t<iframe class=\"ru\" style=\"width:75%;height:300px;\"></iframe>\n</div>\n</body>\n</html>");
    }

    @Override
    public String ___getRuntimeDirname() {
        return "/";
    }

    @Override
    public String ___getRuntimeFilename() {
        return "/index.php";
    }

    @Override
    public String ___getRuntimeNamespace() {
        return "";
    }

    private static class Scope58 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
