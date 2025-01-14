package filas;

public class FilaInt {
	public final int N = 3;
	int dados[] = new int[N];
	int ini, fim, count;

	public void Init() {
		ini = fim = count = 0;
	}

	public boolean IsEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}

	public boolean IsFull() {
		if (count == N)
			return true;
		else
			return false;
	}

	public void Enqueue(int element) {
		if (IsFull()) {
			System.out.println("Enqueue overflow");
		} else {
			dados[fim] = element;
			fim = (fim + 1) % N;
			count++;
		}
	}

	public int Dequeue() {
		if(!IsEmpty()){
		int elem = dados[ini];
		ini = (ini + 1) % N;
		count--;
		return elem;
		}
		return 0;
	}

	public void Clean() {
		if (!IsEmpty()) {
			ini = 0;
			fim = 0;
			count = 0;
		}
	}

	public int Size() {
		return count;
	}

	public int first() {		
		return dados[ini];
	}
}
