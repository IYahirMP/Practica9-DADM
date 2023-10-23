package com.itca.practica9;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    String pagina1 = "<html> " +
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
    String pagina2 =
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
    String pagina3 =
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

    String pagina4 =
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
    String pagina5 =
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
            browser.loadData(pagina1, "text/html", "UTF-8");
        else if (id == R.id.pagina2)
            browser.loadData(pagina2, "text/html", "UTF-8");
        else if (id == R.id.pagina3)
            browser.loadData(pagina3, "text/html", "UTF-8");
        else if (id == R.id.pagina4)
            browser.loadData(pagina4, "text/html", "UTF-8");
        else if (id == R.id.pagina5)
            browser.loadData(pagina5, "text/html", "UTF-8");
        else
            return super.onOptionsItemSelected(item);
        return true;
    }
}