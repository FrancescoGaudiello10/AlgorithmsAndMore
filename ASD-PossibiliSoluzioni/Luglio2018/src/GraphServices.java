
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;

public class GraphServices {
	/**
         * ESERCIZIO 1
	 * Dato un grafo in input, la funziona ritorna 1 se il grafo è un albero, 0 altrimenti.
         * Realizzare una funzione isTree che dato un grafo semplice G,
         * stabilisce se G è un albero. 
         * Un albero è un grafo semplice, connesso e aciclico, significa che non esistono cicli
         * composti da archi distinti
         * 
         * //Faccio una DFS per vedere se è connesso. 
         * Dopo aver visto se è connesso vedo se è aciclico.
	*/
	public static int isTree(Graph g){
		/*DA IMPLEMENTARE*/
            int ret = 0; //Verifica che sia connesso
            List<GraphNode> nodes = g.getNodes(); //Nodi
            
            for(GraphNode n : nodes){
                n.key = Graph.UNEXPLORED; //Metto la chiave UNEXPLORED A TUTTI.
            }
            
            for(GraphNode n : nodes){
                if(n.key == Graph.UNEXPLORED){
                    ret++; //Incremento.
                    DFS(n); 
                }
            }
            
            if(ret != 1){ //Ho fatto più di una DFS, non è connesso.
                return 0; 
            }
            else{ //Grafo connesso, verifico l'aciclicità:
                //Posso usare l'ordine topologico oppure vedere se ho preso un "BACK".
                for(GraphNode n : nodes){
                    if(n.key == Graph.BACK){ 
                        System.out.println("Ho un back. Non aciclico.");
                        return 0; 
                    }
                }
            }
            return 1;
	}
        
        //FUNZIONE DFS
        private static void DFS(GraphNode n){
            if(n.key != Graph.UNEXPLORED){
                n.key = Graph.BACK; //Se sono qui ho un CICLO.
                return; 
            }
            
            n.key = Graph.DISCOVERY; 
            for(GraphEdge e : n.incidentEdges){ //Per ogni arco incidente a n
                GraphNode opp = e.getEdgeOpposite(n); //Nodo opposto
                
                if(opp.key == Graph.UNEXPLORED){ //Se l'opposto è UNEXPLORED.
                    DFS(opp); //Ripeto DFS
                }
            }
            n.key = Graph.EXCLUDED; //Finito.
        }
        
        
        
        

	/**ESERCIZIO 2
	 * Dato un grafo g e tre nodi x,y,z appartenenti a g, la funziona ritorna la lunghezza
	 * del cammino minimo che connette x e z in g, passando per y. Se non esiste alcun cammino
	 * la funzione deve ritornare il valore di default -1.
         * Devo partire da x ed arrivare a z passando per y.
	*/        
        private static int minDist(Graph g, int dist[]){
            
            int min = 100000; //Valore infinito
            int min_index = -1;
            
            for(int v = 0; v < g.nNodes; v++){
                if(dist[v] < min){ //Se il valore in dist è minore, sostituisco. 
                    min = dist[v]; 
                    min_index = v; 
                }
            }
            return min_index; 
        }
        
	public static int getSizeConstrainedPath(Graph g, GraphNode x, GraphNode y, GraphNode z){
		/*DA IMPLEMENTARE*/
            
            PriorityQueue<GraphNode> list = new PriorityQueue<GraphNode>(); //Mi serve una coda per la removeMin
            
            //HashMap<GraphNode, GraphEdge> = new HashMap<GraphNode, GraphEdge>(); 
            HashMap<Integer, GraphNode> dist = new HashMap<Integer, GraphNode>();
            
            final int INFINITY = 100000; //valore infinito
                        
            //INIZIALIZZAZIONE
            for(GraphNode n : g.getNodes()){
                if(n == x){
                    n.key = 0; 
                    list.add(n);
                    dist.put(0, x); //Distanza
                }
                else{
                    n.key = INFINITY; 
                    list.add(n);
                    dist.put(n.key, n);
                }
            }
             
            while(!list.isEmpty()){
                GraphNode rim = list.removeMin();
                int value = rim.key;
                
                
                for(GraphEdge e : rim.incidentEdges){
                    GraphNode opp = e.getEdgeOpposite(rim); //opp è l'opposto
                    
                    //Applico il rilassamento
                    if(dist.get(e).getNodeKey() + e.getEdgeKey() < dist.get(opp).getNodeKey()){
                        //Sostituisco 
                        list.remove(opp);
                        list.add(dist.replace(value, opp)); 
                    }
                }
            }
            for(GraphNode n : g.getNodes()){
                System.out.println(n + " - Label:  " + n.getNodeLabel() + " - Key:  " + n.key);
            }
 
            return 1; 
	}
}