package application;


import entities.StringUtil;
public class TestaStringUtil {

    public static void main(String[] args) {
        String palavra = "abelha";
        char letraAdicional = 'i';
        int numeroVezes = 5;

        System.out.println(StringUtil.lpad(palavra, letraAdicional, numeroVezes));
        System.out.println(StringUtil.rpad(palavra, letraAdicional, numeroVezes));

        System.out.println(StringUtil.ltrim("            abelha"));
        System.out.println(StringUtil.rtrim("navio     "));

        System.out.println(StringUtil.trim("  testando      "));

        System.out.println(StringUtil.countMatches("abraa", 'k'));

        System.out.println(StringUtil.indexOfN("abcede", 'f', 2));
    }

}
