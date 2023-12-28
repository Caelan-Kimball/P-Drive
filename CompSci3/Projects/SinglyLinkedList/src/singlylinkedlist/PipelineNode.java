package singlylinkedlist;

/**
 *
 * @author Caelan Kimball
 */
public class PipelineNode {
    public PipelineNode(int pos, String descr, PipelineNode ptr){
        position = pos;
        description = descr;
        nextNode  = ptr;
    }
    
    public int position;
    public String description;
    public PipelineNode nextNode;
}
