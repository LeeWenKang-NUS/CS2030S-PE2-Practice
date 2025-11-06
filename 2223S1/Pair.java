public class Pair<S,T> {
    private S first;
    private T second;
  
    public Pair(S first, T second) {
        this.first = first;
        this.second = second;
    }
  
    S getFst() {
        return this.first;
    }
  
    T getSnd() {
        return this.second;
    }
  }
  