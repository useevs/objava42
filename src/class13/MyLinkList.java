/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class13;

import class7.Animal;
import class8.FirstInterface;

/**
 *
 * @author shahzad
 */
public class MyLinkList<T> {

    ListItem start, end, current;

    public MyLinkList() {
    }

    public MyLinkList(T item) {
        addItem(item);
    }

    public MyLinkList(T[] items) {
        addItem(items);
    }

    public void addItem(T[] items) {
        for (T item : items) {
            addItem(item);
        }
    }

    public void addItem(T item) {
        ListItem list = new ListItem(item);
        if (start == null) {
            // No element in list 
            start = end = list;
        } else {
            end.next = list;
            end = list;
        }
    }

    public T getFirst() {
        current = start;
        return current != null ? current.item : null;
    }

    public T getNext() {
        if (current != null) {
            current = current.next;
        }
        return current != null ? current.item : null;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        for (T item = getFirst(); item != null; item = getNext()) {
            buf.append(item);
            if (current.next != null) {
                buf.append(",");
            }
        }
        return buf.toString();
    }

    private class ListItem {

        ListItem next;
        T item;

        public ListItem(T item) {
            if ( item instanceof String ) {
                
            }
            this.item = item;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return "ListItem{" + "next=" + next + ", item=" + item + '}';
        }
    }
}
