package farruh.arch.hub.patterns.facade;

public class SortingManager {
    private MergeSort mergeSort;
    private BubbleSort bubbleSort;
    private InsertionSort insertionSort;

    public SortingManager(){
        this.bubbleSort = new BubbleSort();
        this.insertionSort = new InsertionSort();
        this.mergeSort = new MergeSort();
    }

    public void mergeSort(){
        this.mergeSort.sort();
    }

    public void bubbleSort(){
        this.bubbleSort.sort();
    }

    public void insertionSort(){
        this.insertionSort.sort();
    }
}
