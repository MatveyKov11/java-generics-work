public class Pair <T1, T2>{
    T1 key;
    T2 val;
    public Pair(T1 key, T2 val){
        this.key = key;
        this.val = val;
    }
    public String toString(){
        return this.key + "=" + this.val;
    }

    public void setVal(T2 val) {
        this.val = val;
    }

    public void setKey(T1 key) {
        this.key = key;
    }

    public T2 getVal() {
        return val;
    }

    public T1 getKey() {
        return key;
    }
}
