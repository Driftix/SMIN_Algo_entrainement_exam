public class Controller {
    public static void main(String [] args){
        int[] tab = {1,5,6,7,9,2,12,13,11,10,3};
        Tableau tableau = new Tableau(tab);
        tableau.trie();
        System.out.println(tableau.toString());
    }
}
