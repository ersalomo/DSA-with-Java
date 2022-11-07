
public class Array {
    private int[] items;
    private int  count;
    public  Array(int length){
        items = new int[length];
    }
    public void insert(int item){
//        If arrat is full, resize
        if(items.length == count){
            // create a new array (twice the size)
            int[] newItems = new int[count*2];
            // copy all the existing items
            for(int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            // set "items" to this new array
            items = newItems;
        }
//        add the new item at the end
        items[count++] = item;
//        count++;
    }
    public void removeAt(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        // shift the items to the left to fill the hole
        for(int i = index; i < count; i++){
            items[i] = items[i+1];
        }
        count--;
    }

    public int getIndexOf(int index){
        if(index < 0 || index > count) return  -1;

        int hasil = -1;
        for (int i=0; i<count; i++){
            if(i == index){
                hasil = items[index];
                break;
            }
        }
        return hasil;
    }
    public int indexOf(int item){
        // O(n)
        for (int i=0; i < count; i++){
            if(items[i] == item){
                return i;
            }
        }
        return  -1;
    }
    public void print(){
        for (int i=0; i< count; i++) {
            System.out.println(items[i]);
        }
    }
}
