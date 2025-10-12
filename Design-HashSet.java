class MyHashSet {

    private static final int BUCKET_SIZE= 769;
    private LinkedList<Integer>[] table;

    public MyHashSet() {
        table = new LinkedList[BUCKET_SIZE];
        for (int i = 0; i < BUCKET_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % BUCKET_SIZE;
    }
    
    public void add(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = table[index];

        if (!bucket.contains(key)) { 
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = table[index];

        bucket.remove(Integer.valueOf(key));
    }


    public boolean contains(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = table[index];

        return bucket.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */