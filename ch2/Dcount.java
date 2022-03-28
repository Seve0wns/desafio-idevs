/*Escreva um algoritmo que mostre todos os números n menores que 10.000, onde n e n + 1 possuem o mesmo número 
de divisores.*/
public class Dcount {
    public static void main(String args[]){
        int limit=10000;
        int next=0,current=1;
        for(int n=1;n<limit;n++){
            next=getDivNum(n+1);
            //se um número n e o seu próximo contém a mesma quantidade de divisores, imprime ele na tela
            if(current==next){
                System.out.println(n);
            }
            current=next;
        }
    }
    public static int getDivNum(int n){//função para contar a quantidade de divisores de um número n
        int count=2;//a contagem de divisores começa em dois pois todos os numeros são divisíveis por 1 e si mesmos
        /*i começa em 2 pois ele é o menor divisor possível de um número(excluindo 1).Da mesma forma, 
        ele termina em n/2 pois o maior divisor de um número é sua metade(excluindo ele mesmo)*/
        for(int i=2;i<=n/2;i++){
            if(n%i==0){//caso ache um divisor, incrementa o contador em 1
                count++;
            }
        }
        return count;
    }
}
