public class Tableau {
    private int []tab;

    public Tableau(int []tab){
        this.tab = tab;
    }

    public String toString(){
        String tableau = "";
        for(int i : tab){
            tableau += i +",";
        }
        return tableau;
    }
    public void trie(){
        int max = 0;
        int min = 0;
        int indexmin = 0;
        int indexmax = 0;
        //Récupération du min et du max
        //faire varier tab.length
        System.out.println(tab.length/2 +1);
        for(int j = 0; j < tab.length/2  ; j++){
            //on fait varier la longueur pour ne pas prendre tout les elements du tableau a chaque fois
            for(int i = j; i < tab.length -j; i++){
                if(max < tab[i]){
                    max = tab[i];
                    indexmax = i;
                    min = max;

                }
            }
            for(int k = j; k < tab.length - j; k++){
                if (min > tab[k]) {
                    min = tab[k];
                    indexmin = k;

                }
            }
            tab[indexmax] = tab[tab.length-1-j];
            tab[indexmin] = tab[j];
            tab[j] = min;
            tab[tab.length-1-j] = max;
            indexmax = 0;
            indexmin = 0;
            max = 0;
            min = 0;
        }
    }
}
