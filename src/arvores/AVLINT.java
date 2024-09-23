package arvores;

public class AVLINT {
	
	public class ARVORE{
		int dado;
		ARVORE dir,esq;
		int hDir,hEsq;
	}
	
	public ARVORE root = null;
	
	public void mostrarFB(ARVORE p) {
		if (p!=null) {
			mostrarFB(p.esq);
			mostrarFB(p.dir);
			System.out.println("dado: " + p.dado + "\t FB = " + (p.hDir-p.hEsq));
		}
	}
	
	
	public ARVORE inserirH(ARVORE p, int info) {
		if (p == null) { //nó inserido sempre será nó folha
			p=new ARVORE();
			p.dado = info;
			p.esq = null;
			p.dir = null;
			p.hDir=0;
			p.hEsq=0;
		    }
		else if (info < p.dado){
			p.esq= inserirH (p.esq, info);
			if (p.esq.hDir > p.esq.hEsq) //Altura do nó será a maior
			    p.hEsq = p.esq.hDir + 1; //altura dos seus filhos
			else
			    p.hEsq = p.esq.hEsq + 1;
			}
		     else {
			p.dir=inserirH(p.dir, info);
			if (p.dir.hDir > p.dir.hEsq)
			    p.hDir = p.dir.hDir + 1;
			else
			    p.hDir = p.dir.hEsq + 1;
		        }
		return p;
		}

}
