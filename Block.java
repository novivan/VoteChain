public class Block {
    private final int index;
    private final String timestamp;
    private final Data data; //абстрактный класс: либо это опрос, либо это голос в нем
    //пока пусть в каждом блоке будет либо опрос, либо голос
    private final int previousHash;
    private final int hash;


    Block(int index, String timestamp, Data data, int previousHash) {
        this.index = index;
        this.timestamp = timestamp;
        this.data = data;
        this.previousHash = previousHash;
        this.hash = this.hashCode();
    }
}