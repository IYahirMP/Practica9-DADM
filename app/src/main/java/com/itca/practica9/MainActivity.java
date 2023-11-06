package com.itca.practica9;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    int webViewId = Integer.MIN_VALUE;
    WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        browser = new WebView(this);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        Toolbar toolbar = new Toolbar(this);
        toolbar.setId(View.generateViewId());
        toolbar.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 100));
        toolbar.setBackgroundColor(Color.rgb(0,120,255));
        layout.addView(toolbar);
        setSupportActionBar(toolbar);

        layout.setLayoutParams(layoutParams);
        layout.setOrientation(LinearLayout.VERTICAL);
        browser.setLayoutParams(layoutParams);
        browser.setWebChromeClient(new WebChromeClient());
        browser.getSettings().setJavaScriptEnabled(true);
        browser.setTranslationX(0);
        browser.setTranslationY(0);
        browser.loadData("<html style=\"background-color:blue\"></html>","text/html", "UTF-8");
        layout.addView(browser);
        setContentView(layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.pagina1)
            browser.loadData(pagina1_1encoded, "text/html", "base64");
        else if (id == R.id.pagina2)
            browser.loadData(pagina1_2encoded, "text/html", "base64");
        else if (id == R.id.pagina3)
            browser.loadData(pagina1_3encoded, "text/html", "base64");
        else if (id == R.id.pagina4)
            browser.loadData(pagina1_4encoded, "text/html", "base64");
        else if (id == R.id.pagina5)
            browser.loadData(pagina1_5encoded, "text/html", "base64");
        else if (id == R.id.p2_1)
            browser.loadData(pagina2_1encoded, "text/html", "base64");
        else if (id == R.id.p2_2)
            browser.loadData(pagina2_2encoded, "text/html", "base64");
        else if (id == R.id.p2_3)
            browser.loadData(pagina2_3encoded, "text/html", "base64");
        else if (id == R.id.p4_1)
            browser.loadData(pagina4_1encoded, "text/html", "base64");
        else if (id == R.id.p4_2)
            browser.loadData(pagina4_2encoded, "text/html", "base64");
        else
            return super.onOptionsItemSelected(item);
        return true;
    }

    String pagina1_1 = "<html> " +
            "<body> " +
            "<div name=\"capa1\" id=\"capa1\" style=\"position:absolute;top:-1000;left:-1000;\"> " +
            "<b style=\"background-color:black; color:white;\"> &nbsp; &nbsp; Hola Amigo &nbsp; &nbsp; </b> " +
            "</div> " +
            "<script language=\"JavaScript\"> " +
            "var nshort = 3 ; " +
            "var n = 0 ; " +
            "var hilo ; " +
            "capa1.style.top=(screen.availHeight/4); " +
            "capa1.style.left=(screen.availWidth/4); " +
            "/*hilo = setInterval(function repite() { " +
            "n = n + 1 ; " +
            "if ( n > nshort ) { " +
            "capa1.style.top=-1000; " +
            "capa1.style.left=-1000; " +
            "clearInterval( hilo ); " +
            "} " +
            "} , 1000 ) ; */" +
            "</script> " +
            "</body> </html> " +
            "<html> " +
            "<body> " +
            "<script language=\"JavaScript\"> " +
            "var i = 0 ; " +
            "var f = 1 ; " +
            "var cad = prompt ('Escriba N:'); " +
            "var n = (cad/1); " +

            "for(i=1; i<=n; i=i+1) { " +
            "f=f * i ; " +
            "} " +

            "alert('Factorial: ' + f ) ; " +
            "</script> " +
            "</body> </html> " +
            "<html> " +
            "<body> " +
            "<script language=\"JavaScript\"> " +
            "var a = prompt ('Escriba A:'); " +
            "var b = prompt ('Escriba B:'); " +

            "alert('La Suma: ' + ( (a/1) + (b/1) ) ) ; " +
            "</script> " +
            "</body> </html>";

    //SinWebMovil
    String pagina1_2 =
            "<html> <head> <title> Dividir en una AppWeb Cliente </title> </head> " +
                    "<body> <hr> " +
                    "<form name=\"scr\" style=\"text-align:center; background-color:yellow\"> <br> " +
                    "<b> Valor de A: </b> &nbsp; <input type=\"text\" name=\"t1\"> </input> <br><br> " +
                    "<b> Valor de B: </b> &nbsp; <input type=\"text\" name=\"t2\"> </input> <br> <br> " +
                    "<input type=\"text\" name=\"res\" value=\"Resultado:\" style=\"width:100%;\"> </input> <br> <br> " +
                    "<input type=\"button\" name=\"b1\" onclick=\"calcular()\" value=\"Dividir\"> </input> <br> &nbsp; " +
                    "</form> " +
                    "<script language=\"JavaScript\"> " +
                    "function calcular () { " +
                    "scr.res.value = (\"Resultado: \" + ( scr.t1.value / scr.t2.value ) + \" \" ); " +
                    "} " +
                    "</script> " +
                    "<hr> " +
                    "</body> " +
                    "</html>";

    //ConWebMovil
    String pagina1_3 =
            "<html> <head> <title> Dividir en una AppWeb Cliente </title> " +
                    "<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\"/> </head> " +
                    "<body style=\"@media only screen and (min-device-width : 120px) and (max-device-width : 120px) { margin:0.5cm; }\"> <hr> " +
                    "<form name=\"scr\" style=\"text-align:center; background-color:yellow\"> <br> " +
                    "<b> Valor de A: </b> &nbsp; <input type=\"text\" name=\"t1\"> </input> <br><br> " +
                    "<b> Valor de B: </b> &nbsp; <input type=\"text\" name=\"t2\"> </input> <br> <br> " +
                    "<input type=\"text\" name=\"res\" value=\"Resultado:\" style=\"width:100%;\"> </input> <br> <br> " +
                    "<input type=\"button\" name=\"b1\" onclick=\"calcular()\" value=\"Dividir\"> </input> <br> &nbsp; " +
                    "</form> " +
                    "<script language=\"JavaScript\"> " +
                    "function calcular () { " +
                    "scr.res.value = (\"Resultado: \" + ( scr.t1.value / scr.t2.value ) + \" \" ); " +
                    "} " +
                    "</script> " +
                    "<hr> " +
                    "</body> " +
                    "</html>";

    String pagina1_4 =
            "<html> <body> " +
                    "<div id=\"capa1\"> &nbsp; </div> <br> " +
                    "<form name=\"f1\"> " +
                    "<input type=\"text\" name=\"t1\"> </input> " +
                    "</form> <br> " +
                    "<script language=\"JavaScript\"> " +
                    "class division { " +
                    "constructor(){ " +
                    "this.A=0.0; " +
                    "this.B=0.0; " +
                    "} " +
                    "setValores(a, b) { " +
                    "this.A=a; " +
                    "this.B=b; " +
                    "} " +
                    "getDivision() { " +
                    "var r = \"ERROR\" ; " +
                    "if (this.B == 0) { " +
                    "r = \"ERROR\" ; " +
                    "} else { " +
                    "r = (\"Div: \" + (this.A/this.B)); " +
                    "} " +
                    "return r; " +
                    "} " +
                    "} " +
                    "let d = new division() ; " +
                    "d.setValores(5, 6); " +
                    "alert( d.getDivision() ) ; " +
                    "f1.t1.value = (\"\" + d.getDivision() + \"\") ; " +
                    "capa1.innerHTML = (\"<h1> \" + d.getDivision() + \"</h1>\") ; " +
                    "</script> " +
                    "</body> </html>";

    //Herencia
    String pagina1_5 =
            "<html> <head> <title> Hola JSON </title> " +
                    "<script language=\"JavaScript\"> " +
                    "class suma { " +
                    "constructor(){ " +
                    "this.a=0; " +
                    "this.b=0; " +
                    "this.resultado=0; " +
                    "} " +
                    "get res() { " +
                    "return this.resultado; " +
                    "}" +
                    "set setA(x) { " +
                    "this.a=x; " +
                    "}" +
                    "set setB(x) { " +
                    "this.b=x; " +
                    "}" +
                    "setValores(x, y) { " +
                    "this.a=x; " +
                    "this.b=y; " +
                    "}" +
                    "mostrar () { " +
                    "this.resultado= ( (this.a/1.0) + (this.b/1.0) ) ; " +
                    "alert(\"Suma:\"+this.resultado); " +
                    "} " +
                    "} " +
                    "class operacion extends suma { " +
                    "mostrar2 () { " +
                    "this.mostrar (); " +
                    "} " +
                    "}" +
                    "let suma1 = new suma ; " +
                    "suma1.setValores(5, 6); " +
                    "suma1.mostrar(); " +
                    "let suma2 = new suma ; " +
                    "suma2.setA = 8 ; " +
                    "suma2.setB = 9 ; " +
                    "suma2.mostrar(); " +
                    "alert('Suma:' + suma2.res); " +
                    "</script> " +
                    "</head> " +
                    "<body> " +
                    "</body> " +
                    "</html>";

    String pagina2_1 = "<html> <head> <title> NumMayor en una AppWeb Cliente </title> " +
            "<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\"/> </head> " +
            "<body style=\"@media only screen and (min-device-width : 120px) " +
            "and (max-device-width : 120px) { margin:0.5cm; }\"> <hr> " +
            "<form name=\"scr\" style=\"text-align:center; background-color:pink;\"> <br> " +
            "<b> Valor de A: </b> &nbsp; <input type=\"text\" name=\"t1\"> </input> <br><br> " +
            "<b> Valor de B: </b> &nbsp; <input type=\"text\" name=\"t2\"> </input> <br> <br> " +
            "<input type=\"text\" readonly name=\"res\" value=\"Resultado:\" style=\"width:100%;\"> </input> <br> <br> " +
            "<input type=\"button\" name=\"b1\" onclick=\"mostrar()\" value=\"Aceptar\"> </input> <br> &nbsp; " +
            "</form> " +
            "<script language=\"JavaScript\"> " +
            "function mostrar() { " +
            "var RES = \"Error\" ; " +
            "var a = scr.t1.value / 1.0 ; " +
            "var b = scr.t2.value / 1.0 ; " +
            "if(a>b) { " +
            "RES=\"A es mayor\"; " +
            "} " +
            "if(a<b) { " +
            "RES=\"B es mayor\"; " +
            "} " +
            "if(a==b) { " +
            "RES=\"A y B son iguales\"; " +
            "} " +
            "scr.res.value = (\"Resultado: \" + ( RES ) + \" \" ); " +
            "} " +
            "</script> " +
            "<hr> <br> " +
            "<form name=\"f2\" style=\"text-align:center;; background-color:silver;\"> " +
            "<hr> " +
            "<select name=\"r1\"> " +
            "<option name=\"r1\" value=\"white\"> Blanco </option> " +
            "<option selected name=\"r1\" value=\"black\"> Negro </option> " +
            "<option name=\"r1\" value=\"red\"> Rojo </option> " +
            "</select> " +
            "<hr> " +
            "<input type=\"button\" name=\"b1\" onclick=\"scr.style.backgroundColor=f2.r1.value; " +
            "alert('0k: ' + f2.r1.value);\" value=\"Configurar\"> </input> " +
            "<br> &nbsp; " +
            "</form> " +
            "<br> " +
            "<hr> " +
            "</body> </html>";

    String pagina2_2 = "<html> <head> <title> NumMayor en una AppWeb Cliente </title> " +
            "<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\"/> </head> " +
            "<body style=\"@media only screen and (min-device-width : 120px) " +
            "and (max-device-width : 120px) { margin:0.5cm; }\"> <hr> " +
            "<form name=\"scr\" style=\"text-align:center;; background-color:pink;\"> <br> " +
            "<b> Valor de A: </b> &nbsp; <input type=\"text\" name=\"t1\"> </input> <br><br> " +
            "<b> Valor de B: </b> &nbsp; <input type=\"text\" name=\"t2\"> </input> <br> <br> " +
            "<input type=\"text\" readonly name=\"res\" value=\"Resultado:\" style=\"width:100%;\"> </input> <br> <br> " +
            "<input type=\"button\" name=\"b1\" onclick=\"mostrar()\" value=\"Aceptar\"> </input> <br> &nbsp; " +
            "</form> " +
            "<script language=\"JavaScript\"> " +
            "function mostrar() { " +
            "var RES = \"Error\" ; " +
            "var a = scr.t1.value / 1.0 ; " +
            "var b = scr.t2.value / 1.0 ; " +
            "if(a>b) { " +
            "RES=\"A es mayor\"; " +
            "} " +
            "if(a<b) { " +
            "RES=\"B es mayor\"; " +
            "} " +
            "if(a==b) { " +
            "RES=\"A y B son iguales\"; " +
            "} " +
            "scr.res.value = (\"Resultado: \" + ( RES ) + \" \" ); " +
            "} " +
            "</script> " +
            "<hr> <br> " +
            "<form name=\"f2\" style=\"text-align:center;; background-color:silver;\"> " +
            "<hr> " +
            "<input type=\"radio\" checked name=\"r1\" value=\"white\"> Blanco </input> " +
            "<input type=\"radio\" name=\"r1\" value=\"black\"> Negro </input> " +
            "<input type=\"radio\" name=\"r1\" value=\"red\"> Rojo </input> " +
            "<hr> <br> " +
            "<input type=\"button\" name=\"b1\" " +
            "onclick=\"scr.style.backgroundColor=f2.r1.value; if(f2.r1[1].checked) { alert('Negro'); }\" " +
            "value=\"Configurar\"> </input> " +
            "<br> &nbsp; " +
            "</form> " +
            "<br> " +
            "<hr> " +
            "</body> </html>";

    String pagina2_3 = "<html>\n" +
            "    <head>\n" +
            "        <style type=\"text/css\"> body { } form { background-color:yellow; width:200px; height:200px; } </style>\n" +
            "    </head>\n" +
            "    <body>\n" +
            "        <br> <br> <button onclick=\"saludo();\" style=\"background-color:#aaffaa;\"> Aceptar </button> <br> <button onclick=\"f1.style.top=100;f1.style.left=100;\" style=\"background-color:#aaffaa;\"> Mostrar Ventana </button> <br> <script> function operacion() { f1.a1.value=f1.a1.value+'\\nDivision: ' + (f1.t1.value/f1.t2.value) + ''; if(f1.ch1.checked){ f1.a1.value=f1.a1.value+'\\nResta: ' + (f1.t1.value - f1.t2.value) + ''; } } </script> \n" +
            "        <form name=\"f1\" id=\"f1\" style=\"background-color:pink; border:double; width:300px; height:250px; position:absolute; left:150px; top:100px; \">\n" +
            "            <i style=\"width:300px; background-color:blue;color:white;\" onclick=\"f1.style.top=-10000;f1.style.left=-10000;\" > Cerrar &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</i> \n" +
            "            <hr>\n" +
            "            <b> X: </b> <input type=\"text\" name=\"t1\"> </input> <br> <b> Y: </b> <input type=\"text\" name=\"t2\"> </input> <br><br><input type=\"checkbox\" name=\"ch1\"> Calcular Resta Y Divisi&oacute;n</input> <br><input type=\"checkbox\" name=\"ch2\"> Saludar</input> <br> \n" +
            "            <textarea name=\"a1\" style=\"background-color:#ddffff; border: double ; width:100px;height:50px;\"> &nbsp </textarea>\n" +
            "            <br><br>&nbsp;<input type=\"button\" value=\" Aceptar \" style=\"background-color:#aaffaa;\" onclick=\"operacion();\"> </input> <br> &nbsp; <br> &nbsp; <br> &nbsp; \n" +
            "        </form>\n" +
            "        <br> \n" +
            "        <form name=\"f2\" style=\"text-align:center; background-color:silver\">\n" +
            "            <hr>\n" +
            "            <br> &nbsp; <input type=\"radio\" name=\"r1\" value=\"white\"> Blanco </input> <br> <input type=\"radio\" checked name=\"r1\" value=\"black\"> Negro </input> <br> <input type=\"radio\" name=\"r1\" value=\"red\"> Rojo </input> <br> &nbsp; <br> <input type=\"button\" value=\"Aceptar\" onclick=\"f1.style.backgroundColor=f2.r1.value; if (f2.r1[1].checked) { alert(''+f2.r1[1].value); } \" > </input> <br> &nbsp; <br> &nbsp; <br> &nbsp; <br> &nbsp; <br> &nbsp; \n" +
            "        </form>\n" +
            "        <script> function saludo() { if(f1.ch2.checked){alert('Buenos Dias');} } </script> \n" +
            "        <form name=\"f3\" style=\"text-align:center; background-color:#ddddff\">\n" +
            "            <hr>\n" +
            "            <br> Elegir el color: &nbsp; \n" +
            "            <select name=\"combo1\">\n" +
            "                <option name=\"combo1\" value=\"white\"> Blanco </option>\n" +
            "                <option name=\"combo1\" selected value=\"black\"> Negro </option>\n" +
            "                <option name=\"combo1\" value=\"red\"> Rojo </option>\n" +
            "                <option name=\"combo1\" value=\"#aaffff\"> Cyan </option>\n" +
            "            </select>\n" +
            "            <br> &nbsp; <br> <input type=\"button\" value=\"Cambiar\" onclick=\"f1.style.backgroundColor=f3.combo1.value; alert(''+f3.combo1.value);\"> </input> <br> &nbsp; <br> &nbsp; <br> &nbsp; <br> &nbsp; \n" +
            "        </form>\n" +
            "    </body>\n" +
            "</html>";

    String pagina4_1 = "<html>\n" +
            "    <body>\n" +
            "        <center>\n" +
            "            <form name=\"f1\">\n" +
            "                <br>\n" +
            "                <br>\n" +
            "                <select name=\"s1\">\n" +
            "                    <option name=\"s1\" value=\"pink\"> Rosita </option>\n" +
            "                    <option name=\"s1\" value=\"yellow\"> Amarillo </option>\n" +
            "                    <option name=\"s1\" value=\"red\"> Rojo </option>\n" +
            "                    <option name=\"s1\" value=\"purple\"> P&uacute;rpura </option>\n" +
            "                    <option name=\"s1\" value=\"cyan\"> Cyan </option>\n" +
            "                </select>\n" +
            "                <br>\n" +
            "                <br>\n" +
            "                <input type=\"button\" onclick=\"cambiar();\" value=\"Cambiar Color\"> </input>\n" +
            "                <br>\n" +
            "                <br>\n" +
            "            </form>\n" +
            "            <script language=\"JavaScript\">\n" +
            "                function cambiar() {\n" +
            "                    f1.style.background = \"\" + f1.s1.value + \"\" ;\n" +
            "                }\n" +
            "            </script>\n" +
            "        </center>\n" +
            "    </body> \n" +
            "</html>";
    String pagina4_2 = "<html>\n" +
            "   <head>\n" +
            "      <title> Manejo de Controles Web </title>\n" +
            "      <script language=\"JavaScript\">\n" +
            "         function verificar() {\n" +
            "            var opcion = 0;\n" +
            "            var opcion2 = 0;\n" +
            "            for (var i = 0; i < f2.r1.length; i = i + 1) {\n" +
            "                if (f2.r1[i].checked) {\n" +
            "                    opcion = i;\n" +
            "                    break;\n" +
            "                }\n" +
            "            }\n" +
            "            for (var i = 0; i < f2.r2.length; i = i + 1) {\n" +
            "                if (f2.r2[i].checked) {\n" +
            "                    opcion2 = i;\n" +
            "                    break;\n" +
            "                }\n" +
            "            }\n" +
            "            if (f2.ch3.checked) {\n" +
            "                t1.style.textDecoration = \"underline\";\n" +
            "            } else {\n" +
            "                t1.style.textDecoration = \"none\";\n" +
            "            }\n" +
            "            if (f2.ch2.checked) {\n" +
            "                t1.style.fontStyle = \"italic\";\n" +
            "            } else {\n" +
            "                t1.style.fontStyle = \"normal\";\n" +
            "            }\n" +
            "            if (f2.ch1.checked) {\n" +
            "                t1.style.fontWeight = \"bold\";\n" +
            "            } else {\n" +
            "                t1.style.fontWeight = \"normal\";\n" +
            "            }\n" +
            "            t1.style.color = f2.r1[opcion].value;\n" +
            "            t1.style.background = f2.r2[opcion2].value;\n" +
            "         }\n" +
            "      </script> \n" +
            "   </head>\n" +
            "   <body>\n" +
            "      <div style=\"position:absolute;left:300;top:50;\">\n" +
            "         <form name=\"f2\" style=\"width:380; background-color:#ffff99;\">\n" +
            "            <center>\n" +
            "               <br> \n" +
            "               <p id=\"t1\" style=\"font:plain;\"> Texto </p>\n" +
            "               <br>\n" +
            "               <br> \n" +
            "               <fieldset style=\"width:300;\">\n" +
            "                  <legend> &nbsp; &nbsp; Estilo De Letra &nbsp; &nbsp; </legend>\n" +
            "                  &nbsp; &nbsp; <input type=\"checkbox\" name=\"ch1\"> Negrita </input>\n" +
            "                  &nbsp; &nbsp; <input type=\"checkbox\" name=\"ch2\"> Cursiva </input>\n" +
            "                  &nbsp; &nbsp; <input type=\"checkbox\" name=\"ch3\"> Subrayado </input>\n" +
            "               </fieldset>\n" +
            "               <br>\n" +
            "               <br> \n" +
            "               <fieldset style=\"width:300;\">\n" +
            "                  <legend> &nbsp; &nbsp; Color De Letra &nbsp; &nbsp; </legend>\n" +
            "                  &nbsp; &nbsp; <input type=\"radio\" name=\"r1\" value=\"black\" checked> Negro </input>\n" +
            "                  &nbsp; &nbsp; <input type=\"radio\" name=\"r1\" value=\"blue\"> Azul </input>\n" +
            "                  &nbsp; &nbsp; <input type=\"radio\" name=\"r1\" value=\"red\"> Rojo </input>\n" +
            "                  <br> &nbsp; &nbsp; <input type=\"radio\" name=\"r1\" value=\"white\"> Blanco </input>\n" +
            "                  &nbsp; &nbsp; <input type=\"radio\" name=\"r1\" value=\"green\"> Verde </input>\n" +
            "                  &nbsp; &nbsp; <input type=\"radio\" name=\"r1\" value=\"yellow\"> Amarillo </input>\n" +
            "                  &nbsp; &nbsp; <input type=\"radio\" name=\"r1\" value=\"purple\"> Morado </input>\n" +
            "                  &nbsp; &nbsp; <input type=\"radio\" name=\"r1\" value=\"cyan\"> Cyan </input>\n" +
            "               </fieldset>\n" +
            "               <br>\n" +
            "               <br> \n" +
            "               <fieldset style=\"width:300;\">\n" +
            "                  <legend> &nbsp; &nbsp; Color De Fondo &nbsp; &nbsp; </legend>\n" +
            "                  <br> <input type=\"radio\" name=\"r2\" value=\"white\" checked> Blanco </input>\n" +
            "                  <input type=\"radio\" name=\"r2\" value=\"black\"> Negro </input>\n" +
            "                  <input type=\"radio\" name=\"r2\" value=\"pink\"> Rosa </input>\n" +
            "                  <input type=\"radio\" name=\"r2\" value=\"purple\"> Morado </input>\n" +
            "                  <input type=\"radio\" name=\"r2\" value=\"cyan\"> Cyan </input>\n" +
            "               </fieldset>\n" +
            "               <br> <br> <input type=\"button\" value=\"Aceptar\" onclick=\"verificar();\"> </input>\n" +
            "            </center>\n" +
            "         </form>\n" +
            "      </div>\n" +
            "   </body>\n" +
            "</html>";


    String pagina1_1encoded = Base64.encodeToString(pagina1_1.getBytes(), Base64.NO_PADDING);
    String pagina1_2encoded = Base64.encodeToString(pagina1_2.getBytes(), Base64.NO_PADDING);
    String pagina1_3encoded = Base64.encodeToString(pagina1_3.getBytes(), Base64.NO_PADDING);
    String pagina1_4encoded = Base64.encodeToString(pagina1_4.getBytes(), Base64.NO_PADDING);
    String pagina1_5encoded = Base64.encodeToString(pagina1_5.getBytes(), Base64.NO_PADDING);
    String pagina2_1encoded = Base64.encodeToString(pagina2_1.getBytes(), Base64.NO_PADDING);
    String pagina2_2encoded = Base64.encodeToString(pagina2_2.getBytes(), Base64.NO_PADDING);
    String pagina2_3encoded = Base64.encodeToString(pagina2_3.getBytes(), Base64.NO_PADDING);
    String pagina4_1encoded = Base64.encodeToString(pagina4_1.getBytes(), Base64.NO_PADDING);
    String pagina4_2encoded = Base64.encodeToString(pagina4_2.getBytes(), Base64.NO_PADDING);
}