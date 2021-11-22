public class Cellule {
    private int valeur;
    private Cellule previousCell;
    private Cellule nextCell;

    public Cellule(Cellule previousCell, Cellule nextCell, int valeur){
        this.previousCell = previousCell;
        this.nextCell = nextCell;
        this.valeur = valeur;
    }

    public Cellule getPreviousCell() {
        return previousCell;
    }
    public Cellule getNextCell() {
        return nextCell;
    }

    public void setNextCell(Cellule nextCell) {
        this.nextCell = nextCell;
    }
    public void setPreviousCell(Cellule previousCell) {
        this.previousCell = previousCell;
    }
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    public String toString(){
        return "previous: " + this.previousCell + " next: " + this.nextCell;
    }

    public int getValeur() {
        return valeur;
    }
}
