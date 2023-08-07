package app.entity;


public class Client<K, V> {

    private final K key;
    private final V value;

    public Client(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

//public record Client<K, V>(K key, V value) {
//
//}

// Мені запропонувало переробити в record. Чи це справді зручніше ніж прописувати класс для ООП в цьому завданні?
// Я розумію, що ми ще цього не вивчали, але просто цікаво було.
// Я почитав про record тут, щоб трохи розібратись https://www.baeldung.com/java-record-vs-final-class
