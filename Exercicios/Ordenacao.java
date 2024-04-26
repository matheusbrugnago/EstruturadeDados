public class Ordenacao {
    public static void main(String[] args) {
        int meuVetor[]={1,5,7,56,8,61,52,29,45,21,4,9,51,6};
        System.out.print("Iniciando...");
        for (int i = 0; i < meuVetor.length; i++) {
            System.out.print(meuVetor[i]+" ");
        }
        Ordenacao.quickSort(meuVetor);
        System.out.print("\nApós o processamento...");
        for (int i = 0; i < meuVetor.length; i++) {
            System.out.print(meuVetor[i]+" ");
        }
    }
    public static void selectionSort(int[] vetor){
        for (int i = 0; i < (vetor.length-1); i++) {
            int MenorValor=vetor[i];
            for (int j = i; j < (vetor.length); j++) {
                if (vetor[j]<MenorValor){
                    MenorValor=vetor[j];
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
    }
    public static void quickSort(int[] vetor){
        int n = vetor.length;
        quickSortRec(vetor,0,n-1); //avalie esse vetor da posição 0 até n-1
    }
    private static int particionar(int[] vetor,int a,int b){
        int pivo=vetor[a]; //pivo fixado na posição 0
        while (a<b){
            while(vetor[a]<pivo){
                a=a+1;
            }
            while(vetor[b]>pivo){
                b=b-1;
            }
            int temp=vetor[a];
            vetor[a]=vetor[b];
            vetor[b]=temp;
        }
        return a;
    }
    private static void quickSortRec(int[] vetor,int a,int b){
        if(a>=b){
            return; //condição de parada
        }
        int pivo = particionar(vetor,a,b); //descobrir a posição certa de um pivô //divisão e conquista
        quickSortRec(vetor,a,pivo-1); //esquerda do pivô
        quickSortRec(vetor, pivo+1, b); //direita do pivô
    }
}
