
import java.io.IOException;
import java.util.HashMap;

public class UniqueWords {
    private BookReader book = new BookReader(".\\src\\WarAndPeace.txt");

    public UniqueWords() throws IOException {


    }

    public void addUniqueWordsToHashTable(){
        long duration = 0;
        long start = System.currentTimeMillis();
        MyHashTable<String, String> mht = new MyHashTable<>(32768);


        for(book.words.first(); book.words.current() != null; book.words.next()){
            if(mht.keys.contains() == null){
                mht.put(book.words.current(), book.words.current());
            }
        }

        long now = System.currentTimeMillis();
        duration = now - start;
        System.out.println();
        System.out.println("Adding unique words to a hash table...  in " + duration +" ms");
        System.out.println(mht.size()+" unique words");
        System.out.println(mht.comparisons+" comparisons");
        System.out.println(mht.maxProbe+" max probe");

        start = System.currentTimeMillis();

        mht.toString();

        now = System.currentTimeMillis();
        duration = now - start;

        System.out.println("Extracting the key-value pairs... in "+duration+" ms");
    }

}
