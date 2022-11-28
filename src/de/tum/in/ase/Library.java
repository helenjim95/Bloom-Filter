package de.tum.in.ase;

import java.util.LinkedList;
import java.util.List;

/**
 * Library class
 */
public class Library {
    private static final int BLOOM_FILTER_SIZE = 10;
    private static final int BLOOM_FILTER_HASH_FUNCTION_COUNT = 3;

    private boolean[] bloomFilter;
    private List<Book> books;

    /**
     * Creates a Library instance
     */
    public Library() {
        //TODO 1: Initialize Attributes
    }

    /**
     * This generates an array of different hash values for one Object
     *
     * @param o - Object hashes to be created for
     * @return - array of hash values, all of them are in range [0, BLOOM_FILTER_SIZE[
     */

    private static int[] generateHashValues(Object o) {
        final int BITS_IN_INTEGER = 32;
        int bitsPerHash = BITS_IN_INTEGER / BLOOM_FILTER_HASH_FUNCTION_COUNT;

        int hash = o.hashCode();
        int mask = (1 << bitsPerHash) - 1;
        int[] result = new int[BLOOM_FILTER_HASH_FUNCTION_COUNT];

        for (int i = 0; i < BLOOM_FILTER_HASH_FUNCTION_COUNT; i++) {
            result[i] = ((hash & (mask << (i * bitsPerHash))) >> (i * bitsPerHash)) % BLOOM_FILTER_SIZE;
        }

        return result;
    }

    /**
     * Adds a book to the library
     *
     * @param b - given book
     */
    public void add(Book b) {
        //TODO 2: Implement add Method
    }

    /**
     * Finds if the book is in the library - that is, all hashes are on
     *
     * @param b - given book
     * @return - index of the book if the book is in the library, else -1
     */
    public int findInLibrary(Book b) {
        //TODO 4: Implement findInLibrary method
        return -1;
    }

    /**
     * Checks on/off for the Bloom filter hashes of the given book
     *
     * @param b - book given
     * @return - on/off for the Bloom filter hashes
     */

    private boolean bloomFilterHit(Book b) {
        //TODO 3: Implement bloomFilterHit Method
        return false;
    }
}