import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unused")
public class GraphServices {
	
	/**
	* Ritorna la lista degli archi di g.
        * Realizzare una funzione che dato in input un grafo G
        * restituisca una lista dei suoi archi presenti.
        * Se il grafo NON ha archi va restituito NULL.
        * Ciascun arco deve essere presente una sola volta nella lista in output.
	*/
	public static List<GraphEdge> getEdges(Graph g){
            /*DA IMPLEMENTARE*/
            LinkedList<GraphEdge> ris = new LinkedList<>();
            
            for(GraphNode n : g.getNodes()){ 
                
                for(GraphEdge e : n.incidentEdges){ 
                    
                    if(!ris.contains(e)){ 
                        ris.add(e);
                    }
                }
            }

            if(ris.isEmpty()){
                return null; 
            }
            else
                return ris;
	}
	
	
	/**
	* Ritorna 1 se il grafo g e' connesso, 0 altrimenti.
        * Realizzare una funzione che dato un grafo semplice G, restituisca 1 se G è
        * connesso, 0 altrimenti.
        * 
        * //Un grafo è connesso se dati due vertici esiste sempre un percorso che li unisce
        * 
	*/
	public static int isConnected(Graph g) {
		/*DA IMPLEMENTARE*/
            int ret = 0; 
                        
            for(GraphNode n : g.getNodes()){ 
                n.key = Graph.UNEXPLORED; 
            }
            
            for(GraphNode n : g.getNodes()){ 
                if(n.key == Graph.UNEXPLORED){ 
                    ret++;
                    DFS(n); 
                }
            }
            
            if(ret == 1) 
                return 1;
            else
                return 0; 
	}
        
        private static void DFS(GraphNode n){
            if(n.key != Graph.UNEXPLORED){ 
                return; 
            }
            
            n.key = Graph.DISCOVERY;
            for(GraphEdge e : n.incidentEdges){ 
                GraphNode opp = e.getEdgeOpposite(n); 
                //System.out.println("Entro in 1:");
                if(opp.key == Graph.UNEXPLORED){ 
                    //System.out.println("---- Entro in 2:");
                    DFS(opp); 
                }
            }
            n.key = Graph.EXCLUDED; 
        }
	
	
	/**
	* Ritorna 1 se il grafo g e' 1-connesso, 0 altrimenti.
        * Dato in input un grafo semplice, devo restituire 1 se è 1-connesso.
        * ssia devo rimuovere un arco e vedere se è ancora connesso. 
        * 
        * Applico la DFS scritta sopra per es.2 e verifico che sia connesso. 
        * Tolgo un arco e verifico se è ancora connesso. 
	*/
	public static int is1Connected(Graph g) {
		/*DA IMPLEMENTARE*/
            int ret = 0; 
            List<GraphNode> nodes = g.getNodes(); 
            for(GraphNode n : nodes){
                n.key = Graph.UNEXPLORED; 
            }
            
            for(GraphNode n : nodes){
                if(n.key == Graph.UNEXPLORED){
                    ret++; 
                    DFS(n); 
                }
            }
            if(ret == 1){ 
                int k = 0; 

                for(GraphNode n : nodes){
                    for(GraphEdge e : n.incidentEdges){
                        GraphNode opp = e.getEdgeOpposite(n);
                        
                        g.removeEdge(n, opp); 
                        k++;
                        DFS(n);
                    }
                }
                
                if(k == g.nNodes){
                    return 1; 
                }
                else{
                    return 0; 
                }
            }
            else{ 
                return 0; 
            }
        }
}
