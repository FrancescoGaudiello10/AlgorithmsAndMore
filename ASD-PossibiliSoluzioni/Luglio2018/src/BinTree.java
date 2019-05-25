/**
 * Classe per rappresentare un albero binario.
*/
public class BinTree {
	int key;
	BinTree left;
	BinTree right;
	
	/**
 	* Crea un nuovo albero binario avente l'intero passato in input come chiave della radice.
	*/
	public BinTree(int k){
		key = k;
		left = null;
		right = null;
	}

	/**
	 * Inserisce un nuovo bintree alla sinistra del bintree passato in input.
	 * La funzione ritorna il bintree appena inserito oppure NULL in caso di errore
	 * o se il bintree in input aveva gia' un figlio sinistro.
	*/	
	public BinTree setLeftChild(int k){
		if (left==null){
			left = new BinTree(k);
			return left;
		}else{
			return null;
		}
	}

	/**
	 * Inserisce un nuovo bintree alla destra del bintree passato in input.
	 * La funzione ritorna il bintree appena inserito oppure NULL in caso di errore
	 * o se il bintree in input aveva gia' un figlio destro.
	*/
	public BinTree setRightChild(int k){
		if (right==null){
			right = new BinTree(k);
			return right;
		}else{
			return null;
		}
	}
	
	private void printBinTree_aux(BinTree bt, int level){
		if (bt == null)
			return;
		else{
			for(int i = 0; i<level; i++){
				System.out.print(" |");
			}
			System.out.println("-" + bt.key);
			printBinTree_aux(bt.left, level + 1);
			printBinTree_aux(bt.right, level + 1);
		}
	}
	
	/**
	 * Stampa a video una rappresentazione del bintree in input.
	 */
	public void printBinTree(){
		printBinTree_aux(this,0);
	}
}