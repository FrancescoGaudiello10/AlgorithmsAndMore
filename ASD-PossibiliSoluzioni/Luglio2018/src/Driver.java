import java.util.List;

public class Driver {
	
	public static void main(String[] args) {
		if(args.length < 1) {
			printInfo();
		}
		else if(args[0].equals("graph")) {
			Graph g = new Graph();
			
			g.addNode("a");
			GraphNode uno = g.addNode("b");
			GraphNode due = g.addNode("c");
			GraphNode tre = g.addNode("d");
			GraphNode quattro = g.addNode("e");		
			GraphNode cinque = g.addNode("f");
			GraphNode sei = g.addNode("g");
			GraphNode sette = g.addNode("h");
			GraphNode otto = g.addNode("i");
			
			g.addEdge(uno, due);
			g.addEdge(uno, sei);
			g.addEdge(due, tre);
			g.addEdge(tre, quattro);
			g.addEdge(quattro, due);
			g.addEdge(due, sei);
			g.addEdge(cinque, sei);
			g.addEdge(sei, tre);
			g.addEdge(sette, otto);

			System.out.println("");
			System.out.println("Rimozione: " + sei.label + "," + tre.label);
			g.removeEdge(sei, tre);

			System.out.println("");
			System.out.println("Rimozione: " + tre.label + "," + due.label);
			g.removeEdge(tre, due);

			System.out.println("");
			System.out.println("Rimozione: " + quattro.label + "," + tre.label);
			g.removeEdge(quattro, tre);

			// Duplicato
			System.out.println("");
			System.out.println("Rimozione: " + quattro.label + "," + tre.label);
			g.removeEdge(quattro, tre);

			System.out.println("");
			System.out.println("Aggiunta: " + tre.label + "," + sei.label);
			g.addEdge(tre, sei);

			System.out.println("");
			System.out.println("Aggiunta: " + quattro.label + "," + tre.label);
			g.addEdge(quattro, tre);
			
			System.out.println("");
			System.out.println("Rimozione nodo: " + quattro.label);
			g.removeNode(quattro);
			
			System.out.println("");
			System.out.println("Rimozione nodo: " + uno.label);
			g.removeNode(uno);
			
			System.out.println("");
			System.out.println("Rimozione nodo: " + otto.label);
			g.removeNode(otto);
			
			System.out.println("");
			System.out.println("Rimozione nodo: " + sei.label);
			g.removeNode(sei);
			
			// Duplicato
			System.out.println("");
			System.out.println("Rimozione nodo: " + sei.label);
			g.removeNode(sei);
			
		}
		else if(args[0].equals("bintree")) {
			BinTree bt0 = new BinTree(0);

			BinTree bt1 = bt0.setLeftChild(1);
			BinTree bt11 = bt1.setLeftChild(3);
			bt11.setLeftChild(5);
			bt11.setRightChild(6);

			bt1.setLeftChild(4);

			BinTree bt2 = bt0.setRightChild(2);
			bt2.setLeftChild(7);
			bt2.setRightChild(8);

			bt0.printBinTree();
			System.out.println();
		}
		else if(args[0].equals("istree")) {
			Graph g = new Graph();
			GraphNode a = g.addNode("a");
			GraphNode b = g.addNode("b");
			GraphNode c = g.addNode("c");
			GraphNode d = g.addNode("d");
			GraphNode e = g.addNode("e");
			GraphNode f = g.addNode("f");
			GraphNode gi = g.addNode("g");
			GraphNode h = g.addNode("h");
			GraphNode i = g.addNode("i");
			GraphNode l = g.addNode("l");

			g.addEdge( a, b);
			g.addEdge( a, c);
			g.addEdge( b, d);
			g.addEdge( d, h);
			g.addEdge( h, i);
			g.addEdge( h, l);
			g.addEdge( c, e);
			g.addEdge( c, f);
			g.addEdge( c, gi);

			System.out.println("################################");
			System.out.println("Primo test");
			System.out.println("################################");
			System.out.println(g);
			System.out.println("isTree -> " + GraphServices.isTree(g));
			System.out.println();

			g = new Graph();
			a = g.addNode("a");
			b = g.addNode("b");
			c = g.addNode("c");
			d = g.addNode("d");
			e = g.addNode("e");;
			f = g.addNode("f");;
			gi = g.addNode("g");;
			h = g.addNode("h");;
			i = g.addNode("i");;
			l = g.addNode("l");;

			g.addEdge( a, b);
			g.addEdge( a, c);
			g.addEdge( b, d);
			g.addEdge(d, h);
			g.addEdge( h, i);
			g.addEdge( h, l);
			g.addEdge( c, e);
			g.addEdge( c, f);
			g.addEdge( c, gi);
			g.addEdge(a, e);

			System.out.println("################################");
			System.out.println("Secondo test");
			System.out.println("################################");
			System.out.println(g);
			System.out.println("isTree -> " + GraphServices.isTree(g));
			System.out.println();

			g = new Graph();
			a = g.addNode("a");
			b = g.addNode("b");
			c = g.addNode("c");
			d = g.addNode("d");
			e = g.addNode("e");;
			f = g.addNode("f");;
			gi = g.addNode("g");;
			h = g.addNode("h");;
			i = g.addNode("i");;
			l = g.addNode("l");;

			g.addEdge( a, b);
			g.addEdge( a, c);
			g.addEdge( b, d);
			g.addEdge( h, i);
			g.addEdge( h, l);
			g.addEdge( c, e);
			g.addEdge( c, f);
			g.addEdge( c, gi);
			g.addEdge(a, e);

			System.out.println("################################");
			System.out.println("Terzo test");
			System.out.println("################################");
			System.out.println(g);
			System.out.println("isTree -> " + GraphServices.isTree(g));
			System.out.println();
		}
		else if(args[0].equals("path")) {
			Graph g = new Graph();
			GraphNode a = g.addNode("a");
			GraphNode b = g.addNode("b");
			GraphNode c = g.addNode("c");
			GraphNode d = g.addNode("d");
			GraphNode e = g.addNode("e");
			GraphNode f = g.addNode("f");
			GraphNode gi = g.addNode("g");
			GraphNode h = g.addNode("h");
			GraphNode i = g.addNode("i");
			GraphNode l = g.addNode("l");

			g.addEdge(a, b);
			g.addEdge(a, c);
			g.addEdge(b, d);
			g.addEdge(d, h);
			g.addEdge(d, e);
			g.addEdge(h, i);
			g.addEdge(h, l);
			g.addEdge(c, e);
			g.addEdge(c, f);
			g.addEdge(gi, f);
			g.addEdge(c, gi);

			System.out.println(g);
			System.out.println();

			System.out.println("################################");
			System.out.println("Primo test");
			System.out.println("################################");
			System.out.println("minpath b,e per g -> " + GraphServices.getSizeConstrainedPath(g, b, gi, e));
			System.out.println();

			System.out.println("################################");
			System.out.println("Secondo test");
			System.out.println("################################");
			System.out.println("minpath b,a per g -> " + GraphServices.getSizeConstrainedPath(g, b, gi, a));
			System.out.println();

			System.out.println("################################");
			System.out.println("Terzo test");
			System.out.println("################################");
			System.out.println("minpath b,f per g -> " + GraphServices.getSizeConstrainedPath(g, b, gi, f));
			System.out.println();

			System.out.println("################################");
			System.out.println("Quarto test");
			System.out.println("################################");
			System.out.println("minpath b,d per h -> " + GraphServices.getSizeConstrainedPath(g, b, h, d));
			System.out.println();
		}
		else if(args[0].equals("maxsubtree")) {
			BinTree bt0 = new BinTree(1);

			BinTree bt1 = bt0.setLeftChild(2);
			BinTree bt11 = bt1.setLeftChild(4);
			bt11.setLeftChild(8);
			bt11.setRightChild(9);
			BinTree bt12 = bt1.setRightChild(5);
			bt12.setLeftChild(10);
			bt12.setRightChild(11);
			
			BinTree bt2 = bt0.setRightChild(3);
			bt2.setLeftChild(6);
			bt2.setRightChild(7);

			System.out.println("################################");
			System.out.println("Primo test");
			System.out.println("################################");
			bt0.printBinTree();
			System.out.println("maxsubtree --> " + BinTreeServices.getSizeMaxCompleteSubtree(bt0));
			System.out.println();

			bt0 = new BinTree(1);

			bt1 = bt0.setLeftChild(2);
			bt11 = bt1.setLeftChild(4);
			bt11.setLeftChild(8);
			bt11.setRightChild(9);
			bt12 = bt1.setRightChild(5);
			bt12.setLeftChild(10);
			
			bt2 = bt0.setRightChild(3);
			bt2.setLeftChild(6);
			bt2.setRightChild(7);

			System.out.println("################################");
			System.out.println("Secondo test");
			System.out.println("################################");
			bt0.printBinTree();
			System.out.println("maxsubtree --> " + BinTreeServices.getSizeMaxCompleteSubtree(bt0));
			System.out.println();

			bt0 = new BinTree(1);

			bt1 = bt0.setLeftChild(2);
			bt11 = bt1.setLeftChild(4);
			bt11.setLeftChild(8);
			bt11.setRightChild(9);
			bt12 = bt1.setRightChild(5);
			bt12.setLeftChild(10);
			
			bt2 = bt0.setRightChild(3);
			bt2.setLeftChild(6);

			System.out.println("################################");
			System.out.println("Terzo test");
			System.out.println("################################");
			bt0.printBinTree();
			System.out.println("maxsubtree --> " + BinTreeServices.getSizeMaxCompleteSubtree(bt0));
			System.out.println();
		}
	}
	
	private static void printInfo() {
		System.out.println("Manca argomento: {graph, edges, bintree, istree, path, maxsubtree}");
	}
}
