package barclays;

class MyHashMap<K,V> {
	
	MyNode<K,V>[] bucket = new MyNode[10];
	
	public void put(K key, V value){
		int bucketNo = key.hashCode()%10;
		MyNode<K, V> currentNode = bucket[bucketNo];
		if(currentNode == null){
			bucket[bucketNo] = createNode(key, value);
			return;
		}else{
			while(currentNode.getNext()!=null){
				if(currentNode.getKey().equals(key)){
					currentNode.setValue(value);
					return;
				}
				currentNode = currentNode.getNext();
			}
			if(currentNode.getKey().equals(key)){
				currentNode.setValue(value);
				return;
			}
			currentNode.setNext(createNode(key, value));
		}
	}
	
	public V get(K key){
		int bucketNo = key.hashCode()%10;
		MyNode<K, V> currentNode = bucket[bucketNo];
		if(currentNode == null){
			return null;
		}else {
			while(currentNode.getNext()!=null){
				if(currentNode.getKey().equals(key)){
					return currentNode.getValue();
				}
				currentNode = currentNode.getNext();
			}
			if(currentNode.getKey().equals(key)){
				return currentNode.getValue();
			}
			return null;
		}
	}
	
	private MyNode<K, V> createNode(K key, V value){
		return new MyNode<K, V>(key, value);
	}
	
	@Override
	public String toString() {
		String output = "";
		for(MyNode<K, V> currentNode : bucket){
			if(currentNode == null){
				continue;
			}else{
				while(currentNode != null){
					output += currentNode.getKey() + ":" + currentNode.getValue() + "\n";
					currentNode = currentNode.getNext();
				}
			}
		}
		return output;
	}

	private class MyNode<K,V> {
		private K key;
		private V value;
		private MyNode<K,V> next;
		public MyNode(K key, V value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
		public K getKey() {
			return key;
		}
		public void setKey(K key) {
			this.key = key;
		}
		public V getValue() {
			return value;
		}
		public void setValue(V value) {
			this.value = value;
		}
		public MyNode<K, V> getNext() {
			return next;
		}
		public void setNext(MyNode<K, V> next) {
			this.next = next;
		}
	}
	
}
class HashMapCreation {
	public static void main(String[] args) {
		MyHashMap<Integer, String> map = new MyHashMap<Integer, String>();
		map.put(1, "Sufyan");
		map.put(2, "Faizan");
		map.put(3, "Afsha");
		map.put(11, "Shahana");
		System.out.println(map);
		System.out.println(map.get(11));
	}

}
