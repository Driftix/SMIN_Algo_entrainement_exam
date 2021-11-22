public class ListeDC {
    private Cellule head;
    private Cellule queue;
    public ListeDC(Cellule head, Cellule queue){
        this.head = head;
        this.queue = queue;
    }
    public boolean estVide(){
        return head == null && queue == null ? true:false;
    }
    public void insereTete(Cellule newhead){
        Cellule saveCell = this.head;
        saveCell.setPreviousCell(newhead);
        newhead.setNextCell(saveCell);
        this.head = newhead;
    }
    public void insereQueue(Cellule newqueue){
        Cellule saveCell = this.queue;
        saveCell.setNextCell(newqueue);
        newqueue.setPreviousCell(saveCell);
        this.queue = newqueue;
    }
    public void affiche(){
        //Deux façon peut-etre
        //Première méthode
        Cellule celluleParcours = this.head;
        while(celluleParcours.getNextCell() != null){
            System.out.println(celluleParcours.toString());
        }
        //Deuxième methode
        System.out.println(affichage(this.head));
    }
    public String affichage(Cellule head){
        if(head.getNextCell() != null){
            return affichage(head.getNextCell()) + head.toString();
        }else{
            return "";
        }
    }
    /*
    public void inserePos(int index,Cellule newCellule){
        //On peut partir de la fin en prenant total / 2 en fonction du resultat
        Cellule celluleParcours = this.head;
        for(int i = 0; i < index; i++){
            celluleParcours.getNextCell();
        }
        //On a la bonne valeur de cellule ou il faut ajouter (celluleParcours)
        //Marche surement pas parce que on perde les cellules précedentes a cause du parcours
        Cellule previousCell = celluleParcours.getPreviousCell();
        Cellule nextCell = celluleParcours.getNextCell();
        newCellule.setNextCell(nextCell);
        newCellule.setPreviousCell(previousCell);
    }*/

    public void inserePos(int index, Cellule newCellule){
        Cellule celluleParcoursNext = this.head;
        Cellule celluleParcoursPrevious = this.queue;

        for(int i = 0; i < index; i++){
            celluleParcoursNext.getNextCell();
        }
        int tailleTotale = getTotalLength();
        for(int j = tailleTotale; j > tailleTotale - index; j--){
            celluleParcoursPrevious.getPreviousCell();
        }
        newCellule.setNextCell(celluleParcoursPrevious);
        newCellule.setPreviousCell(celluleParcoursNext);
        this.head = newCellule;
    }


    public int getTotalLength(){
        Cellule celluleParcours = this.head;
        int index = 0;
        while(celluleParcours.getNextCell() != null){
            celluleParcours.getNextCell();
            index++;
        }
        return index;
    }

    public void supprimePos(int index){
        Cellule celluleParcoursNext = this.head;
        Cellule celluleParcoursPrevious = this.queue;

        for(int i = 0; i < index; i++){
            celluleParcoursNext.getNextCell();
        }
        int tailleTotale = getTotalLength();
        for(int j = tailleTotale; j > tailleTotale - index + 1 ; j--){
            celluleParcoursPrevious.getPreviousCell();
        }
        celluleParcoursNext.setNextCell(celluleParcoursPrevious);
        celluleParcoursPrevious.setPreviousCell(celluleParcoursNext);
    }
}
