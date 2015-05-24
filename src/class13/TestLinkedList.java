/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class13;

import class7.Dog;

/**
 *
 * @author shahzad
 */
public class TestLinkedList {

    public static void main(String[] args) {
        MyLinkList<String> list = new MyLinkList<String>("one");
        list.addItem("two");
        list.addItem(new String[]{"three", "four"});
        list.addItem("five");

        System.out.println(list);
        MyLinkList<Integer> listInt = new MyLinkList<>();
        listInt.addItem(1);

        MyLinkList<Dog> dogList = new MyLinkList<>();

        MyLinkList<MyLinkList<String>> multiList = new MyLinkList<>();
        multiList.addItem(list);

        MyLinkList<MyLinkList<MyLinkList<MyLinkList<String>>>> mList = new MyLinkList<>();

        MyLinkList<?>[] arralist = {list, listInt, dogList, multiList};
        
        MyLinkList<Pair<String, String>> pairList = new MyLinkList<>() ;
        pairList.addItem(new Pair("One", "1"));
        print(pairList) ;
        
        Pair<String, Integer> p = new Pair("One", 1) ;
        System.out.println(p) ;
        
        print(listInt);
    }

    public static void print(MyLinkList<?> list) {
        System.out.println(list);
    }
}
