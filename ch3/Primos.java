/*Faça um algoritmo que receba um número n e mostre qual é o maior número primo abaixo de n que é obtido 
através da soma consecutiva de números primos.*/
public class Primos {
    public static void main(String args[]){
        int sum=0,limit=50000;
        int greater=0;
        for(int i=2;sum <limit;i++){
            if(checkIfPrimo(i)){
                sum+=i;
                /*é feita uma soma sequencial de todos os números primos, e após atualizar a soma,
                é conferido se o resultado é primo, se for, ele é colocado como o maior*/
                if(checkIfPrimo(sum)){
                    greater=sum;
                }
            }
        }
        System.out.println(greater);
    }
    public static boolean checkIfPrimo(int n){//conferencia de se um número n é primo
        /*i começa em 2 pois esse é o menor divisor possível para um número primo e termina em i>n/i
        pois uma divisão é uma relação bilateral, portanto se n não é divisível por x, ele também não é
        divisível por n/x*/
        for(int i=2;i<=n/i;i++){
            if(n%i==0){//se for achado um divisor, o programa retorna falso
                return false;
            }
        }
        return true;
        /*caso o loop termine e um divisor não seja achado, retorna verdadeiro indicando que é um número primo*/
    }
}
