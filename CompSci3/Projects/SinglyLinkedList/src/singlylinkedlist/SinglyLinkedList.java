package singlylinkedlist;

/**
 *
 * @author Caelan Kimball
 */
public class SinglyLinkedList {
private static PipelineNode headNode = null;
private static PipelineNode tailNode = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creation of the nodes
        append(0, "Pump Station");
        append(3050, "Hwy 35");
        append(4573, "Tank farm");

        traverseAndPrint();
        System.out.println("******* now insert a node before old node 2 *******\n");
        insert(4040, "Cold Creek", 2);
        insert(0505, "Retard Valley", 4);
        traverseAndPrint();
    }

    public static void traverseAndPrint() {
        PipelineNode currentNode = headNode;
        int nodeNum = -1;
        do {
            nodeNum++;
            System.out.println("Node number: " + nodeNum);
            System.out.println("Position: " + currentNode.position);
            System.out.println("Description: "+ currentNode.description);
            System.out.println("");
            
            currentNode = currentNode.nextNode;

        }while(currentNode != null);
                
    }

    public static void insert(int pos, String descr, int index) {
        if(index == 0){
            PipelineNode node = new PipelineNode(pos, descr, headNode);
            headNode = node;
        }else{
            int indx = -1;
            PipelineNode currentNode = headNode;
            do{
                indx++;
                if(indx == index - 1){
                    PipelineNode node = new PipelineNode(pos, descr, null);
                    node.nextNode = currentNode.nextNode;
                    currentNode.nextNode = node;
                    break;
                }
                currentNode = currentNode.nextNode;
            }while(currentNode != null);
        }
    }

    public static void append(int pos, String descr) {
        PipelineNode newNode = new PipelineNode(pos, descr, null);
        if(headNode == null){
            headNode = newNode;
        }
        else{
            tailNode.nextNode = newNode;
        }
        tailNode = newNode;
    }
    
    

}
