package entities;

import java.util.Arrays;

public class StringUtil {

    public static String lpad(String s, char c, int n){
        for (int times=0; times < n; times++){
            s = c + s;
        }
        return s;
    }

    public static String rpad(String s, char c, int n){
        for(int times=0; times<n; times++){
            s = s + c;
        }
        return s;
    }

    public static String ltrim(String s){
        int tamanhoPalavra = s.length();
        char[] letrasDaPalavra = s.toCharArray();
        int qtdEspacos = 0;
        while (letrasDaPalavra[0] == ' '){
            qtdEspacos += 1;
            for(int index=0; index<(tamanhoPalavra-1); index++){
               letrasDaPalavra[index] = letrasDaPalavra[index+1];
            }
        }
        String palavraSemEspacosEsquerda = "";
        for (int index = 0; index < (tamanhoPalavra - qtdEspacos); index++) {
            palavraSemEspacosEsquerda += letrasDaPalavra[index];
        }
        return palavraSemEspacosEsquerda;
    }

    public static String rtrim(String s){
        int tamanhoPalavra = s.length();
        char[] letrasDapalavra = s.toCharArray();
        int qtdEspacos = 0;
        while (letrasDapalavra[tamanhoPalavra-1] == ' '){
            qtdEspacos += 1;
            for(int index=tamanhoPalavra-1; index>=1; index--){
                letrasDapalavra[index] = letrasDapalavra[index-1];
            }
        }
        String palavraSemEspacosDireita = "";
        for (int index = qtdEspacos; index < tamanhoPalavra; index ++){
            palavraSemEspacosDireita += letrasDapalavra[index];
        }
        return palavraSemEspacosDireita;
    }

    public static String trim(String s){
        String semEspacos = rtrim(s);
        semEspacos = ltrim(semEspacos);
        return semEspacos;
    }

    public static int indexOfN(String s, char c, int n){
        // Retorna a posição da enésima ocorrência do caractere c em s, ou -1 se s não contiver c.
        int tamanhoPalavra = s.length();
        int numeroDeOcorrencias = countMatches(s, c);
        System.out.println(numeroDeOcorrencias);
        if (numeroDeOcorrencias < n){
            n = numeroDeOcorrencias;
        }
        char[] todasLetras = s.toCharArray();
        int contadorAparicoesLetra = 1;
        for (int index=0; index < tamanhoPalavra; index ++) {
            if (todasLetras[index] == c){
                if (contadorAparicoesLetra == n){
                    return index;
                }
                contadorAparicoesLetra += 1;
            }
        }
        return -1;
    }

    public static int countMatches(String s, char c){
        char[] todasLetras = s.toCharArray();
        int contador = 0;
        for (char letra:
             todasLetras) {
            if (letra == c){
                contador += 1;
            }
        }
        return contador;
    }
}
