<html>
<head>
<title>Animal.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cc7832;}
.s1 { color: #a9b7c6;}
.s2 { color: #808080;}
.s3 { color: #6a8759;}
.s4 { color: #6897bb;}
</style>
</head>
<body bgcolor="#2b2b2b">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
Animal.java</font>
</center></td></tr></table>
<pre><span class="s0">import </span><span class="s1">java.util.Scanner</span><span class="s0">;</span>

<span class="s0">public class </span><span class="s1">Animal {</span>
    <span class="s2">//Constructor</span>
    <span class="s0">void </span><span class="s1">animal() {</span>
    <span class="s1">}</span>

    <span class="s0">void </span><span class="s1">talking() {</span>

        <span class="s2">//9. Quin tipus d’animal ets?</span>

        <span class="s0">char </span><span class="s1">animal</span><span class="s0">;</span>
        <span class="s1">Scanner lectura = </span><span class="s0">new </span><span class="s1">Scanner(System.in)</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot;Quin tipus d'animal ets?&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">animal = lectura.nextLine().charAt(</span><span class="s4">0</span><span class="s1">)</span><span class="s0">;</span>

        <span class="s0">if </span><span class="s1">(animal == </span><span class="s3">'G'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;Gos&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else if </span><span class="s1">(animal == </span><span class="s3">'M'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;Mono&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else if </span><span class="s1">(animal == </span><span class="s3">'S'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;Serp&quot;</span><span class="s1">)</span><span class="s0">;</span>

        <span class="s0">else if </span><span class="s1">(animal != </span><span class="s3">'G' </span><span class="s1">&amp;&amp; animal != </span><span class="s3">'M' </span><span class="s1">&amp;&amp; animal != </span><span class="s3">'S'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;No existeix&quot;</span><span class="s1">)</span><span class="s0">;</span>

        <span class="s2">//Assignem resultats</span>

        <span class="s0">int </span><span class="s1">r1 = </span><span class="s4">0</span><span class="s0">;</span>
        <span class="s0">int </span><span class="s1">r2</span><span class="s0">;</span>
        <span class="s0">int </span><span class="s1">r3 = </span><span class="s4">0</span><span class="s0">;</span>
        <span class="s0">int </span><span class="s1">r4</span><span class="s0">;</span>

        <span class="s0">char </span><span class="s1">unicode</span><span class="s0">;</span>
        <span class="s1">unicode = lectura.nextLine().charAt(</span><span class="s4">0</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">if </span><span class="s1">(unicode &gt; </span><span class="s3">'S'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;Serp&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else if </span><span class="s1">(unicode &lt; </span><span class="s3">'S' </span><span class="s1">&amp;&amp; unicode &gt; </span><span class="s3">'M'</span><span class="s1">)</span>
            <span class="s1">r1 = unicode - </span><span class="s3">'S'</span><span class="s0">;</span>
        <span class="s1">r2 = unicode - </span><span class="s3">'M'</span><span class="s0">;</span>
        <span class="s0">if </span><span class="s1">(r1 &lt; r2)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;Serp&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else </span><span class="s1">System.out.println(</span><span class="s3">&quot;Mono&quot;</span><span class="s1">)</span><span class="s0">;</span>

        <span class="s0">if </span><span class="s1">(unicode &gt; </span><span class="s3">'G'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;Gos&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else if </span><span class="s1">(unicode &lt; </span><span class="s3">'G' </span><span class="s1">&amp;&amp; unicode &gt; </span><span class="s3">'M'</span><span class="s1">)</span>
            <span class="s1">r3 = unicode - </span><span class="s3">'G'</span><span class="s0">;</span>
        <span class="s1">r4 = unicode - </span><span class="s3">'M'</span><span class="s0">;</span>
        <span class="s0">if </span><span class="s1">(r3 &lt; r4)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;Gos&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else </span><span class="s1">System.out.println(</span><span class="s3">&quot;Mono&quot;</span><span class="s1">)</span><span class="s0">;</span>

        <span class="s2">//10. A que t’agrada jugar?</span>

        <span class="s0">char </span><span class="s1">jugar</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot;A que t'agrada jugar?&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot; 0- Llençar Frisbee&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot; 1- Jugar a la pilota&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot; 2- Carrera de obstacles&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot; 3- Recollir Joguines&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot; 4- Buscar Menjar&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot; 5- Pilla Pilla&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot; 6- Jugar amb l'arena&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot; 7- Al parque&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot; 8- Jocs amb altres gossos&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot; 9- Trencar Joguines&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">jugar = lectura.nextLine().charAt(</span><span class="s4">0</span><span class="s1">)</span><span class="s0">;</span>

        <span class="s0">if </span><span class="s1">(jugar == </span><span class="s3">'0'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;T'agrada jugar a Llençar Frisbee&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else if </span><span class="s1">(jugar == </span><span class="s3">'1'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;T'agrada jugar a la pilota&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else if </span><span class="s1">(jugar == </span><span class="s3">'2'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;T'agrada jugar a la Carrera de obstacles&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else if </span><span class="s1">(jugar == </span><span class="s3">'3'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;T'agrada jugar a Recollir Joguines&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else if </span><span class="s1">(jugar == </span><span class="s3">'4'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;T'agrada jugar a Buscar Menjar&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else if </span><span class="s1">(jugar == </span><span class="s3">'5'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;T'agrada jugar al Pilla Pilla&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else if </span><span class="s1">(jugar == </span><span class="s3">'6'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;T'agrada jugar amb l'Arena&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else if </span><span class="s1">(jugar == </span><span class="s3">'7'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;T'agrada jugar al Parque&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else if </span><span class="s1">(jugar == </span><span class="s3">'8'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;T'agrada jugar a Jocs amb altres gossos&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else if </span><span class="s1">(jugar == </span><span class="s3">'9'</span><span class="s1">)</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;T'agrada jugar a Trencar Joguines&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">else</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;Aquest joc no existeix a la llista&quot;</span><span class="s1">)</span><span class="s0">;</span>

        <span class="s2">//11. Quin és el teu caràcter favorit?</span>

        <span class="s0">char </span><span class="s1">caracter</span><span class="s0">;</span>
        <span class="s1">System.out.println(</span><span class="s3">&quot;Quin és el teu caràcter favorit?&quot;</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s1">caracter = lectura.nextLine().charAt(</span><span class="s4">0</span><span class="s1">)</span><span class="s0">;</span>
        <span class="s0">int </span><span class="s1">r5 = caracter - </span><span class="s3">'A'</span><span class="s0">;</span>
        <span class="s0">int </span><span class="s1">r6 = r5 / </span><span class="s4">2</span><span class="s0">;</span>
        <span class="s0">int </span><span class="s1">A = </span><span class="s3">'A'</span><span class="s0">;</span>

        <span class="s2">// Sortir quan A sigui més gran que r6</span>

        <span class="s0">while </span><span class="s1">(A &lt; </span><span class="s3">'A' </span><span class="s1">+ r6) {</span>
            <span class="s1">System.out.println(A)</span><span class="s0">;</span>

            <span class="s2">//Incrementa el valor de A</span>
            <span class="s1">A++</span><span class="s0">;</span>
            <span class="s0">if </span><span class="s1">(A &gt; r6) </span><span class="s0">break;</span>

            <span class="s2">//12. Llista tots els caràcters amb valor Unicode</span>

            <span class="s0">char </span><span class="s1">uni1</span><span class="s0">;</span>
            <span class="s0">char </span><span class="s1">uni2</span><span class="s0">;</span>


            <span class="s2">//13. Juguem a fer onomatopeies?</span>

            <span class="s2">//14. Posa-li un nom:</span>

            <span class="s1">String nom</span><span class="s0">;</span>
            <span class="s1">nom = lectura.nextLine()</span><span class="s0">;</span>
            <span class="s1">System.out.println(</span><span class="s3">&quot;Gràcies m'agrada aquest nom&quot;</span><span class="s1">)</span><span class="s0">;</span>

            <span class="s2">//15. Pots recordar-me la nostra conversa?</span>

            <span class="s1">System.out.println(animal)</span><span class="s0">;</span>
            <span class="s1">System.out.println(jugar)</span><span class="s0">;</span>
            <span class="s1">System.out.println(caracter)</span><span class="s0">;</span>


        <span class="s1">}</span>
    <span class="s1">}</span>
<span class="s1">}</span>
</pre>
</body>
</html>