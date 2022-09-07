package AdvancedClassDesign.question10;

public class Book {
    private int pageNumber;
    private class BookReader {
        public int getPage() {
            return pageNumber;
        }
    }
}
