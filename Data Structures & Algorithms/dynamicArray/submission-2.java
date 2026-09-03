class DynamicArray {

    private int[] array;
    private int size;
    private int capacity; 

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.size = 0;
        this.capacity = capacity;  
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
        if (i >= size)
        {
            size++;
        }
        
    }

    public void pushback(int n) {
        if (size == capacity)  
        {
            resize();
        }
        array[size] = n;
        size ++;

    }

    public int popback() {
        int pop = array[size -1];
        size--;
        return pop;
    }

    private void resize() {
        int newCapacity = this.capacity *2; 
        int[] newArray = new int[newCapacity];
        for (int i = 0; i < size; i++){
            newArray[i] = this.array[i];
        }
        this.array = newArray;
        this.capacity = newCapacity;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
