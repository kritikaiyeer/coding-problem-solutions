class LRUCache extends LinkedHashMap<Integer,Integer>{
    
    class DoubleLinkedList {
        int key;
        int value;
        DoubleLinkedList prev;
        DoubleLinkedList next;
    }
    
    private void addNode(DoubleLinkedList node){
        /**
        * Always add the new node right after head.
        */
        node.prev = head;
        node.next = head.next;
        
        head.next.prev = node;
        head.next = node;
    }
    
    private void removeNode(DoubleLinkedList node){
        DoubleLinkedList prev = node.prev;
        DoubleLinkedList next = node.next;
        
        prev.next = next;
        next.prev = prev;
    }
    
     private void moveToHead(DoubleLinkedList node){
        removeNode(node);
        addNode(node);
    }
    
    private Map<Integer,DoubleLinkedList> cache = new HashMap<>();
    private int size;
    private int capacity;
    private DoubleLinkedList head, tail;
    
    private DoubleLinkedList popTail(){
        DoubleLinkedList res = tail.prev;
        removeNode(res);
        return res;
    }
    
    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        
        head = new DoubleLinkedList();
        tail = new DoubleLinkedList();
        
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        DoubleLinkedList node = cache.get(key);
        if(node == null) return -1;
        
        moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        DoubleLinkedList node = cache.get(key);
        if(node == null){
            DoubleLinkedList newnode = new DoubleLinkedList();
            newnode.key = key;
            newnode.value = value;

            cache.put(key,newnode);
            addNode(newnode);

            ++size;

            if(size > capacity){
                DoubleLinkedList tail = popTail();
                cache.remove(tail.key);
                --size;
            }
        }else{
            node.value = value;
            moveToHead(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
