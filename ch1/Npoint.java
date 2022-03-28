/*Dado uma palavra qualquer p, construa um algoritmo que calcule a pontuação da palavra de acordo com a 
pontuação informada na tabela*/
public class Npoint {
    public static void main(String[] args) {
        String p="desafio";
        p=p.toUpperCase();
        int count=0;
        for (int i=0;i<p.length();i++){
            count+=getVal(p.charAt(i));
        }
        System.out.println(count);
    }
    public static int getVal(char c){//função para achar o valor correspondente a uma letra c
        if(c=='K'){
            return 5;
        }
        else if(c=='J'||c=='X'){
            return 8;
        }
        else if(c=='D'||c=='G'){
            return 2;
        }
        else if(c=='Q'||c=='Z'){
            return 10;
        }
        else if(c=='B'||c=='C'||c=='M'||c=='P'){
            return 3;
        }
        else if(c=='F'||c=='H'||c=='V'||c=='W'||c=='Y'){
            return 4;
        }
        else{
            return 1;
        }
    }
}